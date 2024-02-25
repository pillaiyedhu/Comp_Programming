package comp_programming;

//[1,4,6,8,9,12,1,35,5,25]
//start = 5, end = 9
//[1,4,6,8,9,25,5,35,1,12]

import java.util.ArrayList;
import java.util.List;

public class ReverseAListFromGivenEndAndStart {

    public static List reverseList(List<Integer> list,int start, int end){
        while(start<end){
            int temp = list.get(start);
            list.set(start, list.get(end));
            list.set(end,temp);

            start++;
            end--;
        }
        return list;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(4);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(12);
        list.add(1);
        list.add(35);
        list.add(5);
        list.add(25);

        System.out.println(list);
        List<Integer> newlist = reverseList(list,5,9);
        System.out.println(newlist);



    }
}
