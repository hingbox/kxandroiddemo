package com.hingbox.firstapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by Admin on 2018/8/16.
 */

public class TwoActivity extends Activity {
    private TwoActivity _this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);
    }
    public void startActivityA(View v){
        Intent intent=new Intent(TwoActivity.this,MainActivity.class);
        startActivity(intent);
    }
}
