package com.example.orbital;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class AboutUsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);
        ImageView leftBackButton = findViewById(R.id.leftback);

        leftBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an explicit Intent to open the DashboardActivity
                Intent intent = new Intent(AboutUsActivity.this, Dashboard.class);

                // Start the DashboardActivity
                startActivity(intent);

                // Finish the current activity (optional, depending on your navigation flow)
                finish();
            }
        });
    }
}