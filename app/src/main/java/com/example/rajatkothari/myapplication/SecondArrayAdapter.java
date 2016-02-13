package com.example.rajatkothari.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;



/**
 * Created by rajat kothari on 13-02-2016.
 */
public class SecondArrayAdapter extends ArrayAdapter<String> {
    Context context;
    String[] names;
    String[] desc;
    Integer[] a;

    public SecondArrayAdapter(Context context, int resource, String[] name, String[] desc, Integer[] a) {
        super(context, resource, name);
        this.context = context;
        this.names = name;
        this.desc = desc;
        this.a = a;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.abc, parent, false);
        TextView textView = (TextView) rowView.findViewById(R.id.textView);
        TextView textView2 = (TextView) rowView.findViewById(R.id.textView2);
        ImageView imgv = (ImageView) rowView.findViewById(R.id.imageView);
        textView.setText(names[position]);
        textView2.setText(desc[position]);
        imgv.setImageResource(a[position]);
        return rowView;
    }
}
