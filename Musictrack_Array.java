import java.util.*;

public class Musictrack_Array {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
       System.out.println("Enter the number of songs");
        int k=sc.nextInt();
        sc.nextLine();
        int count=0;
        String[] playlist=new String[k];
        boolean flag=true;
       while(flag)
        {
            System.out.println("Enter the Song Name");
            String songName=sc.nextLine();
            if(count<k)
            {
            playlist[count]=songName;
            count++;
            }
            else
            {
                flag=false;
                System.out.println("Playlist is Full");
                sc.close();
            }


        }
        System.out.println("The playlist songs are "+Arrays.toString(playlist));
    }
    
}
