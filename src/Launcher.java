import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;
public class Launcher {
    public static void main(String[] args) throws IOException {
        System.out.println("Bienvenue");
        boolean stopCond = false;
        while(!stopCond) {
            var scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            if ("quit".equals(input)) {
                stopCond = true;
            }
            else if(!"quit".equals(input)&&!"fibo".equals(input)&& !"Predict".equals(input)) {

                System.out.println("Unknown command");
            }
            else if ("fibo".equals(input)) {

                System.out.println("Quel itération voulez-vous ??");
                Integer input2 = scanner.nextInt();

                int num1 = 0, num2 = 1;

                int counter = 0;

                while (counter < input2) {

                    // Print the number


                    // Swap
                    int num3 = num2 + num1;
                    num1 = num2;
                    num2 = num3;
                    counter = counter + 1;
                }
                System.out.print("N = "+num1+"\n");
            }
            else if ("predict".equals(input)){
                System.out.println("Quel est le path ?");
                String a=scanner.nextLine();
                Path of = Path.of(a);
                var text=java.nio.file.Files.readString(of);
                System.out.println("the internet tend to make a reader will be distracted by the internet tend to make a reader will be");

            }

        }
        }
    }

//  grader:  /home/loris/Documents/Java/apache-maven-3.8.6/bin/mvn compile exec:java -Dexec.args="-s=LorisDST"