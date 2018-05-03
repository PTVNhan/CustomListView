package com.example.nhanphan.customlistview;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CursorAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.zip.Inflater;

public class CustomAdapter extends ArrayAdapter<String> {
    Context context;
    Integer[] thumnails;
    String [] imageNames;
    public CustomAdapter(Context context, int Layout, String [] imageNames, Integer[] thumnails){
        super(context,R.layout.custom_row,imageNames);
        this.context = context;
        this.thumnails = thumnails;
        this.imageNames = imageNames;
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //return super.getView(position, convertView, parent);
        LayoutInflater inflater = ((Activity)context).getLayoutInflater();
        View row = inflater.inflate(R.layout.custom_row, null);

        ImageView imgIcon = (ImageView)row.findViewById(R.id.imgIcon);
        TextView txtPhotoName = (TextView)row.findViewById(R.id.txtPhotoName);
        TextView txtImageSize = (TextView)row.findViewById(R.id.txtImageSize);

        imgIcon.setImageResource(thumnails[position]);
        txtPhotoName.setText(imageNames[position]);
        txtImageSize.setText("100x100");

        return (row);
    }
}
