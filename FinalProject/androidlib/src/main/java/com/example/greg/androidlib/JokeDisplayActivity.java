package com.example.greg.androidlib;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Greg on 24-06-2016.
 */
public class JokeDisplayActivity extends ActionBarActivity  {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.joke_display);
        TextView jokeTv = (TextView)findViewById(R.id.joke_text_view);
        String joke = getIntent().getStringExtra("joke");
        jokeTv.setText(joke);

        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
