package com.example.calculsomme;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        EditText editText1 = findViewById(R.id.editTextText);
        EditText editText2 = findViewById(R.id.editTextText2);
        TextView textView = findViewById(R.id.textView);
        TextView textView2 = findViewById(R.id.textView2);
        TextView textView3 = findViewById(R.id.textView3);
        Button button = findViewById(R.id.button);
        Button button2 = findViewById(R.id.button2);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText1.setText("");
                editText2.setText("");
                textView.setText("");
                textView3.setText("");
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculSomme(v);
            }
        });
    }


    public void calculSomme(View v) {
        EditText editText1 = findViewById(R.id.editTextText);
        EditText editText2 = findViewById(R.id.editTextText2);
        String s1 =editText1.getText().toString();
        String s2 =editText1.getText().toString();
        double num1 = Double.parseDouble(s1);
        double num2 = Double.parseDouble(s2);
        double somme = num1 + num2;
        TextView textView3 = findViewById(R.id.textView3);
        textView3.setText("La somme est : " + somme);
    }
}
