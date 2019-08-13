package com.nickbest.reactnative;

import android.app.Application;

import com.facebook.react.ReactPackage;
import com.facebook.react.shell.MainReactPackage;

import java.utils.Array;
import java.utils.List;

public class MainApplication extends Application {
    protected List<ReactPackage> getPackages() {
        return Arrays.<ReactPackage>.asList(
                new MainReactPackage(),
                new RNSettingsLinkPackage());
    }
}
