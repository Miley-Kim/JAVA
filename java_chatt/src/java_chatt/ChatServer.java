package java_chatt;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatServer {

   public static void main(String[] args) {
      
      ServerSocket serverSocket = null;
      Socket socket = null;
      
      try {
         serverSocket = new ServerSocket(7777);
         System.out.println("서버가 작동되었습니다.");
         socket = serverSocket.accept();
         
         Sender sender = new Sender(socket);
         Receiver receiver = new Receiver(socket);
         
         sender.start();
         receiver.start();
         
      } catch (Exception e) {
         e.printStackTrace();
      }
      

   }

}