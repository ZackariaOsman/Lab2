/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L2;

//import java.util.Comparator;

/**
 *
 * @author osman
*/
//public class Student implements Comparable, Comparator {
public class Student implements Comparable<Student>{
    
    //props
    private String name;
    private int age;
    
    
    //setters and getters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    //constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    //Comparable method

    /**
     *
     * @param o
     * @return
     */
    @Override
    public int compareTo(Student o) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        if(this.getAge() == o.getAge())
            return 0;
        else if (this.getAge() > o.getAge())
            return 1;
        else 
            return -1;
    }
    
    //toString Method
    @Override
    public String toString(){
        String myString = "Student{" + "Age=" + age +", Name=" + name + "} ";
        return myString;
    }
    
    
    
    
    
}
