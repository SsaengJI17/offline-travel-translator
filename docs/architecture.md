# Architecture

## Principle

Do not use Gemma as the source OCR engine for translation-critical text.

Use a dedicated OCR engine to extract source text, then use Gemma for contextual translation, explanation, and phrase generation.

## Pipeline

```text
CameraX / image picker
→ image preprocessing
→ ML Kit OCR
→ OCR line/block model
→ editable OCR review UI
→ translation pipeline
→ contextual explanation UI
```

## Components

- UI layer: Jetpack Compose
- Image input: image picker first, CameraX later
- OCR: ML Kit Text Recognition scripts
- Translation pipeline: mock first, Gemma later
- Storage: Room in a later milestone
- Speech: Android TextToSpeech in a later milestone
