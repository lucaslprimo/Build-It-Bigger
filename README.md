# Gradle for Android

Used Gradle to build a joke-telling app that has both a free and paid version. This included factoring functionality into libraries as well as using build flavors to modularize the construction of each variant of the app. I also configured a Google Cloud Endpoints development server to supply the jokes.

### Required Components

* Project contains a Java library for supplying jokes
* Project contains an Android library with an activity that displays jokes passed to it as intent extras.
* Project contains a Google Cloud Endpoints module that supplies jokes from the Java library. Project loads jokes from GCE module via an async task.
* Project contains connected tests to verify that the async task is indeed loading jokes.
* Project contains paid/free flavors. The paid flavor has no ads, and no unnecessary dependencies.

### App Behavior

* App retrieves jokes from Google Cloud Endpoints module and displays them via an Activity from the Android Library.

### Other Components

* Free app variant display interstitial ads between the main activity and the joke-displaying activity.
* App displays a loading indicator while the joke is being fetched from the server.
