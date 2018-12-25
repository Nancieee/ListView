package com.nancy.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class ItemAdapter extends BaseAdapter {

    LayoutInflater mInfalter;


    String [] items;
    String [] prices;
    String [] colors;

    public ItemAdapter(Context t, String[] i, String[] p, String[] c){
        items=i;
        prices=p;
        colors=c;
        mInfalter = (LayoutInflater) t.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return items.length;
    }

    @Override
    public Object getItem(int position) {
        return items[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v = mInfalter.inflate(R.layout.my_list_view_detail,null);

        TextView nameTextView = v.findViewById(R.id.nameTextView);
        TextView priceTextView = v.findViewById(R.id.price);
        TextView colorTextView = v.findViewById(R.id.colors);

        String name = items[position];
        String price = prices[position];
        String color = colors[position];

        nameTextView.setText(name);
        priceTextView.setText(price);
        colorTextView.setText(color);

        return v;
    }
}
