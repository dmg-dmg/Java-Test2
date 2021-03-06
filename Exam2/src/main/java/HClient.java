import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class HClient { 
    public static void main(String[] args) {
    while (true) try {
        Socket socket = new Socket("192.168.11.205", 18080);
        System.out.println("please input...");
        Scanner scanner = new Scanner(System.in);
        String p = scanner.nextLine();
        if (p.equals("bye")) {
            socket.close();
            socket.close();
            break;
        }
        // 发送给服务器的数据
        DataOutputStream out = new DataOutputStream(socket.getOutputStream());
        out.writeUTF(p);
        // 接收服务器的返回数据
        DataInputStream in = new DataInputStream(socket.getInputStream());
        System.out.println("hserver:" + in.readUTF());
        socket.close();
    } catch (Exception e) {
        e.printStackTrace();
    }
}
}
