package annotationTask.task2_1;

import java.util.ArrayList;
import java.util.List;
/*Use @Override with some object methods. Override the realization of it.*/
public class Task2_1 {
    public static void paintSurface(List<? extends HouseSurface> lists){
        for (HouseSurface s: lists){

            s.paint();

        }
    }
    public static void main(String args[]){
        List<Wall> list1=new ArrayList<Wall>();
        list1.add(new Wall());



        List<Floor>list2=new ArrayList<Floor>();
        list2.add(new Floor());

        List<Roof>list3=new ArrayList<Roof>();
        list3.add(new Roof());



        paintSurface(list2);
        paintSurface(list3);
        paintSurface(list1);

    }
}

