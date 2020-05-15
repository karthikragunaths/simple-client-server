package com.ks.java.simple_client_server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class Client {

	public static void main(String[] args) throws IOException {

		InputStream in = null;
		BufferedReader bin = null;
		Socket sock = null;

		try {

			sock = new Socket("localhost", 5155);

			in = sock.getInputStream();
			bin = new BufferedReader(new InputStreamReader(in));

			String line;
			while ((line = bin.readLine()) != null) {
				System.out.println(line);
			}

		} catch (IOException e) {

			e.printStackTrace();

		} finally {
			sock.close();
		}

	}

}
