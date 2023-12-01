/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package L2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import L2.binarySearch;
import static L2.bubbleSort.bubbleSort;
import static L2.swap.swap;
import newpackage.StudentClass;


/**
 *
 * @author osman
 */
public class AppDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Student s1 = new Student("Moonear", 12);
        Student s2 = new Student("Salami", 88);
        Student s3 = new Student("Abasalami", 13);
        Student s4 = new Student("Basanali", 13);
        
        //Student[] stu = new Student[4]; going to make a lsit instead
        List<Student> stu = new ArrayList<>();
        stu.add(s1);
        stu.add(s2);
        stu.add(s3);
        stu.add(s4);
        
        //System.out.println(stu[1].getAge());
        
        //int i = s2.compareTo(s1);
        //System.out.println(i);
        //Arrays.sort(stu);
        //-----------------
        
        //Testing out the regular comapreTo method with strings
        
        //System.out.println(s1.toString());
        //String a = "a";
        //String b = "b";
        //String z = "z";
        
        //System.out.println(z.compareTo(a));
        
        //-------------------
        
        //Comparator Work
        
        
        
        //System.out.println(stu);
        ///binary search this is an ArrayList
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        nums.add(6);
        nums.add(7);
        nums.add(8);
        nums.add(94);
        nums.add(100);
            //gonna make an array -- This is an Array
        //int[] a = {5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55};
        //for bubble sort
        int[] b = {64, 34, 25, 12, 22, 11, 90};
        //b4 sort
        //System.out.println("Array before sort:");
        //System.out.println(Arrays.toString(b));
        
        //bubbleSort(b);
        
        //System.out.println("Array after sort:");
        //System.out.println(Arrays.toString(b));
        
        //My program
        Scanner scan = new Scanner(System.in);
        
        //Stuff in the cmd
        //System.out.println("Welcome to the program " + args[0] + " " + args[1]);

        System.out.println("This is your current array of integers: ");
        System.out.println(Arrays.toString(b));
        System.out.println();
        System.out.println();
        System.out.println("How do you want to sort your array? ");
        System.out.println("'b' for Bubble Sort");
        System.out.println("'q' for Quick Sort");
        System.out.println("'i' for Insersion Sort");
        System.out.println("'s' for Selection Sort");
        
        String sortMethod = scan.nextLine();
        
        //logic for program
        
            //var to hold the timecomplexety of the algorythim
        String runComplexity = null;
        
        if (sortMethod.equals("b")){
            bubbleSort(b);
            runComplexity = "O(n^2)";
            
        }
        else if (sortMethod.equals("q") || sortMethod.equals("i") || sortMethod.equals("s")){
            System.out.println();
            System.out.println();
            System.out.println("This sorting technique is not currently available...");
            runComplexity = "null";
        }
        else{
            System.out.println("Invalid Option");
            runComplexity = "null";
            
        }
        System.out.println();
        System.out.println();
        System.out.println("Array after sort:");
        System.out.println(Arrays.toString(b));
        System.out.println();
        System.out.println();
        System.out.println("This Algorythim has a runtime complexity of: " + runComplexity);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Program Ending...");
        
        StudentClass barry = new StudentClass();

      
                
           
                //When you run your code nothing will happen. After you make your class you have to create an instance of this class. 
        
        //binary search test
        //System.out.println("Hello");
        //System.out.println(binarySearch.binSearch(nums, 1));
        
        
        
        
        
        
        
        
        
    }
    
}
