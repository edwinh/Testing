package com.example.edwin.testing;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText firstNameEditText = (EditText) findViewById(R.id.FirstNameEditText);
        final Button submitButton = (Button) findViewById(R.id.submitButton);
        submitButton.setEnabled(false);
        submitButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        final TextView helloText = (TextView) findViewById(R.id.helloTextView);
                        helloText.setText("Hello " + firstNameEditText.getText().toString());
                    }
                }
        );

        firstNameEditText.setOnKeyListener(
                new View.OnKeyListener() {
                    @Override
                    public boolean onKey(View v, int keyCode, KeyEvent event) {
                        if (firstNameEditText.getText().length() > 0)
                            submitButton.setEnabled(true);
                        else
                            submitButton.setEnabled(false);
                        return false;
                    }
                }
        );

    }



}
