package jukeBox;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by btamara on 2017.06.06..
 */
public class JukeBox {
    User user;
    Song input;
    Song song1 = new Song("AAAA-artist", "AAA-title");
    Song song2 = new Song("BBBB-artist", "BBB-title");
    Song song3 = new Song("CCCC-artist", "CCC-title");
    Song song4 = new Song("DDDD-artist", "DDD-title");
    Payment payment;
    ArrayList<Song> playList = new ArrayList<>();
    ArrayList<Song> songList = new ArrayList<>();



    public ArrayList<Song> menu() {
        while (true) {
            System.out.println("welcome in the jukebox");
            System.out.println("create a 3 song long playList for 10Ft");
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter your nickname:");
            user = new User(scanner.next());
            //scanner.nextLine();
            System.out.println("your name is: " + user.getNickName());

            System.out.println("Please pay 10Ft ***type here is thr paying process, change not possible***");
            payment = new Payment(scanner.nextInt());
            System.out.println("your account: " + payment.getFt());
            if (payment.getFt() >= 10) {
                System.out.println("Here is the songlist, pick up 3 songs");
                System.out.println(song1.getSongId() + "- " + song1.getTitle());
                System.out.println(song2.getSongId() + "- " + song2.getTitle());
                System.out.println(song3.getSongId() + "- " + song3.getTitle());
                System.out.println(song4.getSongId() + "- " + song4.getTitle());
                songList.add(song1);
                songList.add(song2);
                songList.add(song3);
                songList.add(song4);
                System.out.println("\n Please add the id of the wished song");
                while(playList.size() != 3){
                    String input = scanner.next();
                    scanner.nextLine();
                    for(Song song : songList) {
                        if (input.contains(song.getSongId())) {
                            createPlayList(song);
                        }
                    }
                    System.out.println("\nyour playlist: ");
                    for(Song song : playList) {
                        System.out.println(song.getSongId() + "- " + song.getTitle());
                    }

                }
                System.out.println("***music is played, hope you enjoyed it***");

            }else{
                System.out.println("please pay at least 10Ft");
            }


        }
    }

        public ArrayList<Song> createPlayList(Song input){
            playList.add(input);
            return playList;
        }


}
