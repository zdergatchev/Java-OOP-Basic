package OnlineRadioDatabase;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        RadioDatabase radio = new RadioDatabase();
        for (int i = 0; i < n; i++) {
            try {
                String[] input = reader.readLine().split(";");
                Song song = new Song(input[0], input[1], input[2].split(":"));
                radio.addSong(song);
            }catch(Exception ex){
                System.out.println(ex.getMessage());
            }
        }
        System.out.println(radio);
    }
}
