package com.example.vande.cs323_coledeanproject;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.RadioButton;
import android.widget.RadioGroup;


public class Q2Activity extends Activity {

    public boolean isCorrect2 = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q2);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //Inflate menu
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public void toQ3Activity(View view) {
        Intent intent = new Intent(this, Q3Activity.class);
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

    public void onRadioButtonClicked2(View view) {
        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.set2);
        int id = radioGroup.getCheckedRadioButtonId();

        if (id == -1) {
            //no item selected
        } else {
            RadioButton radioButton = findViewById(id);
            if (radioButton == findViewById(R.id.vientiane)) {
                isCorrect2 = true;
            }
        }
    }
}

