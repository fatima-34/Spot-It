package com.fatimafarooq.i202304;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class VoiceCallPageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.voice_call_page);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) ImageButton video = findViewById(R.id.endCallButton);
        video.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(VoiceCallPageActivity.this, MessagePageActivity.class);
                startActivity(intent);
            }
        });
    }
}