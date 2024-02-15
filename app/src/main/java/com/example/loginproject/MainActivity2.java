package com.example.loginproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    EditText angka1;
    EditText angka2;
    Spinner dropdown;
    TextView hasil;
    Button hitung;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kalkulator);

        angka1 = findViewById(R.id.angka1);
        angka2 = findViewById(R.id.angka2);
        dropdown = findViewById(R.id.dropDown);
        hasil = findViewById(R.id.hasil);
        hitung = findViewById(R.id.hitung);
        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int inputAngka1 = Integer.parseInt(angka1.getText().toString());
                int inputAngka2 = Integer.parseInt(angka2.getText().toString());
                int hasilArit=0;
                switch (dropdown.getSelectedItem().toString()){
                    case "Tambah":
                        hasilArit= inputAngka1+inputAngka2;
                        hasil.setText(hasilArit+"");
                        break;
                    case "Kurang":
                        hasilArit= inputAngka1-inputAngka2;
                        hasil.setText(hasilArit+"");
                        break;
                    case "Kali":
                        hasilArit= inputAngka1*inputAngka2;
                        hasil.setText(hasilArit+"");
                        break;
                    case "Bagi":
                        double hasilsrit= (double)inputAngka1/(double) inputAngka2;
                        hasil.setText(hasilsrit+"");
                        break;
                }



            }
        });
    }
}