package org.ethasia.workoutwizard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Dependencies.injectDependencies()

        setContentView(R.layout.activity_main)
    }
}
