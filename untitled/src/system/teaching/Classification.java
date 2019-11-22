package system.teaching;

import java.util.Scanner;

public class Classification {
    char first = 0;
    char second = 0;
    char third = 0;
    char fourth = 0;
    char fifth = 0;

    void classify(){
        System.out.println("\nPlease introduce a variable:");
        Scanner input = new Scanner(System.in);
        String answer = input.nextLine();
        System.out.println("The length of the input is: " + answer.length());
        answer = answer.trim();
        if (!checkIfBoolean(answer)){
            checkIfChar(answer);
            checkIfInteger(answer);
            checkIfByte(answer);
            checkIfLong(answer);
        }
    }

    private void checkIfInteger(String data) {
        //Check characters
        checkChar(data);
        //Evaluates if it is an integer
        if (data.length() < 10 && first != '-') {
            System.out.println("This can be an integer");
        }
        else if (data.length() < 10 && first == '-') {
            System.out.println("This can be a negative integer");
        }
        //Evaluates if it is an integer
        if (data.length() == 10 && first != '-') {
            boolean isInteger = true;
            if (first != '1' && first != '2') {
                isInteger = false;
            }
            if (second != '1' && second != '0') {
                isInteger = false;
            }
            if (third != '1' && third != '2' && third != '3' && third != '4' && third != '0') {
                isInteger = false;
            }
            if (isInteger) {
                System.out.println("This can be an integer");
            }
        }
        if (data.length() == 11) {
            boolean isInteger = true;
            if (first != '-') {
                isInteger = false;
            }
            if (second != '1' && second != '2') {
                isInteger = false;
            }
            if (third != '1') {
                isInteger = false;
            }
            if (fourth != '4' && fourth != '3' && fourth != '2' && fourth != '1' && fourth != '0') {
                isInteger = false;
            }
            if (isInteger) {
                System.out.println("This can be a Negative Integer");
            }
        }
    }

    private void checkIfLong(String data) {
        checkChar(data);
        if(data.length() < 19 && first != '-'){
            System.out.println("This can be a long");
        }
        else if (data.length() < 19 && first == '-'){
            System.out.println("This can be a negative long");
        }
        if (data.length() == 19 && first != '-'){
            boolean isLong = true;
            if (first == '-') {
                isLong = false;
            }
            if (second != '2' && second != '1' && second != '0') {
                isLong = false;
            }
            if (third != '2' && third != '1'&& third != '0') {
                isLong = false;
            }
            if (fourth != '3' && fourth != '2' && fourth != '1' && fourth != '0') {
                isLong = false;
            }
            if (isLong) {
                System.out.println("This can be a long");
            }
        }
        if (data.length() == 20){
            boolean isLong = true;
            if (first != '-'){
                isLong = false;
            }
            if (third != '2' && third != '1' && third != '0') {
                    isLong = false;
            }
            if (fourth != '2' && fourth != '1' && fourth != '0') {
                        isLong = false;
            }
            if (fifth != '3' && fifth != '2' && fifth != '1' && fifth != '0') {
                         isLong = false;
            }
            if (isLong) {
                System.out.println("This can be a Negative Long");
            }
        }
    }

    private void checkIfByte(String data) {
        //Evaluates if it is a byte
        if (data.length() < 3) {
            System.out.println("This can be a byte");
        }
        checkChar(data);
        if (data.length() == 3) {
            //Evaluates if it is a + byte
            if (data.length() == 3){
                boolean isByte = true;
                boolean Third = third != '7' && third != '6' && third != '5' && third != '4' && third != '3' && third != '2' && third != '1' && third != '0';
                if (first != '1'){
                    isByte = false;
                }
                if (second != '1' && second != '0' && second != '2') {
                    isByte = false;
                }
                if (Third) {
                    isByte = false;
                }
                if(isByte){
                    System.out.println("This can be a byte");
                }
            }
        }
    }


    private void checkIfChar(String data){
        if (data.length() == 1) {
            System.out.println("This is a char");
        }
        if (data.length() < 5){
            System.out.println("This can be a char");
        }else if (data.length() == 5){
            long maxChar = 65535;
            if(isCharInRange(maxChar, 5, data)){
                System.out.println("This can be a char");
            }
        }
    }

    private boolean checkIfBoolean(String data){
        boolean isBoolean = true;
        if (data.length() == 4 && data.equals("true")) {
            System.out.println("This is a boolean");
        } else if (data.length() == 5 && data.equals("false")) {
            System.out.println("This is a boolean");
        }else{
            isBoolean = false;
        }
        return isBoolean;
    }

    /*public static void main(String[] args) {
    }*/

     private boolean isCharInRange(long maxValue, int dataLength, String data){
         boolean isRange = true;
         for (int i = dataLength; i > 0 && isRange; i--){
             int limit = (int) (maxValue/simplePower(10, i-1));
             limit = limit % 10;
             int current = data.charAt(dataLength-i);
             isRange = !(48 > current  || current > 48+limit);
         }
         return isRange;
     }

     private long simplePower(long input, int power){
         if (power < 1){
             return 1;
         }
         long result = input;
         for (int i = 1; i < power; i++){
             result *= input;
         }
         return result;
     }

    private void checkChar(String data) {

        if (data.length() == 1){
            first = data.charAt(0);
        }
        else if (data.length() == 2){
            first = data.charAt(0);
            second = data.charAt(1);
        }
        else if (data.length() == 3){
            first = data.charAt(0);
            second = data.charAt(1);
            third = data.charAt(2);
        }
        else if (data.length() == 4){
            first = data.charAt(0);
            second = data.charAt(1);
            third = data.charAt(2);
            fourth = data.charAt(3);
        }
        else{
            first = data.charAt(0);
            second = data.charAt(1);
            third = data.charAt(2);
            fourth = data.charAt(3);
            fifth = data.charAt(4);
        }
    }

}

