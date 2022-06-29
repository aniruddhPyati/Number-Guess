//This is a game to guess the correct number and also calculate the number of attempts taken to do so.

import java.util.Scanner;
import java.util.Random;

class Game {

    public int NoOfGuesses=0;
    public int InputNumber;
    public int ComputerChoice;


    public int getNoOfGuesses() {
        return NoOfGuesses;
    }

    public void setNoOfGuesses(int noOfGuesses) {
        NoOfGuesses = noOfGuesses;
    }

     Game() {                 // it was initially void game() , but computerchoice was then always 0 , so void was removed
        Random rand = new Random();
        this.ComputerChoice = rand.nextInt(100);
    }

    void TakeUserinput() {
        System.out.println("enter your guess");
        Scanner sc = new Scanner(System.in);
        InputNumber = sc.nextInt();

    }


        boolean IsCorrectNumber() {
        NoOfGuesses++;
        if (InputNumber == ComputerChoice) {
            System.out.printf("the number was %d \n and you guessed it in %d number of attempts", ComputerChoice, NoOfGuesses);
            return true;
        } else if (InputNumber > ComputerChoice) {
            System.out.println("Number is too big");
        } else if (InputNumber < ComputerChoice) {
            System.out.println("number is too small");
        }
        return false;
    }
}

    public class NumberGame {
        public static void main(String[] args) {

            Game g=new Game();
            boolean b = false;                         // while loop used to calculate number of attempts taken
            while (!b){
                g.TakeUserinput();
                b= g.IsCorrectNumber();

            }



        }

    }

