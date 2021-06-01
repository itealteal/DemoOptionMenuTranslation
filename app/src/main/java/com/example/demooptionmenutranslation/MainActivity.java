package com.example.demooptionmenutranslation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    TextView tvTranslate;
    TextView tvTranslate2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvTranslate = findViewById(R.id.tvTranslate);
        tvTranslate2 = findViewById(R.id.tvTranslate2);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here.
        int id = item.getItemId();

        if (id == R.id.englishSelect) {
            tvTranslate.setText("Hello ");
            tvTranslate2.setText("Bye ");
            return true;
        } else if (id == R.id.italianSelect) {
            tvTranslate.setText("Ciao ");
            tvTranslate2.setText("Addio");
            return true;
        } else {
            tvTranslate.setText("Error translation");
        }

        return super.onOptionsItemSelected(item);
    }




}