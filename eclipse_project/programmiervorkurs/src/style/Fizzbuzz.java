package style;

public class Fizzbuzz {

// === Relevanter Code: Beginn ===
		
public static void main(String[] args) {
int i = 1;
while (i < 100) {
if (i%3==0) {
if (i%5==0) {
System.out.println("Fizzbuzz");
}else{
System.out.println("Fizz");
}}else if(i%5==0){
if(i%3==0) {
System.out.println("Fizzbuzz");
}else{
System.out.println("Buzz");
}}else{
System.out.println(i);
}
i=i+1;
}}
		
// === Relevanter Code: Ende ===
		
}
