package com.example.codetribe.camptshwane;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class Transport extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        getSupportActionBar().setTitle("Transport");

        Intent intent = getIntent();

        // Add back button
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //Create an array of words
        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("eTuk Tuk","http://www.e-tuktuk.co.za/",R.drawable.tuk));
        words.add(new Word("Uber","https://www.uber.com/en-ZA/ride/",R.drawable.uber));
        words.add(new Word("Tshwane Bus Service","http://www.tshwane.gov.za/sites/residents/TshwaneBusSerivces/Pages/default.aspx",R.drawable.tshwane));
        words.add(new Word("A Re Yeng","http://www.tshwane.gov.za/sites/areyeng",R.drawable.areyeng));
        words.add(new Word("The Blue Train","http://www.bluetrain.co.za/",R.drawable.blue_train));
        words.add(new Word("Coaches","https://www.rentautobus.com/en/south-africa/gauteng/pretoria/item1758",R.drawable.sprinter));
        words.add(new Word("GauTrain","http://www.gautrain.co.za/",R.drawable.gautrain));




        // Create an {@@link WordAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create list item for each item in the list.
        WordAdapter adapter = new WordAdapter(this, words);

        //Word_List.xml file
        ListView listView = (ListView)findViewById(R.id.list);

        //Make the {@link ListView} use the {@Link WordAdaptr}
        listView.setAdapter(adapter);


    }



}
