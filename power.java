class power{
public static void main(String[] args){
int a=Integer.parseInt(args[0]);
int b=Integer.parseInt(args[1]);
int result=1;
for(int i=1;i<=b;i++){
result=result*a;}
System.out.println(a+"^"+b+"="+result);
}
}