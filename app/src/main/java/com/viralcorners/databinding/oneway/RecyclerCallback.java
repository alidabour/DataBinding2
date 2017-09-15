package com.viralcorners.databinding.oneway;

import android.databinding.ViewDataBinding;

/**
 * Created by Ali on 15/09/2017.
 */
public interface RecyclerCallback<VM extends ViewDataBinding, T> {
    void bindData(VM binder, T model);
}