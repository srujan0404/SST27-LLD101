
public class Demo05 {
    static int areaAfterResize(Rectangle r) {
        r.setWidth(5); 
        r.setHeight(4); 
        return r.area();
    }
    
    static int squareAreaAfterResize(Square s) {
        s.setSide(4);
        return s.area();
    }
    
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(areaAfterResize(rectangle)); // 20
        
        Square square = new Square();
        System.out.println(squareAreaAfterResize(square)); // 16
    }
}
