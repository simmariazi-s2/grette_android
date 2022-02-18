package com.simmariazi.myapplication.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.simmariazi.myapplication.webservice.MainBoardService

class MainViewFactory(private val mainBoardService: MainBoardService) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return modelClass.getConstructor(MainBoardService::class.java).newInstance(mainBoardService);
    }
}