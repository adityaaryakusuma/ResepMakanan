package com.example.win10.resepmakanan;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by win 10 on 05/10/2017.
 */

public class Detail extends AppCompatActivity {

    ///Deklarasi
    ImageView img;
    TextView judul,resep;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_item);

        img = (ImageView) findViewById(R.id.detail_img);
        judul = (TextView) findViewById(R.id.detail_judul);
        resep = (TextView) findViewById(R.id.detail_resep);
        setData();

    }

    private void setData(){
        img.setImageResource(getIntent().getIntExtra("id_img",0));
        judul.setText(getIntent().getStringExtra("id_judul"));
        resep.setText(getIntent().getStringExtra("id_resep"));
    }
}
