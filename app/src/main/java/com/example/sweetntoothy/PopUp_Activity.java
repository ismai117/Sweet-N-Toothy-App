package com.example.sweetntoothy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.WindowManager;
import android.widget.TextView;

public class PopUp_Activity extends AppCompatActivity {

    private TextView name, description, price;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pop_up);
        init();

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout((int) (width * .8), (int)(height * .5));
    }

    public void init(){
        name = findViewById(R.id.popup_name);
        description = findViewById(R.id.popup_description);
        price = findViewById(R.id.popup_price);

        String nameValue = getIntent().getStringExtra("name");
        String descriptionValue = getIntent().getStringExtra("description");
        String priceValue = getIntent().getStringExtra("price");

        name.setText(nameValue);
        description.setText(descriptionValue);
        price.setText("£"riceValue);

    }
}

