package com.simmariazi.myapplication.viewholder

import androidx.recyclerview.widget.RecyclerView
import com.simmariazi.myapplication.databinding.BoardCardBinding
import com.simmariazi.myapplication.databinding.BoardContentsBinding
import com.simmariazi.myapplication.model.BoardMessageModel

class BoardMessageViewHolder(private val binding: BoardContentsBinding) : RecyclerView.ViewHolder(binding.root){

    fun bind(messageItem:BoardMessageModel){
        val nickName = messageItem.getNickName();
        val contents = messageItem.getContents();
        val upCount = messageItem.getUpCount();
        val downCount = messageItem.getDownCount();
        val commentList = messageItem.getCommentList();

        binding.txtNickName.text = nickName;

        binding.contentsEditor.html = "<p><h1>TITLE</h1></p>\n" +
                "<img src=\"https://cafeptthumb-phinf.pstatic.net/MjAyMjAxMTFfMjQg/MDAxNjQxODY4OTUyMzk4.R70GP2I1CJP2o_nGNQons81RlJ3gxDuOXEmiERVpQEQg.5fR3f9XPMQLvgRB1x0TIkWm3u3OCBEWcuFdS3B0Vlgwg.JPEG/1638752610359-6.jpg?type=w1600\" alt=\"\" class=\"se-image-resource\">\n" +
                "<p>이미지테스트</p>\n" +
                "<img src=\"https://mblogthumb-phinf.pstatic.net/MjAyMTA0MDZfMjI3/MDAxNjE3Njc1MzEwNzcy.7aBq-VKw7E1guArmRRm-8CznwS0wkw1HVqzm8N5vKxEg.Qf_Y9KNIJil8WED3rFV1rWqxUc57rCJCAko5QbtChHEg.PNG.hamingsome/1.png?type=w800\" data-lazy-src=\"\" data-width=\"693\" data-height=\"432\" alt=\"\" class=\"se-image-resource _lazy-loading-target-image\" id=\"img_1\" data-top=\"351\">";

        binding.likeCount.text = upCount.toString();
        binding.dislikeCount.text = downCount.toString();
    }
}