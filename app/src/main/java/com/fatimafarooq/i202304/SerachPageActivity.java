package com.fatimafarooq.i202304;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class SerachPageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.serach_page);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView2);
        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if(item.getItemId() == R.id.home){
                    Intent intent = new Intent(SerachPageActivity.this, HomePageActivity.class);
                    startActivity(intent);
                    return true;
                }
                if(item.getItemId() == R.id.search){
                    Intent intent = new Intent(SerachPageActivity.this, SerachPageActivity.class);
                    startActivity(intent);
                    return true;
                }
                if(item.getItemId() == R.id.add){
                    Intent intent = new Intent(SerachPageActivity.this, PostItemPageActivity.class);
                    startActivity(intent);
                    return true;
                }
                if(item.getItemId() == R.id.chat){
                    Intent intent = new Intent(SerachPageActivity.this, ChatPageActivity.class);
                    startActivity(intent);
                    return true;
                }
                if(item.getItemId() == R.id.profile){
                    Intent intent = new Intent(SerachPageActivity.this, ProfilePagemainActivity.class);
                    startActivity(intent);
                    return true;
                }
                return false;
            }
        });

//        @SuppressLint({"WrongViewCast", "MissingInflatedId", "LocalSuppress"}) ImageButton button = findViewById(R.id.button1);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(SerachPageActivity.this, SearchResultPageActivity.class);
//                startActivity(intent);
//            }
//        });
    }
}