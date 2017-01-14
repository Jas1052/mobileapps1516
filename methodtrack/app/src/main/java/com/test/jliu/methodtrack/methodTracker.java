package com.test.jliu.methodtrack;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class methodTracker extends AppCompatActivity {
    TextView create;
    TextView start;
    TextView resume;
    TextView pause;
    TextView stop;
    TextView restart;
    TextView destroy;
    TextView createTotal;
    TextView startTotal;
    TextView resumeTotal;
    TextView pauseTotal;
    TextView stopTotal;
    TextView restartTotal;
    TextView destroyTotal;
    int createCount = 0;
    int startCount = 0;
    int resumeCount = 0;
    int pauseCount = 0;
    int stopCount = 0;
    int restartCount = 0;
    int destroyCount = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_method_tracker);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        create = (TextView)findViewById(R.id.onCreateView);
        start = (TextView)findViewById(R.id.onStartView);
        resume = (TextView)findViewById(R.id.onResumeView);
        pause = (TextView)findViewById(R.id.onPauseView);
        stop = (TextView)findViewById(R.id.onCreateView);
        restart = (TextView)findViewById(R.id.onRestartView);
        destroy= (TextView)findViewById(R.id.onDestroyView);
        createTotal = (TextView)findViewById(R.id.onCreateViewTotal);
        startTotal = (TextView)findViewById(R.id.onStartViewTotal);
        resumeTotal = (TextView)findViewById(R.id.onResumeViewTotal);
        pauseTotal = (TextView)findViewById(R.id.onPauseViewTotal);
        stopTotal = (TextView)findViewById(R.id.onCreateViewTotal);
        restartTotal = (TextView)findViewById(R.id.onRestartViewTotal);
        destroyTotal= (TextView)findViewById(R.id.onDestroyViewTotal);

        createCount++;
        create.setText("onCreate: " + createCount);

        SharedPreferences sharedPref= getSharedPreferences("createTotal", 0);
        int temp = sharedPref.getInt("create", 0);
        SharedPreferences.Editor editor= sharedPref.edit();
        editor.putInt("create", createCount + temp);
        editor.commit();
        int total = temp+createCount;
        createTotal.setText("onCreate: " + total);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }
    @Override
    protected void onStart()
    {
        super.onStart();
        startCount++;
        start.setText("onStart(): " + startCount);
        SharedPreferences sharedPref= getSharedPreferences("startTotal", 0);
        int temp = sharedPref.getInt("start", 0);
        SharedPreferences.Editor editor= sharedPref.edit();
        editor.putInt("start", startCount + temp);
        editor.commit();
        int total = temp+startCount;
        startTotal.setText("onStart: " + total);
    }
    @Override
    protected void onResume()
    {
        super.onResume();
        resumeCount++;
        resume.setText("onResume(): " + resumeCount);
        SharedPreferences sharedPref= getSharedPreferences("resume", 0);
        int temp = sharedPref.getInt("resume", 0);
        SharedPreferences.Editor editor= sharedPref.edit();
        editor.putInt("resume", resumeCount + temp);
        editor.commit();
        int total = temp+resumeCount;
        resumeTotal.setText("onResume: " + total);
    }
    @Override
    protected void onPause()
    {
        super.onPause();
        pauseCount++;
        pause.setText("onPause(): " + pauseCount);
        SharedPreferences sharedPref= getSharedPreferences("pauseTotal", 0);
        int temp = sharedPref.getInt("pause", 0);
        SharedPreferences.Editor editor= sharedPref.edit();
        editor.putInt("pause", pauseCount + temp);
        editor.commit();
        int total = temp+pauseCount;
        pauseTotal.setText("onPause: " + total);
    }
    @Override
    protected void onStop()
    {
        super.onStop();
        stopCount++;
        stop.setText("onStop(): " + stopCount);
        SharedPreferences sharedPref= getSharedPreferences("stopTotal", 0);
        int temp = sharedPref.getInt("stop", 0);
        SharedPreferences.Editor editor= sharedPref.edit();
        editor.putInt("stop", stopCount + temp);
        editor.commit();
        int total = temp+stopCount;
        stopTotal.setText("onStop: " + total);
    }
    @Override
    protected void onRestart()
    {
        super.onRestart();
        restartCount++;
        restart.setText("onRestart(): " + restartCount);
        SharedPreferences sharedPref= getSharedPreferences("restartTotal", 0);
        int temp = sharedPref.getInt("restart", 0);
        SharedPreferences.Editor editor= sharedPref.edit();
        editor.putInt("restart", restartCount + temp);
        editor.commit();
        int total = temp+restartCount;
        restartTotal.setText("onRestart: " + total);
    }
    @Override
    protected void onDestroy()
    {
        super.onDestroy();
        destroyCount++;
        destroy.setText("onDestroy(): " + destroyCount);
        SharedPreferences sharedPref= getSharedPreferences("destroyTotal", 0);
        int temp = sharedPref.getInt("destroy", 0);
        SharedPreferences.Editor editor= sharedPref.edit();
        editor.putInt("destroy", destroyCount + temp);
        editor.commit();
        int total = temp+destroyCount;
        destroyTotal.setText("onDestroy: " + total);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_method_tracker, menu);
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
