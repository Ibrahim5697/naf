class fc12{
public static void main(String[] args){
int a=0,b=0;
int n=Integer.parseInt(args[0]);     
a=n/2;    
for(int i=2;i<=a;i++){    
if(n%i==0){    
System.out.println("Number is not prime");    
b=1;    
break;    
}    
}    
if(b==0){    
System.out.println("Number is prime");} 
}
}