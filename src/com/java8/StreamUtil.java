package com.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class CustomObject
{
    public int getId() {
        return id;
    }

    public CustomObject(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private int id;
    private String name;
}
public class StreamUtil {

    public static void main(String[] args) {

        List<CustomObject> customObjectList = new ArrayList<>();
        customObjectList.add(new CustomObject(1,"abc"));
        customObjectList.add(new CustomObject(1, "sdf"));
        customObjectList.add(new CustomObject(2, "wer"));
        customObjectList.add(new CustomObject(3, "qwe"));


       // Map<Integer,List<String>> map = customObjectList.stream().collect(Collectors.toMap(x->x.getId(),customObjectList.   y->y.getName()));


        Map<Integer, List<String>> map = customObjectList.stream().collect(Collectors.groupingBy(CustomObject::getId,
                Collectors.mapping(CustomObject::getName,Collectors.toList())));
       // List<CustomObject> list = customObjectList.stream().filter(x->x!=null).collect(Collectors.toList());


        System.out.println(map);
    }
}
