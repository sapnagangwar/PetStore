package com.example.sapnagangwar.projectpetstore;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class CategoryDog extends AppCompatActivity {

    ImageView ivBoxer, ivDachshund;
    Button btnBackToPetCategory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_dog);

        ivBoxer = (ImageView)findViewById(R.id.ivBoxer);
        ivDachshund = (ImageView)findViewById(R.id.ivDachshund);

        btnBackToPetCategory = (Button)findViewById(R.id.btnBackToPetCategory);

        ivBoxer.setClickable(true);
        ivDachshund.setClickable(true);

        ivBoxer.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intentDogBoxerColor = new Intent(CategoryDog.this,SelectDogBoxerColor.class);
                startActivity(intentDogBoxerColor);
            }
        });

    }

    public void onBtnBackToPetCategory(View view){
        this.finish();
    }


}
