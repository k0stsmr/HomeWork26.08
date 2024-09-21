import java.util.Scanner;

public class HomeTask02
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String line = "";
        int key;
        for (int i = 1; line.length() <= 1000-String.valueOf(i).length(); i++)
        {
            line += i;
        }
        System.out.printf("Введите номер символа в диапазоне от 1 до %d -> ", line.length());
        key = input.nextInt();
        if (key <= 0 || key > line.length()) System.out.printf("Вы ввели неверный номер. Введите от 1 до %d -> ", line.length());
        else System.out.printf("На позиции %d находится цифра %c.", key, line.charAt(key-1));
    }
}
