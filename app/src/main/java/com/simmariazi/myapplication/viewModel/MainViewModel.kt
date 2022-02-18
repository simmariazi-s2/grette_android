package com.simmariazi.myapplication.viewModel

import androidx.databinding.ObservableArrayList
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.simmariazi.myapplication.R
import com.simmariazi.myapplication.model.BoardModel
import com.simmariazi.myapplication.webservice.MainBoardService

class MainViewModel(private val boardService: MainBoardService) :  ViewModel()  {
    val boardList:ObservableArrayList<BoardModel> = ObservableArrayList();
    fun requestBoard(){
        val rumorBoard = BoardModel.Builder().Color("#FFF1EB").BoardTitle("진짜래?")
            .BoardContents("사내 소문들을 얘기해요\n확실하지 않은 정보도 괜찮아요").BoardIConID(R.drawable.ic__rumor_board).build();

        val rumorBoard2 = BoardModel.Builder().Color("#F3FBFF").BoardTitle("진짜래?")
            .BoardContents("사내 소문들을 얘기해요\n확실하지 않은 정보도 괜찮아요").BoardIConID(R.drawable.ic_rumo2_board).build();

        val eatBoard = BoardModel.Builder().Color("#F5FFF5").BoardTitle("마시때")
            .BoardContents("회사 근처 맛집, 별로인 곳 모두 맛집 게시판에 공유해요").BoardIConID(R.drawable.ic_eat_rest_board).build();

        val canBoard =  BoardModel.Builder().Color("#F5FFF5").BoardTitle("할거래")
            .BoardContents("사내 소문들을 얘기해요\n확실하지 않은 정보도 괜찮아요").BoardIConID(R.drawable.ic_can_board).build();

        boardList.add(rumorBoard);
        boardList.add(rumorBoard2);
        boardList.add(eatBoard);
        boardList.add(canBoard);
    }
}