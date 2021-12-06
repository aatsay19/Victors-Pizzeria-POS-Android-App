package com.example.project5;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainMenu extends AppCompatActivity {

    private Button orderDeluxeButton;
    private Button orderHawaiianButton;
    private Button orderPepperoniButton;
    private Button viewCurrentOrderButton;
    private Button viewListOfStoreOrdersButton;
    public static final String IMAGE_RESOURCE = "image_resource";
    public static String pizzaType = "Pizza Type: ";

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

    public void handleCurrentOrderButtonClick() {
        viewCurrentOrderButton = (Button) findViewById(R.id.viewCurrentOrderButton);
        viewCurrentOrderButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCurrentOrdersActivity();
            }
        });
    }

    public void handleStoreOrdersButtonClick() {
        viewListOfStoreOrdersButton = (Button) findViewById(R.id.viewListOfStoreOrdersButton);
        viewListOfStoreOrdersButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openListOfStoreOrdersActivity();
            }
        });
    }

    public void openCurrentOrdersActivity() {
        Intent intent = new Intent(this, CurrentOrder.class);
        startActivity(intent);
    }

    public void openListOfStoreOrdersActivity() {
        Intent intent = new Intent(this, ListOfStoreOrders.class);
        startActivity(intent);
    }
}