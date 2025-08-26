/*
Task:
Write two Java programs: a simple TCP server and a TCP client.

The server must:
Listen on port 12345
Accept a single client connection
Read a message sent by the client
Print it on the server console
Send back a reply: "Message received: <original-message>"
⚠️ Don't use threads yet. Keep it as simple as possible. This will form your base.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class Server {
    public static void main(String[] args) {
        System.out.println("Server started. Waiting for client connection...");
        try(ServerSocket serverSocket = new ServerSocket(12345);
            Socket socket = serverSocket.accept();
            BufferedReader getInput = new BufferedReader(new InputStreamReader(socket.getInputStream(), StandardCharsets.UTF_8));
            PrintStream sendOutput = new PrintStream(socket.getOutputStream(), true, StandardCharsets.UTF_8);){ 
                System.out.println("Connected with client!");
                String message = getInput.readLine();
                System.out.println("Client: " + message);
                sendOutput.println("Message received: " + message);
                System.out.println("Client offline. Bye-Bye!");
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
