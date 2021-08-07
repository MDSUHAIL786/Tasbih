package com.example.tasbih;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn;
    EditText input;
    ImageView img;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=findViewById(R.id.button);
        input=findViewById(R.id.editTextNumber);
        img=findViewById(R.id.imageView3);



        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(input.getText().toString().equals("") || input.getText().toString().equals("0"))
                    Toast.makeText(MainActivity.this, "please enter valid value", Toast.LENGTH_SHORT).show();
                else{
                    Intent in=new Intent(MainActivity.this,Tasbih.class);
                    in.putExtra(Intent.EXTRA_TEXT, String.valueOf(input.getText()));
                    startActivity(in);

                }




            }
        });



    }


}