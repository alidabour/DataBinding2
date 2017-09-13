package com.viralcorners.databinding.twoway;

import android.databinding.DataBindingUtil;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.viralcorners.databinding.R;
import com.viralcorners.databinding.databinding.ActivityTwoWayBindingBinding;

import java.util.List;

public class TwoWayBindingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityTwoWayBindingBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_two_way_binding);
        Person person = new Person();
        ((EditFragment)getSupportFragmentManager().getFragments().get(0)).setPerson(person);
        ((ViewingFragment)getSupportFragmentManager().getFragments().get(1)).setPerson(person);

    }
}
