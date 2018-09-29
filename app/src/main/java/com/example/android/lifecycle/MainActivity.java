package com.example.android.lifecycle;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("4itf", "onCreate has executed");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("4itf", "onStart has executed");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("4itf", "onResume has executed");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("4itf", "onPause has executed");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("4itf", "onStop has executed");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("4itf", "onRestart has executed");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("4itf", "Object is deallocated...");
    }

    public void display(View v) {
//        Toast.makeText(this, "The button has been clicked", Toast.LENGTH_LONG).show();
        Snackbar.make(v, "Snackbar is displayed", Snackbar.LENGTH_LONG).show();
    }
}