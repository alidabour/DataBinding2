package com.viralcorners.databinding.eventhandling;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.viralcorners.databinding.R;
import com.viralcorners.databinding.databinding.ActivityEventHandlingBinding;

public class EventHandlingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityEventHandlingBinding binding = DataBindingUtil.setContentView(this,R.layout.activity_event_handling);
        binding.setTask(new Task("Working"));
        binding.setHandler(new MyHandlers());
    }
}
