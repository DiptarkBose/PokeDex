package com.first.pro.pokedex;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class SearchActivity extends AppCompatActivity {
    String query;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

    }

    public void SearchQuery(View view) {
        EditText text = (EditText) findViewById(R.id.editText);
        query = text.getText().toString();
        Intent intent = new Intent(this, InfoActivity.class);
        intent.putExtra("pokemon", query);
        startActivity(intent);
    }
}
