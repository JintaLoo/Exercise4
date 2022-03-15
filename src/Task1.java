import java.util.*;
public class Task1
{
    public static void main(String[] args)
    {
        System.out.println("Calculate the area of Rectangle");
        RectangleArea ra= new RectangleArea();
        ra.getData();
        ra.computeField();
        ra.fieldDisplay();
    }
}

class RectangleArea
{
    Scanner sc = new Scanner(System.in);

    int a,b;
    int sum;
    void getData()
    {
        System.out.print("Enter Length = ");
        a=Integer.parseInt(sc.next());
        System.out.print("Enter Breadth = ");
        b=Integer.parseInt(sc.next());
    }
    void computeField()
    {
        sum=a*b;
    }
    void fieldDisplay()
    {
        System.out.println("The area of the rectangle is "+sum);
    }
}
