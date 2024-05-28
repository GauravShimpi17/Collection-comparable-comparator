package com.tech.marks;

public class B implements Marks{

    private int sub1;
    private int sub2;
    private int sub3;
    private int sub4;

    public B(int sub1,int sub2, int sub3, int sub4){
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
        this.sub4 = sub4;
    }

    @Override
    public double getPercentage() {
        int res = sub1 + sub2 + sub3 + sub4;
        return ((double) res /400)*100;
    }

}
