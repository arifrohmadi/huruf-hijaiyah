package com.blogspot.arifrohmadi.hurufhijaiyah;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.blogspot.arifrohmadi.hurufhijaiyah.adapter.ListHurufAdapter;
import com.blogspot.arifrohmadi.hurufhijaiyah.model.Huruf;
import com.blogspot.arifrohmadi.hurufhijaiyah.data.HurufData;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvHuruf;
    private ArrayList<Huruf> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvHuruf = findViewById(R.id.rv_huruf);
        rvHuruf.setHasFixedSize(true);

        list.addAll(HurufData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList() {
        rvHuruf.setLayoutManager(new LinearLayoutManager(this));
        ListHurufAdapter listHurufAdapter = new ListHurufAdapter(list);
        rvHuruf.setAdapter(listHurufAdapter);

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
                showRecyclerList();
                break;
            case R.id.about:
                Intent about = new Intent(MainActivity.this,About.class);
                startActivity(about);
                break;
            case R.id.istilah:
                Intent istilah = new Intent(MainActivity.this,Istilah.class);
                startActivity(istilah);
                break;
        }
    }
}
