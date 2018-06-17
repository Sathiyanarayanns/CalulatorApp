package com.example.srirama.calulatorapp;

import android.content.Intent;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static String ans1;
    EditText number1;
     EditText number2;
     Button sum;
     TextView answer;
     Button sub;
     Button mul;
     Button div;
    CheckBox checksub,checkdiv,checkmul,checkadd;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        checkdiv=(CheckBox)findViewById(R.id.cbdiv);
        checksub=(CheckBox)findViewById(R.id.cbsub);
        checkadd=(CheckBox)findViewById(R.id.cbadd);
        checkmul=(CheckBox)findViewById(R.id.cbmul);
        number1=(EditText) findViewById(R.id.etnum1);
        number2=(EditText)findViewById(R.id.etnum2);
        sum=(Button)findViewById(R.id.btnadd);
        sub=(Button)findViewById(R.id.btnsub);
        div=(Button)findViewById(R.id.btndiv);
        mul=(Button)findViewById(R.id.btnmul);
        answer=(TextView)findViewById(R.id.tvres);

        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1=Integer.parseInt(number1.getText().toString());
                int num2=Integer.parseInt(number2.getText().toString());
                int res=num1+num2;
                Intent in1=new Intent(getApplicationContext(),Main2Activity.class);
                in1.putExtra("addi",res);
                startActivity(in1);
            }
        });
        sendmessage();
    }
    public void sendmessage(){

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1=Integer.parseInt(number1.getText().toString());
                int num2=Integer.parseInt(number2.getText().toString());
                int min=num1-num2;
                Intent in2=new Intent(getApplicationContext(),Main2Activity.class);
                 in2.putExtra("sub",min);
                startActivity(in2);
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                int num1=Integer.parseInt(number1.getText().toString());
                int num2=Integer.parseInt(number2.getText().toString());
                int multiply=num1*num2;
                Intent in3=new Intent(getApplicationContext() ,Main2Activity.class);
              //  String message=String.valueOf(multiply);
                //System.out.println(message);
                in3.putExtra("multiply" ,multiply);
                startActivity(in3);

            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int num1=Integer.parseInt(number1.getText().toString());
                int num2=Integer.parseInt(number2.getText().toString());
                int divid=num1/num2;
                Intent in4=new Intent(getApplicationContext(),Main2Activity.class);
                in4.putExtra("div",divid);
                startActivity(in4);
            }
        });
    }
}
