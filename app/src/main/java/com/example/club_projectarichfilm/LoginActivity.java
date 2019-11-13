package com.example.club_projectarichfilm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        EditText et_email = (EditText) findViewById(R.id.et_email);
        EditText et_pw = (EditText) findViewById(R.id.et_pw);
        Button btn_register = (Button) findViewById(R.id.btn_register);
        Button btn_login = (Button) findViewById(R.id.btn_login);



    }
}