package com.example.win10.resepmakanan;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by win 10 on 04/10/2017.
 */

public class Adapterku extends RecyclerView.Adapter<Adapterku.MyHolder> {

    String data1[],data2[],data3[];
    int img[];
    Context ctx;

    public Adapterku(Context ct,String s1[],String s2[],String s3[],int i1[]){
        ctx = ct;
        data1=s1;
        data2=s2;
        data3=s3;
        img=i1;
    }

    @Override
    public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater myInflater = LayoutInflater.from(ctx);
        View myView = myInflater.inflate(R.layout.my_row,parent,false);
        return new MyHolder(myView);
    }

    @Override
    public void onBindViewHolder(MyHolder holder, final int position) {
        holder.t1.setText(data1[position]);
        holder.t2.setText(data2[position]);
        holder.myImage.setImageResource(img[position]);

        holder.cardView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), Detail.class);
                i.putExtra("id_img", img[position]);
                i.putExtra("id_judul", data1[position]);
                i.putExtra("id_resep", data3[position]);
                v.getContext().startActivity(i);
            }
        });
    }

    @Override
    public int getItemCount() {
        return data1.length;
    }

    public class MyHolder extends RecyclerView.ViewHolder{
        CardView cardView;
        TextView t1,t2;
        ImageView myImage;
        public MyHolder(View itemView) {
            super(itemView);
            t1 = (TextView)itemView.findViewById(R.id.Text1);
            t2 = (TextView)itemView.findViewById(R.id.Text2);
            myImage = (ImageView)itemView.findViewById(R.id.myImage);
            cardView = (CardView) itemView.findViewById(R.id.cardItem);
            //itemView.setOnClickListener(this);
        }

//        @Override
//        public void onClick(View v) {
//            String teks =t1.getText()+" "+t2.getText();
//
//        }
    }
}
