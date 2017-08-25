package com.example.codetribe.camptshwane;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.hitomi.cmlibrary.CircleMenu;
import com.hitomi.cmlibrary.OnMenuSelectedListener;
import com.hitomi.cmlibrary.OnMenuStatusChangeListener;

public class MainActivity extends AppCompatActivity implements OnMenuSelectedListener, OnMenuStatusChangeListener {
    private CircleMenu CampTshwane;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

    }

    private void initView() {

        CampTshwane = (CircleMenu) findViewById(R.id.circle_menu);
        CampTshwane.setMainMenu(Color.parseColor("#1b5e20"), R.drawable.home, R.drawable.exist);
        CampTshwane.addSubMenu(Color.parseColor("#B07CDA"), R.drawable.accommodation);
        CampTshwane.addSubMenu(Color.parseColor("#B07CDA"), R.drawable.events);
        CampTshwane.addSubMenu(Color.parseColor("#B07CDA"), R.drawable.map);
        CampTshwane.addSubMenu(Color.parseColor("#B07CDA"), R.drawable.transport);
        CampTshwane.addSubMenu(Color.parseColor("#B07CDA"), R.drawable.activities);
        CampTshwane.addSubMenu(Color.parseColor("#B07CDA"), R.drawable.information);
        CampTshwane.setOnMenuSelectedListener(this);
        CampTshwane.setOnMenuStatusChangeListener(this);
    }






    public void facebook(View v) {
        Intent facebookIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/CityOfTshwane/"));
        startActivity(facebookIntent);
    }

    public void twitter(View v) {
        Intent twitterIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/CityTshwane?ref_src=twsrc%5Egoogle%7Ctwcamp%5Eserp%7Ctwgr%5Eauthor"));
        startActivity(twitterIntent);
    }

    public void instagram(View v) {
        Intent instagramIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.tshwane.gov.za/Pages/default.aspx"));
        startActivity(instagramIntent);

    }


    @Override
    public void onMenuSelected(int i) {
        switch (i){

            // Accommodation
            case 0:
                Toast.makeText(this,"accommodation",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this,Accommodation.class);
                startActivity(intent);

                break;


            //Events
            case 1:
                Intent events = new Intent(MainActivity.this,Events.class);
                startActivity(events);
                break;


            //Maps
            case 2:
                Intent maps = new Intent(MainActivity.this,MapsActivity.class);
                startActivity(maps);
                break;


            //transport
            case 3:
                Intent transport = new Intent(MainActivity.this,Transport.class);
                startActivity(transport);
                break;

            //activities
            case 4:
                Intent activities = new Intent(MainActivity.this,Activities.class);
                startActivity(activities);
                break;

            //information
            case 5:
                Intent information = new Intent(MainActivity.this,Information.class);
                startActivity(information);
                break;
        }

    }

    @Override
    public void onMenuOpened() {


    }

    @Override
    public void onMenuClosed() {


    }
}
