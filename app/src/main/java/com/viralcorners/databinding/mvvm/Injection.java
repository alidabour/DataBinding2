package com.viralcorners.databinding.mvvm;

import java.util.concurrent.TimeUnit;

import retrofit2.Retrofit;
import retrofit2.mock.BehaviorDelegate;
import retrofit2.mock.MockRetrofit;
import retrofit2.mock.NetworkBehavior;

/**
 * Created by Ali on 13/09/2017.
 */

public class Injection {
    static Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://google.com").build();
    static NetworkBehavior networkBehavior = NetworkBehavior.create();
    static MockRetrofit mockRetrofit = new MockRetrofit.Builder(retrofit)
            .networkBehavior(networkBehavior)
            .build();
    static BehaviorDelegate<RetroService> delegate = mockRetrofit.create(RetroService.class);
//    RetroService homeService = MockDataSource.getInstance(delegate);

    public static Repository provideHomeRepository() {
        networkBehavior.setDelay(2, TimeUnit.SECONDS);
        networkBehavior.setVariancePercent(40);
        networkBehavior.setFailurePercent(2);
        return Repository.getInstance(MockDataSource.getInstance(delegate));
    }
}
