package com6789.example.duan.daggertest;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by duan on 2018/3/24.
 */
@Singleton
@Component(modules = MainModule.class)
public interface MainComponent {
void inject(MainActivity activity);
}
