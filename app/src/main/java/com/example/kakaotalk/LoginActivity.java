 package com.example.kakaotalk;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    EditText editText;
    Button bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9, bt0, btB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.password);
        Intent intent = new Intent(this, SplashActivity.class);
        startActivity(intent);

        bt1 = findViewById(R.id.bt1);
        bt2 = findViewById(R.id.bt2);
        bt3 = findViewById(R.id.bt3);
        bt4 = findViewById(R.id.bt4);
        bt5 = findViewById(R.id.bt5);
        bt6 = findViewById(R.id.bt6);
        bt7 = findViewById(R.id.bt7);
        bt8 = findViewById(R.id.bt8);
        bt9 = findViewById(R.id.bt9);
        bt0 = findViewById(R.id.bt0);
        btB = findViewById(R.id.btB);
        editText = (EditText)findViewById(R.id.edit);

        final Button.OnClickListener onClickListener = new Button.OnClickListener()
        {
            @Override
            public  void onClick(View v)
            {
                if(v==bt1)
                    editText.setText(editText.getText().toString()+1);
                else if(v==bt2)
                    editText.setText(editText.getText().toString()+2);
                else if(v==bt3)
                    editText.setText(editText.getText().toString()+3);
                else if(v==bt4)
                    editText.setText(editText.getText().toString()+4);
                else if(v==bt5)
                    editText.setText(editText.getText().toString()+5);
                else if(v==bt6)
                    editText.setText(editText.getText().toString()+6);
                else if(v==bt7)
                    editText.setText(editText.getText().toString()+7);
                else if(v==bt8)
                    editText.setText(editText.getText().toString()+8);
                else if(v==bt9)
                    editText.setText(editText.getText().toString()+9);
                else if(v==bt0)
                    editText.setText(editText.getText().toString()+0);
                else if(v==btB)
                    editText.setText("");


                if(editText.getText().toString().equals("1111"))
                {
                    Intent intent = new Intent(LoginActivity.this,MainActivity.class);
                    startActivity(intent);
                    finish();


                    Toast.makeText(LoginActivity.this,"접-속",Toast.LENGTH_LONG).show();
                }



                else if(editText.getText().toString().length()==4)
                {
                    editText.setText("");
                    Toast.makeText(LoginActivity.this,"다시 입력해주세요",Toast.LENGTH_LONG).show();
                }
            }
        };
        bt1.setOnClickListener(onClickListener);
        bt2.setOnClickListener(onClickListener);
        bt3.setOnClickListener(onClickListener);
        bt4.setOnClickListener(onClickListener);
        bt5.setOnClickListener(onClickListener);
        bt6.setOnClickListener(onClickListener);
        bt7.setOnClickListener(onClickListener);
        bt8.setOnClickListener(onClickListener);
        bt9.setOnClickListener(onClickListener);
        bt0.setOnClickListener(onClickListener);
        btB.setOnClickListener(onClickListener);
    }
}
