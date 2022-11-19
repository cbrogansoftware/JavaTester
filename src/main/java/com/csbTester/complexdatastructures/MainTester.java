package com.csbTester.complexdatastructures;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainTester {

    public static void main(String[] args) {

        String[] classesFall = {"Algebra", "Biology", "Computer Science"};
        String[] classesSpring = {"Calculus", "Genetics", "Databases"};
        String[] classesSummer = {"Statistics", "Immunology", "Operating Systems"};
        //List<String> lClasses = ListLoader(classesFall);
        List<String> classesFallL = Complexmaps.ListLoader(classesFall);

        Complexmaps.Student student1 = new Complexmaps.Student("Chris", "Brogan", 50);
        Complexmaps.Student student2 = new Complexmaps.Student("John", "Cassilly", 70);
        Complexmaps.Student student3 = new Complexmaps.Student("Billy", "Smith", 30);

        //Complexmaps complexmaps = new Complexmaps();

        HashMap<Complexmaps.Student, List> classLoad = new HashMap<Complexmaps.Student, List>();

        classLoad.put(student1, classesFallL);

        for (int i = 0;i < classLoad.size();i++){
            System.out.println(student1.getfName());
            System.out.println(classLoad.get(student1).get(2));
        }

    }
}
