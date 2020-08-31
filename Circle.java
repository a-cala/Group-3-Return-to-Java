public class Circle {
    private int radius;
    private int centerX;
    private int centerY;

    public Circle(){
        this.centerX = 0;
        this.centerY = 0;
        this.radius = 1;
    }
    public Circle (int radius, int centerX, int centerY){
        this.radius = radius;
        this.centerX = centerX;
        this.centerY = centerY;
    }

    public void SetCenterX(int CenterX) {
        this.centerX = CenterX;
    }
    public void SetCenterY(int CenterY) {
        this.centerY = CenterY;
    }
    public void SetRadius(int radius) {
        this.radius = radius;
    }

    public int GetCenterX(){
        return centerX;
    }
    public int GetCenterY(){
        return centerY;
    }
    public int GetRadius(){
        return radius;
    }

    public void ComputeArea(){
        System.out.println("Center: (" + GetCenterX() + ", " + GetCenterY()+ ") " + "   Radius: " + GetRadius());
        System.out.println("Area: " + (3.14*radius*radius));
    }
}