package com.viralcorners.databinding.mvvm.network;

import android.support.annotation.NonNull;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.mock.BehaviorDelegate;

/**
 * Created by Ali on 13/09/2017.
 */

public class MockDataSource implements DataSource,RetroService {

    private static MockDataSource INSTANCE;

    final BehaviorDelegate<RetroService> delegate;

    private MockDataSource(BehaviorDelegate<RetroService> delegate) {
        this.delegate = delegate;
    }

    public static MockDataSource getInstance(BehaviorDelegate<RetroService> delegate) {
        if (INSTANCE == null) {
            INSTANCE = new MockDataSource(delegate);
        }
        return INSTANCE;
    }

    @Override
    public void getDataNet(@NonNull final LoadDataCallback callback) {
        getDataRetro().enqueue(new Callback<List<String>>() {
            @Override
            public void onResponse(Call<List<String>> call, Response<List<String>> response) {
                callback.onData(response.body());
            }

            @Override
            public void onFailure(Call<List<String>> call, Throwable t) {
                callback.noData();
            }
        });
    }

    @Override
    public Call<List<String>> getDataRetro() {
        return delegate.returningResponse(generateData()).getDataRetro();
    }

    public List<String> generateData() {
        List<String> strings = new ArrayList<>();
        for(int i=1; i<50; i++) strings.add(String.valueOf(i));

        return strings;
    }
}
