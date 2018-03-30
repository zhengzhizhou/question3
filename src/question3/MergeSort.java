/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question3;

/**
 *
 * @author Administrator
 */
public class MergeSort {
    public void merge(int arr[], int left, int middle, int right){
        
        int num_left = middle - left + 1;
        int num_right = right - middle;
        int i, j, k;
        int[] L = new int[num_left];
        int[] R = new int[num_right];
        
        for(i = 0; i < num_left; i++){
            L[i] = arr[left + i];
        }
        for(j = 0; j<num_right; j++){
            R[j] = arr[middle+1+j];
        }
        i = 0; 
        j = 0;
        k = left;
        while(i < num_left && j < num_right){
            if(L[i]<=R[j]){
                arr[k] = L[i];
                i++;
            }else{
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        
        while(i<num_left){
            arr[k] = L[i];
            i++;
            k++;
        }
        
        while(j < num_right){
            arr[k] = R[j];
            j++;
            k++;
        }
        
    }
    public int[] mergeSort(int arr[], int l, int r){
        if(l < r){
            int m = l + ( r - l )/2;
            mergeSort(arr, l, m);
            mergeSort(arr, m+1, r);
            merge(arr, l, m, r);
        }
        return arr;
    }
}
