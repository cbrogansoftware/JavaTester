package com.csbTester.complexdatastructures;

import org.springframework.boot.autoconfigure.mail.MailProperties;

import java.util.*;
import java.util.stream.Collectors;

public class Complexmaps {

    public static class Student {

        String fName;
        String lName;
        Integer age;

        public Student(String fName, String lName, Integer age){
            this.fName = fName;
            this.lName = lName;
            this.age = age;
        }

        public String getfName() {
            return fName;
        }

        public void setfName(String fName) {
            this.fName = fName;
        }

        public String getlName() {
            return lName;
        }

        public void setlName(String lName) {
            this.lName = lName;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }
    }

    public static List<String> ListLoader(String[] list){

        List<String> cList = Arrays.stream(list).collect(Collectors.toList());;

        return cList;
    }



}
