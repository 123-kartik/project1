public class hello{
 
 	public static void main(String[] arr){

	System.out.println("Welcome To Java World ");

       for(int i=0;i<5;i++){
char c='A';
	for(int j=0;j<i;j++){
	System.out.print("  ");}
	for(int j=i;j<5;j++){
System.out.print(c+" ");
c++;
}
c-=2;
for(int j=i-1;j<3;j++){
System.out.print(c+" ");
c--;
}
System.out.println();
}
System.out.println("Kartik");
System.out.println("Murlidhar");
System.out.println("Paliwal");
}
}
