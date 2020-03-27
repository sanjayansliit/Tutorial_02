package com.example.mad_tutorial2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;

public class Activity2 extends AppCompatActivity {

    Edittext num1;
    Edittext num2;
    Button btnSend;

    @SuppressLint({"CutPasteId", "SetTextI18n"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        TextView nameView = findViewById(R.id.txtName2);
        nameView.setText( "Hello" + name);

        num1 = findViewById(R.id.edtnum1);
        num2 = findViewById(R.id.edtnum2);

        btnSend = findViewById(R.id.btnSend2);


        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String n1 = num1.getText().toString();
                String n2 = num2.getText().toString();

                Intent intent1 = new Intent(Activity2.this,Activity3.class);
                intent1.putExtra("n1","n1");
                intent1.putExtra("n2","n2");

                startActivity(intent1);
            }
        });
    }
