import java.util.*;
public class JavaApplication1 {

    public static void main(String[] args) {
        Random r = new Random();
        int uPoint = 0;
        int bPoint = 0;
        int winPoint = 20; // can be increased or decreased

        
        while (true) {
            
            if (uPoint >= 100) {
                System.out.println("\nUser Won!");
                System.out.println("User point : " + uPoint + "\nComputer point : " + bPoint);
                break;
            } else if (bPoint >= 100) {
                System.out.println("\nComputer Won!");
                System.out.println("Computer point : " + bPoint + "\nUser point : " + uPoint);
                break;
            }
            
            String rock = "Rock"; String paper = "Paper"; String scissor = "Scissor";
            Scanner w = new Scanner(System.in);
            System.out.println("| Rock | Paper | Scissor |");
            System.out.print("Your Choose :");
            String user = w.nextLine();
            
            String[] Bot = {"Rock","Paper","Scissor"};
            int select = r.nextInt(Bot.length); 
            String botS = Bot[select];
            
            if (user.toLowerCase().equals(botS.toLowerCase())) {
                System.out.println("Tied");
            } else if (
                (user.toLowerCase().equals(rock.toLowerCase()) && botS.toLowerCase().equals(scissor.toLowerCase())) ||
                (user.toLowerCase().equals(paper.toLowerCase()) && botS.toLowerCase().equals(rock.toLowerCase())) ||
                (user.toLowerCase().equals(scissor.toLowerCase()) && botS.toLowerCase().equals(paper.toLowerCase())) 
            ) {
                uPoint += winPoint;
                System.out.println("Computer : " + botS.toLowerCase());
                System.out.println("User Point : " + uPoint);
            } else {
                bPoint += winPoint;
                System.out.println("Computer : " + botS.toLowerCase());
                System.out.println("Computer Point : " + bPoint);
            }
            }
        }
    }
