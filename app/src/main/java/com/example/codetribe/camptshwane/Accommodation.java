package com.example.codetribe.camptshwane;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class Accommodation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        getSupportActionBar().setTitle("Accommodation");

        Intent intent = getIntent();

        // Add back button
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //Create an array of words
        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("Koedoesrus Boskamp","http://www.planyourholiday.co.za/view/koedoesrusboskamp",R.drawable.koedoesrus));
        words.add(new Word("Ciara Lodge","https://www.ciaralodge.co.za/about-us",R.drawable.ciara_lodge));
        words.add(new Word("Faircity Roodevallei","http://faircity.co.za/faircity-hotels/roodevallei-accommodation-pretoria/",R.drawable.faircity_roodevallei));
        words.add(new Word("Loodswaai","http://loodswaai.co.za",R.drawable.loodswaai));
        words.add(new Word("Houtbosdorp","http://www.houtbosdorp.co.za",R.drawable.houtbosdorp));
        words.add(new Word("Ngata Safari Lodge","https://ngatasafari.co.za/",R.drawable.ngata_safari_lodge));
        words.add(new Word("Ouklip Game Lodge","http://www.ouklip.co.za/",R.drawable.ouklip_game_lodge));
        words.add(new Word("Stoney Broke Farm","http://www.stonybrookcottages.co.za/index.php",R.drawable.stoney_brooke_farm));
        words.add(new Word("Tree Top and Treats guest house","http://www.treetopsandtreats.co.za/",R.drawable.treetops_treats));
        words.add(new Word("Wild Peach Inn","http://wildpeachinn.co.za/",R.drawable.wild_peach));


        // Create an {@@link WordAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create list item for each item in the list.
        WordAdapter adapter = new WordAdapter(this, words);

        //Word_List.xml file
        ListView listView = (ListView)findViewById(R.id.list);

        //Make the {@link ListView} use the {@Link WordAdaptr}
        listView.setAdapter(adapter);


    }



}
