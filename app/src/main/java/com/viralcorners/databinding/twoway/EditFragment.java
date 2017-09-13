package com.viralcorners.databinding.twoway;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.viralcorners.databinding.databinding.FragmentEditBinding;


public class EditFragment extends Fragment {


    FragmentEditBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentEditBinding.inflate(inflater,container,false);
        return binding.getRoot();
    }

    public void setPerson(Person person){
        binding.setPerson(person);
    }


}
