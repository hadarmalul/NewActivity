package com.example.user.newactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText et;
    Double num1, num2, num3,x;
    int actold, actnow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et = (EditText) findViewById(R.id.et);

        num1 = null;
        num2 = null;
        actold = 0;
        actnow = 0;
        Intent gi = getIntent();
        x = gi.getDoubleExtra("x",0);
        et.setText(""+x);
    }


    public void plus(View view) {
        if (et.getText().toString().isEmpty()){
            Toast.makeText(this,"please enter a number",Toast.LENGTH_SHORT).show();
        }
        else {
            String st1= et.getText().toString();
            double a= Double.parseDouble(st1);
            actnow = 1;
        if (num1==null) {
            num1=a;
            actold=1;
        }
        else {
            num2 = a;
            switch (actold) {
                case 1:
                    num1 = num1 + num2;
                    et.setText("" + num1);
                    actold = actnow;
                    break;
                case 2:
                    num1 = num1 - num2;
                    et.setText("" + num1);
                    actold = actnow;
                    break;
                case 3:
                    num1 = num1 * num2;
                    et.setText("" + num1);
                    actold = actnow;
                    break;
                case 4:
                    num1 = num1 / num2;
                    et.setText("" + num1);
                    actold = actnow;
                    break;
            }
            num3=num1;
        }


            }

    }

    public void minclick(View view) {
        if (et.getText().toString().isEmpty()){
            Toast.makeText(this,"please enter a number",Toast.LENGTH_SHORT).show();
        }
        else{
            String st2 = et.getText().toString();
            double a = Double.parseDouble(st2);
            int actnow = 2;
        if (num1 == null) {
            num1 = a;
            actold = 2;
        }
        else {
            num2 = a;

            switch (actold) {
                case 1:
                    num1 = num1 + num2;
                    et.setText("" + num1);
                    actold = actnow;
                    break;
                case 2:
                    num1 = num1 - num2;
                    et.setText("" + num1);
                    actold = actnow;
                    break;
                case 3:
                    num1 = num1 * num2;
                    et.setText("" + num1);
                    actold = actnow;
                    break;
                case 4:
                    num1 = num1 / num2;
                    et.setText("" + num1);
                    actold = actnow;
                    break;
            }
            num3=num1;
            }
        }
    }

    public void mulclick(View view) {
        if (et.getText().toString().isEmpty()){
            Toast.makeText(this,"please enter a number",Toast.LENGTH_SHORT).show();
        }
        else{
            String st3 = et.getText().toString();
            double a = Double.parseDouble(st3);
            int actnow = 3;
        if (num1 == null) {
            num1 = a;
            actold = 3;
        }
        else {
            num2 = a;
        switch (actold) {
            case 1:
                num1 = num1 + num2;
                et.setText("" + num1);
                actold = actnow;
                break;
            case 2:
                num1 = num1 - num2;
                et.setText("" + num1);
                actold = actnow;
                break;
            case 3:
                num1 = num1 * num2;
                et.setText("" + num1);
                actold = actnow;
                break;
            case 4:
                num1 = num1 / num2;
                et.setText("" + num1);
                actold = actnow;
                break;
        }
        num3=num1;
            }
        }
    }

    public void divclick(View view) {
        if (et.getText().toString().isEmpty()){
            Toast.makeText(this,"please enter a number",Toast.LENGTH_SHORT).show();
        }
        else{
            String st4 = et.getText().toString();
            double a = Double.parseDouble(st4);
            int actnow = 4;
        if (num1 == null) {
            num1 = a;
            actold = 4;
        } else {
            num2 = a;
        switch (actold) {
            case 1:
                num1 = num1 + num2;
                et.setText("" + num1);
                actold = actnow;
                break;
            case 2:
                num1 = num1 - num2;
                et.setText("" + num1);
                actold = actnow;
                break;
            case 3:
                num1 = num1 * num2;
                et.setText("" + num1);
                actold = actnow;
                break;
            case 4:
                num1 = num1 / num2;
                et.setText("" + num1);
                actold = actnow;
                break;
        }
            num3=num1;
            }
        }
    }


    public void acclick(View view) {
        et.setText("0");
        num1 = null;
        num2 = null;
        actold = 0;
        actnow = 0;
        num3 = 0.0;
    }

    public void eqclick(View view) {
        if (et.getText().toString().isEmpty()){
            Toast.makeText(this,"please enter a number",Toast.LENGTH_SHORT).show();
        }
        else {
            String st5 = et.getText().toString();
            num2 = Double.parseDouble(st5);
            switch (actold) {
                case 1:
                    num1 = num1 + num2;
                    et.setText("" + num1);
                    actold = actnow;
                    break;
                case 2:
                    num1 = num1 - num2;
                    et.setText("" + num1);
                    actold = actnow;
                    break;
                case 3:
                    num1 = num1 * num2;
                    et.setText("" + num1);
                    actold = actnow;
                    break;
                case 4:
                    num1 = num1 / num2;
                    et.setText("" + num1);
                    actold = actnow;
                    break;
            }
            num3=num1;
            num1 = null;
            num2 = null;
            actold = 0;
            actnow = 0;
        }
    }

    public void credits(View view) {
        Intent si =  new Intent(this,SecondActivity.class);
        si.putExtra("x",num3);
        startActivity(si);
    }

}

