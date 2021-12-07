package com.example.project5;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

/**
 * This is the java class that implements functionality to activity_main_menu.xml file
 * @author Aatif Sayed, Pranav Tailor
 */

public class MainMenu extends AppCompatActivity {

    private Button orderDeluxeButton;
    private Button orderHawaiianButton;
    private Button orderPepperoniButton;
    private Button viewCurrentOrderButton;
    private Button viewListOfStoreOrdersButton;
    public static final String IMAGE_RESOURCE = "image_resource";
    public static String pizzaType = "Pizza Type: ";

    /**
     * Method that creates activity
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        orderDeluxeButton = (Button) findViewById(R.id.orderDeluxeButton);
        orderHawaiianButton = (Button) findViewById(R.id.orderHawaiianButton);
        orderPepperoniButton = (Button) findViewById(R.id.orderPepperoniButton);
        handleOrderDeluxeButtonClick();
        handleOrderHawaiianButtonClick();
        handleOrderPepperoniButtonClick();
        handleCurrentOrderButtonClick();
        handleStoreOrdersButtonClick();
    }

    /**
     * Method that changes activity to activity_pizza_customization with the deluxe button
     */
    public void handleOrderDeluxeButtonClick() {
        orderDeluxeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainMenu.this, PizzaCustomization.class);
                intent.putExtra(IMAGE_RESOURCE, R.drawable.deluxepizzapic);
                pizzaType = "Pizza Type: Deluxe";
                startActivity(intent);
            }
        });
    }

    /**
     * Method that changes activity to activity_pizza_customization with the hawaiian button
     */
    public void handleOrderHawaiianButtonClick() {
        orderHawaiianButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainMenu.this, PizzaCustomization.class);
                intent.putExtra(IMAGE_RESOURCE, R.drawable.hawaiianpizzapic);
                pizzaType = "Pizza Type: Hawaiian";
                startActivity(intent);
            }
        });
    }

    /**
     * Method that changes activity to activity_pizza_customization with the pepperoni button
     */
    public void handleOrderPepperoniButtonClick() {
        orderPepperoniButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainMenu.this, PizzaCustomization.class);
                intent.putExtra(IMAGE_RESOURCE, R.drawable.pepperonipizzapic);
                pizzaType = "Pizza Type: Pepperoni";
                startActivity(intent);
            }
        });
    }

    /**
     * Method that changes activity to activity_current_orders when the 'view current order' button is pressed
     */
    public void handleCurrentOrderButtonClick() {
        viewCurrentOrderButton = (Button) findViewById(R.id.viewCurrentOrderButton);
        viewCurrentOrderButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCurrentOrdersActivity();
            }
        });
    }

    /**
     * Method that changes activity to activity_list_of_store_orders when the 'view list of store orders' button
     * is pressed
     */
    public void handleStoreOrdersButtonClick() {
        viewListOfStoreOrdersButton = (Button) findViewById(R.id.viewListOfStoreOrdersButton);
        viewListOfStoreOrdersButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openListOfStoreOrdersActivity();
            }
        });
    }

    /**
     * starts activity_current_orders activity
     * used in methods above
     */
    public void openCurrentOrdersActivity() {
        Intent intent = new Intent(this, CurrentOrder.class);
        startActivity(intent);
    }

    /**
     * starts activity_list_of_store_orders activity
     * used in methods above
     */
    public void openListOfStoreOrdersActivity() {
        Intent intent = new Intent(this, ListOfStoreOrders.class);
        startActivity(intent);
    }
}
