package com.example.zao.lab3_ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.content.Intent;


public class MainActivity extends AppCompatActivity implements OnClickListener{

    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button)findViewById(R.id.button_logIn);
        button.setOnClickListener(this);
    }
    @Override
    public void onClick(View v)
    {
        switch (v.getId()){
            case R.id.button_logIn:
                Intent intent = new Intent(this, ChatList.class);
                startActivity(intent);
                break;
                default:break;
        }

    }
}
