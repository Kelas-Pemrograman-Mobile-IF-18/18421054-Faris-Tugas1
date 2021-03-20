package com.farisalchaula.prj1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtNama, txtUmur, txtProfesi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNama = (TextView) findViewById(R.id.txtNama);
        txtNama.setText("Faris Al Chaula Billah");

        txtUmur = (TextView) findViewById(R.id.txtUmur);
        txtUmur.setText("umur : 21");

        txtProfesi = (TextView) findViewById(R.id.txtProfesi);
        txtProfesi.setText("Seorang Freelancer");
    }
}
