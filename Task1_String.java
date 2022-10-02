package Task.House.Task3;



/**
 * Задание 1
 * Дана строка.
 * Удалить из нее все повторяющиеся символы без учета регистра, если они идут друг за другом. Также удалить пробелы.
 * Результат привести к верхнему регистру.
 * <p>
 * Например:
 * "abc Cpddd Dio OsfWw" -> "ABCPDIOSFW"
 */
public class Task1_String {


    public static void main(String[] args) {
        String value = "abc Cpddd Dio OsfWw";
        String result = fillWithOutProbels(value);
        String result1 = fillWithOutRepeats(result);
        System.out.println("abc Cpddd Dio OsfWw" + " -> " + result1);

    }

    //    public static String fillWithOutRepeats(String value) {
//        return value.replace(" ", "")
//                .toLowerCase().replaceAll("([a-z])\\1+", "$1")
//                .toUpperCase();
//    }
//
    public static String fillWithOutProbels(String value) {
        return value.replace(" ", "").toUpperCase();

    }

    public static String fillWithOutRepeats(String value) {
        String result = "";
        for (int i = 0; i < value.length(); i++) {
            if (i + 1 < value.length() && value.charAt(i) != value.charAt(i + 1)) {
                result += value.charAt(i);
            }
            if (i + 1 == value.length()) {
                result += value.charAt(i);
            }
        }
        return result;
    }
}
