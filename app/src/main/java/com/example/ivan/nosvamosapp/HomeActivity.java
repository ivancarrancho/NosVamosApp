package com.example.ivan.nosvamosapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        init();
    }

    private void init() {
        Bundle extras = getIntent().getExtras();

        TextView email = (TextView) findViewById(R.id.emailData);
        TextView password = (TextView)findViewById(R.id.passwordData);

        if (extras != null){
            String em = (String) extras.get("emailData");
            String ps = (String) extras.get("passwordData");
            email.setText(em);
            password.setText(ps);

        }
    }
}