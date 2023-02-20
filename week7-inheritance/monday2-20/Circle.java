public class Circle extends GeometricShape {
    float radius;

    public Circle() {
        // GeometricShape();
        //super();

        radius = 5;
        System.out.println("I created a circle!!");
    }

    public Circle(String color) {
        //System.out.println("Hi");
        super(color);
        super.color = "blue";
    }
}
