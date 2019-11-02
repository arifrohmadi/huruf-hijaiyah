package com.blogspot.arifrohmadi.hurufhijaiyah;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class Istilah extends AppCompatActivity {
    private TextView tvistilah;

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_istilah);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        this.setTitle("Istilah");

        tvistilah = (TextView)findViewById(R.id.tv_istilah_name);

        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
            tvistilah.setText(Html.fromHtml(getString(R.string.istilah)),TextView.BufferType.SPANNABLE);
        } else {
            tvistilah.setText(Html.fromHtml(getString(R.string.istilah)),TextView.BufferType.SPANNABLE);
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }
    public void setMode(int selectedMode) {
        switch (selectedMode) {
            case R.id.home:
                Intent home = new Intent(Istilah.this,MainActivity.class);
                startActivity(home);
                break;
            case R.id.about:
                Intent about = new Intent(Istilah.this,About.class);
                startActivity(about);
                break;
            case R.id.istilah:
                break;
        }
    }
}
