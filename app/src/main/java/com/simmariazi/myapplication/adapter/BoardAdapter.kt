package com.simmariazi.myapplication.adapter


import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.simmariazi.myapplication.R
import com.simmariazi.myapplication.databinding.MainBoardItemBinding
import com.simmariazi.myapplication.model.BoardModel
import com.simmariazi.myapplication.viewholder.BoardViewHolder

class BoardAdapter(private val context:Context, private val boardList:ArrayList<BoardModel>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun getItemCount(): Int {
        //return boardList.count();
        return Integer.MAX_VALUE;
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        //DataBindingUtil.inflate(inflater, R.layout.fragment_main, container, false);
        val boardBinding = MainBoardItemBinding.inflate(LayoutInflater.from(parent.context), parent, false);
        return BoardViewHolder(boardBinding);
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val realPos = position % boardList.size;
        if(holder is BoardViewHolder){
            val item = boardList.get(realPos);
            holder.bind(context, item);
        }
    }
}