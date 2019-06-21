package genericTask.tack1_3;

class Roof  extends HouseSurface {


    void paint(){
        super.color();
        System.out.println("paint roof twice");
        color();
    }
    public void color(){
             System.out.println("red");

    }
}
