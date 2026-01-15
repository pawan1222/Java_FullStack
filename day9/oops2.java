package day9;

public class oops2 {
    int x,y;
    public void initialize(int x,int y){
        this.x=x;
        this.y=y;
    }
    public void update(){
        this.x=4;
        this.y=5;
        this.display();
    }
    public void display(){
        System.out.println("value of x: "+x);
        System.out.println("Value of y: "+y);
    }
    public static void main(String[] args) {
        oops2 obj=new oops2();
        obj.initialize(10,20);
        obj.display();
        obj.update();
    }
}
