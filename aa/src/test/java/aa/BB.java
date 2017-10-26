package aa;

import java.util.List;

import java.util.Scanner;
import java.util.ArrayList;



public class BB {

	public static void main(String[] args) {
		
		
		String imie;
		String nazwisko;
		
		Scanner wejscie = new Scanner(System.in);
		imie = wejscie.nextLine();
		nazwisko = wejscie.nextLine();
		wejscie.close();
		
		AA person = new AA(imie,nazwisko);
		
		List<AA> lista1 = new ArrayList<AA>();
		
		lista1.add(new AA("Lukasz", "Lukasz"));
		lista1.add(person);
		
		lista1.add(new AA(imie,nazwisko));
		
		
		

	}

}
