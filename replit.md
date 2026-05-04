# 恩纳 (Enna) - YouTube Music Client for Android

## Project Overview

Enna is a custom-built, third-party YouTube Music client for Android. It is a **native Android application** — not a web app. There is no web server, frontend, or backend to run in Replit.

## Tech Stack

- **Language:** Kotlin
- **UI Framework:** Jetpack Compose + Material 3
- **Architecture:** MVVM (Model-View-ViewModel)
- **Dependency Injection:** Hilt (Dagger)
- **Networking:** Ktor, OkHttp
- **Database:** Room (local metadata/caching)
- **Media Playback:** Media3 / ExoPlayer
- **Image Loading:** Coil
- **Build System:** Gradle (Kotlin DSL)
- **Dependency Management:** Gradle Version Catalog (`gradle/libs.versions.toml`)
- **Android Gradle Plugin:** 9.1.1

## Project Structure

```
.
├── app/                  # Main Android app module (UI, ViewModels, services)
├── innertube/            # YouTube InnerTube API communication
├── betterlyrics/         # BetterLyrics provider
├── kugou/                # KuGou lyrics provider
├── lrclib/               # LRCLib lyrics provider
├── simpmusic/            # SimpMusic lyrics provider
├── kizzy/                # Discord Rich Presence integration
├── lastfm/               # Last.fm scrobbling integration
├── canvas/               # Background video/canvas feature
├── shazamkit/            # Music recognition (Shazam)
├── fastlane/             # App store metadata and automation
├── gradle/               # Gradle version catalog (libs.versions.toml)
└── settings.gradle.kts   # Multi-module Gradle settings
```

## Key Features

- Ad-free YouTube Music playback with background listening
- EBU R128 loudness normalization, crossfade, pitch/tempo controls
- Live synced lyrics with translation and romanization
- Last.fm scrobbling, ListenBrainz, Discord Rich Presence
- Material 3 dynamic theming, album-art powered colors
- Local file playback, music recognition (Shazam)
- "Together" mode for shared listening sessions

## Building the APK

This project requires an Android SDK and Gradle environment. It cannot be built or run directly in a standard Replit container.

To build locally or in a proper Android build environment:
```bash
./gradlew assembleRelease
```

The signed release APK uses the keystore at `Koiverse.jks`.

## Distribution

- GitHub Releases: https://github.com/cgens67/enna/releases
- Obtainium, IzzyOnDroid, OpenAPK, Unclouded
- Nightly builds via GitHub Actions
