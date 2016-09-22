package com.hsiangyu.example.androidmvp.Presenter;

/**
 * Created by HsiangYu on 2016/9/22.
 */
public interface LoginPresenter {
    void validateCredentials(String username, String password);

    void onDestroy();



}
