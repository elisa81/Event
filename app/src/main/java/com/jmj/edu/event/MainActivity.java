package com.jmj.edu.event;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

        Button button;
        Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(this);

        button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String text = ((Button)v).getText().toString();
        TextView textView = (TextView) findViewById(R.id.textView);

        if(v.getId() == R.id.button) {
            Toast.makeText(this, ((Button)v).getText(), Toast.LENGTH_SHORT ).show();
            textView.setText(text.toString());
        } else {
            Toast.makeText(this, ((Button)v).getText(), Toast.LENGTH_SHORT ).show();
            textView.setText(text.toString());
        }
    }
}
