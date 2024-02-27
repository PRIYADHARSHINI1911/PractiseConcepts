package practice;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

class SocketServer {

	public static void main(String[] args) throws IOException {
		ServerSocket serverSocket = new ServerSocket(9999);
		Socket socket = serverSocket.accept();
        DataOutputStream dataOutputStream = 
        		new DataOutputStream(socket.getOutputStream());
        dataOutputStream.writeUTF("Hello , I am server socket");
        serverSocket.close();
	}

}
