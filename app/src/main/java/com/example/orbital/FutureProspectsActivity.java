package com.example.orbital;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class FutureProspectsActivity extends AppCompatActivity {
    Button btn1,btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_future_prospects);
        btn1=findViewById(R.id.Link1);
        btn2=findViewById(R.id.Link2);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotourl("https://link.springer.com/article/10.1007/s43538-022-00104-2");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotourl("https://www.sciencedirect.com/science/article/pii/S0268401218311836");
            }
        });
        ImageView leftBackButton = findViewById(R.id.leftback);

        // Set an OnClickListener for the left back button
        leftBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an explicit Intent to open the DashboardActivity
                Intent intent = new Intent(FutureProspectsActivity.this, Dashboard.class);

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