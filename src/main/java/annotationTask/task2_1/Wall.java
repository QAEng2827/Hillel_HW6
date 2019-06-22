package annotationTask.task2_1;


class Wall extends HouseSurface {

    void paint(){
        color();
        System.out.println("We paint wall in different collors");
    }

    @Override
    public void color(){

        System.out.println("We choose two thick brashes");

    }
}
