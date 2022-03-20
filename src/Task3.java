import java.io.*;

public class Task3
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Conversion C=new Conversion();
        String choose;
        int system = 0;
        do {
            System.out.println("");
            System.out.println("----------------------------------------------");
            System.out.println("Choose what operation :");
            System.out.println("A. Convert from any system to decimal number");
            System.out.println("B. Convert decimal number to any system");
            System.out.println("C. Addition numbers of any system");
            System.out.println("D. Subtracting numbers of any system");
            System.out.println("E. Multiplication numbers of any system");
            System.out.println("F. Dividing numbers of any system");
            System.out.println("");
            System.out.println("W. Exit the program");
            System.out.print("Enter Operation = ");
            choose = br.readLine();
            if(choose.equals("A"))
            {
                System.out.print("Enter Number from any system = ");
                C.a = br.readLine();
                C.Information();
                System.out.print("What system the number is = ");
                system=Integer.parseInt(br.readLine());
                int i = Integer.parseInt(C.ConvertToDecimal(system));
                System.out.println("Result = " +i);
            }
            if (choose.equals("B"))
            {
                System.out.print("Enter Decimal Number = ");
                C.a = br.readLine();
                C.Information();
                System.out.print("Enter System number = ");
                system= Integer.parseInt(br.readLine());
                String i = C.ConvertToSystem(system);
                System.out.println("Result = " +i);
                }

            if (choose.equals("C"))
            {
                int a = 0,b=0,ans;
                String result;
                C.Information();
                ans= Integer.parseInt(C.Input1(a))+Integer.parseInt(C.Input2(b));
                C.Answer(String.valueOf(ans));
                System.out.println("Result = "+C.a);
            }

            if (choose.equals("D"))
            {
                int a = 0,b=0,ans;
                C.Information();
                ans= Integer.parseInt(C.Input1(a))-Integer.parseInt(C.Input2(b));
                C.Answer(String.valueOf(ans));
                System.out.println("Result = "+C.a);
            }

            if (choose.equals("E"))
            {
                int a = 0,b=0,ans;
                C.Information();
                ans= Integer.parseInt(C.Input1(a))*Integer.parseInt(C.Input2(b));
                C.Answer(String.valueOf(ans));
                System.out.println("Result = "+C.a);
            }
            if (choose.equals("F"))
            {
                int a = 0,b=0,ans;
                C.Information();
                ans= Integer.parseInt(C.Input1(a))/Integer.parseInt(C.Input2(b));
                C.Answer(String.valueOf(ans));
                System.out.println("Result = "+C.a);
            }

        }while (!choose.equals("W")) ;

    }
}

class Conversion
{
    public String a;
    public String First,Second;
    void Information()
    {
        System.out.println("--------------------------------");
        System.out.println("Number System");
        System.out.println("Enter 2 for Binary Number");
        System.out.println("Enter 3 for Ternary Number");
        System.out.println("Enter 4 for Quaternary Number");
        System.out.println("Enter 5 for Quinary Number");
        System.out.println("Enter 6 for Senary Number");
        System.out.println("Enter 7 for Septenary Number");
        System.out.println("Enter 8 for Octal Number");
        System.out.println("Enter 9 for Nonary Number");
        System.out.println("Enter 10 for Decimal number");
        System.out.println("Enter 16 for Hexadecimal number");
        System.out.println("--------------------------------");
    }

    String ConvertToDecimal(int system)
    {
        switch (system)
        {
            case (2):
                a= String.valueOf(Integer.parseInt(a, 2));
                break;
            case (3):
                a= String.valueOf(Integer.parseInt(a, 3));
                break;
            case (4):
                a= String.valueOf(Integer.parseInt(a, 4));
                break;
            case (5):
                a= String.valueOf(Integer.parseInt(a, 5));
                break;
            case (6):
                a= String.valueOf(Integer.parseInt(a, 6));
                break;
            case (7):
                a= String.valueOf(Integer.parseInt(a, 7));
                break;
            case (8):
                a= String.valueOf(Integer.parseInt(a, 8));
                break;
            case (9):
                a= String.valueOf(Integer.parseInt(a, 9));
                break;
            case (10):
                a=a;
                break;
            case (16):
                a= String.valueOf(Integer.parseInt(a, 16));
            break;
        }
        return a;
    }

    String ConvertToSystem(int system)
    {
        int i= Integer.parseInt(a);
        int ans=0,factor=1;
        switch (system)
        {
            case (2):
                a= Integer.toBinaryString(Integer.parseInt(a));
                break;
            case (3):

                while(i>0)
                {
                    ans+=i%3*factor;
                    i/=3;
                    factor*=10;
                }
                a= String.valueOf(ans);
                break;
            case (4):
                while(i>0)
                {
                    ans+=i%4*factor;
                    i/=4;
                    factor*=10;
                }
                a= String.valueOf(ans);
                break;
            case (5):
                while(i>0)
                {
                    ans+=i%5*factor;
                    i/=5;
                    factor*=10;
                }
                a= String.valueOf(ans);
                break;
            case (6):
                while(i>0)
                {
                    ans+=i%6*factor;
                    i/=6;
                    factor*=10;
                }
                a= String.valueOf(ans);
                break;
            case (7):
                while(i>0)
                {
                    ans+=i%7*factor;
                    i/=7;
                    factor*=10;
                }
                a= String.valueOf(ans);
                break;
            case (8):
                a= Integer.toOctalString(Integer.parseInt(a));
                break;
            case (9):
                while(i>0)
                {
                    ans+=i%9*factor;
                    i/=9;
                    factor*=10;
                }
                a= String.valueOf(ans);
                break;
            case (10):
            {
                a=a;
            }
            case (16):
                a=Integer.toHexString(Integer.parseInt(a));
                break;
        }
        return a;
    }

    String Input1(int A) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter First number = ");
        First=br.readLine();
        System.out.print("Enter the system of the number = ");
        int system = Integer.parseInt(br.readLine());
        a=First;
        a=ConvertToDecimal(system);
        return a;
    }

    String Input2(int B) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter Second number = ");
        Second=br.readLine();
        System.out.print("Enter the system of the number = ");
        int system = Integer.parseInt(br.readLine());
        a=Second;
        a=ConvertToDecimal(system);
        return a;
    }

    String Answer(String ans) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter System Number will be display = ");
        int system=Integer.parseInt(br.readLine());
        a= String.valueOf(ans);
        a=ConvertToSystem(system);
        return a;
    }
}
