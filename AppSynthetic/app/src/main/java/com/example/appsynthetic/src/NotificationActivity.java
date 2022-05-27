package com.example.appsynthetic.src;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.appsynthetic.R;

public class NotificationActivity extends AppCompatActivity {
    private NotificationManagerCompat notificationManagerCompat;
    private EditText edt_namepush,edt_title,edt_content;
    private Button btn_pushnofitication;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);
        this.edt_title=this.findViewById(R.id.edt_title);
        this.edt_content=this.findViewById(R.id.edt_content);
        this.btn_pushnofitication=this.findViewById(R.id.btn_nofitication);

        btn_pushnofitication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendOnChannel();
            }
        });
        this.notificationManagerCompat = NotificationManagerCompat.from(this);
    }
    private void sendOnChannel()  {
        String title = this.edt_title.getText().toString();
        String message = this.edt_content.getText().toString();

        Notification notification = new NotificationCompat.Builder(this, NotificationApp.CHANNEL_1_ID)
                .setSmallIcon(R.drawable.ic_launcher_background)
                .setContentTitle(title)
                .setContentText(message)
                .setPriority(NotificationCompat.PRIORITY_HIGH)
                .setCategory(NotificationCompat.CATEGORY_MESSAGE)
                .build();

        int notificationId = 2;
        this.notificationManagerCompat.notify(notificationId, notification);
    }
}