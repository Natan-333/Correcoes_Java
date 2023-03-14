package program;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import org.apache.http.client.ClientProtocolException;

import model.Feriado;
import service.API_Feriado;

public class Programa {

	public static void main(String[] args) {
		
		API_Feriado api_Feriado = new API_Feriado();
		try {
			api_Feriado.VerifyFeriado();
		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}