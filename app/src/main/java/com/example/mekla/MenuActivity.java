package com.example.mekla;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MenuActivity extends AppCompatActivity {

    ImageView foodImage;
    ImageView foodImage3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        foodImage = findViewById(R.id.food_image);
        foodImage3 = findViewById(R.id.food_image3);

        foodImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), DetailActivity.class);
                startActivity(i);
            }
        });

        foodImage3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent u = new Intent(getApplicationContext(), DetailActivity.class);
                startActivity(u);
            }
        });
    }

}