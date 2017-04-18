package com.fei.fei.hw4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText et_msg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = (Button)findViewById(R.id.btn_notification);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction("lincyu.NOTIFICATION");
                String msg = et_msg.getEditableText().toString();
                intent.putExtra("KEY_MSG", msg);
                sendBroadcast(intent);
            }
        });
        et_msg = (EditText)findViewById(R.id.et_msg);
    }
}
