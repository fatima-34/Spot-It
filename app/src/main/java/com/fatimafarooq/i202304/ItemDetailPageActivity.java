package com.fatimafarooq.i202304;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class ItemDetailPageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_detail_page);

        TextView textView = findViewById(R.id.rate);
        CharSequence charSequence = textView.getText();
        String text = charSequence.toString();
        SpannableString spannableString = new SpannableString(text);
        int colorIndex = 4;
        ForegroundColorSpan colorSpan = new ForegroundColorSpan(Color.BLACK);
        spannableString.setSpan(colorSpan, colorIndex, text.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        textView.setText(spannableString);

        ImageButton back = findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ItemDetailPageActivity.this, HomePageActivity.class);
                startActivity(intent);
            }
        });

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button report = findViewById(R.id.report);
        report.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ItemDetailPageActivity.this, ReportPageActivity.class);
                startActivity(intent);
            }
        });

        ImageButton chat = findViewById(R.id.chat);
        chat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ItemDetailPageActivity.this, ChatPageActivity.class);
                startActivity(intent);
            }
        });
    }
}