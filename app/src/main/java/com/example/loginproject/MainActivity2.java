package com.example.loginproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

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
        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int inputAngka1 = Integer.parseInt(angka1.getText().toString());
                int inputAngka2 = Integer.parseInt(angka2.getText().toString());
                int hasilJumlah = 0;
                String text = dropdown.getSelectedItem().toString();
                switch (text){
                    case "Tambah" :
                        hasilJumlah = inputAngka1 + inputAngka2;
                        break;
                    case "Kurang" :
                        hasilJumlah = inputAngka1 - inputAngka2;
                        break;
                    case "Kali" :
                        hasilJumlah = inputAngka1 * inputAngka2;
                        break;
                    case "Bagi" :
                        hasilJumlah = inputAngka1 / inputAngka2;
                }
 
                hasil.setText(hasilJumlah + "");

            }
        });
    }
}