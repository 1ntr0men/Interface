package com.example.aninterface;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    Button log_in;
    EditText login, pass;
    TextView txt1, txt2, txt3, txt4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        log_in = (Button) findViewById(R.id.log_in);
        login = (EditText) findViewById(R.id.login);
        pass = (EditText) findViewById(R.id.pass);
        txt1 = (TextView) findViewById(R.id.txt1);
        txt2 = (TextView) findViewById(R.id.txt2);
        txt3 = (TextView) findViewById(R.id.txt3);
        txt4 = (TextView) findViewById(R.id.txt4);
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v.getId() == R.id.log_in) {
                    if (login.getText().toString().equals("user") &&
                            pass.getText().toString().equals("password")) {
                        txt4.setText("Верно");
                        txt4.setTextColor(Color.GREEN);
                    } else {
                        txt4.setText("Вы ошиблись в логине или пароле");
                        txt4.setTextColor(Color.RED);
                    }
                }
            }
        };
        log_in.setOnClickListener(listener);
    }
}
