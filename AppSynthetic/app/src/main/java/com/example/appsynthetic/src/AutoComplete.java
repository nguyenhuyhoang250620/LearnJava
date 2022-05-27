package com.example.appsynthetic.src;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;

import com.example.appsynthetic.R;

public class AutoComplete extends AppCompatActivity {
    private Button btn_back1;
    private AutoCompleteTextView autoCompleteTextView;
    String[] language={"VietNam","English","Korea","USA","Thailand","Malayxia"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto_complete);
        this.btn_back1=this.findViewById(R.id.btn_back1);
        this.autoCompleteTextView=this.findViewById(R.id.auto_complete);
        btn_back1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,language);
        autoCompleteTextView.setAdapter(adapter);
        autoCompleteTextView.setThreshold(1);

    }
}