import java.util.Scanner;

public class Pi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("How many times do you want to throw? (The more times you throw, the more accurate the estimation.)");
        int times = in.nextInt();
        int inside = 0;
        for (int i = 0; i < times; i++) {
            //Let's see the board as a 1.0*1.0 coordinate system
            double x = Math.random();
            double y = Math.random();
            double distance = Math.sqrt(x*x+y*y);
            if (distance <= 1.0){
                inside++;
            }
        }
        double A = (double)inside/(double)times;
        double pi = A*4.0;
        System.out.println(pi);
    }
}