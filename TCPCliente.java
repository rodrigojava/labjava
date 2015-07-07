import java.io.*;
import java.net.*;
public class TCPClient {

	
	
public static void main(String argv[]) throws Exception 
{

String sentence; 
String modifiedSentence; 
BufferedReader inFromUser = new BufferedReader( new InputStreamReader(System.in)); 
System.out.println(" Conexão local... ");
Socket clientSocket = new Socket("localhost", 4040); 
DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream()); 
BufferedReader inFromServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream())); 
System.out.print("Digite a mensagem :");
sentence = inFromUser.readLine(); 
outToServer.writeBytes(sentence + '\n'); 
modifiedSentence = inFromServer.readLine(); 
System.out.println("Resposta : " + modifiedSentence); 
clientSocket.close();
}
}