package com.test.jliu.buttonsandtoast;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int viewCount1 = 0;
    int viewCount2 = 0;
    int viewCount3 = 0;
    int viewCount4 = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Button Pressed", Toast.LENGTH_SHORT).show();
            }
        });
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        TextView textView = (TextView) findViewById(R.id.textView1);
        textView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                viewCount1++;
                Log.i("onCreate", "TextView1 Pressed " + viewCount1 + " times");
                Toast t = Toast.makeText(MainActivity.this, "TextView1 Pressed " + viewCount1 + " times", Toast.LENGTH_SHORT);
                t.setDuration(Toast.LENGTH_SHORT);
                t.show();
            }
        });
        TextView textView2 = (TextView) findViewById(R.id.textView2);
        textView2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                viewCount2++;
                Log.i("onCreate", "TextView1 Pressed " + viewCount2 + " times");
                Toast t = Toast.makeText(MainActivity.this, "TextView2 Pressed " + viewCount2 + " times", Toast.LENGTH_SHORT);
                t.setDuration(Toast.LENGTH_SHORT);
                t.show();
            }
        });
        TextView textView3 = (TextView) findViewById(R.id.textView3);
        textView3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                viewCount3++;
                Log.i("onCreate", "TextView1 Pressed " + viewCount3 + " times");
                Toast t = Toast.makeText(MainActivity.this, "TextView3 Pressed " + viewCount3 + " times", Toast.LENGTH_SHORT);
                t.setDuration(Toast.LENGTH_SHORT);
                t.show();
            }
        });
        TextView textView4 = (TextView) findViewById(R.id.textView4);
        textView4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                viewCount4++;
                Log.i("onCreate", "TextView1 Pressed " + viewCount4 + " times");
                Toast t = Toast.makeText(MainActivity.this, "TextView4 Pressed " + viewCount4 + " times", Toast.LENGTH_SHORT);
                t.setDuration(Toast.LENGTH_SHORT);
                t.show();
            }
        });
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
