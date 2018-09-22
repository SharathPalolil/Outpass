package com.example.student.outpass;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MyAdapter extends BaseAdapter {
    String productNameArray[]={"shoe1","shoe2","tshirt1","tshirt2","watch1","watch2"};
    int[] productPriceArray={1200,600,460,549,2200,2199};
    int[] productStockArray={2,6,6,6,7,10};
    int[] productImageArray={R.drawable.shoe1,R.drawable.shoe2,R.drawable.tshirt1,R.drawable.tshirt2,R.drawable.watch1,R.drawable.watch2};
    LayoutInflater inflater;

    public MyAdapter(Context ct)
    {
        inflater=LayoutInflater.from(ct);
    }

    @Override
    public int getCount() {
        return productNameArray.length;
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup parent) {
        View custom_row_view=inflater.inflate(R.layout.list_view_row,parent,false);

        ImageView pImageView=(ImageView)custom_row_view.findViewById(R.id.ppimage);
        TextView pProductName=(TextView)custom_row_view.findViewById(R.id.pName);
        TextView pProductPrice=(TextView)custom_row_view.findViewById(R.id.pPrice);
        TextView pProductStock=(TextView)custom_row_view.findViewById(R.id.pStock);

        pProductName.setText("Name: "+productNameArray[i]);
        pProductPrice.setText("Price: "+productPriceArray[i]);
        pProductStock.setText("Stock: "+productStockArray[i]);
        pImageView.setImageResource(productImageArray[i]);

        return custom_row_view;
    }
}
