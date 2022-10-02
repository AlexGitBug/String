package Task.House.Task3;

import java.util.Arrays;

/**
 * Задание 2
 * Дана строка с текстом, в котором есть цифры от 0 до 9.
 * Написать 2 метода:
 * - возвращающий массив цифр из переданной строки
 * - возвращающий сумму цифр из переданного целочисленного массива
 * Посчитать сумму всех чисел из строки
 * Например:
 * “Привет 8, как 1 2 твои дела? Может4, сделать 3 дело?” -> 18 (8+1+2+4+3)
 */
public class Task2_String {
    public static void main(String[] args) {
        String value = "Привет 8, 7, как 1 2 твои дела? Может4, сделать 3 дело?";
        int count = count(value);
        String[] result = fillArrayOfNumbers(value, count);
        System.out.println(Arrays.toString(result));
        int findSum = sumArray(result);
        System.out.println("Cумма чисел из массива = " + findSum);
    }

    public static String[] fillArrayOfNumbers (String value, int count) {
        int counter = 0;
        String [] result = new String[count];
        for (int i = 0; i < value.length(); i++) {
            if(value.charAt(i) == '0' || value.charAt(i) == '1' || value.charAt(i) == '2' ||
                    value.charAt(i) == '3' || value.charAt(i) == '4' || value.charAt(i) == '5' ||
                    value.charAt(i) == '6' || value.charAt(i) == '7' || value.charAt(i) == '8' ||
                    value.charAt(i) == '9') {

                result[counter] = String.valueOf(value.charAt(i));
                counter++;
            }
        }
        return result;
    }

    public static int count(String value) {
        String replace = value.replace("0", "")
                .replace("1", "")
                .replace("2", "")
                .replace("3", "")
                .replace("4", "")
                .replace("5", "")
                .replace("6", "")
                .replace("7", "")
                .replace("8", "")
                .replace("9", "");

        return value.length() - replace.length();
    }

    public static int sumArray(String [] result) {
        int sum = 0;
      for (int i = 0; i < result.length; i++) {
            sum += Integer.parseInt(result[i]);
        }
        return sum;
    }
}
