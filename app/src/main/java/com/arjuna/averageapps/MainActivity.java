package com.arjuna.averageapps;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etIng, etIndo, etKomp, etMtk;
    TextView txtHasil;
    Button btnHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //memanggil id widget
        etIng = (EditText)findViewById(R.id.etIng);
        etIndo = (EditText)findViewById(R.id.etIndo);
        etKomp = (EditText)findViewById(R.id.etKomp);
        etMtk = (EditText)findViewById(R.id.etMtk);
        btnHasil = (Button) findViewById(R.id.btnHasil);
        txtHasil = (TextView) findViewById(R.id.txtHasil);

        btnHasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //mengambil nilai dari widget edit text dan memasukan kedaam nilai String
                String nIng = etIng.getText().toString();
                String nIndo = etIndo.getText().toString();
                String nKomp = etKomp.getText().toString();
                String nMtk = etMtk.getText().toString();

                //mengecek apa edit text kosong
                //kondisi panjang nya kosong
                if(nIng.isEmpty()){
                    //memberikan warning berupa eror
                    etIng.setError("Nilai Inggris Tidak Boleh Kosong");
                }else if (nIndo.isEmpty()){
                    //Kondisi ketika lebarnya kosong
                    etIndo.setError("Nilai Indo Tidak Boleh Kosong");
                }else if (nKomp.isEmpty()){
                    etKomp.setError("Nilai Komp Tidak Boleh Kosong ");
                }else if (nMtk.isEmpty()){
                    etMtk.setError("Nilai Matematika tidak Boleh Kosong");

                }else {

                    //mengubah nilai dari String ke Interger
                    int aMTK = Integer.parseInt(nMtk);
                    int aIng = Integer.parseInt(nIng);
                    int aKomp = Integer.parseInt(nKomp);
                    int aIndo = Integer.parseInt(nIndo);

                    //kondisi ketika panjang dan lebar nya tidak kosong
                    int hasilRatarata = ((aMTK + aIndo + aIng + aKomp) / 4);
                    int hasilTotal = aMTK + aIndo + aIng + aKomp;

                    //menampilkan hasil hitung ke widget textview
                    txtHasil.setText("Hasil Nilai tersebut adalah " + "  " + hasilRatarata + " " + "Hasil Total :" + " " + hasilTotal);
                }
            }
        });
    }
}
