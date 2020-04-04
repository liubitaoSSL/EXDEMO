package com.example.exmvvm.mvvm.model;


import com.example.exmvvm.LoginResult;
import com.example.exmvvm.mvvm.base.BaseModel;
import com.example.exmvvm.mvvm.viewmodel.ILoginViewModel;

/**
 * author  : hacknife
 * e-mail  : 4884280@qq.com
 * github  : http://github.com/hacknife
 * project : briefness
 */
public class LoginModel extends BaseModel<ILoginViewModel> implements ILoginModel {
    public LoginModel(ILoginViewModel viewModel) {
        super(viewModel);
    }

    @Override
    public void login(String account, String pswd) {
        //网络请求;
        if (account.equalsIgnoreCase("admin") && pswd.equalsIgnoreCase("123456")) {
            viewModel.callbackLogin(new LoginResult(0, "登陆成功"));
        } else {
            viewModel.callbackLogin(new LoginResult(1, "登陆失败"));
        }
    }
}
