package wifi.prank

import android.app.Activity
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.Window
import android.widget.MediaController
import android.widget.VideoView

class VideosActivity : Activity() {
    lateinit internal var SrcPath: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        setContentView(R.layout.videos)
        val myVideoView = findViewById<VideoView>(R.id.videoview1)
        val intent = intent
        val vid = intent.getStringExtra("vid")
        SrcPath = "android.resource://" + packageName + "/" + resources.getIdentifier(vid, "raw", packageName)
        myVideoView.setVideoURI(Uri.parse(SrcPath))
        myVideoView.setMediaController(MediaController(this))
        myVideoView.requestFocus()
        myVideoView.start()
    }

}
