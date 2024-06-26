package com.example.ch5_5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;

import android.graphics.Color;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private TextView txvOutput;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txvOutput = (TextView)findViewById(R.id.txvOutput);
        txvOutput.setTextSize(25);
        ConstraintLayout layout=(ConstraintLayout) findViewById(R.id.activity_main);
        layout.setOnTouchListener(this);
    }
    @Override
    public  boolean onTouch(View v, MotionEvent event)
    {
        int act =event.getAction();

        switch (act)
        {
            case MotionEvent.ACTION_DOWN:
                txvOutput.setText("Action_Down");
                txvOutput.setTextColor(Color.RED);
                break;
            case MotionEvent.ACTION_UP:
                txvOutput.setText("Action_Up");
                txvOutput.setTextColor(Color.GREEN);
                break;
            case MotionEvent.ACTION_MOVE:
                float x= event.getX();
                float y= event.getY();
                txvOutput.setText("x="+x+"\ny="+y);
                txvOutput.setTextColor(Color.BLUE);
                break;
        }
        return true;
    }
}
