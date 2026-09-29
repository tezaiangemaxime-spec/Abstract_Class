public class Main {
    public static void main(String[] args){
        Shape s1;
        // What value can s1 hold? Reference

        // you cannot create object for abstract class
        // s1 = new Shape();
        s1 = new Circle("Black", 30.5);

        Shape s2 = new Rectangle("Gold", 20, 25);

        Shape[] shapes = new Shape[2];
        shapes[0] = s1;
        shapes[1] = s2;

        for (Shape sh: shapes) {
            // Shape sh : Shapes - tells to provide all the index values inside shapes array one by one until nothing left
            // Shape sh = s1
            // Shape sh = s2

            // invoking reference-specific calculateArea()
            // Dynamic method dispatch or Runtime polymorphism
            sh.calculateArea();
        }




  //      for (int i = 0; i<shapes.length; i++){
  //      shapes[i].calculateArea();
  //      }

  //  Can a method can be static and abstract at the same time ?
  //  Can a class be static?
  //  Can a class be static and abstract?
  //  Can a class be protected and abstract?







    }
}
