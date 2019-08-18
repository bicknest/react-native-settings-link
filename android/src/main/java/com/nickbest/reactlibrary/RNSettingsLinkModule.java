
package com.nickbest.reactlibrary;

import android.content.Intent;
import android.provider.Settings;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

import android.net.Uri;

public class RNSettingsLinkModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  public RNSettingsLinkModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "RNSettingsLink";
  }
  
  @ReactMethod
  public void locationSourceSettings() {
      Intent intent = new Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS);
      intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
      intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
      if (intent.resolveActivity(reactContext.getPackageManager()) != null) {
          reactContext.startActivity(intent);
      }
  }

  @ReactMethod
  public void appDetailsSettings() {
      String packageName = reactContext.getPackageName();
      Intent intent = new Intent(Settings.ACTION_APPLICATION_DETAILS_SETTINGS, Uri.parse("package:" + packageName));
      intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
      intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
      if (intent.resolveActivity(reactContext.getPackageManager()) != null) {
          reactContext.startActivity(intent);
      }
  }
}
