//number guassing

import java.util.*;
public class Number {
    int randomNo;
    int attempts;
    int max_attempts;

    public  Number(int max_attempts){
        Random random = new Random();
        randomNo = random.nextInt(10) + 1;
        this.max_attempts = max_attempts;
        int totalscore = 0;
    }

    public void play(){
        Scanner sc = new Scanner (System.in);
        System.out.println("Welcome to the number guessing game! I've selected a number, can you guess it? ");
        while(attempts < max_attempts){
            System.out.println("Enter the number you guessed : ");
            int guess = sc.nextInt();
            attempts++;
            if(guess == randomNo){
                System.out.println("Congratulations! You guessed the correct number which is " + randomNo);
                System.out.println("Total score : " + attempts) ;
                break;
            }
            else if(guess < randomNo){
                System.out.println("The number you guessed is too smaller which is " + guess);
                System.out.println("Total score : " + attempts) ;
            }
            else{
                System.out.println("The number you guessed is too larger, plz try again");
                System.out.println("Total score : " + attempts) ;
            }
        }

        System.out.println("The actual number was " + randomNo);
    }
    public static void main(String[] args){

        Number game = new Number(5);
        game.play();
    }
}
