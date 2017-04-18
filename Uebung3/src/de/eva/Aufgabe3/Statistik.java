package de.eva.Aufgabe3;
import java.util.List;

/**
 * Zaehlt die wie viele Addressen von welchem Typ genau.
 * @author Marcel
 * @author Yves
 */
public class Statistik {
	
	public int getAbsoluteUniLeipzigMails(List<EmailAddress> mails){
		int counter = 0;
		for (EmailAddress mail : mails){
			if (mail instanceof MailUniLeipzig){
				counter++;
			}
		}
		return counter;
	}
	
	public int getAbsoluteUniEnglandMails(List<EmailAddress> mails){
		int counter = 0;
		for (EmailAddress mail : mails){
			if (mail instanceof MailUniEngland){
				counter++;
			}
		}
		return counter;
	}
	
	public int countStringvorkommen(List<EmailAddress> mails, String pattern){
		int counter = 0;
		for (EmailAddress mail : mails){
			if (mail.getFullEmailAddress().contains(pattern)){
				counter++;
			}
		}
		return counter;
	}
	
	public double getRelativeUniLeipzigMails(List<EmailAddress> mails){
		// (float) -> TypCast, da sonst 3 / 2 = 1 
		return getAbsoluteUniLeipzigMails(mails) / (float)mails.size(); 
	}
	
	public double getRelativeUniEnglandMails(List<EmailAddress> mails){
		return getAbsoluteUniEnglandMails(mails) / (float)mails.size();
	}
}
