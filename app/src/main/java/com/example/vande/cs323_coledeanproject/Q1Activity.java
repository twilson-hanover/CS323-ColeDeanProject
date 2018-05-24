package com.example.vande.cs323_coledeanproject;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.content.Intent;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.RadioButton;
import android.widget.AdapterView;


public class Q1Activity extends Activity {

    public boolean isCorrect1 = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q1);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //Inflate menu
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }


    public void toQ2Activity(View view) {
        Intent intent = new Intent(this, Q2Activity.class);
        startActivity(intent);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()) {
            case R.id.action_instruct:
                //code to run when the item is clicked
                Intent intent1 = new Intent(this, InstructActivity.class);
                startActivity(intent1);
                return true;
            default:
                return super.onOptionsItemSelected(item);

        }
    }

    public boolean getCorrect1() {
        return isCorrect1;
    }

    public void onRadioButtonClicked1(View view) {
        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.set1);
        int id = radioGroup.getCheckedRadioButtonId();

        if (id == -1) {
            //no item selected
        } else {
            RadioButton radioButton = findViewById(id);
            if(radioButton == findViewById(R.id.thimphu)) {
                isCorrect1 = true;
            }
        }

    }

}

