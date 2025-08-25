
public class Square implements Shape {
    private int side;
    
    public void setSide(int side) {
        this.side = side;
    }
    
    public int getSide() {
        return side;
    }
    
    public int area() {
        return side * side;
    }
}