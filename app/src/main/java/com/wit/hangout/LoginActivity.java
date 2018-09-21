package com.wit.hangout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button bt_fb =findViewById(R.id.bt_fb);
        Button bt_google =findViewById(R.id.bt_google);
        Button bt_creat =findViewById(R.id.bt_creat);

        bt_fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent location = new Intent(LoginActivity.this,com.wit.hangout.location.class);
                startActivity(location);
            }
        });
        bt_google.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent location = new Intent(LoginActivity.this,com.wit.hangout.location.class);
                startActivity(location);
            }
        }));
        bt_creat.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent location = new Intent(LoginActivity.this,com.wit.hangout.location.class);
                startActivity(location);
            }
        }
        ));
    }

}
