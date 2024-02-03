package com.example.custom_country_list;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView countryListView;
    ArrayList<Country>myCountryList=new ArrayList<Country>();
    Country country;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        countryListView=(ListView) findViewById(R.id.countryList);
        country=new Country("Cambodia",170000000,"Khmer",181035,R.drawable.cambodia);
        myCountryList.add(country);
        country=new Country("ThaiLand",12321322,"Thai",132321.55,R.drawable.thailand);
        myCountryList.add(country);
        country=new Country("Laos",170000000,"Khmer",181035,R.drawable.laos);
        myCountryList.add(country);
        country=new Country("Malaysia",170000000,"Khmer",181035,R.drawable.malaysia);
        myCountryList.add(country);
        country=new Country("Vietnam",170000000,"Khmer",181035,R.drawable.vietnam);
        myCountryList.add(country);
        country=new Country("Philipine",170000000,"Khmer",181035,R.drawable.philipine);
        myCountryList.add(country);
        country=new Country("Cambodia",170000000,"Khmer",181035,R.drawable.cambodia);
        myCountryList.add(country);
        country=new Country("Cambodia",170000000,"Khmer",181035,R.drawable.cambodia);
        myCountryList.add(country);
        //add array list to adapter
        MyAdapter myAdapter=new MyAdapter(myCountryList,this);
        //add adapter to list view
        countryListView.setAdapter(myAdapter);
     }
}