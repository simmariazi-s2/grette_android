package com.simmariazi.myapplication.model

class BoardMessageModel(builder:Builder) {

    private var nickName:String = builder.nick_name;
    private var categoryName:String = builder.categoryName;
    private var contents:String = builder.contents;
    private var upCount:Int = builder.upCount;
    private var downCount:Int = builder.downCount;
    private var commentList:ArrayList<CommentModel> = builder.commentList;

    fun getCategoryName() : String{
        return this.categoryName;
    }

    fun getNickName() : String{
        return this.nickName;
    }

    fun getContents(): String{
        return this.contents;
    }

    fun getUpCount() : Int{
        return this.upCount;
    }

    fun getDownCount(): Int{
        return this.downCount;
    }

    fun getCommentList() : ArrayList<CommentModel>{
        return this.commentList;
    }

    class Builder : Buildable<BoardMessageModel> {
        override fun build(): BoardMessageModel {
            return BoardMessageModel(this);
        }

        var categoryName:String = "";
        var contents:String = "";
        var nick_name:String = "";
        var upCount:Int = 0;
        var downCount:Int = 0;
        var commentList:ArrayList<CommentModel> = ArrayList();

        fun CategoryName(categoryName:String) : Builder{
            this.categoryName = categoryName;
            return this;
        }

        fun Contents(contents:String) : Builder{
            this.contents = contents;
            return this;
        }

        fun NickName(nickName:String) : Builder{
            this.nick_name = nickName;
            return this;
        }

        fun UpCount(upCount:Int) : Builder{
            this.upCount = upCount;
            return this;
        }

        fun DownCount(downCount:Int) : Builder{
            this.downCount = downCount;
            return this;
        }

        fun CommentList(commentList: ArrayList<CommentModel>) : Builder{
            this.commentList = commentList;
            return this;
        }
    }
}