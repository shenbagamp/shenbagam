package com.example.shenbagampalanisamy.calculator;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;
import java.lang.*;

public class MainActivity extends Activity {
   TextView t1;
   TextView t2;
   TextView t3;
   EditText e1;
   ImageButton f;
   ImageButton s;
   ImageButton la;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1 = (EditText) findViewById(R.id.editText);
       t1=(TextView) findViewById(R.id.textView10);
       t2=(TextView)findViewById(R.id.textView9);
       t3=(TextView)findViewById(R.id.textView8);
       f=(ImageButton)findViewById(R.id.imageButton);
        s=(ImageButton)findViewById(R.id.imageButton2);
        la=(ImageButton)findViewById(R.id.imageButton3);
        f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val1="10.0% Tip persent";
                 t3.setText(val1);
                int num=Integer.parseInt(e1.getText().toString());
                double n=(num*10)/100;
                double add=n+num;
                t2.setText("$"+Double.toString(n)+"Tip total");
                t1.setText("$"+Double.toString(add)+"Total Bill");

            }
        });
        s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val2="15.0% Tip persent";
                t3.setText(val2);
                int num=Integer.parseInt(e1.getText().toString());
                double n=(num*15)/100;
                double add=n+num;
                String str="";
               // str=
                t2.setText("$"+Double.toString(n)+"Tip total");
                t1.setText("$"+Double.toString(add)+"Total Bill");

            }
        });
        la.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val3="20.0% Tip persent";
                t3.setText(val3);
                int num=Integer.parseInt(e1.getText().toString());
                double n=(num*20)/100;
                double add=n+num;
                t2.setText("$"+Double.toString(n)+"Tip total");
                t1.setText("$"+Double.toString(add)+"Total Bill");


            }
        });
    }
}
