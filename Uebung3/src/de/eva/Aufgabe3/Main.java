package de.eva.Aufgabe3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Test-Main-Klasse, zum testen, ob alles richtig implementiert wurde.
 * @author Marcel
 * @author Yves
 */
public class Main {
	
	public static void main(String[] args) throws IOException {			
		// lies Addressen aus einer Textdatei aus
		List<EmailAddress> mailaddresses = new ArrayList<EmailAddress>();		
		String fileName = "bin/de/eva/Aufgabe3/resources/mails.txt";
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(new File(fileName))));
		String currentLine = null;
		while((currentLine = br.readLine()) != null){
			// nutze EmailAddressFactory, um die richtige Klasse zu erzeugen!
			EmailAddress mail = EmailAddressFactory.createEmail(currentLine);			
			mailaddresses.add(mail);
		}
		br.close();
				
		EmailAddress mail = EmailAddressFactory.createEmail("dfh", "uni-leipzig", "de");				
		if (mail.getFullEmailAddress().equals("dfh@uni-leipzig.de")){
			System.out.println("Super! EmailAddressFactory scheint korrekt zu sein :)");
		}
		
		EmailAddress mail1 = EmailAddressFactory.createEmail("mueller-heinrich", "blib", "de");
		EmailAddress mail2 = EmailAddressFactory.createEmail("mueller-heinrich@blib.de");
		
		if (mail1.vergleicheAddressen(mail2)){
			System.out.println("Super! EmailAddress scheint korrekt zu sein :)");
		} else{
			System.out.println("Hier ist etwas falsch, sie sollten beide gleich sein!");
		}
		
		Statistik stat = new Statistik();
		int absLe = stat.getAbsoluteUniLeipzigMails(mailaddresses);
		int absEn = stat.getAbsoluteUniEnglandMails(mailaddresses);
		if (absLe == 2 && absEn == 1){
			System.out.println("Super! Statistik.getAbsolute* scheint korrekt zu sein :)");
		}
		
		double relLe = stat.getRelativeUniLeipzigMails(mailaddresses);
		double relEn = stat.getRelativeUniEnglandMails(mailaddresses);
		int anzGesamt = mailaddresses.size();
		if (absLe / (float)anzGesamt == relLe && absEn / (float)anzGesamt == relEn){
			System.out.println("Super! Statistik.getRelative* scheint korrekt zu sein :)");
		}
		if (stat.countStringvorkommen(mailaddresses, "mueller") == 3){
			System.out.println("Super! Statistik.countStringvorkommen() scheint korrekt zu sein :)");
		}
		
		MailUniLeipzig le = (MailUniLeipzig)EmailAddressFactory.createEmail("dfh", "uni-leipzig", "de");
		MailUniEngland en = (MailUniEngland)EmailAddressFactory.createEmail("dfh", "uni-england", "en");
		System.out.println(le.sayHelloToStudent());
		System.out.println(en.sayHelloToStudent());
		
		System.out.println("Gut gemacht! Scheint alles korrekt zu sein :)");
	}
	
}
