package com.example.zao.lab3_ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.widget.ArrayAdapter;
import android.widget.ListView;
public class ChatList extends AppCompatActivity {

    String[] names = { "sp15-1", "sp15-1","sp15-1","sp15-1", "sp15-1", "sp15-1",
            "sp15-1", "sp15-1" };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat_list);
        ListView chatList =(ListView)findViewById(R.id.ListView_dynamic);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, names);
        chatList.setAdapter(adapter);
    }
}
