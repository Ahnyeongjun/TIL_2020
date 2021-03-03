package com.example.kakaotalk;

        import android.app.Activity;
        import android.content.Intent;
        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;
        import android.util.Log;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.ImageButton;
        import android.widget.Toast;

public class moreinformation extends Activity {
    private Button m_Button;
    private View.OnClickListener m_listener;

    private  int counter;
    ImageButton memo;
    Button memo1;
    ImageButton Relative;
    Button Relative1;
    EditText EditText1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.moreinformation);
        counter = 0;

        m_Button = findViewById(R.id.button1);
        m_listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m_Button.setText(String.valueOf(++counter));
                if(m_Button.getText().toString().equals("10"))
                {
                    Intent intent = new Intent(moreinformation.this,Counter.class);
                    startActivity(intent);
                    finish();


                    Toast.makeText(moreinformation.this,"접-속",Toast.LENGTH_LONG).show();
                }
           }
        };

        memo = findViewById(R.id.memo);
        memo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(com.example.kakaotalk.moreinformation.this,AndroidStudio_Text.class);
                startActivity(intent);
            }
        });
        memo1 = findViewById(R.id.memo1);
        memo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(com.example.kakaotalk.moreinformation.this, AndroidStudio_Text.class);
                startActivity(intent);
            }
        });
        Relative = findViewById(R.id.Relative);
        Relative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(com.example.kakaotalk.moreinformation.this, Relative.class);
                startActivity(intent);
            }
        });
        Relative1 = findViewById(R.id.Relative1);
        Relative1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(com.example.kakaotalk.moreinformation.this, Relative.class);
                startActivity(intent);
            }
        });
        m_Button.setOnClickListener(m_listener);
    }
}