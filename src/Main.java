import java.util.Collections;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        //Напишите программу, где пользователь вводит сначала количество строк n, затем сами строки.
        // Среди данных строк найти строку с максимальным количеством различных символов.
        // Если таких строк будет много, то вывести первую.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество строк: ");
        int n = scanner.nextInt();
        String str = null;
        for (int i = 1; i <= n; i++){
            System.out.print("Строка " + i + ": ");
            str = scanner.next();
            System.out.println(uniq_count(str));
        }
        assert str != null;
        if (uniq_count(str) == str.length()){
            System.out.println(str);
        }
    }
    static int uniq_count(String str) {
        String[]simbols = str.split("");
        int count = 0;
        for (int j = 0; j < simbols.length; j++) {
            String ThisChar = simbols[j];
            boolean seenThisThisCharBefore = false;
            for (int i = 0; i < j; i++) {
                if (ThisChar.equals(simbols[i])) {
                    seenThisThisCharBefore = true;
                    break;
                }
            }
            if (!seenThisThisCharBefore) {
                count++;
            }
        }
        return count;
    }
}
//Пример для теста работы программы:

//Количество строк: 3
//Строка 1: привет
//Строка 2: анализ
//Строка 3: 111111111111
//Ответ: привет