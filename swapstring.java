class swapstring{
public static void main(String[] args){
String a="IBRAHIM";
char[] b=a.toCharArray();
for(int i=0;i<b.length;i++){
if(i%2==0){
if((i+1)<b.length){
System.out.print(b[i+1]);}
System.out.print(b[i]);}
}
}
}