package com.viralcorners.databinding.mvvm;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Ali on 13/09/2017.
 */

public interface RetroService {
    @GET()
    Call<List<String>> getDataRetro();
}
