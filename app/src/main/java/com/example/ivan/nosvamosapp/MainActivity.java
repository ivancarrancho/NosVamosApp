package com.example.ivan.nosvamosapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btn;
    private EditText email;
    private EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        btn = (Button) findViewById(R.id.buttonId);
        email = (EditText) findViewById(R.id.emailId);
        password = (EditText) findViewById(R.id.passwordId);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Entro2");
                Intent intent = new Intent(MainActivity.this, HomeActivity.class);
                intent.putExtra("emailData", email.getText().toString());
                intent.putExtra("passwordData", password.getText().toString());
                startActivity(intent);
            }
        });
    }

}
