package com.example.mad_tutorial2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btnSend;
    EditText txtName;

    @SuppressLint("CutPasteId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtName = findViewById(R.id.editName);
        btnSend = findViewById(R.id.btnSend);


        btnSend.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String name = txtName.getText().toString();
                Intent intent = new Intent( MainActivity.this,Activity2.class);
                intent.putExtra("name",name);
                startActivity(intent);
            }
        }

    }