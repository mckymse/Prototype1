package com.example.prototype1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;


import com.tomer.fadingtextview.FadingTextView;

public class Language extends AppCompatActivity implements View.OnClickListener {

    private CardView hindi,tamil,english,telugu;

    private FadingTextView fadingTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.language);

        fadingTextView = findViewById(R.id.fade);
        hindi = (CardView) findViewById(R.id.hindi);
        tamil = (CardView) findViewById(R.id.tamil);
        english = (CardView) findViewById(R.id.english);
        telugu = (CardView) findViewById(R.id.telugu);

        hindi.setOnClickListener(this);
        tamil.setOnClickListener(this);
        english.setOnClickListener(this);
        telugu.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        Intent i;

        switch (view.getId()){
            case R.id.hindi : i = new Intent(this,Hindi.class);startActivity(i);break;
            case R.id.english : i = new Intent(this,English.class);startActivity(i);break;
            case R.id.tamil : i = new Intent(this,Tamil.class);startActivity(i);break;
            case R.id.telugu : i = new Intent(this,Telugu.class);startActivity(i);break;
            default:break;
        }
    }
}
