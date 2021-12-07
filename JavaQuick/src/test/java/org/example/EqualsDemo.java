package org.example;

public class EqualsDemo {

    public static void main(String[] args) {
        String page="user";
        String page1;
        if (page=="user")
            page1 = page+"/query";
        else page1=page;
        System.out.println(page1);
    }

}
