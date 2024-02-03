package com.example.custom_country_list;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MyAdapter extends BaseAdapter {
    ArrayList<Country> countryList;
    Activity myContent;

    public MyAdapter(ArrayList<Country> countryList, Activity myContent) {
        this.countryList = countryList;
        this.myContent = myContent;
    }

    @Override
    public int getCount() {
        return countryList.size();
    }

    @Override
    public Object getItem(int position) {
        return countryList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v=convertView;
        if(v==null){
            LayoutInflater layoutInflater=myContent.getLayoutInflater();
            v=layoutInflater.inflate(R.layout.row_item,null);
        }
        ImageView img=(ImageView) v.findViewById(R.id.imgCountry);
        TextView countryName=(TextView) v.findViewById(R.id.txtCountry);
        TextView area=(TextView) v.findViewById(R.id.txtArea);
        TextView population=(TextView) v.findViewById(R.id.txtPopulation);
        TextView lang=(TextView) v.findViewById(R.id.txtLanguage);

        Country C=countryList.get(position);
        //set
        img.setImageResource(C.getImg());
        countryName.setText(C.getCountryName());
        area.setText("Area :"+C.getArea());
        population.setText("Population:"+C.getPopulation());
        lang.setText("Language :" + C.getLanguage());
        return v;
    }


}
