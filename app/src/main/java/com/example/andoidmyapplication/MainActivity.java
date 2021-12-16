package com.example.andoidmyapplication;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    //Button = button_background, button_textcolor, button_text, button_custom_text

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //tap to change to custom text
        findViewById(R.id.button_custom_text).setOnClickListener(v -> {
            String userEnteredText = ((EditText) findViewById(R.id.edit_Text)).getText().toString();

            if (userEnteredText.isEmpty()){
                ((TextView) findViewById(R.id.msg_background)).setText("Create your own text");
            } else {
                ((TextView) findViewById(R.id.msg_background)).setText(userEnteredText);
            }
        });

        //tap to change background color
        findViewById(R.id.button_background).setOnClickListener(v -> {
            //#ff42959a =  green
            (findViewById(R.id.backGround)).setBackgroundColor(getResources().getColor(R.color.green));
        });

        //tap to change text
        findViewById(R.id.button_text).setOnClickListener(v -> {
            //msg_background = text
            ((TextView) findViewById(R.id.msg_background)).setText("I hope you enjoy my APP");
        });

        //tap to change text color
        findViewById(R.id.button_textcolor).setOnClickListener(v -> {
            //#FFFFFFFF = white
            ((TextView) findViewById(R.id.msg_background)).setTextColor(getResources().getColor(R.color.white));
        });

        //------------------------------> RESET <---------------------------------------------

        findViewById(R.id.backGround).setOnClickListener(v -> {
        //reset background color.  dark_blue = #ff23729a
            (findViewById(R.id.backGround)).setBackgroundColor(getResources().getColor(R.color.dark_blue));
        //reset text
            ((TextView) findViewById(R.id.msg_background)).setText("Hello from Andreza!");
        //reset text color.   dark = #263238
            ((TextView) findViewById(R.id.msg_background)).setTextColor(getResources().getColor(R.color.dark));
        });
    }
}