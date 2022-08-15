package com.bootdio.bussinescard.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bootdio.bussinescard.databinding.ActivityAddBusinessCardBinding

class AddBusinessCardActivity : AppCompatActivity() {

    private val binding by lazy {ActivityAddBusinessCardBinding.inflate(layoutInflater)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        insertListener()
    }

    private fun insertListener(){
        binding.btnClose.setOnClickListener{
            finish()
        }

        binding.btnConfirma.setOnClickListener{

        }
    }
}