package com.hingbox.firstapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {
    private MainActivity _this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void startActivityB(View v){
        Intent intent=new Intent(MainActivity.this,TwoActivity.class);
        startActivity(intent);
    }
}
