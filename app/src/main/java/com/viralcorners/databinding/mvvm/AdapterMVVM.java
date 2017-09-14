package com.viralcorners.databinding.mvvm;

import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.viralcorners.databinding.R;
import com.viralcorners.databinding.databinding.StringItemBinding;

import java.util.List;

/**
 * Created by Ali on 13/09/2017.
 */

public class AdapterMVVM extends RecyclerView.Adapter<AdapterMVVM.ViewHolder>
    implements  AddData{
    List<String> data;
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        StringItemBinding binding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()),
                R.layout.string_item,parent,false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.binding.setObject(data.get(position));
    }

    @Override
    public int getItemCount() {
        return data==null?0:data.size() ;
    }

    @Override
    public <T> void setData(List<T> data) {
        if(data!=null){
            if (this.data == null){
                this.data = (List<String>) data;
                notifyItemRangeInserted(0,data.size());
            }else {
                this.data = (List<String>) data;
                notifyDataSetChanged();
            }
        }
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private StringItemBinding binding;
        public ViewHolder(StringItemBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
        public void bind(String anyObject){
            binding.setObject(anyObject);
        }
    }
}
