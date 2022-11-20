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
        List<String> classesSpringL = Complexmaps.ListLoader(classesSpring);
        List<String> classesSummerL = Complexmaps.ListLoader(classesSummer);

        Complexmaps.Student student1 = new Complexmaps.Student("Chris", "Brogan", 50);
        Complexmaps.Student student2 = new Complexmaps.Student("John", "Cassilly", 70);
        Complexmaps.Student student3 = new Complexmaps.Student("Billy", "Smith", 30);

        //Complexmaps complexmaps = new Complexmaps();

//        HashMap<Complexmaps.Student, List> classLoad = new HashMap<Complexmaps.Student, List>();
        Map<Complexmaps.Student, List<String>> classLoad = new HashMap<>();

        classLoad.put(student1, classesFallL);
        classLoad.put(student2, classesSpringL);
        classLoad.put(student3, classesSummerL);

        classLoad.forEach((key, value) -> {
            //System.out.println(key.getfName() + "=" + value + " "); // Show all 'classes' for student fName
            System.out.println(key.getfName() + "=" + value.get(2) + " ");
        });

    }
}
