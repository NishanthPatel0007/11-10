package com.example.thefinals;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page01);  // Ensure this matches your layout file name.

        // Button 9 - Navigate back to MainActivity
        Button button9 = findViewById(R.id.button9);  // Ensure button9 exists in your page01.xml
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate back to MainActivity
                Intent intent = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(intent);  // Start MainActivity
            }
        });

        // Button 54 - Opens WebViewActivity with the desired URL
        Button button54 = findViewById(R.id.button54);  // Ensure button54 exists in your page01.xml
        button54.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to WebViewActivity and pass a URL
                Intent intent = new Intent(MainActivity2.this, WebViewActivity.class);
                intent.putExtra("url", "https://epaper.vijayavani.net/#");  // Pass the desired URL
                startActivity(intent);  // Start WebViewActivity
            }
        });
    }
}