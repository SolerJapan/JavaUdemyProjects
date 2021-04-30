package udemyJava4;

public class calculator {

	public static void main(String[] args) {
		System.out.println("Thank you for using the area calculator");
        System.out.println("This calculator lets you get the area of: ");
        System.out.println("1 – Square\n2 – Rectangle\n3 – Triangle\n4 – Circle\n");

        
        //Task 5 – Call area functions.

        double square = areaSquare(2);
        double rectangle = areaRectangle(1,2);
        double triangle = areaTriangle(1,2);
        double circle = areaCircle(2); 


        //Task 7 – Call a function that prints all the areas. 
        
        printAreas(square,rectangle,triangle,circle);
        
    }

    //Task 1 - Write a function that calculates the area of a square. 

    public static double areaSquare(double side1) {
	
		double area = side1 * side1;
		
		if(area < 0)
		{
			System.out.println("Error: impossible");
			System.exit(0);
		}
		
			return area;
		
	}


    public static double areaRectangle(double length, double width) {

    	double area = (length * width);
    	
    	if(area < 0)
		{
			System.out.println("Error: impossible");
			System.exit(0);
		}
		
			return area;
		
    } 

    //Task 3 - Write a function that calculates the area of a triangle. 

    public static double areaTriangle(double base, double height) {

    	double area = (base * height)/2;
    	
    	if(area < 0)
		{
			System.out.println("Error: impossible");
			System.exit(0);
		}
		
			return area;
		
      
    }

    //Task 4 - Write a function that calculates the area of circle. 


    public static double areaCircle(double radius) {

    	double area = (radius * 3.14);
    	
    	if(area < 0)
		{
			System.out.println("Error: impossible");
			System.exit(0);
		}
	
			return area;
		
    }



    //Task 6: Write a function that prints every area.

    public static void printAreas(double squ, double rect, double tri, double cir)
	{
		System.out.println("Square area: "  + squ );
		System.out.println("Rectangle area: "  + rect );
		System.out.println("Triangle area: "  + tri );
		System.out.println("Circle area: "  + cir );
	}
   
   

}


