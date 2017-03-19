package com.example.andres.myapplication;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.gson.Gson;

public class Registrarse extends AppCompatActivity {
    private Button submmitBtn;
    private Context context = this;
    private EditText usertxt;
    private EditText passwordtxt;
    private  Gson gson;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrarse);



        submmitBtn = (Button) findViewById(R.id.submmitBtn);

        submmitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent send = new Intent(context,MainActivity.class);
                startActivity(send);
            }
        });

    }
}
