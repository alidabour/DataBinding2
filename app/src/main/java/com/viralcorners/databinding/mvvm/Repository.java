package com.viralcorners.databinding.mvvm;

import android.support.annotation.NonNull;

import java.util.List;

/**
 * Created by Ali on 13/09/2017.
 */

public class Repository implements DataSource{
    private static Repository INSTANCE  = null;
    private final DataSource dataSource;

    private Repository(@NonNull DataSource dataSource){
        this.dataSource = dataSource;
    }
    public static Repository getInstance(DataSource dataSource){
        if(INSTANCE == null){
            INSTANCE = new Repository(dataSource);
        }
        return INSTANCE;
    }
    /**
     * Used to force {@link #getInstance(DataSource)} to create a new instance
     * next time it's called.
     */
    public static void destroyInstance() {
        INSTANCE = null;
    }

    @Override
    public void getDataNet(@NonNull LoadDataCallback callback) {
        //ToDo check if data is cached
        //getCachedData();

        //for now call network
        getDataFromRemoteSource(callback);
    }

    public void getDataFromRemoteSource(@NonNull final LoadDataCallback callback) {
        dataSource.getDataNet(new LoadDataCallback() {
            @Override
            public void onData(List<String> data) {
                //ToDo :: Refresh cached data
                callback.onData(data);
            }

            @Override
            public void noData() {
                callback.noData();
            }
        });
    }
}
