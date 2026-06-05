package com.ssaengji.offlinetraveltranslator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.ssaengji.offlinetraveltranslator.ui.theme.OfflineTravelTranslatorTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            OfflineTravelTranslatorTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    OcrPrototypeScreen()
                }
            }
        }
    }
}

@Composable
private fun OcrPrototypeScreen() {
    var recognizedText by remember { mutableStateOf("No entry after 10 PM\nService charge 10% not included") }
    val mockTranslation = buildMockTravelTranslation(recognizedText)

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Text(
            text = "Offline Travel Translator",
            style = MaterialTheme.typography.headlineSmall
        )
        Text(
            text = "Milestone 2: OCR review screen prototype",
            style = MaterialTheme.typography.bodyMedium
        )

        OutlinedTextField(
            value = recognizedText,
            onValueChange = { recognizedText = it },
            label = { Text("Recognized OCR text") },
            modifier = Modifier.fillMaxWidth(),
            minLines = 6
        )

        Button(onClick = { recognizedText = "Spicy beef noodle 12.50\nShrimp fried rice 10.00\nContains peanuts" }) {
            Text("Load sample menu OCR")
        }

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "Mock Gemma result",
            style = MaterialTheme.typography.titleMedium
        )
        Text(
            text = mockTranslation,
            style = MaterialTheme.typography.bodyMedium
        )
    }
}

private fun buildMockTravelTranslation(ocrText: String): String {
    return """
        [Translation]
        This area contains travel text that should be translated after OCR review.

        [Traveler explanation]
        Use the OCR text as the source of truth. Gemma should explain context, warnings, prices, time limits, and allergy risks.

        [Source OCR]
        $ocrText
    """.trimIndent()
}
