package com.company;
class A{
    int exec(){
        return 8;
    }
}
class B extends A{
    int val;

    int exec(int val){
        return val;
    }
}

public class Main {


    public static void main(String[] args) {
	// write your code here
        B b = new B();
        System.out.println(b.exec());


    }
}
