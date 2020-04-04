package com.example.exmvvm.mvvm;

import com.example.exmvvm.R;
import com.example.exmvvm.mvvm.view.ILoginView;
import com.example.exmvvm.mvvm.viewmodel.ILoginViewModel;
import com.example.exmvvm.mvvm.viewmodel.LoginViewModel;
import com.hacknife.briefness.BindLayout;
import com.example.exmvvm.mvvm.base.BaseActivity;

/**
 * author  : hacknife
 * e-mail  : 4884280@qq.com
 * github  : http://github.com/hacknife
 * project : briefness
 */
@BindLayout(R.layout.activity_login)
public class LoginActivity extends BaseActivity<ILoginViewModel, LoginActivityBriefnessor> implements ILoginView {
    @Override
    protected ILoginViewModel createViewModel(LoginActivityBriefnessor briefnessor) {
        return new LoginViewModel(this, briefnessor);
    }
}
