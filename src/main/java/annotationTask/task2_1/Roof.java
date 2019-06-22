package annotationTask.task2_1;

class Roof extends HouseSurface {


    void paint(){
        super.color();
        System.out.println("paint roof twice");
        color();
    }
    public void color(){
             System.out.println("red");

    }
}
