package com.viralcorners.databinding.oneway;

import android.databinding.BindingAdapter;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

/**
 * Created by Ali on 13/09/2017.
 */

public class BindingHelper {
    @BindingAdapter("app:imageUrl")
    public static void loadImage(ImageView view, String url){
        Glide.with(view.getContext()).load(url).into(view);
    }
}
