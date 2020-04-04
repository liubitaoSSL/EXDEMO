package com.example.exmvvm.mvvm.viewmodel;

import android.widget.Toast;

import com.example.exmvvm.LoginResult;
import com.example.exmvvm.mvvm.model.ILoginModel;
import com.example.exmvvm.mvvm.model.LoginModel;
import com.example.exmvvm.mvvm.view.ILoginView;
import com.example.exmvvm.mvvm.base.BaseViewModel;

/**
 * author  : hacknife
 * e-mail  : 4884280@qq.com
 * github  : http://github.com/hacknife
 * project : briefness
 */
public class LoginViewModel extends BaseViewModel<ILoginView, ILoginModel, LoginActivityBriefnessor> implements ILoginViewModel {

    public LoginViewModel(ILoginView view, LoginActivityBriefnessor briefnessor) {
        super(view, briefnessor);
    }

    @Override
    protected ILoginModel createModel() {
        return new LoginModel(this);
    }

    @Override
    public void onLoginClick(String account, String pswd) {
        if (account.length() < 3) {
            Toast.makeText(context(), "账号不正确", Toast.LENGTH_SHORT).show();
            return;
        }
        if (pswd.length() < 3) {
            Toast.makeText(context(), "密码不正确", Toast.LENGTH_SHORT).show();
            return;
        }
        model.login(account, pswd);
    }

    @Override
    public void callbackLogin(LoginResult result) {
        briefnessor.setResult(result);
    }
}
