package com.ardadeniz.assignment9

import android.content.Intent
import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.view.View
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        cameraPermission()
    }
    fun takeVideo(view: View){
        startActivity(Intent(MediaStore.ACTION_VIDEO_CAPTURE))
    }

    fun takeImage(view: View){
        startActivity(Intent(MediaStore.ACTION_IMAGE_CAPTURE))
    }

    private fun cameraPermission(){
        if(ContextCompat.checkSelfPermission(this, android.Manifest.permission.CAMERA) == PackageManager.PERMISSION_DENIED){
            ActivityCompat.requestPermissions(this, arrayOf(android.Manifest.permission.CAMERA),48)
        }
    }
}