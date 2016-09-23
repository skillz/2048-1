# 2048 - Android Native Example Project

This repo contains an example of the 2048 game with Skillz integration. The purpose of this example is to show how to integrate an Android Native game with the Skillz Platform .

This project is setup to work with the latest version of the Skillz Android SDK, which can be found at https://skillz.com/developer/downloads. Once the SDK is downloaded, the Skillz embedded framework will need to be added to the project. 

The Installation for this project was divided into 3 major steps: [Installing the Skillz framework](https://github.com/skillz/2048-1/commit/2b0ab6425172b1adaa2b19250e6b1a42a8fd24fa),[Implementing Core Skillz](https://github.com/skillz/2048-1/commit/8c4beea2271529ec904f15549dcc01190da1957c), and [Implementing Skillz Fairness](https://github.com/skillz/2048-1/commit/1876737c30af36b8ef0d0c97f30422020f9926aa).

### Skillz example instructions <br />
Step 1: This [commit](https://github.com/skillz/2048-1/commit/2b0ab6425172b1adaa2b19250e6b1a42a8fd24fa) completed the [Installing the Skillz framework ](https://cdn.skillz.com/doc/developer/android_native/integrate_skillz_sdk/adding_the_skillz_library/) step of the Skillz Integration. 

* This step adds the framework to the project and configures the project to link with the Skillz framework.<br /><br />

Step 2: This [commit](https://github.com/skillz/2048-1/commit/8c4beea2271529ec904f15549dcc01190da1957c) completed the [Implementing Core Skillz](https://cdn.skillz.com/doc/developer/android_native/integrate_skillz_sdk/handle_skillz_activity/) step of the Skillz Integration. 

* This step integrates the Skillz platform with the project and will add multiplayer tournaments using the Skillz API.<br /><br />

Step 3: This [commit](https://github.com/skillz/2048-1/commit/1876737c30af36b8ef0d0c97f30422020f9926aa) completed the [Implementing Skillz Fairness](https://cdn.skillz.com/doc/developer/android_native/integrate_skillz_sdk/handle_skillz_activity/) step of the Skillz Integration. 

* This step ensures that the players' games are fair by implementing a consistent random number generation.<br /><br />

For additional SDK installation details refer to the [Skillz documentation](https://cdn.skillz.com/doc/developer/).
<hr/>

All credits to the design of this game belongs to Gabriele Cirulli.

Original code: https://github.com/gabrielecirulli/2048

Download from Google Play: https://play.google.com/store/apps/details?id=com.tpcstld.twozerogame

Use governed by the MIT License.
