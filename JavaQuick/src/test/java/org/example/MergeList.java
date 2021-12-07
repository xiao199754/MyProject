package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MergeList {

    public List<Map<String,Object>> mergeList(List<Map<String,Object>> list1,
                                              List<Map<String,Object>> list2,
                                              String fieldName) {
        List<Map<String,Object>> resultList = new ArrayList<>();
        System.out.println(list1.size());
        Map<Object,Integer> fieldValueMap = new HashMap<>(list1.size());

        for(int i = 0; i < fieldValueMap.size(); i ++) {
            Map<String,Object> map1 = list1.get(i);
            fieldValueMap.put( map1.get(fieldName),i );
            System.out.println(fieldValueMap.get("1,ooo1"));
            resultList.add(map1);
        }

        for(Map<String,Object> map2 : list2) {
            int index = fieldValueMap.get(map2.get(fieldName));
            if(index > -1) {
                resultList.get(index).putAll(map2);
            }
        }
        return resultList;
    }
}
