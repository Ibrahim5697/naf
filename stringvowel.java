import java.util.Scanner;
class stringvowel{
public static void main(String[] args){
String b;
Scanner s=new Scanner(System.in);
System.out.println("enter the string");
String a=s.nextLine();
b=a.replaceAll("[a,e,i,o,u,A,E,I,O,U]","");
System.out.println("after removed vowels"+b);
StringBuilder b1 = new StringBuilder();      
b1.append(b);
b1=b1.reverse();
for(int i=0;i<b1.length();i++)
System.out.print(b1.charAt(i));
}
}