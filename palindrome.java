class palindrome{
public static void main(String[] args){
int x=Integer.parseInt(args[0]);
int y=Integer.parseInt(args[1]);
int a;
a=x+y;
System.out.println("the sum is"+a);
int b,temp;
int sum=0;
temp=a;
while(a>0){
b=a%10;
sum=(sum*10)+b;
a=a/10;}
if(temp==sum){
System.out.println("the no is palindrome");}
else{
System.out.println("the no is not palindrome");}
}
}