package geo;

import java.util.Random;

public class Geometrics {
   


    public static double squareArea(double x){
        return x*x;
    }
    public static double squarePerimeter( double x){
        return 4*x;
    }
    public static double rectangleArea(double x, double y){
        return x*y;
    }
    public static double rectanglePerimeter(double x,double y){
        return (x+y)*2;
    }
    public static double zoneSphere(double x,double y,double z){
        return (Math.PI * z * (3 * Math.pow(y, 2) + 3 * Math.pow(x, 2) + Math.pow(z, 2))) / 6;
    }
    public static double sphereCylinder( double z){
        return (Math.PI * Math.pow(z, 3) / 6);
    }
    public static double ungula(double x,double z){
        return (double) (2 * x * z) / 3;
    }

    public static void main(String[] args) {
       
      System.out.println(squareArea(5));
      System.out.println(squarePerimeter(7));
      System.out.println(rectangleArea(5.6, 8.8));
      System.out.println(rectanglePerimeter(7.5, 9.2));
      System.out.println(zoneSphere(3, 5, 8.2));
      System.out.println(sphereCylinder(7.7));
      System.out.println(ungula(2.2, 3.3));
       
       Random r = new Random();
      
       
       System.out.println(squareArea(r.nextDouble()));
       System.out.println(rectangleArea(r.nextDouble(),r.nextDouble() ));

       System.out.println(r.nextDouble()+" "+ r.nextDouble());


       double randomValueWithRange = 10+(100-10)*r.nextDouble();
       System.out.println(randomValueWithRange    );

       
       
       
       
       
       
       
       
       
    }
}
