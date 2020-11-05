public class Circle extends Shape implements Selectable{

    //properties

    private double radius;
    boolean selected;

    //constructor

    public Circle(){
    radius = 1.0;
}
    public Circle ( double r ){
    radius = r;
    }

    //methods

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return (radius * radius * Math.PI);
    }

    public String toString(){
        return "Circle, Radius: " + this.radius + " Is Selected: ";
    }

    public void setLocation( int x, int y ){
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }

    public boolean getSelected(){
        return selected;
    }

    public void setSelected( boolean selection ){
        selected = selection;
    }

    public Shape contains( int x, int y ){
        if( Math.pow((this.getX() - x), 2) + Math.pow((this.getY() - y), 2) <= Math.pow(this.radius , 2) )
            return this;

        return null;
    }

}