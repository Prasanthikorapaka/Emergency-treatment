package com.example.emergencytreatmentapp;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;

public class EmergencyProceduresActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergency_procedures);

        // Example of displaying emergency procedures
        TextView emergencyProceduresInfo = findViewById(R.id.emergencyProceduresInfo);
        emergencyProceduresInfo.setText("Emergency Procedures:\n\n"
                + "1. Heart Attack: Call 911 immediately. Keep the person calm and have them sit or lie down.\n"
                + "2. Stroke: Call 911 immediately. Monitor the person closely and keep them comfortable.\n"
                + "3. Seizure: Clear the area around the person, cushion their head, and do not restrain their movements.\n"
                + "4. Severe Allergic Reaction: Use an EpiPen if available and seek emergency medical help.\n"
                + "5. Unconsciousness: Check for breathing, call 911, and start CPR if necessary.");
    }
}
