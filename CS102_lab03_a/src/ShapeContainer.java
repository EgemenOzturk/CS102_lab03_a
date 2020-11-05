import java.util.ArrayList;

public class ShapeContainer{

//properties

    ArrayList<Shape> container;

//constructors

    public ShapeContainer(){

        container = new ArrayList<>();
    }

//methods

    public void add( Shape shape ){
        container.add(shape);
    }

    public double getArea(){
        double area = 0;
        for( int a = 0; a < this.container.size(); a++ ){
            area = area + (this.container.get(a)).getArea();
        }
        return area;
    }

    public String toString(){

        String returnString = "";
        for( int a = 0; a < this.container.size(); a++ ){
            returnString = returnString + (this.container.get(a)).toString();
        }
        return returnString;
    }

    public void findFirstShape( int x, int y ){
        int a = 0;

        if( container.size() > 0 ){
            while ( a < container.size() && (((Selectable)container.get(a)).contains(x,y))==null ){
                a++;
            }

            if( a < container.size() && container.get(a)!= null && ((Selectable)container.get(a)).contains(x,y) != null ){
                System.out.println(container.get(a).toString());
                ((Selectable)container.get(a)).setSelected(true);
                System.out.println( "Making it selected: " );
                System.out.println(container.get(a).toString());
            }
            else
                System.out.println(" There are no shapes that contain this (x,y) ");
        }
        else
            System.out.println(" There are no shapes in container ");
    }

    public void removeSelectedShapes(){
        ArrayList<Shape> newContainer = new ArrayList<>();

        for( int a = 0; a < container.size(); a++ ){
            if( container.get(a) instanceof Selectable && !((Selectable)container.get( a )).getSelected() )
                newContainer.add(container.get(a));
        }
        this.container = newContainer;
    }
}