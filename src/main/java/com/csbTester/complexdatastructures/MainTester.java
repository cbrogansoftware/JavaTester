package com.csbTester.complexdatastructures;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

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

        System.out.println("~~~~~~~~~~~~~~~~~~~~");

        System.out.println("Key value pairs accessing specific object properties:");
        classLoad.forEach((key, value) -> {
            //System.out.println(key.getfName() + "=" + value + " "); // Show all 'classes' for student fName
            System.out.println(key.getfName() + " is taking " + value.get(2) + " ");
        });

        System.out.println("~~~~~~~~~~~~~~~~~~~~");

        System.out.println("Print keys only:");
        classLoad.forEach((key, value) -> {
            System.out.println(key.getfName());
        });

        System.out.println("~~~~~~~~~~~~~~~~~~~~");

        System.out.println("No looping. Show specific key hashCode and specific subject: ");
        System.out.println(classLoad.get(student1).hashCode());
        System.out.println(classLoad.get(student1).get(1));


        //Arrays.stream(ints).filter(x -> x % 2 == 0).forEach(System.out::println);

        System.out.println("~~~~~~~~~~~~~~~~~~~~");
        // New map with only first name and specific subject
        Map<String, String> result = classLoad.entrySet()
                .stream()
                .filter(map -> map.getKey().getfName().contains("i".toLowerCase()))
                .collect(Collectors.toMap(map -> map.getKey().getfName(), map -> map.getValue().get(1)));

        System.out.println("A new map with desired values that were filtered and simplified to contain first name and specific subjects:");
        result.forEach((key, value) -> {
            System.out.println(key + " - " + value);
        });

    }
}
