import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Random;

public class FileExample {
    public static void main (String[] args)throws IOException {
        //part 1 reading into the list
        var fileName = "students.txt";
        String all_names = Files.readString(Paths.get(fileName));
        String[] name_list = all_names.split( "\r\n");
        var numberOfStudents = name_list.length; //Camel case pedroReis not Snake Case pedro_reis
        var randGenerator = new Random();
        var num = randGenerator.nextInt(numberOfStudents);
        System.out.println("Congrats "+ name_list[num] + " you get to answer this question");
        //part 2 - printing the list   was line 11
//        for (String name : name_list) { //note the {
//            if (name.equals("fgdzyjsyt")) { // equals vs ==, == not same place in memory
//                System.out.println(name);
//
//            }
//        }
        // Adding to git vs github? errors}
    }}