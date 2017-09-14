package com.viralcorners.databinding.mvvm;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.viralcorners.databinding.databinding.FragmentMvvmBinding;

public class MVVMFragment extends Fragment {

    private MVVMViewModel viewModel;
    private FragmentMvvmBinding binding;

    public static MVVMFragment getInstance() {
        MVVMFragment fragment = new MVVMFragment();
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentMvvmBinding.inflate(inflater, container, false);
        viewModel.loadData();
        binding.setViewModel(viewModel);
        setupAdapter();
        return binding.getRoot();
    }

    private void setupAdapter() {

        binding.recycleview.setHasFixedSize(true);
        binding.recycleview.setAdapter(new AdapterMVVM());
    }

    public void setViewModel(MVVMViewModel viewModel) {
        this.viewModel = viewModel;
    }

}
