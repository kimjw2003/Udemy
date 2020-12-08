package com.example.viewmodel_test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.viewmodel_test.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    private lateinit var viewModel : MainActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        viewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java)
        totalNumber_Tv.text = viewModel.getCurrentNumber().toString()

        binding.apply {
            ADDBtn.setOnClickListener {

                totalNumberTv.text = viewModel.getUpdatedNumber(numberEt.text.toString().toInt()).toString()
            }
        }
    }
}