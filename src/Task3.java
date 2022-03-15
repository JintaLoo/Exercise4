import java.io.*;

public class Task3 {
    public static void main(String[] args) throws IOException {
        String choose;
        String FirstNum, SecondNum;
        int system1, system2, system3, temp;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Detail d = new Detail();
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

            if (choose.equals("A")) {
                System.out.println("Enter Number from any system = ");
                FirstNum = br.readLine();
                d.Information();
                System.out.print("What system the number is = ");
                system1 = Integer.parseInt(br.readLine());
                if (system1 == 2) {
                    temp = d.BinaryToDecimal(Integer.parseInt(FirstNum));
                    System.out.println("Result = " + temp);
                } else if (system1 == 10) {
                    System.out.println("It is already Decimal number");
                } else if (system1 == 16) {
                    temp = d.HexToDecimal(FirstNum);
                    System.out.println("Result = " + temp);
                }
            }
            if (choose.equals("B")) {
                System.out.print("Enter Decimal Number = ");
                FirstNum = br.readLine();
                d.Information();
                System.out.print("Enter System number = ");
                system1 = Integer.parseInt(br.readLine());
                if (system1 == 2) {
                    temp = Integer.parseInt(d.DecimalToBinary(FirstNum));
                    System.out.println("Result = " + temp);
                } else if (system1 == 10) {
                    System.out.println("It is already Decimal number");
                } else if (system1 == 16) {
                    String tem = d.DecimalToHexa(FirstNum);
                    System.out.println("Result = " + tem);
                }

            }
            if (choose.equals("C")) {
                int a = 0, b = 0;
                d.Information();
                System.out.print("Enter First number = ");
                FirstNum = br.readLine();
                System.out.print("Enter the system of the number = ");
                system1 = Integer.parseInt(br.readLine());
                if (system1 == 2) {
                    a = d.BinaryToDecimal(Integer.parseInt(FirstNum));
                } else if (system1 == 10) {
                    a = Integer.parseInt(FirstNum);
                } else if (system1 == 16) {
                    a = d.HexToDecimal(FirstNum);
                }
                System.out.print("Enter Second Number = ");
                SecondNum = br.readLine();
                System.out.print("Enter the system of the number = ");
                system2 = Integer.parseInt(br.readLine());
                if (system2 == 2) {
                    b = d.BinaryToDecimal(Integer.parseInt(SecondNum));
                } else if (system2 == 10) {
                    b = Integer.parseInt(SecondNum);
                } else if (system2 == 16) {
                    b = d.HexToDecimal(SecondNum);
                }
                int sum = a + b;
                System.out.print("Enter System Number will be display = ");
                system3 = Integer.parseInt(br.readLine());
                if (system3 == 2) {
                    temp = Integer.parseInt(d.DecimalToBinary(String.valueOf(sum)));
                    System.out.println("Result = " + temp);
                } else if (system3 == 10) {
                    System.out.println("Result = " + sum);
                } else if (system3 == 16) {
                    String tem = d.DecimalToHexa(String.valueOf(sum));
                    System.out.println("Result = " + tem);
                }
            }
            if (choose.equals("D")) {
                int a = 0, b = 0;
                d.Information();
                System.out.print("Enter First number = ");
                FirstNum = br.readLine();
                System.out.print("Enter the system of the number = ");
                system1 = Integer.parseInt(br.readLine());
                if (system1 == 2) {
                    a = d.BinaryToDecimal(Integer.parseInt(FirstNum));
                } else if (system1 == 10) {
                    a = Integer.parseInt(FirstNum);
                } else if (system1 == 16) {
                    a = d.HexToDecimal(FirstNum);
                }
                System.out.print("Enter Second Number = ");
                SecondNum = br.readLine();
                System.out.print("Enter the system of the number = ");
                system2 = Integer.parseInt(br.readLine());
                if (system2 == 2) {
                    b = d.BinaryToDecimal(Integer.parseInt(SecondNum));
                } else if (system2 == 10) {
                    b = Integer.parseInt(SecondNum);
                } else if (system2 == 16) {
                    b = d.HexToDecimal(SecondNum);
                }
                int sum = a - b;
                System.out.print("Enter System Number will be display = ");
                system3 = Integer.parseInt(br.readLine());
                if (system3 == 2) {
                    temp = Integer.parseInt(d.DecimalToBinary(String.valueOf(sum)));
                    System.out.println("Result = " + temp);
                } else if (system3 == 10) {
                    System.out.println("Result = " + sum);
                } else if (system3 == 16) {
                    String tem = d.DecimalToHexa(String.valueOf(sum));
                    System.out.println("Result = " + tem);
                }
            }
            if (choose.equals("E")) {
                int a = 0, b = 0;
                d.Information();
                System.out.print("Enter First number = ");
                FirstNum = br.readLine();
                System.out.print("Enter the system of the number = ");
                system1 = Integer.parseInt(br.readLine());
                if (system1 == 2) {
                    a = d.BinaryToDecimal(Integer.parseInt(FirstNum));
                } else if (system1 == 10) {
                    a = Integer.parseInt(FirstNum);
                } else if (system1 == 16) {
                    a = d.HexToDecimal(FirstNum);
                }
                System.out.print("Enter Second Number = ");
                SecondNum = br.readLine();
                System.out.print("Enter the system of the number = ");
                system2 = Integer.parseInt(br.readLine());
                if (system2 == 2) {
                    b = d.BinaryToDecimal(Integer.parseInt(SecondNum));
                } else if (system2 == 10) {
                    b = Integer.parseInt(SecondNum);
                } else if (system2 == 16) {
                    b = d.HexToDecimal(SecondNum);
                }
                int sum = a * b;
                System.out.print("Enter System Number will be display = ");
                system3 = Integer.parseInt(br.readLine());
                if (system3 == 2) {
                    temp = Integer.parseInt(d.DecimalToBinary(String.valueOf(sum)));
                    System.out.println("Result = " + temp);
                } else if (system3 == 10) {
                    System.out.println("Result = " + sum);
                } else if (system3 == 16) {
                    String tem = d.DecimalToHexa(String.valueOf(sum));
                    System.out.println("Result = " + tem);
                }
            }
            if (choose.equals("F")) {
                int a = 0, b = 0;
                d.Information();
                System.out.print("Enter First number = ");
                FirstNum = br.readLine();
                System.out.print("Enter the system of the number = ");
                system1 = Integer.parseInt(br.readLine());
                if (system1 == 2) {
                    a = d.BinaryToDecimal(Integer.parseInt(FirstNum));
                }else if(system1==10){
                    a=Integer.parseInt(FirstNum);
                }
                else if (system1 == 16) {
                    a = d.HexToDecimal(FirstNum);
                }
                System.out.print("Enter Second Number = ");
                SecondNum = br.readLine();
                System.out.print("Enter the system of the number = ");
                system2 = Integer.parseInt(br.readLine());
                if (system2 == 2) {
                    b = d.BinaryToDecimal(Integer.parseInt(SecondNum));
                }else if(system2==10){
                    b=Integer.parseInt(SecondNum);}
                else if (system2 == 16) {
                    b = d.HexToDecimal(SecondNum);
                }
                int sum = a / b;
                System.out.print("Enter System Number will be display = ");
                system3=Integer.parseInt(br.readLine());
                if(system3==2){
                    temp = Integer.parseInt(d.DecimalToBinary(String.valueOf(sum)));
                    System.out.println("Result = " + temp);}
                else if(system3==10) {
                    System.out.println("Result = "+sum);
                }
                else if(system3==16) {
                    String tem = d.DecimalToHexa(String.valueOf(sum));
                    System.out.println("Result = " + tem);
                }
            }
        }
        while (!choose.equals("W")) ;
    }
}

class Detail
{
    void Information()
    {
        System.out.println("--------------------------------");
        System.out.println("Number System");
        System.out.println("Enter 2 for Binary Number");
        System.out.println("Enter 10 for Decimal number");
        System.out.println("Enter 16 for Hexadecimal number");
        System.out.println("--------------------------------");
    }

    int BinaryToDecimal(int FirstNum)
    {
        int a=Integer.parseInt(String.valueOf(FirstNum), 2);
        return a;
    }
    int HexToDecimal(String FirstNum)
    {
        int a=Integer.parseInt(FirstNum,16);
        return a;
    }
    String DecimalToBinary(String FirstNum)
    {
        String a = Integer.toBinaryString(Integer.parseInt(FirstNum));
        return a;
    }
    String DecimalToHexa(String FirstNum)
    {
        String a=Integer.toHexString(Integer.parseInt(FirstNum));
        return a;
    }
}