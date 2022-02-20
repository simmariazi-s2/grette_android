package com.simmariazi.myapplication.viewModel

import androidx.databinding.ObservableArrayList
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.simmariazi.myapplication.R
import com.simmariazi.myapplication.model.BoardMessageModel
import com.simmariazi.myapplication.model.BoardModel
import com.simmariazi.myapplication.webservice.MainBoardService

class MainViewModel(private val boardService: MainBoardService) :  ViewModel()  {
    val boardList:ObservableArrayList<BoardModel> = ObservableArrayList();
    val maindBoardList:ObservableArrayList<BoardMessageModel> = ObservableArrayList();

    // 웹 통신 추가 필요
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

    // 추후 웹통신 추가 필요
    fun requestBoardMessage(){
        val board1 = BoardMessageModel.Builder().NickName("직박구리")
            .Contents("test입니다.").DownCount(0).CategoryName("그래떄")
            .UpCount(60).build();

        val board2 = BoardMessageModel.Builder().NickName("직박구리2")
            .Contents("회사건물 출입 안되요ㅜㅜ").DownCount(0).CategoryName("그래때")
            .UpCount(60).build();

        val board3 = BoardMessageModel.Builder().NickName("직박구리3")
            .Contents("회사건물 출입 안되요ㅜㅜ").DownCount(5).CategoryName("그래때")
            .UpCount(30).build();

        val board4 = BoardMessageModel.Builder().NickName("직박구리4")
            .Contents("여기 맛집이에요!").DownCount(4).CategoryName("마시때")
            .UpCount(70).build();

        maindBoardList.add(board1);
        maindBoardList.add(board2);
        maindBoardList.add(board3);
        maindBoardList.add(board4);
    }
}