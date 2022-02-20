package com.simmariazi.myapplication.model

class BoardModel(builder:Builder) {
    private var color:String = builder.color;
    private var boardID:Int = 0;
    private var boardTitle:String = builder.boardTitle;
    private var boardContents:String = builder.boardContents;
    private var boardIconID:Int = builder.boardIconID;

    fun getColor():String{
        return color;
    }

    fun getBoardTitle():String{
        return this.boardTitle;
    }

    fun getBoardContents():String{
        return boardContents;
    }

    fun getBoardIconID():Int{
        return boardIconID;
    }

    class Builder : Buildable<BoardModel>{
        var color:String="";
        var boardTitle:String = "";
        var boardContents:String = "";
        var boardIconID:Int = 0;
        override fun build(): BoardModel {
            return BoardModel(this);
        }

        fun Color(color:String) : Builder{
            this.color = color;
            return this;
        }

        fun BoardTitle(title:String) : Builder{
            this.boardTitle = title;
            return this;
        }

        fun BoardContents(contents:String) : Builder{
            this.boardContents = contents;
            return this;
        }

        fun BoardIConID(resID:Int) : Builder{
            this.boardIconID = resID;
            return this;
        }
    }
}