package com.fatimafarooq.i202304;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class ChatPageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chat_page);

//        @SuppressLint({"WrongViewCast", "MissingInflatedId", "LocalSuppress"}) ImageButton back = findViewById(R.id.button1);
//        back.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(ChatPageActivity.this, MessagePageActivity.class);
//                startActivity(intent);
//            }
//        });

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView2);
        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if(item.getItemId() == R.id.home){
                    Intent intent = new Intent(ChatPageActivity.this, HomePageActivity.class);
                    startActivity(intent);
                    return true;
                }
                if(item.getItemId() == R.id.search){
                    Intent intent = new Intent(ChatPageActivity.this, SerachPageActivity.class);
                    startActivity(intent);
                    return true;
                }
                if(item.getItemId() == R.id.add){
                    Intent intent = new Intent(ChatPageActivity.this, PostItemPageActivity.class);
                    startActivity(intent);
                    return true;
                }
                if(item.getItemId() == R.id.chat){
                    Intent intent = new Intent(ChatPageActivity.this, ChatPageActivity.class);
                    startActivity(intent);
                    return true;
                }
                if(item.getItemId() == R.id.profile){
                    Intent intent = new Intent(ChatPageActivity.this, ProfilePagemainActivity.class);
                    startActivity(intent);
                    return true;
                }
                return false;
            }
        });
    }
}