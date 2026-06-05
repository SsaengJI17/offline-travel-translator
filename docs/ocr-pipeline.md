# OCR Pipeline

## Goal

Build a reliable OCR review flow before adding production Gemma translation.

## Flow

1. User selects or captures an image.
2. App runs ML Kit Text Recognition.
3. OCR output is shown as editable text.
4. User corrects OCR mistakes.
5. Corrected text is passed to the translation pipeline.
6. Gemma explains context and travel risks.

## Important Rule

The OCR text is the source of truth. The image may be used for context, but the model should not invent text that the OCR engine did not extract.

## Next Tasks

- Add image picker.
- Add ML Kit recognizer wrapper.
- Create OCR result data model.
- Add editable review UI.
- Add mock translation service interface.
