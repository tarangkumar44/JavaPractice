/*
Task:
Exchange multiple messages (not just one).

Server:
Accept one client connection.
Keep reading messages in a loop until the client sends "exit".
For every message, reply "Server received: <message>".
When client sends "exit", close connection gracefully.

⚠️ Still single client only. We’ll get to multiple clients in the next step.
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
        System.out.println("Server started on port 9999, waiting for client...");
        try(ServerSocket serverSocket = new ServerSocket(9999);
            Socket socket = serverSocket.accept();
            BufferedReader getInput = new BufferedReader(new InputStreamReader(socket.getInputStream(), StandardCharsets.UTF_8));
            PrintStream sendOutput = new PrintStream(socket.getOutputStream(), true, StandardCharsets.UTF_8)){
                System.out.println("Client online. Receiving messages now");
                String message = "";
                do {
                    message = getInput.readLine();
                    System.out.println("Client: " + message);
                    sendOutput.println("Server received: " + message);
                } while (!message.equalsIgnoreCase("exit"));
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
