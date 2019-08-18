
# react-native-settings-link

## Getting started

`$ npm install react-native-settings-link --save`

### Manual installation


#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.reactlibrary.RNSettingsLinkPackage;` to the imports at the top of the file
  - Add `new RNSettingsLinkPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-settings-link'
  	project(':react-native-settings-link').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-settings-link/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      implementation project(':react-native-settings-link')
  	```

## Usage
```javascript
import RNSettingsLink from 'react-native-settings-link';

and then call one of the methods, e.g.

RNSettingsLink.locationSourceSettings();

or to get access to Androids location settings. Good for when you want the user
to enable their phone's location.

RNSettingsLink.appDetailsSettings();

to open activity to make changes to your apps settings. This is good if you are asking
your user to change permissions for your application.
