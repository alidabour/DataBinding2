package com.viralcorners.databinding.mvvm.viewmodel;

import android.databinding.BaseObservable;
import android.databinding.ObservableArrayList;
import android.databinding.ObservableBoolean;
import android.databinding.ObservableList;

import com.viralcorners.databinding.mvvm.network.DataSource;
import com.viralcorners.databinding.mvvm.network.Repository;

import java.util.List;

/**
 * Created by Ali on 13/09/2017.
 */

public class MVVMViewModel extends BaseObservable {
    private final Repository repository;
    public ObservableList<String> dataList = new ObservableArrayList<>();
    public ObservableBoolean isLoading = new ObservableBoolean(true);

    public MVVMViewModel(Repository repository) {
        this.repository = repository;
    }

    public void loadData(){
        isLoading.set(true);
        repository.getDataFromRemoteSource(new DataSource.LoadDataCallback() {
            @Override
            public void onData(List<String> data) {
                dataList.clear();
                dataList.addAll(data);
                isLoading.set(false);
            }

            @Override
            public void noData() {
                isLoading.set(false);
            }
        });
    }
    public void refershData(){
        loadData();
    }
}
