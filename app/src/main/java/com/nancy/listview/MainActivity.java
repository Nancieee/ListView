package com.nancy.listview;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView myView;
    String [] items;
    String [] prices;
    String [] colors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Resources res = getResources();
        items = res.getStringArray(R.array.items);
        prices = res.getStringArray(R.array.prices);
        colors = res.getStringArray(R.array.colors);
        myView = findViewById(R.id.myListView);

        ItemAdapter itemAdapter = new ItemAdapter(this, items, prices,colors);
        myView.setAdapter(itemAdapter);

        myView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent showPic = new Intent(getApplicationContext(),DetailActivity.class);
                showPic.putExtra("com.nancy.listview.Item_Index", position);

                startActivity(showPic);
            }
        });


    }
}
