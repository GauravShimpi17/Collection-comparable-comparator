package com.tech.marks;

public class A implements Marks{

    private int sub1;
    private int sub2;
    private int sub3;
    public A(int sub1,int sub2, int sub3){
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
    }

    @Override
    public double getPercentage() {
        int res = sub1 + sub2 + sub3;
        return ((double) res /300)*100;
    }
}
