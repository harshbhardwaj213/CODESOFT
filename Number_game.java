import java.util.Random;
import java.util.Scanner;

class Start{

    public int number;
    public int gussed_number;
    public int guesses=0;

    public Start(){
        Random r=new Random();
        number =r.nextInt(100);
        // System.out.println(number);
    }

    public void guess(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Guess the number in 10 chances-");
        System.out.println("Guess the Number:");
        gussed_number=sc.nextInt();
    }

    public void guess_again(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Try again:");
        gussed_number=sc.nextInt();
    }


    public Boolean check(){
        guesses++;
        if(guesses<=10){
            if(gussed_number==number){
                System.out.println("Congratulatios! You guessed the correct number. \nYou took "+guesses+" chances to guess the correct number.");
                System.out.println("Your score is "+(10-guesses+1)+" out of 10.");
                return true;
            }
            else if(gussed_number<number){
                System.out.println("Guessed number is too low.");
                if(guesses<10) guess_again();
                check();
            }
            else if(gussed_number>number){
                System.out.println("Guessed number is too high.");
                if(guesses<10) guess_again();
                check();
            }
            return false;
        }
        else{
            System.out.println("You failed to guess the number in 10 chances.");
        }
        return true;
        
    }

}

public class Number_game{
    public static void main(String[] args) {
        
        Start game=new Start();
        game.guess();
        game.check();
    }
}
    
