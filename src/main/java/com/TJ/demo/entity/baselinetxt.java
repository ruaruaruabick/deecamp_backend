package com.TJ.demo.entity;

import java.util.ArrayList;

public class baselinetxt {
    ArrayList<String> textlist;
    public baselinetxt(ArrayList<String> textlist){
        this.textlist = textlist;
    }
    public ArrayList<String> gettxt(){
        return textlist;
    }
}
