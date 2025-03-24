public class Rectangle extends Shape {
    int length;
    int width;

    Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    int area(){
        return length*width;
    }

    @Override
    void display(){
        System.out.println("Area of rectangle is: "+area());
    }
}
