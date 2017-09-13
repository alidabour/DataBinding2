package com.viralcorners.databinding.oneway;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;

import com.viralcorners.databinding.R;
import com.viralcorners.databinding.databinding.ActivityMainBinding;

public class OneWayActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        setupAdapter();
    }

    private void setupAdapter() {
        binding.recycleview.setLayoutManager(new LinearLayoutManager(this));
        binding.recycleview.setHasFixedSize(true);
        binding.recycleview.setAdapter(new Adapter());
    }
}
