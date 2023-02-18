package application;
import java.util.Scanner;
public class TeamSize {
    public static void main (String[] args){
        final int MIN_PLAYERS = 9;
        final int MAX_PLAYERS = 15;
        int players;
        int teamsize;
        int teams;
        int leftOver;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the number of players per team.");
        teamsize = keyboard.nextInt();
        while (teamsize < MIN_PLAYERS || teamsize > MAX_PLAYERS){
            System.out.println("The number must be at least" + MIN_PLAYERS + " and no more than " + MAX_PLAYERS +
                    ".\n Enter the number of players.");
            teamsize = keyboard.nextInt();
        }
        System.out.println("Enter the available number of players.");
        players = keyboard.nextInt();
        while (players < 0){
            System.out.println("Enter 0 or greater.");
            players = keyboard.nextInt();
        }
        teams = players/teamsize;
        leftOver = players%teamsize;
        System.out.println("There will be " + teams + " teams with " + leftOver + " player left over.");
    }
}
