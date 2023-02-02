package dao;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import model.Client;

public class ClientDao {

	public void addClient(Client client) {

		try {
			FileOutputStream fs = new FileOutputStream("C:\\Users\\59013-42-16\\Desktop\\client.txt");
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(client);
			os.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Client getClient() {
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\59013-42-16\\Desktop\\client.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Client client = (Client) ois.readObject();
			return client;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
