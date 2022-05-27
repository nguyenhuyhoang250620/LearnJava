package com.example.appsynthetic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.appsynthetic.src.Alert_Dialog;
import com.example.appsynthetic.src.AutoComplete;
import com.example.appsynthetic.src.CameraActivity;
import com.example.appsynthetic.src.ClipboardActivity;
import com.example.appsynthetic.src.LoginScreenActivity;
import com.example.appsynthetic.src.NotificationActivity;
import com.example.appsynthetic.src.SQLDatabaseActivity;

public class MainActivity extends AppCompatActivity {
    private Button btn_alert,btn_autocomplete,btn_camera,btn_clipboard,btn_loginscreen,btn_notification,btn_SQL;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.btn_alert = this.findViewById(R.id.btn_alert);
        this.btn_autocomplete=this.findViewById(R.id.btn_autocomplete);
        this.btn_camera=this.findViewById(R.id.btn_camera);
        this.btn_clipboard = this.findViewById(R.id.btn_clipboard);
        this.btn_loginscreen=this.findViewById(R.id.btn_loginscreen);
        this.btn_notification=this.findViewById(R.id.btn_pushnofitication);
        btn_alert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Alert_Dialog.class);
                startActivity(intent);
            }
        });
        btn_autocomplete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, AutoComplete.class);
                startActivity(intent);
            }
        });
        btn_camera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, CameraActivity.class);
                startActivity(intent);
            }
        });
        btn_clipboard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(MainActivity.this, ClipboardActivity.class);
                startActivity(intent);
            }
        });
        btn_loginscreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, LoginScreenActivity.class);
                startActivity(intent);
            }
        });
        btn_notification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, NotificationActivity.class);
                startActivity(intent);
            }
        });
    }
}