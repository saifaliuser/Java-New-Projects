package game.java;
import java.util.Random;
import java.util.Scanner;


class Game {
    public int number;
    public int inputNumber;
    public int noOfGuesses;

    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }


    Game() {
        Random rand = new Random();
        this.number = rand.nextInt(100);
    }

    void takeUserInput() {
        System.out.println("Guess the Number");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();
    }

    boolean isCorrectNumber() {
        noOfGuesses++;
        if (inputNumber == number) {
            System.out.format("Yes you have guessed it right, it was %d \n You guessed it in %d attempts", number, noOfGuesses );
            return true;
        } else if (inputNumber > number) {
            System.out.println("Too High Number.....");
        } else if (inputNumber < number) {
            System.out.println("Too Low Number.....");
        }
        return false;

    }
        public static void main (String[]args){
            // write your code here
            
            Game g = new Game();
            boolean b = false;
            while (!b) {
                g.takeUserInput();
                b = g.isCorrectNumber();
                System.out.println(b);
            }

        }


    }