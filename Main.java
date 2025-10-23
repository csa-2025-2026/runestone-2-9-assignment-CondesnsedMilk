import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter a word: ");
    String userInput = scan.next();

    String currentLetter = "";
    int mostLetterInt = 0;
    for(int i = 0; i < userInput.length(); i++)
    {
      currentLetter = userInput.substring(i, i + 1);
      for(int j = 0; j < userInput.length(); j++)
      {

        if(currentLetter.equals(userInput.substring(j, j + 1)))
        {
          mostLetterInt++;
        }
      }

    }

    System.out.printf("The letter %s appears the most times with %d occurences.%n", currentLetter, mostLetterInt);

  }

}


