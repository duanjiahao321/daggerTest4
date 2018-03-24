package com6789.example.duan.daggertest;

import android.util.Log;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by duan on 2018/3/24.
 */
@Module
public class MainModule {
@Provides
@Singleton
    Person providerPerson(){
    Log.i("dagger","from module");
        return new Person();
    }
}
