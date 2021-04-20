package com.yousaf.inheritance;

public class Teacher {
    protected String Name;
    protected int id;

    public void Teacher(String Name,int id){
        this.Name = Name;
        this.id = id;
    }
    public void setName(String Name){
        this.Name = Name;
    }
    public  String getName(){
        return Name;
    }
    public void setId(int id){
        this.id = id;
    }
    public  String toString(Teacher object){
        String object_info;
        object_info = object.toString();
        return object_info;
    }


}
