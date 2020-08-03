package com.example.letseat;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class RulletActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rullet);
    }

    public void onAgainButtonClicked(View v){
        Toast.makeText(getApplicationContext(),"룰렛을 다시 돌렸습니다.",Toast.LENGTH_LONG).show();
    }

    public void onBackButtonClicked(View v){

        finish();
    }





}