public class Rectangle extends Shape {
    double Length;
    double Width;

    Rectangle(){
        // this.color = "";
        super();
        this.Length = 0;
        this.Width = 0;
    }

    Rectangle(String color, double Length, double Width) {
        // this.color = "";
        super();
        this.Length = 0;
        this.Width = 0;
    }

    @Override
    public void calculateArea() {
        double area = this.Length * this.Width;
        System.out.println("Rectangle area:" + area);

    }
}