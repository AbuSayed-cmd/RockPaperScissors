package RockPaper;

import java.util.Scanner;

public class rockPaperSci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Let's play Rock Paper Scissors.");
        System.out.println("When I say 'Shoot', Choose: rock, paper, scissors");
        System.out.println("Are you ready? Write 'Yes' if you are.");

        String ready= scan.nextLine();

        if(ready.equals("yes")){
            System.out.println("\nGreat!");
            System.out.println("rock - paper - scissors, Shoot!");
            String choise = scan.nextLine();
            String computerChoise = computerChoice();

            System.out.println("\nYou chose:\t" +choise);
            System.out.println("The computer choose:\t" +computerChoise);

            String result = result(choise, computerChoise);
            System.out.println(result);
        }else{
            System.out.println("Play another time");
        }

        scan.close();
    }

    public static String computerChoice(){
        double randomNumber = Math.random() * 3; // return the number between 0 and 2
        int integer = (int) randomNumber;

        switch(integer){
            case 0: return "rock";
            case 1: return "paper";
            case 2: return "scissor";
            default: return "outOfRange";
        }
    }

    public static String result (String yourChoise, String computerchoise){
        String result = "";
        if(yourChoise.equals("rock") && computerchoise.equals("scissors")){
            result= "You Win!";
        }else if(computerchoise.equals("rock") && yourChoise.equals("scissors")){
            result="You lost";
        }else if(yourChoise.equals("paper") && computerchoise.equals("rock")){
            result="you win!";
        }else if(computerchoise.equals("paper") && yourChoise.equals("rock")){
            result="You lost";
        }else if(yourChoise.equals("scissors") && computerchoise.equals("paper")){
            result="you win!";
        }else if(computerchoise.equals("scissors") && yourChoise.equals("paper")){
            result="You lost";
        }else{
            result="It's a tie";
        }

        return result;
    }
    
}
