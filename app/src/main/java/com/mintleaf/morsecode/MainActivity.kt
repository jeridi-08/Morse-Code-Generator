package com.mintleaf.morsecode

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.mintleaf.morsecode.ui.theme.MorseCodeTheme
import java.util.Locale

fun translateMorseCode(string: String): CharSequence? {
    val allMorseCodes = mapOf("a" to "*-","b" to "-***","c" to "-*-*","d" to "-**","e" to "*","f" to "**-*","g" to "--*","h" to "****","i" to "**","j" to "*---","k" to "-*-","l" to "*-**","m" to "--","n" to "-*","o" to "---","p" to "*--*","q" to "--*-","r" to "*-*","s" to "***","t" to "-","u" to "**-","v" to "***-","w" to "*--","x" to "-**-","y" to "-*--","z" to "--**","0" to "-----","1" to "*----","2" to "**---","3" to "***--","4" to "****-","5" to "*****","6" to "-****","7" to "--***","8" to "---**","9" to "----*","." to "*-*-*-","," to "--**--",":" to "---***","?" to "**--**", "'" to "*----*","-" to "-****-","/" to "-**-*","(" to "-*--*-", ")" to "-*--*-", "\"" to "*-**-*", " " to " / ", "!" to "-.-.--")
    var finalString = ""
    for (i in 0..string.length-1) {
        finalString += (allMorseCodes[((string[i].toString()).lowercase())])
    }
    return finalString
}

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var text = findViewById<EditText>(R.id.editTextText)
        var button = findViewById<Button>(R.id.button2)
        var outputText = findViewById<TextView>(R.id.textView3)
        button.setOnClickListener {
            outputText.text = translateMorseCode((text.text).toString())
        }
        }
    }