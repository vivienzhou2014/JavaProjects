package Demo15Net;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

public class FileUploadTCPServer {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(8888);
        while(true){
            Socket socket = server.accept();
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try{
                        File file = new File("d:\\upload");
                        if(!file.exists()){
                            file.mkdirs();
                        }
                        String fileName = "itcast"+ System.currentTimeMillis()+new Random().nextInt(999999)+".jpg";
                        //FileOutputStream fos = new FileOutputStream(file+"\\1.jpg");
                        FileOutputStream fos = new FileOutputStream(file+"\\"+fileName);

                        InputStream is = socket.getInputStream();
                        int len = 0;
                        byte[] bytes = new byte[1024];
                        while((len=is.read(bytes))!=-1){
                            fos.write(bytes,0,len);
                        }
                        OutputStream os = socket.getOutputStream();
                        os.write("Upload successful!".getBytes());
                        fos.close();
                        socket.close();
                }catch (IOException e){
                        System.out.println(e);
                    }
            }}).start();

        }

        //server.close();
    }
}
