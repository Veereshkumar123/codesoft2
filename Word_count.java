import java.util.Scanner;

public class Word_count
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
     String text;
     System.out.println("Type a text:");
     text=sc.nextLine();
     //using spcace we can count the words
     int countWords = text.split("\\s").length;

     //when text containe , . : it will not count
     for(int i=0;i<text.length();i++)
     {
        if(text.charAt(i)==',' || text.charAt(i)=='"' || text.charAt(i)=='.')
        {
            countWords--;
        }
        
     }
     System.out.println("..............................");
     System.out.println("The Number of words in text:\n"+countWords);
     System.out.println("..............................");

    }
   
}

