package com.example.EWCS;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {

    private EditText pass,upd;
    private Button btn5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        pass=findViewById(R.id.editText3);
        upd=findViewById(R.id.editText2);
        btn5=findViewById(R.id.button3);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    String passd=pass.getText().toString();
                    String updt = upd.getText().toString();
                    if(passd.contentEquals("1234")){
                        Intent intent = new Intent(MainActivity2.this, MainActivity.class);
                        intent.putExtra("val", updt);
                        startActivity(intent);
                    }
                    else{
                        Intent intent = new Intent(MainActivity2.this, MainActivity.class);
                        startActivity(intent);
                    }

            }
        });


    }
}