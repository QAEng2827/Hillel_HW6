package genericTask;
/*Write a generic method to find the maximal element in the range [begin, end] of a list.*/

import java.util.Arrays;
import java.util.List;

public class Task1_2 {
    public static <T extends Object & Comparable<? super T>>
    T max(List<? extends T> list, int begin, int end) {

        T maxElem = list.get(begin);

        for (int i = begin; i < end; ++i)
            if (maxElem.compareTo(list.get(i)) < 0)
                maxElem = list.get(i);
        return maxElem;
    }
    public static void main(String[] args){
        List<Integer> simpNumb = Arrays.asList(1,2,3,8,5,6,7,25,9,10,11);
        System.out.println(max(simpNumb,0,7));
        System.out.println(max(simpNumb, 5,10));
    }


}
