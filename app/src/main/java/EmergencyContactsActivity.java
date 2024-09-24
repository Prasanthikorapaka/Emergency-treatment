package com.example.emergencytreatmentapp;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;

public class EmergencyContactsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergency_contacts);

        // Example of displaying emergency contact numbers
        TextView emergencyContactsInfo = findViewById(R.id.emergencyContactsInfo);
        emergencyContactsInfo.setText("Emergency Contacts:\n\n"
                + "1. Ambulance: 102\n"
                + "2. Police: 100\n"
                + "3. Fire Brigade: 101\n"
                + "4. Poison Control: 1800-222-1222\n"
                + "5. Local Hospital: 123-456-7890");
    }
}
