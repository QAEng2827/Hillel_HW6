package genericTask;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*Write a generic method to exchange the positions of two different elements in an array.*/

public class Task1_1 {

    public static <T> void swap(T[] a, int i, int j){
        T temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }


    public static void main(String[] args){
        String[] str={"One","Two","Three"};
        System.out.println("before: "+ Arrays.toString(str));
        swap(str,0,2);
        System.out.println("after: "+Arrays.toString(str));
       Integer[] num = {1,2,3,4,5};
        System.out.println("before: "+ Arrays.toString(num));
        swap(num,2,4);
        System.out.println("after: "+Arrays.toString(num));
    }
}

