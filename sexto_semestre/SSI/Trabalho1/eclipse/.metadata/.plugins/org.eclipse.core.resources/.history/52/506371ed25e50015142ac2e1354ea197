import java.net.ServerSocket;
import java.net.Socket;

public class WebServerMultithreading {
		
		public static void main(String argv[]) throws Exception
		{
			int port = 16000;
			// Processar a requisição de serviço HTTP em um laço infinito.
			while (true)  {		   
				ServerSocket listenSocket = new ServerSocket (port+1);		   
				Socket connectionSocket = listenSocket.accept();		   
		 // Construir um objeto para processar a mensagem de requisição HTTP.
		   HttpRequest request = new HttpRequest ( connectionSocket );
		 // Criar um novo thread para processar a requisição.
		   Thread thread = new Thread(request);
		 //Iniciar o thread.
		   thread.start();
		
			
			}
		
		}
}
		
