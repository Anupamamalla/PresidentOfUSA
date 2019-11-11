package com.example.presidents;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

public class Detail extends AppCompatActivity {
    CircleImageView imgProfile;

    TextView tvName, tvdesc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        ActionBar name = getSupportActionBar();

        imgProfile = findViewById(R.id.imgProfile);
        tvName = findViewById(R.id.Fname);
        tvdesc = findViewById(R.id.detail);

        Bundle bundle = getIntent().getExtras();
        if(bundle!=null){

            imgProfile.setImageResource(bundle.getInt("image"));

            tvName.setText(bundle.getString("name"));

            tvdesc.setText(bundle.getString("detail"));

            name.setTitle(tvName.getText().toString());

        }


    }
}
