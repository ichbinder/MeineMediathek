# Meine Mediathek
TODO

## Download a pre-build version
You can download a pre-build version of **Meine Mediathek** from the [Google Play][1] store.

## Build the application with [Eclipse][2]
For building the application by yourself follow the following steps:

  1. Clone the application repository

          git clone https://github.com/thuetz/MeineMediathek.git
       
  2. Change into the cloned directory

          cd MeineMediathek

  3. Change into the app directory and run the native build process (you need the [Android NDK][3]):

          cd app
          $NDK_ROOT_DIR/ndk-build

  4. Create an Android project for the actual application (using the `Android Project from Existing Code` function of Eclipse)
  5. Build the application :)

## Changelog
### Version 0.0.3 (Code: *3*, Released on: ***2012-11-24***) - [Changes][101]
* Changed the way the titles of the movies in the ZDF Mediathek are extracted
* Fixed a bug which caused a crash while starting the app

### Version 0.0.2 (Code: *2*, Released on: ***2012-11-23***) - [Changes][100]
* Made all texts translatable
* Added a license agreement for the first start of the application
* The download buffer size will vary according to the estimated file size of the movie which should be downloaded
* Fixed a lot of bugs causing the application to crash
* Made the application available in the Google Play Store

### Version 0.0.1 (Code: *1*, Released on: ***2012-11-20***)
* First version which is able to download a stream from [ZDF Mediathek][4]

 [1]: https://play.google.com/store/apps/details?id=com.halcyonwaves.apps.meinemediathek
 [2]: http://www.eclipse.org/
 [3]: http://developer.android.com/tools/sdk/ndk/index.html
 [4]: http://www.zdf.de/ZDFmediathek/hauptnavigation/startseite?flash=off
 [100]: https://github.com/thuetz/MeineMediathek/compare/v0.0.1...v0.0.2 
 [101]: https://github.com/thuetz/MeineMediathek/compare/v0.0.2...v0.0.3 