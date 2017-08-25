package com.example.codetribe.camptshwane;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class Activities extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        getSupportActionBar().setTitle("Activities");

        Intent intent = getIntent();

        // Add back button
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //Create an array of words
        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("Abseiling","https://www.dirtyboots.co.za/activities/town/abseiling/pretoria-adventures",R.drawable.abseiling));
        words.add(new Word("Acrobranch","https://www.dirtyboots.co.za/activities/town/acrobranch-south-africa/pretoria-adventures",R.drawable.acrobranch));
        words.add(new Word("Archery","https://www.dirtyboots.co.za/activities/town/archery/pretoria-adventures",R.drawable.faircity_roodevallei));
        words.add(new Word("Karting","https://www.dirtyboots.co.za/activities/town/go-karts/pretoria-adventures",R.drawable.go_karting));
        words.add(new Word("Hang Gliding","https://www.dirtyboots.co.za/activities/town/hang-gliding/pretoria-adventures",R.drawable.hang_gliding));
        words.add(new Word("Horse Riding","https://www.dirtyboots.co.za/activities/town/horse-riding/pretoria-adventures",R.drawable.horse_riding));
        words.add(new Word("Quad biking","https://www.dirtyboots.co.za/activities/town/quad-biking/pretoria-adventures",R.drawable.quad_biking));
        words.add(new Word("River Rafting","https://www.dirtyboots.co.za/activities/town/river-rafting/pretoria-adventures",R.drawable.river_rafting));
        words.add(new Word("Zip Line","https://www.dirtyboots.co.za/activities/town/zip-line/pretoria-adventures",R.drawable.zip_line));


        // Create an {@@link WordAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create list item for each item in the list.
        WordAdapter adapter = new WordAdapter(this, words);

        //Word_List.xml file
        ListView listView = (ListView)findViewById(R.id.list);

        //Make the {@link ListView} use the {@Link WordAdaptr}
        listView.setAdapter(adapter);


    }



}
