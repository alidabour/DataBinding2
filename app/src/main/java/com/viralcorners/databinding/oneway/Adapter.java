package com.viralcorners.databinding.oneway;

import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.viralcorners.databinding.R;
import com.viralcorners.databinding.databinding.ItemBinding;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ali on 13/09/2017.
 */

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    private List<User> userList;

    public Adapter(){
        userList = new ArrayList<>();
        userList.add(new User("user1","https://organicthemes.com/demo/profile/files/2012/12/profile_img.png"));
        userList.add(new User("user2","https://organicthemes.com/demo/profile/files/2012/12/profile_img.png"));
        userList.add(new User("user3","https://organicthemes.com/demo/profile/files/2012/12/profile_img.png"));
        userList.add(new User("user4","https://organicthemes.com/demo/profile/files/2012/12/profile_img.png"));
        userList.add(new User("user5","https://organicthemes.com/demo/profile/files/2012/12/profile_img.png"));
        userList.add(new User("user6","https://organicthemes.com/demo/profile/files/2012/12/profile_img.png"));
        userList.add(new User("user7","https://organicthemes.com/demo/profile/files/2012/12/profile_img.png"));
        userList.add(new User("user8","https://organicthemes.com/demo/profile/files/2012/12/profile_img.png"));
        userList.add(new User("user9","https://organicthemes.com/demo/profile/files/2012/12/profile_img.png"));
        userList.add(new User("user10","https://organicthemes.com/demo/profile/files/2012/12/profile_img.png"));

    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ItemBinding itemBinding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()),
                R.layout.item,parent,false);
        return new ViewHolder(itemBinding);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.bind(userList.get(position));

    }

    @Override
    public int getItemCount() {
        return userList==null?0:userList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ItemBinding binding;
        public ViewHolder(ItemBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
        public void bind(User user){
            binding.setUser(user);
        }

    }
}
