package com.example.emergencytreatmentapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import com.example.emergencytreatmentapp.FirstAidActivity;
import com.example.emergencytreatmentapp.EmergencyContactsActivity;
import com.example.emergencytreatmentapp.EmergencyProceduresActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnFirstAid = findViewById(R.id.btnFirstAid);
        Button btnEmergencyContacts = findViewById(R.id.btnEmergencyContacts);
        Button btnEmergencyProcedures = findViewById(R.id.btnEmergencyProcedures);

        btnFirstAid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FirstAidActivity.class);
                startActivity(intent);
            }
        });

        btnEmergencyContacts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, EmergencyContactsActivity.class);
                startActivity(intent);
            }
        });

        btnEmergencyProcedures.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, EmergencyProceduresActivity.class);
                startActivity(intent);
            }
        });
    }
}
