public class Circle {
    public double radius;
    private String colour;

    public Circle(){
        this.radius = 1.0;
        this.colour = "red";
    }
    public Circle(double r){
        this.radius = r;
        colour = "red";
    }
    public Circle(double r, String c){
        this.radius = r;
        this.colour = c;
    }

    public double getRadius(){
        return radius;
    }
    public double getArea(){
        return radius*radius*Math.PI;
    }
    public String getColor(){
        return colour;
    }

    public void setRadius(double newRadius){
        radius = newRadius;
    }
    public void setColor(String newColour){
        colour = newColour;
    }

}
