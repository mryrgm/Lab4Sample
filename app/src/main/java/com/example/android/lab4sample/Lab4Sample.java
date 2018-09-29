package com.example.android.lab4sample;

import android.content.Intent;
import android.net.Uri;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import java.net.URI;

public class Lab4Sample extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab4_sample);
        Log.d("4itf", "onCreate has executed....");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("4itf", "onStart has executed....");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("4itf", "onResume has executed....");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("4itf", "onStop has executed....");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("4itf", "onPause has executed....");
    }

    public void display(View v) {
        //  Toast.makeText(this, "RUN!! Ean is coming!!!", Toast.LENGTH_LONG).show();
        Snackbar.make(v, "snackbar is displayed", Snackbar.LENGTH_LONG).show();

    }

    public void display2(View v){
        Intent i = new Intent(this,SecondActivity.class);
        startActivity(i);
    }

    public void process(View v){
        Intent i = null, chooser=null;
        if (v.getId()==R.id.btnMap){
            i=new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo:14.610400,120.991916"));
            chooser = Intent.createChooser(i, "Select app");
            startActivity(chooser);
        }
    }
}