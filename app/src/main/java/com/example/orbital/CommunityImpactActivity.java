package com.example.orbital;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class CommunityImpactActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_community_impact);
        ImageView leftBackButton = findViewById(R.id.leftback);

        // Set an OnClickListener for the left back button
        leftBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an explicit Intent to open the DashboardActivity
                Intent intent = new Intent(CommunityImpactActivity.this, Dashboard.class);

                // Start the DashboardActivity
                startActivity(intent);

                // Finish the current activity (optional, depending on your navigation flow)
                finish();
            }
        });
    }
}