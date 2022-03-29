package com.example.svetofor;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public TextView tvInfo;
    public ConstraintLayout constraintLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        constraintLayout = (ConstraintLayout) findViewById(R.id.constraint);
        tvInfo = (TextView) findViewById(R.id.textView);
    }

    public void buttonRedClick(View view) {
        tvInfo.setText(R.string.red);
        constraintLayout.setBackgroundResource(R.color.redColor);
    }
    public void buttonYellowClick(View view) {
        tvInfo.setText(R.string.yellow);
        constraintLayout.setBackgroundResource(R.color.yellowColor);
    }
    public void buttonGreenClick(View view) {
        tvInfo.setText(R.string.green);
        constraintLayout.setBackgroundResource(R.color. greenColor);
    }
}