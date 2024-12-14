package com.example.calculator;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bplus,bmin,bmult,bdiv,beql,bcan,bdot;
    EditText et_res;
    Float v1,v2;
    Boolean add=false,sub=false,mult=false,div=false;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        b1=(Button) findViewById(R.id.btn_one);
        b2=(Button) findViewById(R.id.btn_two);
        b3=(Button) findViewById(R.id.btn_three);
        b4=(Button) findViewById(R.id.btn_four);
        b5=(Button) findViewById(R.id.btn_five);
        b6=(Button) findViewById(R.id.btn_six);
        b7=(Button) findViewById(R.id.btn_seven);
        b8=(Button) findViewById(R.id.btn_eight);
        b9=(Button) findViewById(R.id.btn_nine);
        b0=(Button) findViewById(R.id.btn_zero);
        bdot=(Button) findViewById(R.id.btn_dot);
        bplus=(Button) findViewById(R.id.btn_plus);
        bmin=(Button) findViewById(R.id.btn_min);
        bmult=(Button) findViewById(R.id.btn_mul);
        bdiv=(Button) findViewById(R.id.btn_div);
        bcan=(Button) findViewById(R.id.btn_cancel);
        beql=(Button) findViewById(R.id.btn_eql);
        et_res=(EditText) findViewById(R.id.et_result);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et_res.setText(et_res.getText()+"1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et_res.setText(et_res.getText()+"2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et_res.setText(et_res.getText()+"3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et_res.setText(et_res.getText()+"4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et_res.setText(et_res.getText()+"5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et_res.setText(et_res.getText()+"6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et_res.setText(et_res.getText()+"7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et_res.setText(et_res.getText()+"8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et_res.setText(et_res.getText()+"9");
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et_res.setText(et_res.getText()+"0");
            }
        });
        bdot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et_res.setText(et_res.getText()+".");
            }
        });
        bplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                v1=Float.parseFloat(et_res.getText()+"");
                add=true;
                et_res.setText(null);
            }
        });
        bmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                v1=Float.parseFloat(et_res.getText()+"");
                sub=true;
                et_res.setText(null);
            }
        });
        bmult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                v1=Float.parseFloat(et_res.getText()+"");
                mult=true;
                et_res.setText(null);
            }
        });
        bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                v1=Float.parseFloat(et_res.getText()+"");
                div=true;
                et_res.setText(null);
            }
        });
        beql.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                v2=Float.parseFloat(et_res.getText()+"");
                if(add){
                    et_res.setText(v1+v2+"");
                    add=false;
                } else if (sub) {
                    et_res.setText(v1-v2+"");
                    sub=false;
                } else if (mult) {
                    et_res.setText(v1*v2+"");
                    mult=false;

                } else if (div) {
                    et_res.setText(v1/v2+"");
                    div=false;
                }
            }
        });
        bcan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et_res.setText(null);
            }
        });
    }
}