package com.yousaf.inheritance;

public class Lecturer extends  Teacher{
    protected String cources;
    public void setCources(String cources){
        this.cources = cources;
    }
    public  String getCources(){
        return  cources;
    }
    public  String toString(Lecturer object){
        String object_info;
        object_info = object.toString();
        return object_info;
    }
}
