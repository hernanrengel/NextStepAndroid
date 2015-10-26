package com.xiberty.nextstep.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.xiberty.nextstep.R;
import com.xiberty.nextstep.adapters.ListSettingsAdapter;
import com.xiberty.nextstep.models.ItemPerfil;
import com.xiberty.nextstep.util.DataBase;

import java.util.ArrayList;

/**
 * Created by hrengel on 26/10/15.
 */
public class PerfilFragment  extends Fragment {

//    perfilListView

    private DataBase dataBase;

    private ListView listView;

    private ArrayList<ItemPerfil> itemPerfils;


    public static PerfilFragment newInstance() {
        return new PerfilFragment();
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);



        dataBase = new DataBase(getActivity());

    }

    @Override
    public void onStart() {
        super.onStart();

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_sugeridas, container, false);

        listView = (ListView) view.findViewById(R.id.list);

        ItemPerfil itemPerfil = new ItemPerfil();
        itemPerfil.setIcon(getActivity().getResources().getDrawable(R.mipmap.ic_launcher));
        itemPerfil.setItem("Editar Cuenta");

        itemPerfil.setIcon(getActivity().getResources().getDrawable(R.mipmap.ic_launcher));
        itemPerfil.setItem("Acerca");

        itemPerfil.setIcon(getActivity().getResources().getDrawable(R.mipmap.ic_launcher));
        itemPerfil.setItem("Settings");

        itemPerfil.setIcon(getActivity().getResources().getDrawable(R.mipmap.ic_launcher));
        itemPerfil.setItem("Cerrar Sesion");

        itemPerfils.add(itemPerfil);

        ListSettingsAdapter listAdapter = new ListSettingsAdapter(getActivity());
        listAdapter.adicionarItem(itemPerfils);

        listView.setAdapter(listAdapter);


        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

    }


}
