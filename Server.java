/*
 * Deborah Lewis
 * IT351: Advanced Java Programming
 * Colorado Technical University
 */
package DeborahLewis_AdvancedJavaProgramming;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ServerSocket server = new ServerSocket(67); //establish port 
        Socket connection = server.accept(); //establish connection
        ObjectInputStream in = new ObjectInputStream(connection.getInputStream()); //accept input
        ObjectOutputStream out = new ObjectOutputStream(connection.getOutputStream()); //send output

        //read object from DataRequest.java
        DataRequest request = (DataRequest) in.readObject();

        //add data to object
        switch (request.getDataType()) {
            case DataRequest.CUSTOMERS:
                out.writeObject(DataRequest.getCUSTOMERS());
                out.flush();
                break;
            case DataRequest.PRODUCTS:
                out.writeObject(DataRequest.getPRODUCTS());
                out.flush();
                break;
        }

    }

}
