package com.example.tasbih;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class PopUp extends Activity {

    Button but1,but2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pop_up);



        but1 = (Button)findViewById(R.id.but1);
        but2 = (Button)findViewById(R.id.but2);


        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopUp.this.finish();
            }
        });

        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent t=new Intent(PopUp.this,MainActivity.class);
                startActivity(t);

                PopUp.this.finish();

            }
        });
        PopUp.this.setFinishOnTouchOutside(false);

    }
}


