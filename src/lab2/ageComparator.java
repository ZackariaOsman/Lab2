/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2;

import java.util.Comparator;

/**
 *
 * @author osman
 */
public class ageComparator implements Comparator <Student> {

    @Override
    public int compare(Student s1, Student s2) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        if(s1.getAge() == s2.getAge())
            return s1.getName().compareTo(s2.getName());
        else if (s1.getAge() >= s2.getAge())
            return 1;
        else 
            return -1;
        
    }
    
}
