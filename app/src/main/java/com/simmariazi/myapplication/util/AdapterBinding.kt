package com.simmariazi.myapplication.util

import androidx.databinding.BindingAdapter
import androidx.databinding.ObservableArrayList
import androidx.recyclerview.widget.RecyclerView
import com.simmariazi.myapplication.adapter.BoardAdapter
import com.simmariazi.myapplication.model.BoardModel

object AdapterBinding {
    @BindingAdapter("bind_board")
    @JvmStatic
    fun bindBoard(recyclerView: RecyclerView, boardList:ObservableArrayList<BoardModel>){
        with(recyclerView.adapter as BoardAdapter){
            boardList?.let{
                setBoardList(it);
            }
        }
    }
}