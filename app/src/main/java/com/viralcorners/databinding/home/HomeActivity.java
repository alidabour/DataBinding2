package com.viralcorners.databinding.home;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.viralcorners.databinding.R;
import com.viralcorners.databinding.oneway.OneWayActivity;
import com.viralcorners.databinding.twoway.TwoWayBindingActivity;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

    }

    public void onClick(View view) {
        switch (view.getId()){
            case R.id.oneWay:
                startActivity(new Intent(this,OneWayActivity.class));
                break;
            case R.id.twoWay:
                startActivity(new Intent(this, TwoWayBindingActivity.class));
                break;
        }
    }
}
