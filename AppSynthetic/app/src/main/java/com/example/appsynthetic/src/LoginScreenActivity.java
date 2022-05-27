package com.example.appsynthetic.src;

import static com.example.appsynthetic.R.color.purple_200;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.appsynthetic.R;

public class LoginScreenActivity extends AppCompatActivity {
    private EditText edt_username,edt_password;
    private Button btn_login,btn_cancel;
    private TextView txt_wrong;
    int wrong=3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);
        this.edt_username=this.findViewById(R.id.edt_username);
        this.edt_password=this.findViewById(R.id.edt_password);
        this.btn_login=this.findViewById(R.id.btn_login);
        this.btn_cancel=this.findViewById(R.id.btn_cancle);
        this.txt_wrong=this.findViewById(R.id.txt_wrong);

        btn_cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edt_username.getText().toString().equals("hoang")&&edt_password.getText().toString().equals("hoang")){
                    Toast.makeText(LoginScreenActivity.this,"Dang nhap thanh cong",Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(LoginScreenActivity.this,"Dang nhap that bai",Toast.LENGTH_SHORT).show();
                    txt_wrong.setVisibility(View.VISIBLE);
                    txt_wrong.setBackgroundColor(Color.RED);
                    wrong--;
                    txt_wrong.setText(Integer.toString(wrong));
                    if (wrong==0){
                        btn_login.setEnabled(false);
                    }
                }
            }
        });
    }
}