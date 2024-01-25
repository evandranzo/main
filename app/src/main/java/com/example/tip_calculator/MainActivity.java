package com.example.tip_calculator;

import android.content.res.Resources;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initDisplayButton();
    }

    private void initDisplayButton(){
        Button displayButton = findViewById(R.id.buttonDisplay);
        displayButton.setOnClickListener(view -> {
            EditText editName = findViewById(R.id.editTextNumber);
            TextView textDisplay = findViewById(R.id.textView);
            String nameToDisplay = editName.getText().toString();
            Resources res = getResources(); // Asks the system for access to the values files
            String displayString = res.getString(R.string.welcome_message, nameToDisplay); // Creates the string with a message and name
            textDisplay.setText(displayString);
        });
    }
}