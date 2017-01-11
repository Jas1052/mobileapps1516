package com.test.jliu.helloworld;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

    FrameLayout mFrame;
    int mCurrentLayout = 0;
    int[] mLayouts = {
            R.layout.content_hello_world,
            R.layout.layout_1,
            R.layout.layout_2,
            R.layout.layout_3,
            R.layout.layout_4,
            R.layout.layout_5,
            R.layout.layout_6,
            R.layout.layout_7,
            R.layout.layout_8
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello_world);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mFrame = (FrameLayout) findViewById(R.id.frame);
        update();

        final MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.tone);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mCurrentLayout = (mCurrentLayout + 1) % mLayouts.length;
                update();

                if (mp != null) {
                    mp.seekTo(0);
                    mp.start();
                }

                Snackbar.make(view, "Updated to layout " + mCurrentLayout, Snackbar.LENGTH_SHORT)
                        .setAction("Action", null).show();
            }
        });
    }

    private void update() {
        mFrame.removeAllViews();
        getLayoutInflater().inflate(mLayouts[mCurrentLayout], mFrame);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_hello_world, menu);
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
