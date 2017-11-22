package com.example.motoyama.mymaillauncher;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = getIntent();
        int id = intent.getIntExtra("ADRESS",0);

        ImageView myAdressImageView = (ImageView) findViewById(R.id.atya);

        switch (id) {
            case R.id.radioButton3:
                myAdressImageView.setImageResource(R.drawable.atyamo);
                break;
            case R.id.radioButton2:
                myAdressImageView.setImageResource(R.drawable.kimori);
                break;
            case R.id.radioButton:
                myAdressImageView.setImageResource(R.drawable.mizu);
                break;
        }


    }

    public void onAdressButtonTapped(View view){
        Intent intent = new Intent(this,MainActivity.class);
        intent.putExtra("ADRESS",view.getId());
        startActivity(intent);
    }


}
