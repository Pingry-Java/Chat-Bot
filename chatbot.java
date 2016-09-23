import java.util.Scanner;
    
/**
* This class represents a basic AI that will chat with the human user
* It isn't very humanlike yet......
* @author Tom Drzik
* @verson 0.1
*/


public class chatbot
{
    public static void main(String[] args)
    {   Scanner keyboard = new Scanner(System.in);
        System.out.println("Hi i'm Chatbot. What's your name?");
        String userName = keyboard.nextLine();
        System.out.println("Nice to meet you, " + userName + ", how old are you?");
        int age = keyboard.nextInt();
        keyboard.nextLine(); //Gets pointer to beginning of next line
        if (age > 40 && age < 100)
        {
            System.out.println("Wow that's old!");
            System.out.println("Only" + (100- age) + " years until you're 100! ");
        
                
        }
     
        else
        {
            System.out.println(" How many days until you turn " + (++age) + "?");
            int answer = keyboard.nextInt();
            keyboard.nextLine();
            System.out.println(answer + " ?. Thats closer than you think. You're getting old fast");
        }
        
        String answer2 = "not bye";
        while (! answer2.equals("bye") && (! answer2.equals("Bye")))
        {
            System.out.println("Tell me one of your hobbies or say bye to exit");
            answer2  = keyboard.nextLine();
            
        }
        
    }
    
    
    
    
    
}