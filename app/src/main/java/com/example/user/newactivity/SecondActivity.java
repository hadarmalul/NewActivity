package com.example.user.newactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView tv;
    double x;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        tv = (TextView) findViewById(R.id.tv);
        Intent gi = getIntent();
        x= gi.getDoubleExtra("x",0);
        tv.setText("last result:" +x);

    }


    public void back(View view) {
        Intent si =  new Intent(this,MainActivity.class);
        si.putExtra("x",x);
        startActivity(si);
    }
}
