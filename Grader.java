import java.util.*;

public class Grader {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int iter = scanner.nextInt();
        for (int i = 0; i < iter; i++ ) {
            int grade = scanner.nextInt();
            if ((grade%5)>2) {
                System.out.println((grade/5+1)*5);
            } else {
                System.out.println(grade);
            }
        }    
    }    
}