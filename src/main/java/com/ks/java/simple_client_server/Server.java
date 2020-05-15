package com.ks.java.simple_client_server;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) throws IOException {

		Socket client = null;
		PrintWriter pout = null;
		ServerSocket sock = null;

		try {

			sock = new ServerSocket(5155);

			while (true) {

				client = sock.accept();

				pout = new PrintWriter(client.getOutputStream(), true);
				pout.println(new java.util.Date().toString());

				pout.close();
				client.close();
			}

		} catch (Exception e) {

			e.printStackTrace();

		} finally {

			if (client != null)
				client.close();

			if (sock != null)
				sock.close();

		}

	}

}
