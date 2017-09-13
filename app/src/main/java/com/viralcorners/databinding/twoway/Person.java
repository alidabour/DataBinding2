package com.viralcorners.databinding.twoway;

import android.databinding.BaseObservable;
import android.databinding.Observable;
import android.databinding.ObservableBoolean;
import android.databinding.ObservableField;
import android.databinding.ObservableInt;
import android.support.annotation.NonNull;
import android.util.Log;
import android.view.View;

/**
 * Created by Ali on 13/09/2017.
 */

public class Person extends BaseObservable{
    public ObservableField<String> name = new ObservableField<>("");
    public ObservableBoolean isStudent = new ObservableBoolean();
    public ObservableInt points = new ObservableInt(0);

    public void start(){
    }

    public void addPoints(){
        points.set(points.get()+ 1 );
    }
}
