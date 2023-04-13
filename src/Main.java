public class Main {
    public static void main(String[] args) {


        //Calculate Area of any shape

        Triangle t = new Triangle(5,2);

        square s = new square(10);

        rectangle r = new rectangle(5,4);

        AreaOfShape areaOfShape = new AreaOfShape(r);
        AreaOfShape areaOfShape1 = new AreaOfShape(s);
        AreaOfShape areaOfShape2 = new AreaOfShape(t);

        areaOfShape.printArea();
        areaOfShape1.printArea();
        areaOfShape2.printArea();




    }
}