package com.example.sapnagangwar.projectpetstore;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SelectPetCategory extends AppCompatActivity {


    TextView tvCategory;
    Button btnDog, btnCat, btnBird, btnFish, btnBackToHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_pet_category);

        tvCategory = (TextView)findViewById(R.id.tvCategogy);
        btnDog = (Button)findViewById(R.id.btnDog);
        btnCat = (Button)findViewById(R.id.btnCat);
        btnBird = (Button)findViewById(R.id.btnBird);
        btnFish = (Button)findViewById(R.id.btnFish);
        btnBackToHome = (Button)findViewById(R.id.btnBackToHome);
    }

    public void onClickDog(View view){
        Intent intentDogSelection = new Intent(this,CategoryDog.class);
        startActivity(intentDogSelection);
    }

    public void onClickCat(View view){
        Intent intentCatSelection = new Intent(this,CategoryCat.class);
        startActivity(intentCatSelection);
    }
    public void onClickBird(View view){
        Intent intentBirdSelection = new Intent(this,CategoryBird.class);
        startActivity(intentBirdSelection);
    }
    public void onClickFish(View view){
        Intent intentFishSelection = new Intent(this,CategoryFish.class);
        startActivity(intentFishSelection);
    }

    public void onBackToHome(View view){
        this.finish();
    }
}
