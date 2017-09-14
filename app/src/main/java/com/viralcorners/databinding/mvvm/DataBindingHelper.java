package com.viralcorners.databinding.mvvm;

import android.databinding.BindingAdapter;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import java.util.List;

/**
 * Created by Ali on 13/09/2017.
 */

public class DataBindingHelper {

    @SuppressWarnings("unchecked")
    @BindingAdapter("app:adapterList")
    public static <T> void setData(RecyclerView recyclerView, List<T> items){
        AddData adapter = (AddData) recyclerView.getAdapter();
        if (adapter!= null){
            adapter.setData(items);
        }
    }

}
