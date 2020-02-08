package com.example.pokemonadapter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        String[] myStringArray = { "Bulbasaur", "Dragonite", "Pikachu" };
//
//        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, myStringArray);
//
//        ListView listView = (ListView) findViewById(R.id.list_view);
//        listView.setAdapter(adapter);
//
//        AdapterView.OnItemClickListener mMessageClickedHandler = new AdapterView.OnItemClickListener() {
//            public void onItemClick(AdapterView parent, View v, int position, long id) {
//                String message = adapter.getItem(position);
//                Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();
//            }
//        };
//
//        listView.setOnItemClickListener(mMessageClickedHandler);

        RecyclerView recyclerView = findViewById(R.id.recycler_view);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        List<Pokemon> list = new ArrayList<>();

        list.add(new Pokemon(R.drawable.bulbasaur, "Bulbasaur"));
        list.add(new Pokemon(R.drawable.dragonite, "Dragonite"));
        list.add(new Pokemon(R.drawable.pikachu, "Pikachu"));

        recyclerView.setAdapter(new PokemonAdapter(list));
    }
}
