class Conversion {
public static void main(String args[]){
int i = Integer.parseInt(args[0]);
int j = Integer.parseInt(args[1]);
String a = Integer.toBinaryString(i); 
String b = Integer.toBinaryString(j);
System.out.print("Binary value: "+a); 
System.out.print("\t"+b);
} 
}