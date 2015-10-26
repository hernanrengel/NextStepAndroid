package com.xiberty.nextstep.fragments;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListView;

import com.xiberty.nextstep.Parms;
import com.xiberty.nextstep.R;
import com.xiberty.nextstep.adapters.ListOfertasAdapter;
import com.xiberty.nextstep.models.Oferta;
import com.xiberty.nextstep.util.DataBase;
import com.xiberty.nextstep.util.L;
import com.xiberty.nextstep.util.ServiceHandler;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

/**
 * Created by hrengel on 20/10/15.
 */
public class SugeridasFragment extends Fragment implements SwipeRefreshLayout.OnRefreshListener {

    private ArrayList<Oferta> ofertas;

    private DataBase dataBase;

    private ListView listView;

    private SwipeRefreshLayout swipeLayout;

    private GetData mTask;

    public static SugeridasFragment newInstance() {
        return new SugeridasFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);

        dataBase = new DataBase(getActivity());

        ofertas = new ArrayList<>();
    }

    @Override
    public void onStart() {
        super.onStart();

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_sugeridas, container, false);

        listView = (ListView) view.findViewById(R.id.list);

        ViewGroup viewGroup = (ViewGroup) view;

        swipeLayout = (SwipeRefreshLayout) viewGroup.findViewById(R.id.ptr_layout);
        swipeLayout.setOnRefreshListener(this);
        swipeLayout.setColorSchemeColors(R.color.colorAccent,
                R.color.colorAccent,
                R.color.colorAccent,
                R.color.colorAccent);

        swipeLayout.setProgressViewOffset(false, 0,
                (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 24, getResources().getDisplayMetrics()));


        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        callWS();

        listView.setOnScrollListener(new AbsListView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(AbsListView view, int scrollState) {

            }

            @Override
            public void onScroll(AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount) {
                int topRowVerticalPosition =
                        (listView == null || listView.getChildCount() == 0) ?
                                0 : listView.getChildAt(0).getTop();
                swipeLayout.setEnabled(topRowVerticalPosition >= 0);
            }
        });
    }

    public void callWS() {
        if (mTask != null) {
            L.i(this, "task is not null");
            if (mTask.getStatus() == AsyncTask.Status.FINISHED) {
                L.i(this, "status is finish");
            }
            return;
        }

        mTask = new GetData();
        mTask.execute();
    }

    @Override
    public void onRefresh() {

    }


    private class GetData extends AsyncTask<Void, Void, Void> {

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            swipeLayout.setRefreshing(true);
        }

        @Override
        protected Void doInBackground(Void... params) {
            ServiceHandler sh = new ServiceHandler();
            String jsonStr = sh.makeServiceCall(Parms.INTERNSHIP, ServiceHandler.GET);

            Log.d("Response: ", "> " + jsonStr);

            if (jsonStr != null) {
                try {
                    JSONArray jsonarray = new JSONArray(jsonStr);

                    for (int i = 0; i < jsonarray.length(); i++) {
                        JSONObject n = jsonarray.getJSONObject(i);

//                        title: "dsfsdgfdg",
//                                description: null,
//                                remuneration: 0,
//                                address: null,
//                                publication_date: "2015-10-20",
//                                validity: null,
//                                company: null,
//                                candidates_applications: [ ],
//                        candidates_categories: [ ]

                        String title = n.getString("title");
                        String description = n.getString("description");
                        int remuneration = n.getInt("remuneration");
                        String address = n.getString("address");
                        String publication_date = n.getString("publication_date");
                        String validity = n.getString("validity");
                        String company = n.getString("company");


                        // tmp hashmap for single contact

                        Oferta oferta = new Oferta();
                        oferta.setCargo(title);
                        oferta.setDescripcion(description);
                        oferta.setSalario(remuneration + "");
                        oferta.setDireccion(address);
                        oferta.setFecha(publication_date);
                        oferta.setSave(validity);
                        oferta.setEmpresa(company);

                        // adding contact to contact list
                        ofertas.add(oferta);

//                        mDb = SQLiteDatabase.openOrCreateDatabase(Util.getDatabasePath(mContext), null);
//
//                        mDb.delete("data", null, null);
//
//                        String sql = "INSERT INTO data (account, amount, date, category, bank, " +
//                                "type, state, user) VALUES (?,?,?,?,?,?,?,?)";
//
//                        mDb.beginTransaction();
//
//                        SQLiteStatement stmt = mDb.compileStatement(sql);
//                        for (Transaction value : transactionArrayList) {
//                            assert stmt != null;
//
//                            stmt.bindString(1, value.getAccount());
//                            stmt.bindDouble(2, value.getAmount());
//                            stmt.bindString(3, value.getDate());
//                            stmt.bindString(4, value.getCategory());
//                            stmt.bindString(5, value.getBank());
//                            stmt.bindString(6, value.getType());
//                            stmt.bindString(7, value.getState());
//                            stmt.bindString(8, value.getUser());
//
//                            stmt.execute();
//                            stmt.clearBindings();
//                        }
//
//                        mDb.setTransactionSuccessful();
//                        mDb.endTransaction();
//
//                        if (mDb.isOpen()) {
//                            mDb.close();
//                        }

                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            } else {
                Log.e("ServiceHandler", "Couldn't get any data from the url");
            }

            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);

            ListOfertasAdapter listAdapter = new ListOfertasAdapter(getActivity());
            listAdapter.adicionarItem(ofertas);
            listView.setAdapter(listAdapter);

            swipeLayout.setRefreshing(false);

            mTask = null;
        }
    }


}
