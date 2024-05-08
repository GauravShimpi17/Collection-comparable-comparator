package com.tech.serialization;

import java.io.*;

public class Student implements Serializable {

    private static final long serialVersionId = 1L;
    private String name;
    private int age;
    private String course;

    public Student(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", course='" + course + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Student s1 = new Student("Gaurav",12,"Android Development");

        try{
//            Serializing the data
            FileOutputStream fOut = new FileOutputStream("student.txt");
            ObjectOutputStream out = new ObjectOutputStream(fOut);
            out.writeObject(s1);
            out.close();
            System.out.println("Serialized data is saved in student.txt");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }


//        Deserializing data
        Student deserializedStudent = null;
        try {
            FileInputStream Finp = new FileInputStream("student.txt");
            ObjectInputStream inp = new ObjectInputStream(Finp);
            deserializedStudent = (Student) inp.readObject();
            inp.close();
            Finp.close();

        }catch (Exception e){
            System.out.println(e.getMessage());
        }

//        printing deserialized data
        if (deserializedStudent != null) {
            System.out.println("Deserialized Student: " + deserializedStudent);
        } else {
            System.out.println("Deserialization failed.");
        }
    }
}
