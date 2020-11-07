package my.prwe.oo;

//work
public class Circle {
    private float radius;//圆的半径


    private float height;

    public Circle(float radius) {
        this.radius = radius;
    }

    public Circle(float radius, float height) {
        this.radius = radius;
        this.height = height;
    }

    public double getArea(float radius){
        return 3.14 * radius * radius;
    }

    public double getPerimeter(float radius){
        return 2 * 3.14 * radius;
    }

    public double getVolume(float height,float radius){
        return getArea(radius) * height;
    }

    public void show(){
        System.out.println(getArea(radius)+"   "+getPerimeter(radius)+"   "+getVolume(height,radius));
    }

    public static void main(String[] args) {
        Circle c = new Circle((float) 2.0, (float) 2.0);
        c.show();
    }
}
