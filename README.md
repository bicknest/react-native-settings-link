
# react-native-settings-link

## Getting started

`$ npm install react-native-settings-link --save`

### Mostly automatic installation

`$ react-native link react-native-settings-link`

### Manual installation


#### iOS

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `react-native-settings-link` and add `RNSettingsLink.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libRNSettingsLink.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)<

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
      compile project(':react-native-settings-link')
  	```

#### Windows
[Read it! :D](https://github.com/ReactWindows/react-native)

1. In Visual Studio add the `RNSettingsLink.sln` in `node_modules/react-native-settings-link/windows/RNSettingsLink.sln` folder to their solution, reference from their app.
2. Open up your `MainPage.cs` app
  - Add `using Settings.Link.RNSettingsLink;` to the usings at the top of the file
  - Add `new RNSettingsLinkPackage()` to the `List<IReactPackage>` returned by the `Packages` method


## Usage
```javascript
import RNSettingsLink from 'react-native-settings-link';

// TODO: What to do with the module?
RNSettingsLink;
```
  