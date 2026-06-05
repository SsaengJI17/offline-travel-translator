# Offline Travel Translator

Offline-first Android travel translator focused on photo OCR, contextual translation, and travel-friendly explanations.

## Goal

Build an Android app that helps travelers translate and understand text without relying on a network connection whenever possible.

The first MVP is intentionally OCR-centered:

```text
Image input
→ ML Kit OCR
→ editable OCR result
→ mock Gemma translation/explanation result
```

Gemma is used for contextual translation and explanation. OCR is handled by a dedicated OCR engine because image-text reading accuracy is critical for translation.

## MVP Scope

- Select an image from the device
- Extract text with ML Kit Text Recognition
- Show recognized text for review and correction
- Send reviewed text to a translation pipeline
- Display a mock Gemma-style travel explanation
- Prepare the codebase for CameraX and on-device Gemma integration

## Planned Tech Stack

- Kotlin
- Jetpack Compose
- CameraX
- ML Kit Text Recognition
- Room
- Android TextToSpeech
- Gemma 4 E2B / E4B integration in a later milestone

## Project Structure

```text
app/                       Android app module
docs/                      Product and architecture notes
.github/                   Issue and PR templates
```

## Local Setup

1. Pull the latest code.
2. Open the project in Android Studio.
3. Let Gradle sync.
4. Run the `app` configuration on an emulator or real Android device.

If Gradle sync fails because dependency versions have changed, update the versions in the root `build.gradle.kts` and `app/build.gradle.kts`.

## Development Flow

```text
GPT updates GitHub
→ developer runs git pull locally
→ developer tests in Android Studio
→ developer commits and pushes changes
→ GPT continues from the updated repository state
```

## Current Milestone

Milestone 1 is complete: Gemma was tested in Edge Gallery and showed fast image explanation, but OCR accuracy was not sufficient for direct translation.

Milestone 2 target: build the OCR pipeline prototype.
