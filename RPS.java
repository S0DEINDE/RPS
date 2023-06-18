import java.util.*;
public class RPS {

    static void winner(String x, String y, String namer){
        if (x.equals(y)){
            System.out.println("DRAW!");
        }
        else if (x.equals("R") && y.equals("P")) {
            System.out.println("CPU Wins!");
        }
        else if (x.equals("R") && y.equals("S")) {
            System.out.println(namer + " Wins!");
        }

        else if (x.equals("P") && y.equals("R")){
            System.out.println(namer + " Wins!");
        }
        else if (x.equals("P") && y.equals("S!")){
            System.out.println("CPU Wins");
        }

        else if (x.equals("S") && y.equals("R!")) {
            System.out.println("CPU Wins");
        }
        else if (x.equals("S") && y.equals("P")){
            System.out.println(namer + " Wins!");
        }
    }



    static String conv_ascii( String contestant) {
        switch (contestant) {
            case "P" -> {
                return "\uD83D\uDCC3";
            }
            case "R" -> {
                return "\uD83E\uDEA8";
            }
            case "S" -> {
                return "✂️";
            }
        }
        return "";
    }


    static String converter(Integer computer){
        String[] randomizer = {"R", "P", "S"};
        return randomizer[computer];
    }
    public static void main(String[] args){

        System.out.println("~~~~~~~~~~~~~~~~~~~ROCK~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~PAPER~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~SCISSORS~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");


        Scanner rps = new Scanner(System.in);
        System.out.println("WHat is your name?");
        String namer = rps.nextLine();
        System.out.println(namer + " Rock, Paper or Scissors?(Rock(R),Paper(P) or Scissors(S):");
        String user = rps.nextLine();

        Random rand = new Random();
        int cpu = rand.nextInt((2) + 1);
        String computadora = converter(cpu);
        System.out.println(conv_ascii(user) + " VS "+ conv_ascii(computadora));
        winner(user,computadora, namer);
        System.out.println(namer + " thanks for playing!");

        System.out.println("~~~~~~~~~~~~THANKS FOR USING MY PROGRAM!~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}
