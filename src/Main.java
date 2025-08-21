//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Задача 1");
        int[] paymentAmount = {1000, 2000, 3000, 4000, 5000};
        int sum = 0;
        for (int i = 0; i < paymentAmount.length; i++) {
            sum += paymentAmount[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей.");

        System.out.println("Задача 2");
        int[] weeklyExpenses = {1000, 1200, 1450, 1500, 1700};
        int min = weeklyExpenses[0];
        int max = weeklyExpenses[0];
        for (int expenses : weeklyExpenses){
            if (expenses < min){
                min = expenses;
            }
            if (expenses > max){
                max = expenses;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + min + " рублей.");
        System.out.println("Максимальная сумма трат за неделю составила " + max + " рублей.");

        System.out.println("Задача 3");
        int[] monthlyExpenses = {7500, 9000, 11000, 12500, 14000};
        int sumM = 0;
        for (int expensesM : monthlyExpenses){
            sumM += expensesM;
        }
        int weeks = monthlyExpenses.length;
        double average = (double) sumM / weeks;
        System.out.printf("Средняя сумма трат за месяц составила %.2f рублей.%n", average);

        System.out.println("Задача 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }







    }
}