package com.viralcorners.databinding.twoway;

import android.databinding.BaseObservable;
import android.databinding.Observable;
import android.databinding.ObservableArrayList;
import android.databinding.ObservableBoolean;
import android.databinding.ObservableField;
import android.databinding.ObservableInt;
import android.databinding.ObservableList;
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
    public ObservableInt progress = new ObservableInt(10);
    public ObservableList<String> enity = new ObservableArrayList<>();
    public ObservableInt spinnerPosition = new ObservableInt();

    public void start(){
        enity.add("First");
        enity.add("Second");
        enity.add("Third");
    }

    public ObservableArrayList getCities(int position){
        ObservableArrayList<String> cities = new ObservableArrayList<>();
        switch (position){
            case 0:
                cities.add("Cairo");
                cities.add("Alex");
                break;
            case 1:
                cities.add("Not Cairo");
                cities.add("Not Alex");
                break;
        }

        return cities;
    }
    public void addPoints(){
        points.set(points.get()+ 1 );
    }

}
