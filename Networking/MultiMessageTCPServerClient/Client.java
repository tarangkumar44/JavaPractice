/*
Task:
Exchange multiple messages (not just one).

Client:
After connecting, allow user to type multiple messages (read from console using BufferedReader).
Keep sending to server until "exit" is typed.
Print every reply from server.

⚠️ Still single client only. We’ll get to multiple clients in the next step.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        System.out.println("Trying to connect with the server...");
        try(Scanner scanner = new Scanner(System.in);
            Socket socket = new Socket("localhost", 9999);
            BufferedReader getInput = new BufferedReader(new InputStreamReader(socket.getInputStream(), StandardCharsets.UTF_8));
            PrintStream sendOutput = new PrintStream(socket.getOutputStream(), true, StandardCharsets.UTF_8)){
                System.out.println("Connected to server.");
                String message = "";
                do {
                    System.out.print("Send: ");
                    message = scanner.nextLine();
                    sendOutput.println(message);
                    System.out.println("Receive: " + getInput.readLine());
                } while (!message.equalsIgnoreCase("exit"));
        } catch (Exception e){
            e.getMessage();
        }
    }
}
