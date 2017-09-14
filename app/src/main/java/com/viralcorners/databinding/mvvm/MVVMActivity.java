package com.viralcorners.databinding.mvvm;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.viralcorners.databinding.R;
import com.viralcorners.databinding.mvvm.util.ActivityUtils;
import com.viralcorners.databinding.mvvm.util.ViewModelHolder;

public class MVVMActivity extends AppCompatActivity {
    private final String VIEW_MODEL_TAG = "VIEW_MODEL_TAG";
    private MVVMViewModel mvvmViewModel;
    private MVVMFragment mvvmFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle_view);
        mvvmViewModel = findOrCreateViewModel();
        mvvmFragment = findOrCreateViewFragment();
        mvvmFragment.setViewModel(mvvmViewModel);
    }

    @NonNull
    private MVVMViewModel findOrCreateViewModel() {
        // In a configuration change we might have a ViewModel present. It's retained using the
        // Fragment Manager.
        @SuppressWarnings("unchecked")
        ViewModelHolder<MVVMViewModel> retainedViewModel =
                (ViewModelHolder<MVVMViewModel>) getSupportFragmentManager()
                        .findFragmentByTag(VIEW_MODEL_TAG);

        if (retainedViewModel != null && retainedViewModel.getViewmodel() != null) {
            // If the model was retained, return it.
            return retainedViewModel.getViewmodel();
        } else {
            // There is no ViewModel yet, create it.
            MVVMViewModel viewModel = new MVVMViewModel(Injection.provideHomeRepository());
//                    getApplicationContext(),

            // and bind it to this Activity's lifecycle using the Fragment Manager.
            ActivityUtils.addFragmentToActivity(
                    getSupportFragmentManager(),
                    ViewModelHolder.createContainer(viewModel),
                    VIEW_MODEL_TAG);
            return viewModel;
        }
    }

    @NonNull
    private MVVMFragment findOrCreateViewFragment() {
        MVVMFragment taskDetailFragment = (MVVMFragment) getSupportFragmentManager()
                .findFragmentById(R.id.container);

        if (taskDetailFragment == null) {
            taskDetailFragment = MVVMFragment.getInstance();

            ActivityUtils.addFragmentToActivity(getSupportFragmentManager(),
                    taskDetailFragment, R.id.container);
        }
        return taskDetailFragment;
    }

}
