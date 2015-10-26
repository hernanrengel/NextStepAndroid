package com.xiberty.nextstep.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.xiberty.nextstep.R;
import com.xiberty.nextstep.models.ItemPerfil;

import java.util.ArrayList;

/**
 * Created by hrengel on 26/10/15.
 */
public class ListSettingsAdapter extends BaseAdapter {
    private LayoutInflater inflater;
    private ArrayList<ItemPerfil> mData;
    private Context mContext;

    public ListSettingsAdapter(Context contexto) {
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
            convertView = inflater.inflate(R.layout.list_item_perfil, null);
            holder = new ViewHolder();
            assert convertView != null;

            holder.listIcon = (ImageView) convertView.findViewById(R.id.listIcon);
            holder.itemName = (TextView) convertView.findViewById(R.id.itemName);


            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        ItemPerfil itemPerfil= mData.get(position);


        holder.listIcon.setImageDrawable(mContext.getDrawable(R.mipmap.ic_launcher));
        holder.itemName.setText(itemPerfil.getItem());

        return convertView;
    }

    static class ViewHolder {
        private ImageView listIcon;
        private TextView itemName;

    }

    public void adicionarItem(ArrayList<ItemPerfil> itemPerfils) {
        mData = itemPerfils;
        notifyDataSetChanged();
    }

    public void eliminarTodo() {
        mData.clear();
        notifyDataSetChanged();
    }
}
