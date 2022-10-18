class CircleArea
{
    double area(double x)
    {
       return 3.14 * x;
    }
}
class SquareArea
{
    int area(int x){
        return x * x;
    }
}

public class Overloading {
    public static void main(String args[]){
        CircleArea ca = new CircleArea();
        SquareArea sa = new SquareArea();


        System.out.println("Circle area = " + ca.area(3));
        System.out.println("Square area = " + sa.area(2));


    }
}
