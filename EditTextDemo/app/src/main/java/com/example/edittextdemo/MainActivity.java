package com.example.edittextdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void button_Click(View view)
    {
        EditText edtName = (EditText)findViewById(R.id.edtName);
        TextView txtShow = (TextView)findViewById(R.id.txtShow);
        String name = edtName.getText().toString();
        txtShow.setText("你的名字是: " + name);
    }
}