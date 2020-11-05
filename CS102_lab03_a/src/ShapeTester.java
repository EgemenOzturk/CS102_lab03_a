import java.util.Scanner;

public class ShapeTester{

    public static void menu(){

        System.out.println(" -----------------------------------------");
        System.out.println(" 1.Create an empty set of shapes: ");
        System.out.println(" 2.Add a Shape: ");
        System.out.println(" 3.Compute & Show Area: ");
        System.out.println(" 4.Find the Shape that contains given x,y: ");
        System.out.println(" 5.Remove All Selected Shapes from the set: ");
        System.out.println(" 6.Quit. ");
        System.out.println(" -----------------------------------------");
    }

    public static void shapeMenu(){

        System.out.println(" -----------------------------------------");
        System.out.println(" 1.Create a shape of a Rectangle or Square: ");
        System.out.println(" 2.Create a shape of a Circle: ");
        System.out.println(" 3.Back to main Menu. ");
        System.out.println(" -----------------------------------------");
    }

    public static void main(String[] args){

        //Variables

        int selection;
        int shapeSelection;
        Scanner scan       = new Scanner( System.in );
        Scanner shapeScan = new Scanner( System.in );
        ShapeContainer set = new ShapeContainer();

        //Menu

        do{
            menu();

            System.out.println( "Please Select: " );
            selection = scan.nextInt();

            if( selection == 1 ){
                set = new ShapeContainer();
            }

            else if( selection == 2 ){

                do{
                    shapeMenu();
                    System.out.println( "Please Select: " );
                    shapeSelection = scan.nextInt();

                    if( shapeSelection == 1 ){
                        System.out.print( "Enter height:" );
                        int height = shapeScan.nextInt();
                        System.out.println( "Enter width: ( Enter same value with the height if you want a square )" );
                        int width = shapeScan.nextInt();
                        Rectangle shape1 = new Rectangle( width, height );
                        System.out.println(" Enter position x: ");
                        int x = shapeScan.nextInt();
                        System.out.println(" Enter position y: ");
                        int y = shapeScan.nextInt();
                        shape1.setLocation( x,y );
                        set.add(shape1);
                    }

                    else if( shapeSelection == 2 ){
                        System.out.print( "Enter radius:" );
                        int radius = shapeScan.nextInt();
                        Circle shape2 = new Circle( radius );
                        System.out.println(" Enter position x: ");
                        int x = shapeScan.nextInt();
                        System.out.println(" Enter position y: ");
                        int y = shapeScan.nextInt();
                        shape2.setLocation( x,y );
                        set.add(shape2);
                    }

                }while( shapeSelection!= 3 );

            }

            else if ( selection == 3 ){
                System.out.println("Total Area is: " + set.getArea());
            }

            else if( selection == 4 ){
                System.out.println("Enter x:");
                int x = shapeScan.nextInt();
                System.out.println("Enter y:");
                int y = shapeScan.nextInt();

                set.findFirstShape( x,y );
            }

            else if( selection ==5 ){
                set.removeSelectedShapes();
            }

        }while( selection!= 6 );

        System.out.println(" Goodbye!! :) ");
    }
}
