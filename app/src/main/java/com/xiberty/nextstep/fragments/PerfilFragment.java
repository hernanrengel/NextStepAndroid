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

        itemPerfils = new ArrayList<>();

    }

    @Override
    public void onStart() {
        super.onStart();

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_perfil, container, false);

        listView = (ListView) view.findViewById(R.id.perfilListView);

        ItemPerfil itemPerfil1 = new ItemPerfil();
        itemPerfil1.setIcon(getActivity().getResources().getDrawable(R.mipmap.ic_launcher));
        itemPerfil1.setItem("Editar Cuenta");

        ItemPerfil itemPerfil2 = new ItemPerfil();
        itemPerfil2.setIcon(getActivity().getResources().getDrawable(R.mipmap.ic_launcher));
        itemPerfil2.setItem("Acerca");

        ItemPerfil itemPerfil3 = new ItemPerfil();
        itemPerfil3.setIcon(getActivity().getResources().getDrawable(R.mipmap.ic_launcher));
        itemPerfil3.setItem("Settings");

        ItemPerfil itemPerfil4 = new ItemPerfil();
        itemPerfil4.setIcon(getActivity().getResources().getDrawable(R.mipmap.ic_launcher));
        itemPerfil4.setItem("Cerrar Sesion");

        itemPerfils.add(itemPerfil1);
        itemPerfils.add(itemPerfil2);
        itemPerfils.add(itemPerfil3);
        itemPerfils.add(itemPerfil4);

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
