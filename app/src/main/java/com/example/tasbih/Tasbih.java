package com.example.tasbih;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;

public class Tasbih extends AppCompatActivity {
    TextView txt;
    TextView txt2;
    ImageView img;
    ImageView refresh;
    ConstraintLayout l;
    PopupWindow popUp;
    int i=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        popUp = new PopupWindow(this);
        LinearLayout layout = new LinearLayout(this);
        LinearLayout mainLayout = new LinearLayout(this);
        setContentView(R.layout.activity_tasbih);
        txt=findViewById(R.id.intentText);
        txt2=findViewById(R.id.textView4);
        txt2.setText("0");
        img=findViewById(R.id.imageView12);

        Intent t=getIntent();
        String tasbihNostr=t.getStringExtra(Intent.EXTRA_TEXT);
        int count=Integer.parseInt(tasbihNostr);

        img.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                txt2.setText(String.valueOf(i++));
                if(txt2.getText().equals(String.valueOf(count))){
                    Vibrator t=(Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                    t.vibrate(700);
                    Intent i=new Intent(Tasbih.this,PopUp.class);
                    i.putExtra(Intent.EXTRA_TEXT,txt2.getText());
                    startActivity(i);

                }
                return false;
            }
        });
        refresh=findViewById(R.id.imageView4);
        refresh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt2.setText("0");
                i=0;
            }
        });
        txt.setText(tasbihNostr);
    }


}