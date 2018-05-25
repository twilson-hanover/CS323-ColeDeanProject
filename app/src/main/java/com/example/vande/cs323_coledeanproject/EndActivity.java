package com.example.vande.cs323_coledeanproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import android.view.LayoutInflater;

public class EndActivity extends Activity {

    public boolean youWon = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //Inflate menu
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public void toEnd(View view) {
        //Intent intent = new Intent(this, Q3Activity.class);
        //startActivity(intent);
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

    public void winLose(boolean bq1, boolean bq2, boolean bq3) {
//        bq1 = Q1Activity.class.getMethod("getCorrect1", );
        if(bq1 && bq2 && bq3) {
            youWon = true;
        }
    }

    public void showResults(View view) {

        if(youWon) {
            Intent intent = new Intent(this, ToastService.class);
            intent.putExtra(ToastService.EXTRA_MESSAGE, getResources().getString(R.string.won));
            startService(intent);
        } else {
            Intent intent = new Intent(this, ToastService.class);
            intent.putExtra(ToastService.EXTRA_MESSAGE, getResources().getString(R.string.lost));
            startService(intent);
        }

    }
}
