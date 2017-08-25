package com.example.codetribe.camptshwane;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.location.places.Place;
import com.google.android.gms.location.places.ui.PlacePicker;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;


public class MapsActivity extends AppCompatActivity implements OnMapReadyCallback {

    Button button;
    private static final int PLACE_PICKER_REQUEST = 1;
    private GoogleMap mMap;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);

        button = (Button) findViewById(R.id.openMap);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startPlacePickerActivity();

            }

        });




    }


    public void startPlacePickerActivity() {
        PlacePicker.IntentBuilder intentBuilder = new PlacePicker.IntentBuilder();

        try {
            Intent intent = intentBuilder.build(this);
            startActivityForResult(intent, PLACE_PICKER_REQUEST );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }




    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == PLACE_PICKER_REQUEST) {
            if (resultCode == RESULT_OK) {
                displaySelectedPlaceFromPlacePicker(data);
            }
        }
    }

    protected void displaySelectedPlaceFromPlacePicker(Intent data) {
        Place placeSelected = PlacePicker.getPlace(MapsActivity.this, data);

        String name = placeSelected.getName().toString();
        String address = placeSelected.getAddress().toString();

        TextView selectedLocation = (TextView) findViewById(R.id.text);
        selectedLocation.setText(name + "," + address);


    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */


    @Override
    public void onMapReady(GoogleMap googleMap) {

        // Add a marker in Pretoria and move the camera
        LatLng pretoria = new LatLng(-25.731340, 28.218370);
        mMap.addMarker(new MarkerOptions().position(pretoria).title("Marker in Pretoria"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(pretoria));
    }
}




