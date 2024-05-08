package com.tech.serialization.is_a;

import java.io.*;

public class Is_A_Main {
    public static void main(String[] args) {
        try {

            Child child = new Child(1, "Gaurav", "Android Development", 45000);
            FileOutputStream fOut = new FileOutputStream("is_a.txt");
            ObjectOutputStream out = new ObjectOutputStream(fOut);
            out.writeObject(child);
            out.flush();
            out.close();
        } catch (Exception e) {
            throw new RuntimeException();
        }

//        Deserializing

        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("is_a.txt"));
            Child c = (Child) in.readObject();
            System.out.println(c.getId() + ", " + c.getName() + ", " + c.getCourse() + ", " + c.getFee());
            in.close();
        } catch (Exception e) {
            throw new RuntimeException();
        }


    }
}
