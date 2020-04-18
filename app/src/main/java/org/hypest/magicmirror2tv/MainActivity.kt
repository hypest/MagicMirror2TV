package org.hypest.magicmirror2tv

import android.app.Activity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        webView.settings.javaScriptEnabled = true
        webView.setInitialScale(100)
        webView.settings.builtInZoomControls = true
        webView.loadUrl("http://192.168.1.60:8100");
    }
}
