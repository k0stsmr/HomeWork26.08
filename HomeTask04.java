import java.util.Scanner;

public class HomeTask04
{
    public static void main(String[] args)
    {
        char[] glas = new char[]{'a', 'e', 'i', 'o', 'u', 'y', 'A', 'E', 'I', 'O', 'U', 'Y'};
        char[] soglas = new char[]{'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm',
                                    'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'z'};

        Scanner input = new Scanner(System.in);
        String line = "";
        int length=0;
        boolean glasSoglas = false;
        System.out.println("Введите исходную строку ->");
        line = input.nextLine();
        String[] words = line.split(" ");
        for (String word: words)
        {
            length = word.length();
            for(int i = 0; i < 12; i++)
            {
                if (word.charAt(0) == glas[i])
                {
                    for(int j = 0; j < 20; j++)
                    {
                        if(word.charAt(length-1) == soglas[j])
                        {
                            System.out.println(word);
                            glasSoglas = true;
                        }
                    }
                }
            }
        }
        if (!glasSoglas) System.out.println("Во введённой строке нет слов на гласную, оканчивающихся на согласную");
    }
}
