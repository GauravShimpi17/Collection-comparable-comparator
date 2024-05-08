package com.tech.multithreading;

public class CompanyMain {
    public static void main(String[] args) {

    Company company = new Company();
    Producer p = new Producer(company);
    Consumer c = new Consumer(company);

    p.start();
    c.start();

    }
}
