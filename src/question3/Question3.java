/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question3;

import java.util.Random;

/**
 *
 * @author Administrator
 */
public class Question3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] ram = new int[500];
        for(int i = 0; i<500; i++){
            ram[i] = new Random().nextInt();
        }
        MergeSort mergeSort = new MergeSort();
        ram = mergeSort.mergeSort(ram, 0, 499);
        for(int j = 0; j < 500; j++){
            System.out.println(ram[j]);
        }
    }
}
