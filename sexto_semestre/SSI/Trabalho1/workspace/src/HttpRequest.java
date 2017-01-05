import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.StringTokenizer;

final class HttpRequest implements Runnable
{
	final static String CRLF = "\r\n";
	Socket socket;
	// Construtor
	public HttpRequest(Socket socket) throws Exception
	{
		this.socket = socket;
	}
	// Implemente o método run() da interface Runnable.
	public void run()
	{
		try {
			processRequest();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	private void processRequest() throws Exception
	{
		   String requestMessageLine;
		   String fileName;
		   
		   BufferedReader inFromClient = new BufferedReader(new 
				   InputStreamReader(socket.getInputStream()));
		   DataOutputStream outToClient = new DataOutputStream(
				   socket.getOutputStream());
		   
		   requestMessageLine = inFromClient.readLine();
		   
		   StringTokenizer tokenizedLine = new StringTokenizer (requestMessageLine);
		   
		   if (tokenizedLine.nextToken().equals("GET")) {
			   fileName = tokenizedLine.nextToken();
			   if (fileName.startsWith("/") == true)
				   fileName = fileName.substring(1); 
			   File file = new File(fileName);
			   int numOfBytes = (int) file.length();
			   FileInputStream inFile = new FileInputStream(fileName);
			   byte[] fileInBytes = new byte[numOfBytes];
			   inFile.read(fileInBytes);
			   outToClient.writeBytes("HTTP/1.0 200 Document Follows\r\n");
			   outToClient.writeBytes("Content-Type: text/html");
			   outToClient.writeBytes("Content-Length:"+numOfBytes+"\r\n");
			   outToClient.writeBytes("\r\n");
			   outToClient.write(fileInBytes, 0, numOfBytes);
			   socket.close();		   
		   }
		   else  System.out.println("Bad Request Message");
	}		
}


