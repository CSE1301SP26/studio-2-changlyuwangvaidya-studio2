import java.util.Scanner;

public class Ruin {
public static void main(String[] args){

Scanner in = new Scanner(System.in);
System.out.println( "Enter your simulation day number");
    int simulationDayNumber = in.nextInt(); 
System.out.println("startAmount");
	int startAmount = in.nextInt();
System.out.println("winChance");
    //the winChance should be a double from 0.00 to 1.00
	double winChance = in.nextDouble();   
System.out.println("winLimit");
	int winLimit = in.nextInt(); 

for (int i= 1; i<= simulationDayNumber; i++){
    while (startAmount < winLimit && startAmount > 0){
    if (Math.random() <= winChance){
    startAmount++;}
    else {
        startAmount--;}
    }
if (startAmount==0){
    System.out.println("Simulation" + i + ":" + " LOSE");
}
else {
    System.out.println("Simulation" + i + ":" + " WIN");
}
}

}


}
