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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        handleOrderDeluxeButtonClick();
        handleOrderHawaiianButtonClick();
        handleOrderPepperoniButtonClick();
        handleCurrentOrderButtonClick();
        handleStoreOrdersButtonClick();
    }

    public void handleOrderDeluxeButtonClick() {
        orderDeluxeButton = (Button) findViewById(R.id.orderDeluxeButton);
        orderDeluxeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPizzaCustomizationActivity();
            }
        });
    }

    public void handleOrderHawaiianButtonClick() {
        orderHawaiianButton = (Button) findViewById(R.id.orderHawaiianButton);
        orderHawaiianButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPizzaCustomizationActivity();
            }
        });
    }

    public void handleOrderPepperoniButtonClick() {
        orderPepperoniButton = (Button) findViewById(R.id.orderPepperoniButton);
        orderPepperoniButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPizzaCustomizationActivity();
            }
        });
    }

    public void handleCurrentOrderButtonClick() {
        viewCurrentOrderButton = (Button) findViewById(R.id.viewCurrentOrderButton);
        viewCurrentOrderButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCurrentOrdersActivity();
            }
        });
    }

    public void handleStoreOrdersButtonClick() {
        viewListOfStoreOrdersButton = (Button) findViewById(R.id.viewListOfStoreOrdersButton);
        viewListOfStoreOrdersButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openListOfStoreOrdersActivity();
            }
        });
    }

    public void openCurrentOrdersActivity() {
        Intent intent = new Intent(this, CurrentOrder.class);
        startActivity(intent);
    }

    public void openPizzaCustomizationActivity() {
        Intent intent = new Intent(this, PizzaCustomization.class);
        startActivity(intent);
    }

    public void openListOfStoreOrdersActivity() {
        Intent intent = new Intent(this, ListOfStoreOrders.class);
        startActivity(intent);
    }
}