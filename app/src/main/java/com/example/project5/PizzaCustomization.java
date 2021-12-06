package com.example.project5;

import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

//import static com.example.project5.MainMenu.IMAGE_RESOURCE;

public class PizzaCustomization extends AppCompatActivity {
    public static ImageView imageOfPizza;
    public static TextView typeOfPizza;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizza_customization);
        imageOfPizza = (ImageView) findViewById(R.id.pizzaImage);
        imageOfPizza.setImageResource(getIntent().getIntExtra(MainMenu.IMAGE_RESOURCE, R.drawable.deluxepizzapic));
        typeOfPizza = (TextView) findViewById(R.id.pizzaType);
        typeOfPizza.setText(MainMenu.pizzaType);
    }
}