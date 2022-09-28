package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reservation;

public class Program {

	/*
	 * QUANDO VC TEM UM MÉTODO E DENTRO DELE VC FAZ UMA CHAMADA DE MÉTODO QUE PODE
	 * OCASIONAR UMA EXCEÇÃO OU VC TRATA A EXCEÇÃO COM TRY CATCH OU SIMPLESMENTE VC
	 * PROPAGA A EXCEÇÃO UTILIZANDO O THROWS PARSEEXCEPTION - COMO FOI FEITO ABAIXO
	 */

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("ROOM NUMBER:");
		int number = sc.nextInt();
		System.out.println("CHECK-IN DATE (dd/MM/yyyy): ");
		Date checkIn = sdf.parse(sc.next());
		System.out.println("CHECK-OUT DATE (dd/MM/yyyy): ");
		Date checkOut = sdf.parse(sc.next());
		
		if(!checkOut.after(checkIn)) {
			System.out.println("ERROR IN RESERVATION: CHECK-OUT DATE MUST BE AFTER CHECK-IN DATE");
		}else {
			Reservation reservation = new Reservation(number, checkIn, checkOut) {
				System.out.println("ROOM NUMBER:");
				
			}
		
	
	}



