package com.yousaf;
import  java.util.ArrayList;
import com.yousaf.inheritance.LabEngineer;
import com.yousaf.inheritance.Lecturer;
import com.yousaf.inheritance.Professor;
import com.yousaf.inheritance.Teacher;
import com.yousaf.Generics.*;
import java.util.Scanner;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("*************Task1*************");
        ArrayList<Teacher> list = new ArrayList<Teacher>();
        LabEngineer[] objects_lab_engineer = new LabEngineer[10];
        Lecturer[] objects_lecturer = new Lecturer[10];
        Professor[] objects_professor = new Professor[10];
        for(int i=0;i<10;i++){
            objects_lab_engineer[i] = new LabEngineer();
            objects_lecturer[i] = new Lecturer();
            objects_professor[i] = new Professor();
        }
        for(int i=0;i<10;i++){
            list.add(objects_lab_engineer[i]);
            list.add(objects_lecturer[i]);
            list.add(objects_professor[i]);
        }

        Collections.shuffle(list);//Shuffling the list
        print_teachers(list);
        System.out.println("*************Task2*************");
        KeyValuePair<Integer,String> obje = new KeyValuePair<Integer,String>();
        obje.add_element(45,"Mahmood Yousaf");
        obje.add_element(42,"Abdullah");
        obje.add_element(46,"Qazi Arsalan");
        String check = obje.getElement(46);
        System.out.println(check);
        String check2 = obje.getElement(42);
        System.out.println(check2);
        String check3 = obje.getElement(45);
        System.out.println(check3);
        obje.remove_element(46);
        //After deletion checking is it removed or not
        String check4 = obje.getElement(46);
        System.out.println(check4);
        /*Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println(name);*/
        //objects_lab_engineer[0].setName("Mahmood Yousaf");
        //String hi = objects_lab_engineer[0].getName();



    }

    public static void print_teachers(ArrayList<Teacher> list1){
        for(int i=0;i<30;i++) {
            boolean check = list1.get(i) instanceof LabEngineer;
            if (check == true) {
                System.out.println("I am here object of Lab Engineer at index-->" + i);
                continue;
            }
        }
            for(int i=0;i<30;i++) {
                boolean check = list1.get(i) instanceof Lecturer;
                if (check == true) {
                    System.out.println("I am here object of Lecturer at index-->" + i);
                    continue;
                }
            }
                for(int i=0;i<30;i++) {
                    boolean check = list1.get(i) instanceof Professor;
                    if (check == true) {
                        System.out.println("I am here object of Professor at index-->" + i);
                        continue;
                    }
                }
            }
        }
