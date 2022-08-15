package com.bootdio.bussinescard.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bootdio.bussinescard.R
import com.bootdio.bussinescard.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy {ActivityMainBinding.inflate(layoutInflater)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}