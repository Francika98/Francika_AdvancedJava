import java.util.ArrayList;
import java.util.Scanner;

public class Musictrack_Arraylist {
      public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
       System.out.println("Kindly choose an option to create your playlist(Add/Remore):");
        String choice=sc.nextLine();
        sc.nextLine();
        int count=0;
        ArrayList<String> playlist=new ArrayList<String>();
        playlist.add("Song 1");
        playlist.add("Song 2");
        playlist.add("Song 3");

        boolean flag=true;
        switch (choice) {
            case "Add":
                while(flag)
            {
                System.out.println("Enter the Song Name");
                String songName=sc.nextLine();
                playlist.add(songName);
                count++;
                if(count%10==0)
                {
                    System.out.println("Do you wish to add more songs? (yes/no)");
                    String response=sc.nextLine();
                    if(response.equalsIgnoreCase("no"))
                    {
                        flag=false;
                        System.out.println("Playlist is Finalized");
                        sc.close();
                    }
                }
            }

                break;
            case "Remove":
            while(flag)
            {
                System.out.println("Enter the song name to be removed");
                String songName=sc.nextLine();
                if(playlist.contains(songName))
                {
                    playlist.remove(songName);
                    System.out.println("The song "+songName+" is removed from the playlist");
                }
                else
                {
                    flag=false;
                    System.out.println("The song "+songName+" is not found in the playlist");
                     sc.close();
                }
            }
            default:
                break;
        
            }
            System.out.println("The playlist songs are "+playlist);
        }
       
    }
       
    

