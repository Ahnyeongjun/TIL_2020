package com.example.club_projectarichfilm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {

    EditText et_email, et_pw;
    String sEmail, sPw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        EditText et_email = (findViewById(R.id.et_email));
        EditText et_pw = (findViewById(R.id.et_pw));

    }

    public void btn_join(View view) {
        sEmail = et_email.getText().toString();
        sPw = et_pw.getText().toString();
    }
}
