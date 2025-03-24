public class Square extends Shape{
    int length;

    Square(int length){
        this.length = length;
    }

    @Override
    int area(){
        return length*length;
    }

    @Override
    void display(){
        System.out.println("Area of square is: "+area());
    }
}
