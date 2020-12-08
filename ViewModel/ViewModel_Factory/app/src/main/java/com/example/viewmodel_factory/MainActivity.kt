package com.example.viewmodel_factory

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.viewmodel_factory.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    private lateinit var viewModel : MainActivityViewModel
    private lateinit var viewModelFactory : MainActivityViewModelFactory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        viewModelFactory = MainActivityViewModelFactory(125)
        viewModel = ViewModelProvider(this, viewModelFactory).get(MainActivityViewModel::class.java)
        totalNumber_Tv.text = viewModel.getCurrentNumber().toString()

        binding.apply {
            ADDBtn.setOnClickListener {
                totalNumberTv.text = viewModel.getUpdatedNumber(numberEt.text.toString().toInt()).toString()
            }
        }
    }
}