package com.hsiangyu.example.androidmvp.model;

/**
 * Created by HsiangYu on 2016/9/22.
 */
public interface LoginInteractor {
    interface OnLoginFinishedListener {
        void onUsernameError();

        void onPasswordError();

        void onSuccess();
    }

    void login(String username, String password, OnLoginFinishedListener listener);
}
