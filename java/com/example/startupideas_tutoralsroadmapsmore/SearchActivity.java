package com.example.startupideas_tutoralsroadmapsmore;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

import java.util.ArrayList;

public class SearchActivity extends AppCompatActivity {
    SearchView searchView;
    ListView listView;
    ArrayList list;
    ArrayAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        getSupportActionBar().hide();

        searchView = findViewById(R.id.searchView);
        listView = findViewById(R.id.listView);
        list = new ArrayList<>();

        list.add(getString(R.string.SA_stringTH1).toString());
        list.add(getString(R.string.SA_stringTH2).toString());
        list.add(getString(R.string.SA_stringTH3).toString());
        list.add(getString(R.string.SA_stringTH4).toString());
        list.add(getString(R.string.SA_stringTH5).toString());
        list.add(getString(R.string.SA_stringTH6).toString());
        list.add(getString(R.string.SA_stringTH7).toString());
        list.add(getString(R.string.SA_stringTH8).toString());
        list.add(getString(R.string.SA_stringTH9).toString());
        list.add(getString(R.string.SA_stringTH10).toString());
        list.add(getString(R.string.SA_stringTH11).toString());
        list.add(getString(R.string.SA_stringTH12).toString());
        list.add(getString(R.string.SA_stringTH13).toString());
        list.add(getString(R.string.SA_stringTH14).toString());
        list.add(getString(R.string.SA_stringTH15).toString());
        list.add(getString(R.string.SA_stringTH16).toString());
        list.add(getString(R.string.SA_stringTH17).toString());
        list.add(getString(R.string.SA_stringTH18).toString());
        list.add(getString(R.string.SA_stringTH19).toString());
        list.add(getString(R.string.SA_stringTH20).toString());
        list.add(getString(R.string.SA_stringTH21).toString());
        list.add(getString(R.string.SA_stringTH22).toString());
        list.add(getString(R.string.SA_stringTH23).toString());
        list.add(getString(R.string.SA_stringTH24).toString());
        list.add(getString(R.string.SA_stringTH25).toString());
        list.add(getString(R.string.SA_stringTH26).toString());
        list.add(getString(R.string.SA_stringTH27).toString());
        list.add(getString(R.string.SA_stringTH28).toString());
        list.add(getString(R.string.SA_stringTH29).toString());
        list.add(getString(R.string.SA_stringTH30).toString());
        list.add(getString(R.string.SA_stringTH31).toString());
        list.add(getString(R.string.SA_stringTH32).toString());
        list.add(getString(R.string.SA_stringTH33).toString());
        list.add(getString(R.string.SA_stringTH34).toString());
        list.add(getString(R.string.SA_stringTH35).toString());
        list.add(getString(R.string.SA_stringTH36).toString());
        list.add(getString(R.string.SA_stringTH37).toString());
        list.add(getString(R.string.SA_stringTH38).toString());

        list.add(getString(R.string.SA_stringTH40).toString());
        list.add(getString(R.string.SA_stringTH41).toString());
        list.add(getString(R.string.SA_stringTH42).toString());
        list.add(getString(R.string.SA_stringTH43).toString());
        list.add(getString(R.string.SA_stringTH44).toString());
        list.add(getString(R.string.SA_stringTH45).toString());
        list.add(getString(R.string.SA_stringTH46).toString());
        list.add(getString(R.string.SA_stringTH47).toString());
        list.add(getString(R.string.SA_stringTH48).toString());
        list.add(getString(R.string.SA_stringTH49).toString());
        list.add(getString(R.string.SA_stringTH50).toString());
        list.add(getString(R.string.SA_stringTH51).toString());
        list.add(getString(R.string.SA_stringTH52).toString());
        list.add(getString(R.string.SA_stringTH53).toString());
        list.add(getString(R.string.SA_stringTH54).toString());

        list.add(getString(R.string.SA_stringTH56).toString());
        list.add(getString(R.string.SA_stringTH57).toString());
        list.add(getString(R.string.SA_stringTH58).toString());
        list.add(getString(R.string.SA_stringTH59).toString());
        list.add(getString(R.string.SA_stringTH60).toString());
        list.add(getString(R.string.SA_stringTH61).toString());
        list.add(getString(R.string.SA_stringTH62).toString());
        list.add(getString(R.string.SA_stringTH63).toString());
        list.add(getString(R.string.SA_stringTH64).toString());
        list.add(getString(R.string.SA_stringTH65).toString());

        list.add(getString(R.string.SA_stringTH67).toString());
        list.add(getString(R.string.SA_stringTH68).toString());
        list.add(getString(R.string.SA_stringTH69).toString());
        list.add(getString(R.string.SA_stringTH70).toString());
        list.add(getString(R.string.SA_stringTH71).toString());
        list.add(getString(R.string.SA_stringTH72).toString());
        list.add(getString(R.string.SA_stringTH73).toString());
        list.add(getString(R.string.SA_stringTH74).toString());
        list.add(getString(R.string.SA_stringTH75).toString());
        list.add(getString(R.string.SA_stringTH76).toString());
        list.add(getString(R.string.SA_stringTH77).toString());
        list.add(getString(R.string.SA_stringTH78).toString());


        adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1,list);
        listView.setAdapter(adapter);
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                if(list.contains(query)){
                    adapter.getFilter().filter(query);
                }else{
                    Toast.makeText(getApplicationContext(), "No Match found", Toast.LENGTH_LONG).show();
                }
                return false;
            }
            @Override
            public boolean onQueryTextChange(String newText) {
                adapter.getFilter().filter(newText);
                return false;
            }
        });



        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position,
                                    long id) {
                int integer_value = position + 1;
//                String val = Integer.toString(integer_value);
//              Toast.makeText(getActivity(), val,Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), ScrollingActivity.class);
                if(integer_value<39){
                    intent.putExtra("keyI_MISA", integer_value);
                }
                if(integer_value>39 &&  integer_value<55){
                    integer_value=integer_value+1;
                    intent.putExtra("keyI_MISA", integer_value);
                }
                if(integer_value>55  &&  integer_value<79){
                    integer_value=integer_value+2;
                    intent.putExtra("keyI_MISA", integer_value);
                }

                SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor editor = preferences.edit();
                editor.putInt("sp_scrollAct", 6);
                editor.apply();


                startActivity(intent);
            }
        });


    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent(SearchActivity.this, activity_navigation_drawer.class);
        startActivity(intent);

    }
}