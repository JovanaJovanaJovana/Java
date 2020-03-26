package itbootcamp.domaci;

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesite naziv zeljenog meseca:");
		
		String mesec = sc.next();
		String januar = "januar";
		String februar = "februar";
		String mart = "mart";
		String april = "april";
		String maj = "maj";
		String jun = "jun";
		String jul = "jul";
		String avgust = "avgust";
		String septembar = "septembar";
		String oktobar = "oktobar";
		String novembar = "novembar";
		String decembar = "decembar";
		
		
		switch (mesec) {
	
		case "januar":
		case "jun":
		case "jul":
	
			System.out.println("Postoje tri naziva meseca koja imaju pocetno slovo j, oni su: januar, jun i jul.");
			break;
			
		case "februar":
			
			System.out.println("Postoji jedan mesec koji pocinje slovom f, a to je februar.");
			break;
		
		case "mart":
		case "maj":	
			
			System.out.println("Postoje dva meseca koja pocinju slovom m, a ona su mart i maj.");
			break;
			
		case "april":
		case "avgust":
			
			System.out.println("Postoje dva meseca koja pocinju slovom a, a ona su april i avgust.");
			break;
			
		case "septembar":
			
			System.out.println("Postoje jedan mesec koji pocinje slovom s, mesec septembar.");
			break;
			
		case "oktobar":
		
			System.out.println("Postoji jedan mesec koji pocinje slovom o, mesec oktobar.");
			break;
			
		case "novembar":
	
			System.out.println("Postoji jedan mesec koji pocinje slovom n, mesec novembar.");
			break;
			
		case "decembar":
			
			System.out.println("Postoji jedan mesec koji pocinje slovom d, mesec decembar.");
			break;
			
		default:
			
			if ((mesec.equals("Januar"))) {
			System.out.println("Molimo vas unesite naziv meseca malim slovima.");		
		} else 
			if ((mesec.equals("Februar"))) {
			System.out.println("Molimo vas unesite naziv meseca malim slovima.");		
		} else 
			if ((mesec.equals("Mart"))) {
				System.out.println("Molimo vas unesite naziv meseca malim slovima.");		
		} else 
			if ((mesec.equals("April"))) {
				System.out.println("Molimo vas unesite naziv meseca malim slovima.");
		} else 
			if ((mesec.equals("Maj"))) {
				System.out.println("Molimo vas unesite naziv meseca malim slovima.");
		} else 
			if ((mesec.equals("Jun"))) {
				System.out.println("Molimo vas unesite naziv meseca malim slovima.");		
		} else 
			if ((mesec.equals("Jul"))) {
				System.out.println("Molimo vas unesite naziv meseca malim slovima.");			
		} else 
			if ((mesec.equals("Avgust"))) {
				System.out.println("Molimo vas unesite naziv meseca malim slovima.");			
		} else 
			if ((mesec.equals("Septembar"))) {
				System.out.println("Molimo vas unesite naziv meseca malim slovima.");			
		} else 
			if ((mesec.equals("Oktobar"))) {
				System.out.println("Molimo vas unesite naziv meseca malim slovima.");			
		} else 
			if ((mesec.equals("Novembar"))) {
				System.out.println("Molimo vas unesite naziv meseca malim slovima.");			
		} else 
			if ((mesec.equals("Decembar"))) {
				System.out.println("Molimo vas unesite naziv meseca malim slovima.");			
		} else {																									
			System.out.println("Mesec koji ste uneli ne postoji.");		}
	}
}
}