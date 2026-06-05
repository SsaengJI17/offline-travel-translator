# Product Plan

## Product

Offline Travel Translator is an Android app for overseas travel translation.

The app should help users translate text, understand signs and menus, and create travel-ready phrases without depending on a network connection.

## Core User Scenarios

1. Translate typed text.
2. Photograph a sign, menu, ticket, receipt, or notice.
3. Review OCR text before translation.
4. Get a contextual explanation for travel decisions.
5. Save useful phrases for repeated use.

## MVP

The first MVP validates the OCR-centered workflow:

```text
Image input
→ OCR extraction
→ OCR review and correction
→ contextual translation result
```

Gemma integration is mocked at first so the OCR and UI workflow can be tested quickly.

## Non-goals for MVP

- real-time AR translation
- full voice conversation mode
- cloud sync
- account login
- production Gemma runtime integration
