package com.example.mywolkoutjourney;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {
private Button btnJadwal, btnLatihan, btnTentang;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        btnJadwal = findViewById(R.id.jadwalTahes);
        btnLatihan = findViewById(R.id.latihanTahes);
        btnTentang = findViewById(R.id.tentangTahes);

        btnJadwal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, JadwalActivity.class);
                startActivity(intent);
            }
        });
        btnLatihan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, LatihanActivity.class);
                startActivity(intent);
            }
        });
        btnTentang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, TentangActivity.class);
                startActivity(intent);
            }
        });
    }
}
