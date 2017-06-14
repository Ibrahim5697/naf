import java.util.Scanner;
class holiday{
public static void main(String[] args){
String a="sunday";
System.out.println("enter the day");
Scanner s=new Scanner(System.in);
String b=s.nextLine();
if(b.equals(a)){
System.out.println("false");}
else{
System.out.println("true");}
}
}