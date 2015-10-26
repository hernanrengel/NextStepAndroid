package com.xiberty.nextstep.adapters;

/**
 * Created by hrengel on 20/10/15.
 */

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.xiberty.nextstep.R;
import com.xiberty.nextstep.models.Oferta;

import java.util.ArrayList;

/**
 * Created by hrengel on 19/10/15.
 */
public class ListOfertasAdapter extends BaseAdapter {
    private LayoutInflater inflater;
    private ArrayList<Oferta> mData;
    private Context mContext;

    public ListOfertasAdapter(Context contexto) {
        inflater = LayoutInflater.from(contexto);
        mData = new ArrayList<>();
        this.mContext = contexto;
    }

    public int getCount() {
        return mData.size();
    }

    public Object getItem(int position) {
        return position;
    }

    public long getItemId(int position) {
        return position;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.list_item_sugeridas, null);
            holder = new ViewHolder();
            assert convertView != null;

            holder.empresaImageView = (ImageView) convertView.findViewById(R.id.empresaImageView);
            holder.puestoTextView = (TextView) convertView.findViewById(R.id.puestoTextView);
            holder.empresaTextView = (TextView) convertView.findViewById(R.id.empresaTextView);
            holder.fechaTextView = (TextView) convertView.findViewById(R.id.fechaTextView);


            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        Oferta oferta = mData.get(position);


        holder.empresaImageView.setImageDrawable(mContext.getDrawable(R.mipmap.ic_launcher));
        holder.puestoTextView.setText(oferta.getCargo());
        holder.empresaTextView.setText(oferta.getEmpresa());
        holder.fechaTextView.setText(oferta.getFecha());

        return convertView;
    }

    static class ViewHolder {
        private ImageView empresaImageView;
        private TextView puestoTextView;
        private TextView empresaTextView;
        private TextView fechaTextView;

    }

    public void adicionarItem(ArrayList<Oferta> oferta) {
        mData = oferta;
        notifyDataSetChanged();
    }

    public void eliminarTodo() {
        mData.clear();
        notifyDataSetChanged();
    }

}

