package com.black.flair.cityinsider;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    double lat[] = new double[10],vlat[]=new double[10];
    double lng[] = new double[10],vlng[]=new double[10];
    LatLng last[] = new LatLng[10];
    LatLng visited[] = new LatLng[10];
    double dist[] = new double[10];
    int count = 0, q=0;
    String src;
    double min;
    private Button b;
    private EditText e;

    String a[] = new String[10];//,b,c,d,e,f,g,h,i,j;

    String las[]=new String[10];

    boolean z0, z1, z2, z3, z4, z5, z6, z7, z8, z9;
    //TextView et1,et2,et3,et4,et5,et6,et7,et8,et9,et10;
    TextView et[]=new TextView[10];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);

        b = findViewById(R.id.button7);
        e = findViewById(R.id.editText);

        et[0]=(TextView)findViewById(R.id.t1);
        et[1]=(TextView)findViewById(R.id.t2);
        et[2]=(TextView)findViewById(R.id.t3);
        et[3]=(TextView)findViewById(R.id.t4);
        et[4]=(TextView)findViewById(R.id.t5);
        et[5]=(TextView)findViewById(R.id.t6);
        et[6]=(TextView)findViewById(R.id.t7);
        et[7]=(TextView)findViewById(R.id.t8);
        et[8]=(TextView)findViewById(R.id.t9);
        et[9]=(TextView)findViewById(R.id.t10);

        boolean q0 = getIntent().getExtras().getBoolean("a0");
        boolean q1 = getIntent().getExtras().getBoolean("a1");
        boolean q2 = getIntent().getExtras().getBoolean("a2");
        boolean q3 = getIntent().getExtras().getBoolean("a3");
        boolean q4 = getIntent().getExtras().getBoolean("a4");
        boolean q5 = getIntent().getExtras().getBoolean("a5");
        boolean q6 = getIntent().getExtras().getBoolean("a6");
        boolean q7 = getIntent().getExtras().getBoolean("a7");
        boolean q8 = getIntent().getExtras().getBoolean("a8");
        boolean q9 = getIntent().getExtras().getBoolean("a9");

        z0 = q0;
        z1 = q1;
        z2 = q2;
        z3 = q3;
        z4 = q4;
        z5 = q5;
        z6 = q6;
        z7 = q7;
        z8 = q8;
        z9 = q9;




        mapFragment.getMapAsync(this);
    }



    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        if (z0) {
            las[0]="Mysore Palace";
           count++;
            LatLng mp = new LatLng(lat[0] = 12.3051, lng[0] = 76.6551);
            visited[count] = new LatLng(vlat[count]=lat[0], vlng[count]=lng[0]);
            mMap.addMarker(new MarkerOptions().position(mp).title("Mysore Palace"));
            float zoomLevel = 11.0f;
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(mp, zoomLevel));
        }

        if (z1) {
            las[1]="Brindavan Gardens";
            count++;
            LatLng bg = new LatLng(lat[1] = 12.4216, lng[1] = 76.5725);
            visited[count] = new LatLng(vlat[count]=lat[1], vlng[count]=lng[1]);
            mMap.addMarker(new MarkerOptions().position(bg).title("Bri n d a   van Gardens"));
            float zoomLevel = 8.0f;
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(bg, zoomLevel));
        }

        if (z2) {
            las[2]="Mysore Zoo";
            count++;
            LatLng zoo = new LatLng(lat[2] = 12.3022, lng[2] = 76.6640);
            visited[count] = new LatLng(vlat[count]=lat[2], vlng[count]=lng[2]);
            mMap.addMarker(new MarkerOptions().position(zoo).title("Mysore Zoo"));
            float zoomLevel = 8.0f;
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(zoo, zoomLevel));
        }

        if (z3) {
            las[3]="Karanji Lake";
            count++;
            LatLng kl = new LatLng(lat[3] = 12.3028, lng[3] = 76.6736);
            visited[count] = new LatLng(vlat[count]=lat[3],vlng[count]= lng[3]);
            mMap.addMarker(new MarkerOptions().position(kl).title("Karanji Lake"));
            float zoomLevel = 8.0f;
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(kl, zoomLevel));
        }

        if (z4) {
            las[4]="Mall Of Mysore";
            count++;
            LatLng mm = new LatLng(lat[4] = 12.2977, lng[4] = 76.6644);
            visited[count] = new LatLng(vlat[count]=lat[4], vlng[count]=lng[4]);
            mMap.addMarker(new MarkerOptions().position(mm).title("Mall Of Mysore"));
            float zoomLevel = 8.0f;
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(mm, zoomLevel));
        }

        if (z5) {
            las[5]="GRS Fantacy Park";
            count++;
            LatLng grs = new LatLng(lat[5] = 12.3531, lng[5] = 76.6346);
            visited[count] = new LatLng(vlat[count]=lat[5], vlng[count]=lng[5]);
            mMap.addMarker(new MarkerOptions().position(grs).title("GRS Fantacy Park"));
            float zoomLevel = 8.0f;
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(grs, zoomLevel));
        }

        if (z6) {
            las[6]="Chamundi Hill";
            count++;
            LatLng ch = new LatLng(lat[6] = 12.2753, lng[6] = 76.6701);
            visited[count] = new LatLng(vlat[count]=lat[6], vlng[count]=lng[6]);
            mMap.addMarker(new MarkerOptions().position(ch).title("Chamundi Hill"));
            float zoomLevel = 8.0f;
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(ch, zoomLevel));
        }

        if (z7) {
            las[7]="Lalit Mahal Palace";
            count++;
            LatLng lm = new LatLng(lat[7] = 12.2983, lng[7] = 76.6926);
            visited[count] = new LatLng(vlat[count]=lat[7], vlng[count]=lng[7]);
            mMap.addMarker(new MarkerOptions().position(lm).title("Lalit Mahal Palace"));
            float zoomLevel = 8.0f;
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(lm, zoomLevel));
        }

        if (z8) {
            las[8]="Art Gallery";
            count++;
            LatLng ag = new LatLng(lat[8] = 12.3068, lng[8] = 76.6499);
            visited[count] = new LatLng(vlat[count]=lat[8], vlng[count]=lng[8]);
            mMap.addMarker(new MarkerOptions().position(ag).title("Art Gallery"));
            float zoomLevel = 8.0f;
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(ag, zoomLevel));
        }

        if (z9) {
            las[9]="Srirangpatna Temple";
            count++;
            LatLng st = new LatLng(lat[9] = 12.4216, lng[9] = 76.6931);
            visited[count] = new LatLng(vlat[count]=lat[9], vlng[count]=lng[9]);
            mMap.addMarker(new MarkerOptions().position(st).title("Srirangpatna Temple"));
            float zoomLevel = 8.0f;
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(st, zoomLevel));
        }


       calculate();

        double p;


    }


  public void calculate() {

     last[q] = visited[q];
     et[q].setText(las[q]);


    int t=0;

      for (int i = 0; i <count; i++)

          dist[i] = Math.sqrt(((vlat[0] - vlat[i]) * (vlat[0] - vlat[i])) + ((vlng[0] - vlng[i]) * (vlng[0] - vlng[i])));

      min = dist[0];

      for (int z = 0; z <= 9; z++) {


          if (min < dist[z]) {
              min = dist[z];
              visited[0] = visited[z];
              last[q] = visited[0];
              et[t].setText(las[q]);
              t++;
              for (int n = z; n < count; n++)
                  visited[n] = visited[n + 1];
              count--;

          }
          q++;

      }

  }

}


