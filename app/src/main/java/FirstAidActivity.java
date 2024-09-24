package com.example.emergencytreatmentapp;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;

public class FirstAidActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_aid);

        // Example of displaying first aid information
        TextView firstAidInfo = findViewById(R.id.firstAidInfo);
        firstAidInfo.setText("Basic First Aid Information:\n\n"
                + "1. CPR: For cardiac arrest, perform chest compressions at a rate of 100-120 per minute.\n"
                + "2. Choking: Perform the Heimlich maneuver if the person is choking.\n"
                + "3. Bleeding: Apply pressure to the wound to stop the bleeding.\n"
                + "4. Burns: Cool the burn under running water for at least 10 minutes.\n"
                + "5. Fractures: Immobilize the injured part and seek medical help.");
    }
}
