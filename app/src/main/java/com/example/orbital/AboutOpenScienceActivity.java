package com.example.orbital;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class AboutOpenScienceActivity extends AppCompatActivity {
    Button btn;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_open_science);

        btn = findViewById(R.id.BTNLink);
        imageView=findViewById(R.id.InfoVideo);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotourl("https://science.nasa.gov/researchers/open-science/");
            }
        });
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotourl("https://www.youtube.com/watch?v=8fGRN5fa-Ks&ab_channel=TheRoyalSociety");
            }
        });

        // Find the left back ImageView by its ID
        ImageView leftBackButton = findViewById(R.id.leftback);

        // Set an OnClickListener for the left back button
        leftBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an explicit Intent to open the DashboardActivity
                Intent intent = new Intent(AboutOpenScienceActivity.this, Dashboard.class);

                // Start the DashboardActivity
                startActivity(intent);

                // Finish the current activity (optional, depending on your navigation flow)
                finish();
            }
        });
    }

    private void gotourl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}