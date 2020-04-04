package com.example.exmvvm.mvvm.model;


import com.example.exmvvm.mvvm.base.IBaseModel;

/**
 * author  : hacknife
 * e-mail  : 4884280@qq.com
 * github  : http://github.com/hacknife
 * project : briefness
 */
public interface ILoginModel extends IBaseModel {
    void login(String account, String pswd);
}
