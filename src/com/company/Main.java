package com.company;

import java.util.*;

class Student {
    private String name;
    Student(String name) {

    }

}

class User {
    String name;
    int age;

    User(String n, int a) {
        name = n;
        age = a;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class Main {

    public static void test() {
        test();
    }

    public static void main(String[] args) {
      //  test();

       /* Integer [] array;
        array =new Integer[10];
        for(int i=0;i<array.length;i++)
            array[i]=(new Random()).nextInt();

        Arrays.sort(array);
*/
/*
        ArrayList<Student> array=new ArrayList();
        for(int i=0;i<10;i++){
            String name=new Scanner(System.in).next();
            array.add(new Student(name));
        }
        for(int i=0;i<10;i++){
            System.out.println(array.get(i));
        }
        // foreach
        Iterator<Student> iterator=array.iterator();
        while(iterator.hasNext()){
            Student student=iterator.next();
            System.out.println(student);
        }
        */

/*
     TreeSet<Integer> treeSet = new TreeSet<>();
     treeSet.add(100);
     treeSet.add(44);
     treeSet.add(-5);
     treeSet.add(44);
     // сортировка по natural ordering


     System.out.println(treeSet);


     TreeSet<User> tree = new TreeSet<>(new Comparator<User>() {
         @Override
         public int compare(User o1, User o2) {
             return o2.age-o1.age;
            //return o1.name.compareTo(o2.name);
         }
     });

     tree.add(new User("Ivan",22));
     tree.add(new User("Alex",12));
     tree.add(new User("Max",50));

        System.out.println(tree);
*/



/*
        Integer [] a = {16, 28, 60, 22, 67, 54, 11};
        Arrays.sort(a, a.length/2, a.length);


        TreeMap<String, String> pets = new TreeMap<>();

        SortedMap<String,String> mondayPets = pets.subMap("A","I");

        System.out.println(mondayPets);
*/


        TreeMap<String, TreeMap<String,Integer>> buyer = new TreeMap<String, TreeMap<String,Integer>>();
        Scanner scan = new Scanner(System.in);
            while(true) {
            String full_string = scan.nextLine();
            if(!full_string.isEmpty()) {
                String words[] = full_string.split(" ");

                String name = words[0];
                String prod = words[1];
                int count = Integer.parseInt(words[2]);
                TreeMap<String, Integer> product = buyer.get(name);
                if (product == null) {
                    product = new TreeMap<String, Integer>();
                    product.put(prod, count);
                    buyer.put(name, product);
                } else {
                    if (!product.containsKey(prod)) {
                        product.put(prod, count);
                    } else {
                        product.put(prod, count + product.get(prod));
                    }
                }
            } else break;
        }
        for(Map.Entry<String,TreeMap<String,Integer>> e: buyer.entrySet()) {
            System.out.println(e.getKey()+ ":");
            for(Map.Entry<String,Integer> ee: e.getValue().entrySet()) {
                System.out.println(ee.getKey() + " " + ee.getValue());
            }
        }
    }
}
