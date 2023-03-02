package com.example.appcomponents
//Creating activity and changing from one activity to another
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main2.*


class MainActivity2 : AppCompatActivity() {

    var fileUri:String?="https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.artstation.com%2Fartwork%2FXneN5Y&psig=AOvVaw3oJwhSIzczQJKPilsNLu7h&ust=1674724295273000&source=images&cd=vfe&ved=0CBAQjRxqFwoTCKCbxKew4vwCFQAAAAAdAAAAABAE"
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.i("create"," Activity OnCreate")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
//        Utils.dontUseBinding { buttonGetBack.setOnClickListener { Intent(this,MainActivity::class.java).also {startActivity(it) } } } indtead of doing this
        // i can use finish()_ function
//        Utils.dontUseBinding { ImageButton.setOnClickListener { Intent(this, DOWNLOAD_SERVICE::class.java).
//        apply { data=Uri.parse(fileUri) }.also { startActivity(it) } } }
        Utils.dontUseBinding { buttonGetBack.setOnClickListener { finish() } }
    }
    override fun onStart() {
        super.onStart()
        Log.d("OnStart2","Activity2 starts")
    }

    override fun onSaveInstanceState(outState: Bundle) {

        super.onSaveInstanceState(outState)
        Log.i("create"," Activity2 saveInstance state")
    }

    override fun onResume() {
        super.onResume()
        Log.d("OnResume2","Activity2 resumed")
    }

    override fun onPause() {
        super.onPause()
        Log.d("OnPause2","Activity2 paused")
    }

    override fun onDestroy() {
        super.onDestroy()

        Log.d("OnDestroy2","Activity2 destroy")
    }

    override fun onStop() {
        super.onStop()
        Log.d("OnStop2","Activity2 stops")
    }
}