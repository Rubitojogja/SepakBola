package com.rubito.sepakbola;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;


public class DetailPemainActivity extends AppCompatActivity {

    TextView nama, asal, ket;
    ImageView gambar;
    public String title = "Detail Pemain Sepak Bola";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailpemain);

        getSupportActionBar().setTitle(title);

        nama = findViewById(R.id.nama);
        asal = findViewById(R.id.asal);
        ket = findViewById(R.id.keterangan);
        gambar = findViewById(R.id.photos);

        Intent intent = getIntent();
        String images = intent.getExtras().getString("POTO");
        String namarm = intent.getExtras().getString("NAMA");
        String asalrm = intent.getExtras().getString("ASAL");
        String ketrm = intent.getExtras().getString("KET");

        Glide.with(this)
                .load(images)
                .into(gambar);
        nama.setText(namarm);
        asal.setText(asalrm);
        ket.setText(ketrm);
    }
}
