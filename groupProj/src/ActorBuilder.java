import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ActorBuilder {
    public static File file;
    public static void main (String args[]) throws IOException{
        Actors actor = new Actor();
        int fileSize;
        String path = "/Users/wyattpeake/Desktop/Fall2018/socialnetwork/groupProj/src/actorTest.txt";
        file = new File(path);

            Scanner sc = new Scanner(file);
            fileSize = sc.nextInt();
            System.out.println(fileSize);
            sc.nextLine();
            sc.nextLine();
            while(sc.useDelimiter("  ").hasNext()){
                String str = sc.next();
                if(str.contains("nm0")){
                    actor.setNameDesignator(str);
                }
                if(str.contains("tt000")){
                    actor.setTitle(str);
                }
            }













    }

    public static int getFileSize(Scanner sc){
        int size = 1;
        while (sc.hasNextLine()){
            System.out.println("line");
            size++;

        }
        return size;
    }

}
