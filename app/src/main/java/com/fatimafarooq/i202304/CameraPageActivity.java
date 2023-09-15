package com.fatimafarooq.i202304;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class CameraPageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.camera_page);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) ImageButton cancel = findViewById(R.id.cancelButton);
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CameraPageActivity.this, MessagePageActivity.class);
                startActivity(intent);
            }
        });

        Button video = findViewById(R.id.switchVideoButton);
        video.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CameraPageActivity.this, VideoPageActivity.class);
                startActivity(intent);
            }
        });
    }
}