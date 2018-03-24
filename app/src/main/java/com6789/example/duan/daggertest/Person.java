package com6789.example.duan.daggertest;

import android.util.Log;

import javax.inject.Inject;

/**
 * Created by duan on 2018/3/24.
 */

public class Person {
    @Inject
    public Person(){
        Log.i("dagger","Person is create!");
    }
}
