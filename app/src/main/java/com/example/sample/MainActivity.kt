package com.example.sample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import com.example.sample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var mBinding: ActivityMainBinding
    private lateinit var mViewmodel: MainViewModel

    private fun initViewModel(){
        mViewmodel = ViewModelProviders.of(this).get(MainViewModel::class.java)
        mViewmodel.init()
    }

    private fun initBindings(){
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        mBinding.viewmodel = mViewmodel
        mBinding.lifecycleOwner = this
    }

    private fun setupBindings(){

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        initViewModel()
        initBindings()
        setupBindings()
    }
}
