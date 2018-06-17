package com.example.srirama.calulatorapp;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Result extends AppCompatActivity {
    private EditText cname;
    private Button click;
    private TextView colortxt;
    private String color []={"Color.BLACK","red","black"};
    String r="red";
    String b="blue";
    String g="green";
    Button nextpage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        cname=(EditText)findViewById(R.id.etcn);
        click=(Button)findViewById(R.id.btnclik);
        colortxt=(TextView)findViewById(R.id.tvcolor);
        nextpage=(Button)findViewById(R.id.btnsecondpage);
        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String col=cname.getText().toString();

                    if(g.equals(col)) {
                        colortxt.setTextColor(Color.GREEN);
                       }
                if(col.equals(r)) {
                    colortxt.setTextColor(Color.RED);
                }
                if(col.equals(b)) {
                    colortxt.setTextColor(Color.BLUE);
                }
            }
        });
    nextpage.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i1=new Intent(getApplicationContext(),Main2Activity.class);
            startActivity(i1);
        }
    });

    }
}
