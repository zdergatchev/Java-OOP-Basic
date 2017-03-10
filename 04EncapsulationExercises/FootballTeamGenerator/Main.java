package FootballTeamGenerator;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)throws IOException{
        Scanner cs = new Scanner(System.in);
        String input;
        Teams teams = new Teams();
        while (!(input = cs.nextLine()).equalsIgnoreCase("end")) {
            String[] tokens = input.split(";");
            switch (tokens[0]) {
                case "Team":
                    try {
                        teams.addTeam(tokens[1]);
                    } catch (IllegalArgumentException iae) {
                        System.out.println(iae.getMessage());
                    }
                    break;
                case "Add":
                    try{
                        teams.addPlayerToTeam(tokens[1], tokens[2], Integer.parseInt(tokens[3]),
                                Integer.parseInt(tokens[4]), Integer.parseInt(tokens[5]), Integer.parseInt(tokens[6])
                                , Integer.parseInt(tokens[7]));
                    } catch (IllegalArgumentException iae) {
                        System.out.println(iae.getMessage());
                    }
                    break;
                case "Remove":
                    try {
                        teams.removePlayerFromTeam(tokens[1], tokens[2]);
                    }catch (IllegalArgumentException iae){
                        System.out.println(iae.getMessage());
                    }
                    break;
                case "Rating":
                    try{
                        System.out.printf("%s - %.0f%n",tokens[1],teams.getAverageStat(tokens[1]));
                    }catch (IllegalArgumentException iae){
                        System.out.println(iae.getMessage());
                    }
                    break;
            }
        }
    }
}
