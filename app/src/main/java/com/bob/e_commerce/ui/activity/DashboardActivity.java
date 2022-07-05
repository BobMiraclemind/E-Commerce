package com.bob.e_commerce.ui.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.bob.e_commerce.databinding.ActivityDashboardBinding;

public class DashboardActivity extends AppCompatActivity {

    ActivityDashboardBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDashboardBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}