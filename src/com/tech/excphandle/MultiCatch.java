package com.tech.excphandle;

public class MultiCatch {

    public static void arrayIndex() {
        int arr[] = {1, 2, 3, 4, 5};

        try {
            System.out.println(arr[6]);
        } catch (NullPointerException e) {
            System.out.println("Null pointer");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Not found");
        }
    }

    public static void main(String[] args) {
        arrayIndex();
    }

}
