/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2;

import java.util.List;

/**
 *
 * @author osman
 */
public class binarySearch {
    
    //[6,3,9] 
    
    //static mehtod
    public static int binSearch(List<Integer> arr, int target){
        //started the binary search
        //int targetIndex = arr.get(target);
        int l = 0;
        int r = arr.size() -1;
        
        //tested the method
        //return arr.size();
        //actual code for binary search 
        while (l <= r){
            int m = l + (r-l)/2;
            if (arr.indexOf(target) == m){
                return m;
            }
            else if (arr.indexOf(target) > m ){
                l = m + 1;
            }
            else if (arr.indexOf(target) < m){
                r = m - 1;
            }
        }
        return -1; //value doesn't exist
    }
    
}
/*
public class BinarySearch {

    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == target) {
                return mid; // Target found at index 'mid'
            }

            if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1; // Target not found in the array
    }

    public static void main(String[] args) {
        int[] sortedArray = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        int target = 13;

        int result = binarySearch(sortedArray, target);

        if (result != -1) {
            System.out.println("Element " + target + " found at index " + result);
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }
    }
}

*/