package Day_3_Solution;

import java.util.Scanner;
public class ConstructorOverloading {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        double l = s.nextDouble();
        double w = s.nextDouble();
        double h = s.nextDouble();
        Constructor cuboid1 = new Constructor(l,w,h);
    }
}
class Constructor{
    double length, width, height;
    Constructor(){
        length = 10;
        width = 10;
        height= 10;
        System.out.println("Constructor without parameter");
        System.out.println("Volume is " + (length*width*height));
    }
    Constructor(double l,double w, double h){
        this();
        length = l;
        width = w;
        height = h;
        System.out.println("Constructor with parameter");
        System.out.println("Volume is " + (length*width*height));
    }
}