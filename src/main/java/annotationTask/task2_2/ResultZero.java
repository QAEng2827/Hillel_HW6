package annotationTask.task2_2;
/*Create junit test class in maven project. Create some simple program class with method1 that returns 0.
 Use @Test annotation to create some test method in your test class. In test method verify that method1 returns 0.*/
public class ResultZero{

    public int resultCheck(int x, int y){

  if (y==x){
      int res= 0;
      System.out.println("Result is zero");
      return 0;

  } else {
      int res = x-y;
      System.out.println("Result isn't zero. The Result is " + res);
  }

return x-y;
    }

}
