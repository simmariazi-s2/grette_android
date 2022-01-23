package com.simmariazi.myapplication.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.simmariazi.myapplication.R
import com.simmariazi.myapplication.databinding.ActivityRegisterBinding
import com.simmariazi.myapplication.databinding.CustomAgreementBinding
import com.simmariazi.myapplication.databinding.CustomToolbarBinding
import com.sothree.slidinguppanel.SlidingUpPanelLayout

class RegisterActivity : AppCompatActivity() {
    var binding:ActivityRegisterBinding? = null;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_register)
        setToolbar(binding!!.customToolbar);
    }

    private fun setToolbar(toolbar:CustomToolbarBinding){
        val toolbar = toolbar.toolbar;

        setSupportActionBar(toolbar);

        val actionBar = supportActionBar;

        if(actionBar != null){
            actionBar.setDisplayShowHomeEnabled(true);
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setDisplayShowTitleEnabled(false);
            actionBar.setHomeAsUpIndicator(R.drawable.ic_back);
        }
    }

    fun getAgreement() : SlidingUpPanelLayout {
        return binding!!.slidingLayout;
    }
}