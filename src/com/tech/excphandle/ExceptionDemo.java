package com.tech.excphandle;

public class ExceptionDemo {

    public static void divide(int devident, int divisor) throws HandleException {

        if (divisor == 0) {
            throw new HandleException("Can not divide by zero");
        } else {
            int result = devident / divisor;
            System.out.println("The result is : " + result);
        }
    }

    public static void main(String[] args) throws HandleException {
        try {
            divide(10,0);
        } catch (HandleException e) {
            throw new HandleException("can not devide by zero");
        }

    }
}
