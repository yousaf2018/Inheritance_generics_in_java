package com.yousaf.inheritance;

public class LabEngineer extends Teacher{
    private String labs[];

    public void setLabs(String[] labs) {
        this.labs = labs;
    }
    public String[] getLabs(){
        return labs;
    }
    public  String toString(LabEngineer object){
        String object_info;
        object_info = object.toString();
        return object_info;
    }
}
