/*
Task:
Write two Java programs: a simple TCP server and a TCP client.

The client must:
Connect to localhost on port 12345
Send a message (e.g., "Hello Server!")
Receive the reply from the server
Print the reply on the client console
⚠️ Don't use threads yet. Keep it as simple as possible. This will form your base.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class Client {
    public static void main(String[] args) {
        System.out.println("Attempting to connect to server on port 12345...");
        try(Socket socket = new Socket("localhost", 12345);
            BufferedReader getInput = new BufferedReader(new InputStreamReader(socket.getInputStream(), StandardCharsets.UTF_8));
            PrintStream sendOutput = new PrintStream(socket.getOutputStream(), true, StandardCharsets.UTF_8);){
                System.out.println("Connected with server!");
                String message = "Hello Server!";
                sendOutput.println(message);
                System.out.println("Server reply: " + getInput.readLine());
                System.out.println("Server offline. Bye-Bye!");
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
