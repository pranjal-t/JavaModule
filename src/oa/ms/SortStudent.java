package oa.ms;

import java.util.*;
import java.util.stream.Collectors;

public class SortStudent {

    static Map<String, List<Student>> subjectToStudentsMap = new HashMap();

    static {
        subjectToStudentsMap.put("Physics", Arrays.asList(
                new Student("Rahul", "Garg", 25,"Science", 40),
                new Student("Sidd", "Bhatia", 30,"Science", 50),
                new Student("Monica", "Mishra", 26, "Science", 30)
        ));
        subjectToStudentsMap.put("Chemistry", Arrays.asList(
                new Student("Rahul", "Garg", 25,"Science", 46),
                new Student("Neha", "Jain", 33,"Science", 48),
                new Student("Monica", "Mishra", 26,"Science", 46)
        ));

        subjectToStudentsMap.put("Maths", Arrays.asList(
                new Student("Vishal", "Garg", 24,"Commerce", 44),
                new Student("Abhishek", "Kakkar",22, "Commerce", 43),
                new Student("Monica", "Mishra", 26,"Science", 48)
        ));
    }

    public static void main(String[] args) {

        Map<String, MyObject> map = new HashMap<>();

       int count;

        for(Map.Entry<String, List<Student>> val : subjectToStudentsMap.entrySet())
        {

            List<Student> list = val.getValue();

            for(Student s : list)
            {
                if(map.get(s.firstName + " " + s.lastName)==null)
                {
                     count=1;
                    MyObject myObject = new MyObject(s,s.score,count,s.score);
                    map.put(s.firstName + " " + s.lastName, myObject);
                }
                else
                {
                    MyObject obj = map.get(s.firstName + " " + s.lastName);
                     count = obj.count+1;
                   // obj.avgScore = (obj.avgScore+s.score)/(count);

                   // System.out.println(s.firstName + " " + s.lastName);

                    MyObject newObj = new MyObject(s,(obj.totalScore+s.score)/(count), count, obj.totalScore + s.score);
                    map.put(s.firstName + " " + s.lastName, newObj);
                }
            }
        }

        //Collections.sort(Arrays.asList(map.values().toArray()));
        for(Map.Entry<String, MyObject> val : map.entrySet())
        {
          //  System.out.println(val.getKey() + " " +
            //        val.getValue().student.stream + " " + val.getValue().avgScore);
        }

        HashMap<String, MyObject> anotherVal = map.entrySet().stream().sorted((i,j)-> (int) (j.getValue().avgScore - i.getValue().avgScore))
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(e1,e2) -> e1, LinkedHashMap::new));

        for(Map.Entry<String, MyObject> val : anotherVal.entrySet())
        {
            System.out.println(val.getKey() + " " +
                    val.getValue().student.stream + " " + val.getValue().avgScore);
        }


    }
}

class MyObject
{
    Student student;

    double avgScore;
    int count;
    double totalScore;

    public MyObject(Student student, double avgScore, int count, double totalScore)
    {
        this.student = student;
        this.avgScore = avgScore;
        this.count = count;
        this.totalScore = totalScore;
    }
}

class Student {
    String firstName;
    String lastName;
    double score;
    String stream;
    int age;

    public Student(String firstName, String lastName, int age, String stream, double score) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.score = score;
        this.age = age;
        this.stream = stream;
    }
}

