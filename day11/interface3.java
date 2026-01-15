package day11;


interface Resizable{
    public void resizeWidth(int width);
    public void resizeHeight(int width);
}


class Rectangle implements Resizable{
    private int width;
    private int height;

    public int getwidth(){
        return width;
    }
    public int getheight(){
        return height;
    }

    public void setwidth(int width){
        this.width=width;
    }
    public void setheight(int height){
        this.height=height;
    }

    @Override
    public void resizeWidth(int width){
        this.width=width;
    }

    @Override
    public void resizeHeight(int height){
        this.height=height;
    }

    public void display(){
        System.out.println("Dimention: Height-> "+height+" width-> "+width);
    } 
} 


public class interface3 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.setheight(25);
        r.setwidth(23);

        r.display();

        r.resizeHeight(28);
        r.resizeWidth(80);

        r.display();
    }
}
