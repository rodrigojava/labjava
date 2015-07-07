import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.Socket;
public class TCPServerThread implements Runnable{

private Socket _socket;
private String _msg;
static TCPServerThread tcp;
public TCPServerThread(Socket socket, String msg ){
this._socket= socket;
this._msg = msg;
}
public void gravarArquivo(String msg){
try{
File file = new File("/Alander/msg"+_socket+".txt");
FileWriter w = new FileWriter(file);
w.write("Mensagem da classe ServidorApp" +_msg);
w.close();
System.out.println("Arquivo"+file+" Criado com Sucesso: ");
} catch (IOException ex) {
}
}

public void run(){
tcp.gravarArquivo(_msg);
}
}