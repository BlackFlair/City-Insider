package com.black.flair.cityinsider;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;

import com.black.flair.cityinsider.R;
import com.google.android.gms.maps.model.LatLng;

public class tourist extends AppCompatActivity  {

    private Button b;
    private CheckBox c1, c2, c3, c4, c5, c6, c7, c8, c9, c0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tourist);

        final String a[] = new String[10];

        c0=(CheckBox)findViewById(R.id.checkBox1);
        c1=(CheckBox)findViewById(R.id.checkBox2);
        c2=(CheckBox)findViewById(R.id.checkBox3);
        c3=(CheckBox)findViewById(R.id.checkBox4);
        c4=(CheckBox)findViewById(R.id.checkBox5);
        c5=(CheckBox)findViewById(R.id.checkBox6);
        c6=(CheckBox)findViewById(R.id.checkBox7);
        c7=(CheckBox)findViewById(R.id.checkBox8);
        c8=(CheckBox)findViewById(R.id.checkBox9);
        c9=(CheckBox)findViewById(R.id.checkBox10);
        b =(Button) findViewById(R.id.button4);


        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent x = new Intent(tourist.this, MapsActivity.class);
                if(c0.isChecked())
                    x.putExtra("a0",true);
                if(c1.isChecked())
                    x.putExtra("a1", true);
                if(c2.isChecked())
                    x.putExtra("a2", true);
                if(c3.isChecked())
                    x.putExtra("a3", true);
                if(c4.isChecked())
                    x.putExtra("a4", true);
                if(c5.isChecked())
                    x.putExtra("a5", true);
                if(c6.isChecked())
                    x.putExtra("a6", true);
                if(c7.isChecked())
                    x.putExtra("a7", true);
                if(c8.isChecked())
                    x.putExtra("a8", true);
                if(c9.isChecked())
                    x.putExtra("a9", true);

                startActivity(x);

            }
        });


    }

}
