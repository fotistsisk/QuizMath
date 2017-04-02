package com.example.fotis.quizsmartphones;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class questions2 extends AppCompatActivity {
    boolean q1, q2, q3, q4, q5, q6,q7;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions2);
    }

    public void onRadioButtonClicked1(View View) {
        RadioButton cb1_2 = (RadioButton) findViewById(R.id.q1_2);
        if (cb1_2.isChecked()) {
            q1 = true;
        } else
            q1 = false;
    }

    public void onRadioButtonClicked2(View View) {
        RadioButton cb2_3 = (RadioButton) findViewById(R.id.q2_3);
        if (cb2_3.isChecked()) {
            q2 = true;
        } else
            q2 = false;
    }

    public void onRadioButtonClicked3(View View) {
        RadioButton cb3_3 = (RadioButton) findViewById(R.id.q3_3);
        if (cb3_3.isChecked()) {
            q3 = true;
        } else
            q3 = false;
    }

    public void onRadioButtonClicked4(View View) {
        RadioButton cb4_2 = (RadioButton) findViewById(R.id.q4_2);
        if (cb4_2.isChecked()) {
            q4 = true;
        } else
            q4 = false;
    }

    public void onRadioButtonClicked5(View View) {
        RadioButton cb5_2 = (RadioButton) findViewById(R.id.q5_2);
        if (cb5_2.isChecked()) {
            q5 = true;
        } else
            q5 = false;
    }

    public void onRadioButtonClicked6(View View) {
        RadioButton cb6_1 = (RadioButton) findViewById(R.id.q6_1);
        if (cb6_1.isChecked()) {
            q6 = true;
        } else
            q6 = false;
    }

    public void onRadioButtonClicked7(View View) {
            CheckBox cb7_1 = (CheckBox) findViewById(R.id.q7_1);
            CheckBox cb7_2 = (CheckBox) findViewById(R.id.q7_2);
        if (cb7_1.isChecked() && cb7_2.isChecked()) {
            q7 = true;
        } else
            q7 = false;
    }

    public void done(View view) {
        TextView results = (TextView) findViewById(R.id.results);
        int resultnum = 0, highscore = 0;
        if (q1 == true)
            resultnum++;
        if (q2 == true)
            resultnum++;
        if (q3 == true)
            resultnum++;
        if (q4 == true)
            resultnum++;
        if (q5 == true)
            resultnum++;
        if (q6 == true)
            resultnum++;
        if (q7==true)
            resultnum++;
        String messagenumtext = resultnum + "/7";
        TextView messagenum = (TextView) findViewById(R.id.resultnum);
        messagenum.setText(messagenumtext);
        String message = getString(R.string.q1r, q1) + "\n"
                + getString(R.string.q2r, q2) + "\n"
                + getString(R.string.q3r, q3) + "\n"
                + getString(R.string.q4r, q4) + "\n"
                + getString(R.string.q5r, q5) + "\n"
                + getString(R.string.q6r, q6) + "\n"
                + getString(R.string.q7r, q7);
        results.setText(message);
        String messagetoast;
        if (resultnum == 7)
            messagetoast = getString(R.string.congrats) ;
        else if (resultnum <7 && resultnum>3)
            messagetoast = getString(R.string.good_job);
        else if (resultnum==3)
            messagetoast= getString(R.string.not_that_bad);
        else
            messagetoast = getString(R.string.study_more);
        String username = getIntent().getStringExtra("message");
        messagetoast=messagetoast+" "+username+"!\nYour score is : "+messagenumtext+"!";
        Toast.makeText(getApplicationContext(), messagetoast,
                Toast.LENGTH_LONG).show();
    }

    public void reset(View View) {
        recreate();
        RadioGroup rd1 = (RadioGroup) findViewById(R.id.radiogroup1);
        rd1.clearCheck();
        RadioGroup rd2 = (RadioGroup) findViewById(R.id.radiogroup2);
        rd2.clearCheck();
        RadioGroup rd3 = (RadioGroup) findViewById(R.id.radiogroup3);
        rd3.clearCheck();
        RadioGroup rd4 = (RadioGroup) findViewById(R.id.radiogroup4);
        rd4.clearCheck();
        RadioGroup rd5 = (RadioGroup) findViewById(R.id.radiogroup5);
        rd5.clearCheck();
        RadioGroup rd6 = (RadioGroup) findViewById(R.id.radiogroup6);
        rd6.clearCheck();
        RadioGroup rd7 = (RadioGroup) findViewById(R.id.radiogroup7);
        rd7.clearCheck();
    }
}