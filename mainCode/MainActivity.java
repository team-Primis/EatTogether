package com.example.letseat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButton1Clicked(View v){
        Intent myIntent =new Intent(Intent.ACTION_VIEW, Uri.parse("http://m.naver.com"));
        startActivity(myIntent);
    }

    public void onRulletButtonClicked(View v){
        Intent newIntent = new Intent(getApplicationContext(),RulletActivity.class);
        startActivity(newIntent);
    }

    public void onBackButtonClicked(View v){
        Toast.makeText(getApplicationContext(),"돌아가기 버튼이 눌렸어요",Toast.LENGTH_LONG).show();
        finish();
    }




}