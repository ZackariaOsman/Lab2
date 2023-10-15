/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2;

import static lab2.swap.swap;

/**
 *
 * @author osman
 */
//int[] b = {64, 34, 25, 12, 22, 11, 90};
public class bubbleSort {
    
    public static void bubbleSort(int[] array){
        
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length - 1; j++){
                if (array[j] > array[j+1]){
                    swap(array, j, j+1);
                }
            }
        } 
    }
    
}
