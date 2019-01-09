# 2048 Example Skillz Integration

This repo contains an example of an Android app integrating with the Skillz SDK. It's intended to be a supplement to [our documentation](https://cdn.skillz.com/doc/developer/android_native/integrate_skillz_sdk/adding_the_skillz_library/) which will walk you through the process of integrating a native Android game. 

This example was written using Skillz SDK version 21.0.14. Check [here](https://developers.skillz.com/downloads) to see the latest version.

If you are experiencing trouble, please email <a href="mailto:integrations@skillz.com">integrations@skillz.com</a> with a detailed description of the issue you are encountering.


## Commit Instructions
In the interest of making this example easier to break down, this project has been divided into three main commits that represent the three major steps of the integration process. These commits have some supplemental comments explaining things that may not be immediately clear.


To view the diff with the entire integration, click [here](https://github.com/skillz/2048-1/compare/9dc76628b59b9c6d33e9ee29b0af14213db86301..171afc8b9c1edcb26fccd0fa0794a0c8db956a5e) (note that the supplemental comments that were made on the different commits do not appear how they should in this view).


#### Commit 1: Installing the Skillz Framework
The commit can be viewed [here](https://github.com/skillz/2048-1/commit/f4aa9f7f231797aeb4e4cbd72afa6b0efc1ecaaf) and follows the instructions laid out on [this page](https://cdn.skillz.com/doc/developer/android_native/integrate_skillz_sdk/adding_the_skillz_library/) of our documentation. 

Changes made in this commit:
- Updated module's build.gradle to include the Skillz SDK as a dependency and made necessary versioning updates
- Updated proguard.txt
- Updated Android manifest to include Skillz metadata and updated the game's activity's launch mode


#### Commit 2: Getting In and Out of the Skillz SDK
The commit can be viewed [here](https://github.com/skillz/2048-1/commit/ad01de9914f43a366a56cced851526e9f968551a) and follows part of the instructions on [this page](https://cdn.skillz.com/doc/developer/android_native/integrate_skillz_sdk/handle_skillz_activity/) of our documentation.

Changes made in this commit:
- Created the new `LaunchActivity` that launches the Skillz SDK when the app is started
- Added reporting the player's score to Skillz when game completes
- Added ability for user to abort the match early


#### Commit 3: Ensuring Fairness
The commit can be viewed [here](https://github.com/skillz/2048-1/commit/171afc8b9c1edcb26fccd0fa0794a0c8db956a5e) and follows the rest of the instructions on [this page](https://cdn.skillz.com/doc/developer/android_native/integrate_skillz_sdk/handle_skillz_activity/) of our documentation that were not covered in commit 2.

Changes made in this commit:
- Used Skillz random instead of default random class
- Added updating in-progress scores 


<hr />

This is a port of Gabriele Cirulli's 2048 game to Android, all credit for game design goes to him.

Logo redrawn by Margaret Lu.

[Original code](https://github.com/gabrielecirulli/2048) (github.com)

[Download on Google Play](https://play.google.com/store/apps/details?id=com.tpcstld.twozerogame) (play.google.com)

Use governed by the MIT License.
