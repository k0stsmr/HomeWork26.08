import java.util.Scanner;

public class HomeTask05
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String line = "";
        int length=0, count=0;
        boolean even = false;
        System.out.println("Введите исходную строку ->");
        line = input.nextLine();
        //line = "Один два три четыре пять: шесть семь восемь девять десять"; // 7 слов
        //line = "В мире существует только две бесконечности: вселенная и человеческая глупость, хотя в первой я не уверен"; //9 слов
        String[] words = line.split(" |: |, ");
        for (String word: words)
        {
            length = word.length();
            if (length % 2 == 0)
            {
                count++;
                even = true;
            }
        }
        if (!even) System.out.println("Во введённой строке нет слов с чётным количеством букв");
        else System.out.printf("Во введённой строке %d слов с чётным количеством букв", count);
    }
}