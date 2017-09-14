package com.viralcorners.databinding.mvvm.network;

import android.support.annotation.NonNull;

import java.util.List;

/**
 * Created by Ali on 13/09/2017.
 */

public interface DataSource {

    void getDataNet(@NonNull LoadDataCallback callback);


    interface LoadDataCallback {
        void onData(List<String> data);
        void noData();
    }
}
