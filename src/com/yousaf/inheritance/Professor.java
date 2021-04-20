package com.yousaf.inheritance;

public class Professor extends  Teacher{
    private String projects[];
    private  String commmittes[];
    public void setProjects(String projects[]){
        this.projects = projects;
    }
    public String[] getProjects(){
        return  projects;
    }
    public  void setCommmittes(String commmittes[]){
        this.commmittes = commmittes;
    }
    public  String[] getCommmittes(){
        return commmittes;
    }
    public  String toString(Professor object){
        String object_info;
        object_info = object.toString();
        return object_info;
    }
}
