package com.example.project5;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

/**
 * This is the java class that implements functionality to activity_current_orders.xml file
 * @author Aatif Sayed, Pranav Tailor
 */

public class CurrentOrder extends AppCompatActivity {

    /**
     * Method that creates activity
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_current_orders);
    }
}
