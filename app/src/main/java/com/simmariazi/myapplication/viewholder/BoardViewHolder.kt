package com.simmariazi.myapplication.viewholder

import android.content.Context
import android.graphics.Color
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.simmariazi.myapplication.databinding.MainBoardItemBinding
import com.simmariazi.myapplication.model.BoardModel

class BoardViewHolder(private val binding:MainBoardItemBinding) : RecyclerView.ViewHolder(binding.root) {
    fun bind(context: Context, item:BoardModel){
        val boardTitle = item.getBoardTitle();
        val boardContents = item.getBoardContents();
        val boardResID = item.getBoardIconID();
        val backColor = item.getColor();

        binding.boardTitle.setText(boardTitle);
        binding.boardContents.setText(boardContents);
        binding.boardMainLayout.setBackgroundColor(Color.parseColor(backColor));

        Glide.with(context).load(boardResID).into(binding.boardImage);

    }
}