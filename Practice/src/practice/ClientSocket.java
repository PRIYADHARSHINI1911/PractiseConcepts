package practice;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.*;

class ClientSocket {

	public static void main(String[] args) throws IOException {
		Socket socket = new Socket("localhost",9999);
		DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
		String msg = dataInputStream.readUTF();
		System.out.print(msg);;
	}
	
}
