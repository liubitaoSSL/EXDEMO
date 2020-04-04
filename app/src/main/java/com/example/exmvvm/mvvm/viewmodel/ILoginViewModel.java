package com.example.exmvvm.mvvm.viewmodel;


import com.example.exmvvm.LoginResult;
import com.example.exmvvm.mvvm.base.IBaseViewModel;

/**
 * author  : hacknife
 * e-mail  : 4884280@qq.com
 * github  : http://github.com/hacknife
 * project : briefness
 */
public interface ILoginViewModel extends IBaseViewModel {
    void onLoginClick(String account, String pswd);

    void callbackLogin(LoginResult result);

}
