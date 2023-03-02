package com.example.appcomponents

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import com.example.appcomponents.databinding.ActivityMainBinding
class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    private var gameState: String? = null
    private var GAME_STATE_KEY:String="Game Key"
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.i("create"," Activity OnCreate")
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        gameState = savedInstanceState?.getString(GAME_STATE_KEY)
        setContentView(R.layout.activity_main)//DENOTES THE XML FILE
        //to use binding we have to enable it in gradle under android under buildFeatures we have to enable viewBinding true
        //and import it in kotin class import com.example.appcomponents.databinding.ActivityMainBinding
        //without binding means we have to add an plugin to gradle like     id 'kotlin-android-extensions' and import it in
        //kotlin class import kotlinx.android.synthetic.main.activity_main.*
//        binding=ActivityMainBinding.inflate(layoutInflater)

//        Utils.useBinding { binding.buttonGoNext.setOnClickListener { findNavController(R.id.buttonGoNext).navigate(R.id.textView2) } }
        Utils.dontUseBinding { buttonGoNext.setOnClickListener {
            Intent(this,MainActivity2::class.java).also{startActivity(it)}//creating instance of the intent
        } }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.i("Saved instance state","on save instance state")
    }

    override fun onStart() {
        super.onStart()
        Log.d("OnStart","Activity starts")
    }

    override fun onResume() {
        super.onResume()
        Log.d("OnResume","Activity resumed")
    }

    override fun onPause() {
        super.onPause()
        Log.d("OnPause","Activity paused")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("OnDestroy","Activity destroy")
    }

    override fun onStop() {
        super.onStop()
        Log.d("OnStop","Activity stops")
    }

}