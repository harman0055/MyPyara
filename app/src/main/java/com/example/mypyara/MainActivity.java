package com.example.mypyara;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.mypyara.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding variableBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        variableBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(variableBinding.getRoot());
        
        EditText myedit = variableBinding.myedittext;
        Button mybutton = variableBinding.mybutton;
        TextView mytext = variableBinding.textview;
        mybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String editTextContent = myedit.getText().toString();
                mytext.setText("Your Name Is: " + editTextContent);
            }

        });
    }
}
