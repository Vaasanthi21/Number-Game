import java.util.*;
class NumberGame
{
    public static void main(String[] args)
    {
        int score=0;
        int chances=10;
        boolean playAgain=true;
        Scanner v=new Scanner(System.in);
        System.out.println("Welcome To the Game");
        while(playAgain)
        {
            int random=getRandN(1,100);
            boolean guess=false;
            for(int i=0;i<chances;i++)
            {
                System.out.println("Chance "+ (i+1) + "Enter your Guess:");
                int user=v.nextInt();
                if(user==random)
                {
                    guess=true;
                    score+=1;
                    System.out.println("You Guessed It Correct");
                    break;
                }
                else if(user>random)
                {
                    System.out.println("Number you Guessed is Very High");
                }
                else
                {
                    System.out.println("Number you Guessed is Very low");
                }
            }
            if(guess==false)
            {
                System.out.println("The Game Ended With "+ score+"Better Luck Next Time and the number is:" + random);
            }
            System.out.println("Do you Want To continue(Yes/No):");
            String n=v.next();
            playAgain=n.equalsIgnoreCase("Yes");
        }
        System.out.println("Your Score is " + score);
    }
    public static int getRandN(int min,int max)
    {
            return (int)(Math.random()*(max-min+1)+min);
    }
}