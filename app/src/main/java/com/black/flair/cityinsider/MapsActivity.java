package com.black.flair.cityinsider;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    String a[] = new String[10];//,b,c,d,e,f,g,h,i,j;

    boolean z0,z1,z2,z3,z4,z5,z6,z7,z8,z9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);


        boolean q0 =getIntent().getExtras().getBoolean("a0");
        boolean q1 =getIntent().getExtras().getBoolean("a1");
        boolean q2 =getIntent().getExtras().getBoolean("a2");
        boolean q3 =getIntent().getExtras().getBoolean("a3");
        boolean q4 =getIntent().getExtras().getBoolean("a4");
        boolean q5 =getIntent().getExtras().getBoolean("a5");
        boolean q6 =getIntent().getExtras().getBoolean("a6");
        boolean q7 =getIntent().getExtras().getBoolean("a7");
        boolean q8 =getIntent().getExtras().getBoolean("a8");
        boolean q9 =getIntent().getExtras().getBoolean("a9");

        z0=q0;
        z1=q1;
        z2=q2;
        z3=q3;
        z4=q4;
        z5=q5;
        z6=q6;
        z7=q7;
        z8=q8;
        z9=q9;


        mapFragment.getMapAsync(this);
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
        mMap = googleMap;

        double lat[]=new double[10];
        double lng[]=new double[10];

        if(z0){
            LatLng mp = new LatLng(lat[0]=12.3051, lng[0]=76.6551);
            mMap.addMarker(new MarkerOptions().position(mp).title("Marker in Mysore Palace"));
            float zoomLevel = 11.0f;
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(mp, zoomLevel));
        }

        if(z1){
            LatLng bg = new LatLng(lat[1]=12.4216, lng[1]=76.5725);
            mMap.addMarker(new MarkerOptions().position(bg).title("Marker in Mysore Palace"));
            float zoomLevel = 8.0f;
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(bg, zoomLevel));
        }

        if(z2){
            LatLng zoo = new LatLng(lat[2]=12.3022, lng[2]=76.6640);
            mMap.addMarker(new MarkerOptions().position(zoo).title("Marker in Mysore Palace"));
            float zoomLevel = 8.0f;
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(zoo, zoomLevel));
        }

        if(z3){
            LatLng kl = new LatLng(lat[3]=12.3028, lng[3]=76.6736);
            mMap.addMarker(new MarkerOptions().position(kl).title("Marker in Mysore Palace"));
            float zoomLevel = 8.0f;
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(kl, zoomLevel));
        }

        if(z4){
            LatLng mm = new LatLng(lat[4]=12.2977, lng[4]=76.6644);
            mMap.addMarker(new MarkerOptions().position(mm).title("Marker in Mysore Palace"));
            float zoomLevel = 8.0f;
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(mm, zoomLevel));
        }

        if(z5){
            LatLng grs = new LatLng(lat[5]=12.3531, lng[5]=76.6346);
            mMap.addMarker(new MarkerOptions().position(grs).title("Marker in Mysore Palace"));
            float zoomLevel = 8.0f;
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(grs, zoomLevel));
        }

        if(z6){
            LatLng ch = new LatLng(lat[6]=12.2753, lng[6]=76.6701);
            mMap.addMarker(new MarkerOptions().position(ch).title("Marker in Mysore Palace"));
            float zoomLevel = 8.0f;
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(ch, zoomLevel));
        }

        if(z7){
            LatLng lm = new LatLng(lat[7]=12.2983, lng[7]=76.6926);
            mMap.addMarker(new MarkerOptions().position(lm).title("Marker in Mysore Palace"));
            float zoomLevel = 8.0f;
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(lm, zoomLevel));        }

        if(z8){
            LatLng ag = new LatLng(lat[8]=12.3068, lng[8]=76.6499);
            mMap.addMarker(new MarkerOptions().position(ag).title("Marker in Mysore Palace"));
            float zoomLevel = 8.0f;
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(ag, zoomLevel));
        }

        if(z9){
            LatLng st = new LatLng(lat[9]=12.4216, lng[9]=76.6931);
            mMap.addMarker(new MarkerOptions().position(st).title("Marker in Mysore Palace"));
            float zoomLevel = 8.0f;
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(st, zoomLevel));
        }



    }
}
