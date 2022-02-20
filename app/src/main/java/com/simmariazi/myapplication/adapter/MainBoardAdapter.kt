package com.simmariazi.myapplication.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.simmariazi.myapplication.databinding.BoardCardBinding
import com.simmariazi.myapplication.databinding.BoardContentsBinding
import com.simmariazi.myapplication.model.BoardMessageModel
import com.simmariazi.myapplication.viewholder.BoardMessageViewHolder

class MainBoardAdapter(private val context: Context, private var boardList:ArrayList<BoardMessageModel> ) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun getItemCount(): Int {
        return boardList.size;
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if(holder is BoardMessageViewHolder){
            val item = boardList.get(position);
            holder.bind(item);
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val binding = BoardContentsBinding.inflate(LayoutInflater.from(parent.context), parent, false) ;
        return BoardMessageViewHolder(binding);
    }

    fun setMainBaordList(boardList: ArrayList<BoardMessageModel>){
        this.boardList = boardList;
        notifyDataSetChanged();
    }
}