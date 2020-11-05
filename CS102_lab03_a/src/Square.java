public class Square extends Rectangle{

    //properties

    int theSide;

    //constructor

    public Square( int theSide ){

        super( theSide,theSide );
    }

    //methods

    public String toString(){
        return "The shape is square, its side: " + this.theSide + " Is Selected: ";
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
}
