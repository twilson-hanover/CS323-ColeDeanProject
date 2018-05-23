package com.example.vande.cs323_coledeanproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Q1Activity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q1);
    }

    //Call onStartGame() when the button is clicked
    public void onStartGame(View view) {
        Intent intent = new Intent(this, Q1Activity.class);
        startActivity(intent);
    }
}
