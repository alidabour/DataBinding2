package com.viralcorners.databinding.eventhandling;

import android.util.Log;
import android.view.View;
import android.widget.Toast;

/**
 * Created by Ali on 14/09/2017.
 */

public class MyHandlers {

    public void onClickFriend(View view){
        Toast.makeText(view.getContext(), "Hi Friend", Toast.LENGTH_SHORT).show();
    }
    public void onSaveClick(Task task){
        Log.v("DataBinding","Task :" + task.taskTitle);
    }

    public void onSaveWithView(View view,Task task){
        Toast.makeText(view.getContext(),"Title = "+ task.taskTitle, Toast.LENGTH_SHORT).show();
    }
    public boolean onSaveWithLongClick(View view, Task task){
        Toast.makeText(view.getContext(),"Title = "+ task.taskTitle, Toast.LENGTH_SHORT).show();
        return true;
    }

}
