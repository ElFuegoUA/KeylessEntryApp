package com.example;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    String ADAU;
    String ADAL;
    String AAAL;
    String ADDU;

    TextView textView;
    RelativeLayout relativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.textView3);

        relativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);

        ADAU = "AlarmDisarmed\nAllUnlocked";
        ADAL = "AlarmDisarmed\nAllLocked";
        AAAL = "AlarmArmed\nAllLocked";
        ADDU = "AlarmDisarmed\nDriverUnlocked";

        textView.setText(ADAU);

    }

    public void onLock(View view){
        if(textView.getText().equals(ADAU)){
            textView.setText(ADAL);
            relativeLayout.setBackgroundColor(Color.GREEN);
        }
        else if(textView.getText().equals(ADDU)){
            textView.setText(ADAL);
            relativeLayout.setBackgroundColor(Color.GREEN);
        }
        else if(textView.getText().equals(ADAL)){
            textView.setText(ADAL);
            relativeLayout.setBackgroundColor(Color.GREEN);
        }
        else if(textView.getText().equals(AAAL)) {
            textView.setText(AAAL);
            relativeLayout.setBackgroundColor(Color.RED);
        }
    }


    public void onLock2(View view){
        if(textView.getText().equals(ADAU)) {
            textView.setText(AAAL);
            relativeLayout.setBackgroundColor(Color.RED);
        }
        else if(textView.getText().equals(ADDU)){
            textView.setText(AAAL);
            relativeLayout.setBackgroundColor(Color.RED);
        }
        else if(textView.getText().equals(ADAL)){
            textView.setText(AAAL);
        relativeLayout.setBackgroundColor(Color.RED);
        }
        else if(textView.getText().equals(AAAL)){
            textView.setText(AAAL);
            relativeLayout.setBackgroundColor(Color.RED);
        }
    }


    public void onUnlock(View view){
        if(textView.getText().equals(ADAU)){
            textView.setText(ADAU);
            relativeLayout.setBackgroundColor(Color.GREEN);
        }
        else if(textView.getText().equals(ADDU)){
            textView.setText(ADDU);
            relativeLayout.setBackgroundColor(Color.GREEN);
        }
        else if(textView.getText().equals(ADAL)){
            textView.setText(ADDU);
            relativeLayout.setBackgroundColor(Color.GREEN);
        }
        else if(textView.getText().equals(AAAL)){
            textView.setText(ADDU);
            relativeLayout.setBackgroundColor(Color.GREEN);
        }
    }


    public void onUnlock2(View view){
        if(textView.getText().equals(ADAU)){
            textView.setText(ADAU);
            relativeLayout.setBackgroundColor(Color.GREEN);
        }
        else if(textView.getText().equals(ADDU)){
            textView.setText(ADDU);
            relativeLayout.setBackgroundColor(Color.GREEN);
        }
        else if(textView.getText().equals(ADAL)){
            textView.setText(ADAU);
            relativeLayout.setBackgroundColor(Color.GREEN);
        }
        else if(textView.getText().equals(AAAL)){
            textView.setText(ADAU);
            relativeLayout.setBackgroundColor(Color.GREEN);
        }
    }


}
