package java_chatt;

import java.net.Socket;

public class ChatClient {

   public static void main(String[] args) {
      
      Socket socket = null;
      
      try {
         socket = new Socket("",7777);
         
         System.out.println("서버에 연결되었습니다.");
         
         Sender sender = new Sender(socket);
         Receiver receiver = new Receiver(socket);
         
         sender.start();
         receiver.start();
         
      } catch (Exception e) {
         e.printStackTrace();
      }
      

   }
}