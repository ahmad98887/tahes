package com.example.mywolkoutjourney;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class LatihanDetail extends AppCompatActivity implements DialogFragmentCustom.GetData {
    private Button tambahkanBtn;
    private TextView nama;
    private TextView detail;
    private ImageView imageView;
    private String day;
    private int min;
    private LatihanModel incomingGym;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_latihan_detail);

        try {
            Intent intent = getIntent();
            incomingGym = intent.getParcelableExtra("Detail");
            nama.setText(incomingGym.getNama());
            detail.setText(incomingGym.getDeskripsi());
            Glide.with(this).asBitmap().load(incomingGym.getGambar())
                    .into(imageView);
        } catch (NullPointerException ignored) {

        }
        tambahkanBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DialogFragmentCustom fragmentCustom = new DialogFragmentCustom();
                Bundle bundle = new Bundle();
                bundle.putParcelable("incomingGym", incomingGym);
                fragmentCustom.setArguments(bundle);
                fragmentCustom.show(getSupportFragmentManager(),"myDialog");
            }
        });
    }

    @Override
    public void collectData(JadwalModel plan) {
        Intent intent = new Intent(this, JadwalActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.putExtra("GYMObject", plan);
        startActivity(intent);

    }
}
