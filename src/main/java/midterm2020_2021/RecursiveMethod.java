package midterm2020_2021;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RecursiveMethod {

    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList<Integer>(Arrays.asList(1,2,3));
        int res = methodY(arrayList);
        System.out.println(res);
    }

    public static int methodY(List<Integer> list) {
        if(list.size()< 2)return list.size();
        List<Integer> leftList=list.subList(0,list.size()/2);
        List<Integer> rightList=list.subList(list.size()/2,list.size());

        int count=0;
        int x=rightList.get(0);
        for(int i=0;i<rightList.size()&&x==rightList.get(i);i++){
            count++;
        }
        for(int i=leftList.size()-1;i>=0&&x==leftList.get(i);i--){
            count++;
        }
        count=Math.max(count,methodY(leftList));
        count=Math.max(count,methodY(rightList));
        return count;
    }
}
