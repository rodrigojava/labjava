import java.net.Socket;
import java.io.*;
import java.net.*;

      public class ServidorApp {
		static int _porta= 4040;
		static String msg_cli;
		static ServerSocket srvApp;
		static Socket sk = new Socket();

		public static void criarThread() throws InterruptedException{

		Thread tcpserverthread = new Thread(new TCPServerThread(sk , msg_cli ));
		tcpserverthread.start();
		tcpserverthread.join();
		}
		private static void aguardarConexao() throws IOException{

		ServidorApp.srvApp = new ServerSocket(_porta);
		System.out.println("A Porta "+ _porta + " foi aberta!\n Aguardando uma nova Conexao...\n");
		InetAddress inet = InetAddress.getByName("localhost");
		while(true){
		ServidorApp.sk = srvApp.accept();
		System.out.println("Informações coletadas do Cliente...");
		System.out.println(inet.getHostAddress());
		System.out.println(inet.getHostName());
		BufferedReader recebercliente = new BufferedReader(new InputStreamReader(sk.getInputStream()));

		ServidorApp.msg_cli = recebercliente.readLine();
		System.out.println("Mensagem do cliente: " + msg_cli);

		}
		}
		public static void main (String [] args) throws IOException, InterruptedException {

		ServidorApp.aguardarConexao();
		ServidorApp.criarThread();

		}
		}	
	
	
	
	
	

