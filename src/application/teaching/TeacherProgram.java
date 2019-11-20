package application.teaching;

import java.util.Scanner;

public class TeacherProgram {
    public static void main(String[] args) {
        System.out.println("Do you want to classify variables? (Y / N)");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        answer = answer.trim().toUpperCase();
        if (answer.equals("Y")||answer.equals("YES")){
            Classification classification = new Classification();
            while (true){
                classification.classify();
            }
        }else {
            System.exit(1);
        }
        }
    }
