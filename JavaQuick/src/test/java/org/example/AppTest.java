package org.example;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

    public static void main(String[] args) {
        Map<String,Object> map1 = new HashMap<>();
        Map<String,Object> map2 = new HashMap<>();

        List<Map<String,Object>> list1 = new ArrayList<>();
        List<Map<String,Object>> list2 = new ArrayList<>();

        map1.put("0","0,ooo0");
        map1.put("1","1,ooo1");
        map1.put("2","2,ooo2");
        map1.put("3","3,ooo3");

        list1.add(map1);

        map2.put("0","0,kkk1");
        map2.put("1","1,ooo1");
        map2.put("2","2,kkk4");
        System.out.println(map2.get("1"));
        list2.add(map2);

        MergeList mergeList = new MergeList();
        List<Map<String, Object>> listResult = mergeList.mergeList(list1, list2, "1");
        for (Map<String, Object> listResult1:listResult) {
            System.out.println(listResult1);
        }

    }
}
