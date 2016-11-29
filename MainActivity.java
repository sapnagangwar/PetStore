package com.example.sapnagangwar.projectpetstore;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvMain;
    Button btnStart, btnExit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvMain = (TextView)findViewById(R.id.tvMain);
        btnStart = (Button)findViewById(R.id.btnStart);
        btnExit = (Button)findViewById(R.id.btnExit);
    }

    public void onStart(View view){
        Intent intentCategory = new Intent(this, SelectPetCategory.class);
        startActivity(intentCategory);
    }

    public void onExit(View view){
        this.finish();
    }
}
