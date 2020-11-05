public class Rectangle extends Shape implements Selectable{

    //properties


    int width;
    int height;
    boolean selected;

    public Rectangle ( int width, int height ){

        this.width = width;
        this.height = height;
}
    public double getArea(){
        return( width * height );
    }
    public String toString(){
        return "The shape is rectangle, its width : " + this.width + " and its height:  " + this.height + " Is Selected: " ;
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

    public void setSelected( boolean sel ){
        selected = sel;
    }

    public Shape contains( int x, int y ){
        if( x >= this.x - width / 2 && x <= this.x + width / 2 && y >= this.y - height / 2 && y <= this.y + height / 2 )
            return this;
        return null;
    }
}
