package com.test.jliu.customviews;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class customViews extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_views);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_custom_views, menu);
        final MyTextView textView = (MyTextView) findViewById(R.id.textView1);
        textView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textView.incrementAndUpdate();
            }
        });
        final MyTextView textView2 = (MyTextView) findViewById(R.id.textView2);
        textView2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textView2.incrementAndUpdate();
            }
        });
        final MyTextView textView3 = (MyTextView) findViewById(R.id.textView3);
        textView3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textView3.incrementAndUpdate();
            }
        });
        final MyTextView textView4 = (MyTextView) findViewById(R.id.textView4);
        textView4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textView4.incrementAndUpdate();
            }
        });
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
