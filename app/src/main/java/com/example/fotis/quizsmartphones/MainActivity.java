package com.example.fotis.quizsmartphones;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /*
        I added this in order to not get the keyboard automatically pop up when you open the app!
             */
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);

        setContentView(R.layout.activity_main);
    }

    /*
    This function gets the value from the EditText and then creates an intent with which the user can go to
    the other activity where the questions actually are.Also i pass the user name in order to use it for the Toast message.
     */

    public void begin(View View) {
        Log.v("MainActivity","Begin!");
        EditText edittext = (EditText) findViewById(R.id.username);
        String message = edittext.getText().toString();
        Intent intent = new Intent("com.example.fotis.QuizSmartphones.questions2");
        intent.putExtra("message", message);
        startActivity(intent);
    }
}