package com.example.srirama.calulatorapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
     TextView showdiv,multiply,subraction,addition;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        show();
    sub();
        div();
        product();
    }
    public void div(){

        showdiv=(TextView)findViewById(R.id.tvansdiv);
        int div=getIntent().getExtras().getInt("div");
        showdiv.setText(Integer.toString(div));
    }
   public void show(){
       addition=(TextView)findViewById(R.id.tvshow);
       int meessage=getIntent().getExtras().getInt("addi");

       addition.setText(Integer.toString(meessage));

   }
   public void sub(){
       subraction=(TextView)findViewById(R.id.tvanssub);
       int sub=getIntent().getExtras().getInt("sub");
       subraction.setText(Integer.toString(sub));
   }
   public void product(){
       multiply=(TextView)findViewById(R.id.tvansmul);
       int mul=getIntent().getExtras().getInt("multiply");
       multiply.setText(Integer.toString(mul));
   }
}
