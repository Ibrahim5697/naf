class fc18{
public static void main(String[] args){
int a=Integer.parseInt(args[0]);
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