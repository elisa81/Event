package com.jmj.edu.event;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, View.OnLongClickListener {

    Button button;
    Button button1;
    Button button2;
    Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(this);

        button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(this);

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnLongClickListener(this);

        button3 = (Button) findViewById(R.id.button3);
        button3.setOnLongClickListener(this);

    }

    @Override
    public void onClick(View v) {
        String text = ((Button) v).getText().toString();
        TextView textView = (TextView) findViewById(R.id.textView);
        int id = v.getId();

        switch (id) {
            case R.id.button:
                Toast.makeText(this, ((Button) v).getText(), Toast.LENGTH_SHORT).show();
                textView.setText(text.toString());
                break;
            case R.id.button1:
                Toast.makeText(this, ((Button) v).getText(), Toast.LENGTH_SHORT).show();
                textView.setText(text.toString());
                break;
            case R.id.button2:
                Toast.makeText(this, ((Button) v).getText(), Toast.LENGTH_SHORT).show();
                textView.setText(text.toString());
                break;
            case R.id.button3:
                Toast.makeText(this, ((Button) v).getText(), Toast.LENGTH_SHORT).show();
                textView.setText(text.toString());
                break;

        }

    }

    @Override
    public boolean onLongClick(View v) {
        String text = ((Button) v).getText().toString();
        TextView textView = (TextView) findViewById(R.id.textView);
        int id = v.getId();


        switch (id) {
            case R.id.button2:
                Toast.makeText(this, ((Button) v).getText(), Toast.LENGTH_SHORT).show();
                textView.setText(text.toString());
                break;
            case R.id.button3:
                Toast.makeText(this, ((Button) v).getText(), Toast.LENGTH_SHORT).show();
                textView.setText(text.toString());
                break;
        }
        return false;
    }
}
