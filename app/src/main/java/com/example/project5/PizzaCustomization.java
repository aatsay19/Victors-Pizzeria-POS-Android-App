package com.example.project5;

import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

//import static com.example.project5.MainMenu.IMAGE_RESOURCE;

/**
 * This is the java class that implements functionality to activity_pizza_customization.xml file
 * @author Aatif Sayed, Pranav Tailor
 */
public class PizzaCustomization extends AppCompatActivity {
    public static ImageView imageOfPizza;
    public static TextView typeOfPizza;

    /**
     * Method that creates activity
     * @param savedInstanceState
     */
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
