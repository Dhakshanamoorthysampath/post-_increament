import java.io.IOException;
import java.io.DataInputStream;
 class AddCalcutation{

public static void main(String[] args)throws Exception{
System.out.println("enter the data");
int data = System.in.read();
System.out.println("Entre the data = "+data);

System.out.println("By using data input steram");
DataInputStream dis =new DataInputStream(System.in);
System.out.println("enter the int number a");

int a = Integer.parseInt(dis.readLine());

System.out.println("enter the int number b");
int b = Integer.parseInt(dis.readLine());
int c = a+b;
System.out.println("c is executed"+c);

}
}