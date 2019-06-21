package genericTask.tack1_3;



import java.util.ArrayList;
import java.util.List;

/*Create your own example of java class with generics (and usage of it in main),
 use ‘extends’, ‘super’ (wildcards).*/
class Task1_3{
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

     paintSurface(list1);

     paintSurface(list2);
     paintSurface(list3);
 }
}
