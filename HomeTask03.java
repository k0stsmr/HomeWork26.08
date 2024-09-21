import java.util.Scanner;

public class HomeTask03
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String line = "";
        int length=0, count=0;
        System.out.println("Введите исходную строку ->");
        line = input.nextLine();
        //line = "London is the capital of Great Britain.";    //7 слов. Средняя длина (6+2+3+7+2+5+8)/7=4.714
        String[] words = line.split(" ");
        for (String word: words)
        {
            count++;
            length += word.length();
        }
        System.out.println("Средняя длина слов в предложении = " + (double)length/count);
    }
}
