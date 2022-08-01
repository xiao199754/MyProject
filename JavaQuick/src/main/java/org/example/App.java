package org.example;

import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        HashMap<String,String> hashMap = new HashMap<>();
        HashSet<String> hashSet = new HashSet<>();

        hashMap.put("1","ok2");
        hashMap.put("1","ok1");
        hashMap.put("2","ok2");

        hashSet.add("Time0");
        hashSet.add("Time0");
        hashSet.add("Time1");
        hashSet.add("Time2");


        System.out.println( "Hello World!" );
        System.out.println( hashMap.get("1") );
        System.out.println( hashMap.get("2") );

        for (String h:hashSet) {
            System.out.println( h );
        }
    }
}
