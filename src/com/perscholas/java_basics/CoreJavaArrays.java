package com.perscholas.java_basics;

import java.util.Arrays;

public class CoreJavaArrays {
    public static void main(String[] args) {
        int[] intArray = {1,2,3};
        for (int i: intArray) {
            System.out.println(i);
        }
        System.out.println("--------------------");
        Integer[] anotherIntArray = {13, 5, 7, 68, 2};
        System.out.println("Middle of array " + Arrays.toString(anotherIntArray)  + " is " + middleOfArray(anotherIntArray));
        System.out.println("--------------------");
        String[] colors = {"red", "green", "blue", "yellow"};
        System.out.println(colors.length);
        String[] newColors = colors.clone();
        System.out.println(Arrays.toString(newColors));
        System.out.println("--------------------");
        int[] newIntArray = {43,4,1,100,31};
        System.out.println("First index: " + newIntArray[0]);
        System.out.println("Last index: "+ newIntArray[newIntArray.length-1]);
        //ArrayIndexOutOfBoundsException System.out.println("Last index: "+ newIntArray[newIntArray.length]);
        //newIntArray[5] = 10;

        int[] intArray2 = new int[5];
        for(int i=0; i<intArray2.length; i++){
            intArray2[i] = i;
        }

        int[] intArray3 = new int[5];
        for(int i=0; i<intArray2.length; i++){
            intArray2[i] = i*2;
        }

        char[] charArray = {'5','c','f','g','a'};
        for(int x=0; x< charArray.length; x++){
            if(x!=(charArray.length/2)){
                System.out.println(charArray[x]);
            }
        }

        String[] stringArray = {"first", "second", "third", "fourth", "fifth"};
        System.out.println(Arrays.toString(stringArray));
        String temp = stringArray[0];
        stringArray[0] = stringArray[stringArray.length/2];
        stringArray[stringArray.length/2] = temp;
        System.out.println(Arrays.toString(stringArray));

        int[] unsortedArray = {4, 2,9,13,1,0};
        int[] sortedArray = mergeSort(unsortedArray);
        /*I implemented a merge sort though I think I can improve it later on */
        System.out.println(Arrays.toString(sortedArray));
        System.out.println("Smallest element is: " + sortedArray[0]);
        System.out.println("Largest element is: " + sortedArray[sortedArray.length-1]);


        Object[] objectArray = {3, "Element 1", "Element 2", "Element 3", 3.4};
        System.out.println(Arrays.toString(objectArray));
    }

    // use of return generic type so no matter what type of array it is it will always return the middle element
    public static  <T> T middleOfArray(T[] arr){
            return arr[arr.length/2];
    }

    public static int[] mergeSort(int[] arr){
        if(arr.length==1) //already sorted
            return arr;
        else{
            int[] arr1 = Arrays.copyOfRange(arr, 0,arr.length/2);
            int[] arr2 = Arrays.copyOfRange(arr, arr.length/2 , arr.length);
            arr1 = mergeSort(arr1);
            arr2 = mergeSort(arr2);
            return merge(arr1, arr2);
        }

    }

    public static int[] merge(int[] arr1, int[] arr2){
            //sort the two arrs that come in
        int[] sorted = new int[arr1.length+arr2.length];
        int firstIndex =0, secondIndex =0, sortedIndex =0;
        while(firstIndex < arr1.length && secondIndex < arr2.length){

            //compare the elements in the arrays to see which one should get pushed onto the list
            if(arr1[firstIndex] < arr2[secondIndex]){
                sorted[sortedIndex] = arr1[firstIndex];
                firstIndex++;
                sortedIndex++;
            }else{
                sorted[sortedIndex] = arr2[secondIndex];
                secondIndex++;
                sortedIndex++;
            }
        }
        // at a certain point one of the array indexes should be bigger than the array length -1 so check which one and
        // add all the elements of the other list to the end of sortedArray list
        if(firstIndex >=arr1.length){
            System.arraycopy(arr2,secondIndex, sorted, sortedIndex, arr2.length-secondIndex);
        }
        else if(secondIndex >= arr2.length){
            System.arraycopy(arr1,firstIndex, sorted, sortedIndex, arr1.length-firstIndex);
        }
        return sorted;
    }


}
