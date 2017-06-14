class CamelCase {
public static void main(String[] args) {
String a="ksr college of engineering";
String result = "";
char b = a.charAt(0);
result = result + Character.toUpperCase(b);
for(int i = 1; i < a.length(); i++) {
char currentChar = a.charAt(i);
char previousChar = a.charAt(i - 1);
if(previousChar == ' ') {
result = result + Character.toUpperCase(currentChar);
}
else {
result = result + currentChar;}
}
System.out.println(result);
}
}