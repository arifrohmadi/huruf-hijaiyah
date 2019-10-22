package com.blogspot.arifrohmadi.hurufhijaiyah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Detail extends AppCompatActivity {
    String name, makhraj, sifat;
    int photo, photo_makhraj;
    private TextView tvname, tvdetail, tvsifat;
    private ImageView imgphoto, imgphotomakhraj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        if (savedInstanceState == null) {
            Bundle extras = getIntent().getExtras();
            if(extras == null) {
                name = null;
                makhraj = null;
                sifat = null;
                photo = 0;
                photo_makhraj = 0;
            } else {
                name = extras.getString("name");
                makhraj = extras.getString("makhraj");
                sifat= extras.getString("sifat");
                photo = extras.getInt("photo");
                photo_makhraj = extras.getInt("photo_makhraj");
            }
        } else {
            name = (String) savedInstanceState.getSerializable("name");
            makhraj = (String) savedInstanceState.getSerializable("makhraj");
            sifat = (String) savedInstanceState.getSerializable("sifat");
        }

        this.setTitle("Huruf "+name);
        tvname = (TextView)findViewById(R.id.tv_detail_name);
        tvdetail = (TextView)findViewById(R.id.tv_detail_detail);
        tvsifat = (TextView)findViewById(R.id.tv_detail_sifat);

        imgphoto = (ImageView)findViewById(R.id.img_detail_photo);
        imgphotomakhraj = (ImageView)findViewById(R.id.img_detail_photomakhraj);

        tvname.setText(name);
        tvdetail.setText(makhraj);
        tvsifat.setText("Sifat Huruf: "+ sifat);
        imgphoto.setImageResource(photo);
        imgphotomakhraj.setImageResource(photo_makhraj);
    }
}
