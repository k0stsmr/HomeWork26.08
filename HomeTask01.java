import java.util.Scanner;

public class HomeTask01
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String line, key;
        int index=0, count=0;
        System.out.println("Введите исходную строку ->");
        line = input.nextLine();
        System.out.println("Введите символ для поиска ->");
        key = input.next();
        if (line.indexOf(key.charAt(0)) == -1)
        {
            System.out.printf("Символа \'%s\' в строке \'%s\' не найдено%n", key, line);
        }
        else
        {
            System.out.printf("Символ \'%s\' в строке \'%s\' найден по индексам:%n", key, line);
            while (index < line.length()-1)
            {
                index = line.indexOf(key.charAt(0), index);
                if (index != -1 && String.valueOf(line.charAt(index)).equals(key))
                {
                    System.out.println(index);
                    count++;
                    index++;
                }
                else break;
            }
            System.out.printf("Общее количество вхождений символа \'%s\' в строку \'%s\' составляет %d", key, line, count);
        }
    }
}
