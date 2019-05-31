package wifi.prank

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.view.Window
import android.widget.AdapterView
import android.widget.AdapterView.OnItemClickListener
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import java.lang.Compiler.enable
import android.content.SharedPreferences





class MainActivity : Activity() {
    lateinit internal var a: Intent
    lateinit internal var onlinea: Intent
    lateinit internal var onlineb: Intent
    lateinit internal var onlinec: Intent
    lateinit internal var settings: SharedPreferences

    var lista: ArrayList<String>? = null

    var enable: Boolean = false


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        setContentView(R.layout.activity_main)
        //var lista = arrayOf("TOP HACK, "ANDROID", " y WPA2_PSK", "hack movil", "pc", "movil", "pc y movil")
        lista = ArrayList<String>()
        settings = getSharedPreferences("UserConfigs", Context.MODE_PRIVATE)
        enable = settings.getBoolean("activo", false)
        //if (enable) {
            lista!!.add("TOP APP HACKS")
            lista!!.add("ANDROID")
            lista!!.add("WEP, WPA y WPA2")
            lista!!.add("HACK MOBILE")
            lista!!.add("TUTO PC")
            lista!!.add("TUTO MOBILE")
            lista!!.add("TUTO PC & MOBILE")
        //}
        val list = findViewById<ListView>(R.id.list)
        val adapter1 = ArrayAdapter(baseContext, R.layout.custom_textview, lista)
        list.adapter = adapter1
        val popup = Toast.makeText(applicationContext, "Click en los anuncios y 5 estrellas ayuda! Gracias", Toast.LENGTH_LONG)
        popup.show()
        //Clases
        a = Intent(this, VideosActivity::class.java)
        onlinea = Intent(this, Hackone::class.java)
        onlineb = Intent(this, Hacktwo::class.java)
        onlinec = Intent(this, Hackthree::class.java)
        list.cacheColorHint = 0
        list.onItemClickListener = OnItemClickListener { _, _, arg2, _ ->
            when (arg2) {
                0 -> {
                    a.putExtra("vid", "a")
                    startActivity(a)
                }
                1 -> {
                    a.putExtra("vid", "b")
                    startActivity(a)
                }
                2 -> {
                    a.putExtra("vid", "c")
                    startActivity(a)
                }
                3 -> {
                    a.putExtra("vid", "d")
                    startActivity(a)
                }
                4 -> startActivity(onlinea)
                5 -> startActivity(onlineb)
                6 -> startActivity(onlinec)
                else -> {
                }
            }
        }
    }
}
