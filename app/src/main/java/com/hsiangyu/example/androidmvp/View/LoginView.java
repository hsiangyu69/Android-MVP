package com.hsiangyu.example.androidmvp.View;

/**
 * Created by HsiangYu on 2016/9/22.
 */
public interface LoginView {
    void showProgress();

    void hideProgress();

    void setUsernameError();

    void setPasswordError();

    void showSuccessMessage();

}
