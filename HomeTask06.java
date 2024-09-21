public class HomeTask06  //исключить из номеров 00000 - 99999 все номера, содержащие 4 или 13.
{
    public static void main(String[] args)
    {
        String number;/* = new String();*/
        int numLength = 0, count = 0;
        for (int i = 0; i<=99999; i++)
        {
            number = String.valueOf(i);
            numLength = number.length();
            while (numLength < 5)
            {
                number = "0" + number;
                numLength = number.length();
            }
            if (number.contains("13") || number.contains("4"))
            {
                count++;
            }
        }
        System.out.printf("Нужно исключить %d единиц техники", count);//43840
    }
}
