package com.example.widgetsradio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.widgetsradio.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.radioGroup.setOnCheckedChangeListener {
                group, checkedId ->
            if(checkedId == R.id.radioApple) {
               Log.d("Radio", "사과")
            } else if(checkedId == R.id.radioBanana) {
                Log.d("Radio", "바나")
            } else {
                Log.d("Radio", "오렌지")
            }
        }
    }
}