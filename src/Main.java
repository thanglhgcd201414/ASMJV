import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Transfer message = new Transfer();

        long start = System.currentTimeMillis();

        System.out.println(" Please input your message:");
        try {
            while (true) {
                String text = scanner.nextLine();
                if (text.isEmpty())
                {
                    break;

                }
                else if (text.length() > 250) {
                    throw new Exception("Your input is too long (" + text.length() + "), we can only send a message with a maximum of 250 characters!");
                }
                else {
                    // Send Message
                    message.send(text);
                    // Recive Message
                    message.recive();
                }
            }
        } catch (Exception e) {
            System.out.println("Bị Lỗi:"+e.getMessage());
        }

        long elapsedTimeMillis = System.currentTimeMillis() - start;
        //Show time execution

        System.out.println("Time executed: "+elapsedTimeMillis / 100000.0);

        //Notification Message
        message.notification();



    }
}

