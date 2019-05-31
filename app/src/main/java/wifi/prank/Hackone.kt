package wifi.prank

import android.app.Activity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Toast

class Hackone : Activity() {
    private var mWebview: WebView? = null
    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mWebview = WebView(this)
        mWebview!!.settings.javaScriptEnabled = true // enable javascript
        val activity = this
        mWebview!!.webViewClient = object : WebViewClient() {
            override fun onReceivedError(view: WebView, errorCode: Int, description: String, failingUrl: String) {
                Toast.makeText(activity, description, Toast.LENGTH_SHORT).show()
            }
        }
        mWebview!!.loadUrl("http://computerhoy.com/paso-a-paso/internet/tutorial-obtener-contrasena-tu-wifi-wifislax-9089")
        setContentView(mWebview)
    }
}