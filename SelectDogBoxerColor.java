package com.example.sapnagangwar.projectpetstore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SelectDogBoxerColor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_dog_boxer_color);
    }

    public void onReturnToCategoryDog(View view){
        this.finish();
    }
}
