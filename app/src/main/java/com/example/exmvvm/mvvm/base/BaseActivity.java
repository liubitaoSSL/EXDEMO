package com.example.exmvvm.mvvm.base;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.hacknife.briefness.Briefness;
import com.hacknife.briefness.Briefnessor;


/**
 * author  : hacknife
 * e-mail  : 4884280@qq.com
 * github  : http://github.com/hacknife
 * project : briefness
 */
public abstract class BaseActivity<T extends IBaseViewModel,B extends Briefnessor> extends AppCompatActivity implements IBaseView {
    protected T viewModel;
    protected B briefnessor;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        briefnessor = (B ) Briefness.bind(this);
        viewModel = createViewModel(briefnessor);
        briefnessor.bindViewModel(viewModel);
        initView();
    }

    protected abstract T createViewModel(B briefnessor);


    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (viewModel != null)
            viewModel.dettachView();
    }

    protected void initView() {
    }

    @Override
    public Context applicationContext() {
        return getApplication();
    }

    @Override
    public Activity context() {
        return this;
    }
}
