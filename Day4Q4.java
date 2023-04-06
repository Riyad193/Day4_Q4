// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5}; // إنشاء مصفوفة من الأرقام
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to check: ");
        int check = input.nextInt(); // تخزين العدد الذي يود المستخدم التحقق من وجوده في المصفوفة
        boolean found = false; // تعيين متغير للتحقق من وجود العدد في المصفوفة
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == check) { // التحقق من وجود العدد في المصفوفة
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println(check + " is found in the array.");
        } else {
            System.out.println(check + " is not found in the array.");
        }
    }
}