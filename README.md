# ContextRoute AI

A native Kotlin + Jetpack Compose frontend for context-aware route recommendations. This project is intentionally backend-free and uses clearly labelled local demo data until production location, map, routing, authentication and hazard services are integrated.

## Open and build

1. Open this folder in Android Studio Hedgehog or newer.
2. Use JDK 17 and let Android Studio sync Gradle.
3. Run `./gradlew assembleDebug` or select the `app` configuration.
4. Install `app/build/outputs/apk/debug/app-debug.apk` on an Android 8.0+ device or emulator.

No API keys are required. If the environment does not have an Android SDK or Gradle distribution, Android Studio can perform the build after opening the project.

## Architecture

The app uses a single Compose entry point with a stateful navigation host, reusable Material 3 components, local demo repositories, validation functions, and replaceable map/routing abstractions. DataStore is included for future preference persistence; no production backend is contacted.

## Completion matrix

| ID | Screen | Status |
|---|---|---|
| SC-01 | Splash | Implemented |
| SC-02 | Onboarding: Smarter Routes | Implemented |
| SC-03 | Onboarding: Your Context | Implemented |
| SC-04 | Onboarding: Safety & Accessibility | Implemented |
| SC-05 | Permission Request | Implemented |
| SC-06 | Home / Map Dashboard | Implemented |
| SC-07 | Origin & Destination Search | Implemented |
| SC-08 | Travel Context | Implemented |
| SC-09 | Additional Requirements | Implemented |
| SC-10 | Route Comparison | Implemented |
| SC-11 | Route Options Overview | Implemented |
| SC-12 | Active Navigation | Implemented |
| SC-13 | Explore POIs | Implemented |
| SC-14 | Submit Road Report | Implemented |
| SC-15 | Report Details | Implemented |
| SC-16 | Report Lifecycle | Implemented |
| SC-17 | Emergency Hospital Mode | Implemented |
| SC-18 | Saved Places | Implemented |
| SC-19 | Profile & Preferences | Implemented |
| SC-20 | Network Banner | Implemented as reusable component |
| SC-21 | Loading States | Implemented as reusable component |
| SC-22 | Empty States | Implemented as reusable component |
| SC-23 | Error States | Implemented as reusable component |
| SC-24 | Offline Mode | Implemented |
| SC-25 | Dark Theme | Implemented |
| SC-26 | Accessibility Mode | Implemented |
| SC-27 | Privacy & Security | Implemented |
| SC-28 | App Settings | Implemented |

## Simulated features and limitations

Map tiles, GPS, geocoding, route calculation, POI discovery, report verification, account authentication, hospital notification, sharing, and cloud synchronization are simulated or represented by local UI only. The app never claims that demo routes or reports are live or verified. Emergency calling opens the native dialer with a configured demo emergency number; it does not contact emergency services automatically.
