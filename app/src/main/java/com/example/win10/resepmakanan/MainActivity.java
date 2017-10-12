package com.example.win10.resepmakanan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    RecyclerView r1;
    String s1[],s2[],s3[];
    int ImageResource[]={R.drawable.nasi_goreng,R.drawable.nasi_ruwet,R.drawable.ayam_goreng,R.drawable.ayam_geprek};

    Adapterku ad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        r1=(RecyclerView)findViewById(R.id.myRecycler);

        s1=getResources().getStringArray(R.array.nama_makanan);
        s2=getResources().getStringArray(R.array.deskripsi);
        s3=getResources().getStringArray(R.array.resep);
        ad = new Adapterku(this,s1,s2,s3,ImageResource);

        r1.setAdapter(ad);
        r1.setLayoutManager(new LinearLayoutManager(this));
    }
}
