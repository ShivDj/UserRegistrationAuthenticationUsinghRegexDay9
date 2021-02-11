package UserRegistration_Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Regex reg = new Regex();
		reg.userFirstNameCheckRegex();
		reg.userLastNameCheckRegex();
		reg.userEmailCheckRegex();
		reg.userPhoneNumberCheckRegex();
		reg.userPassWardCheckRegex();
	}

	private void userFirstNameCheckRegex()

	{
		System.out.println("enter your First name:-");
		String fName = sc.next();

		String regex = "[A-Z]{1}[a-z]{2,20}$";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(fName);
		boolean b = m.matches();

		if (b == true) {
			System.out.println("You have entered  " + fName + "  the perfect first name ---congrats");
		} else {
			System.out.println(
					"you have not entered first name according to Authincation rule of REGEX please read instruction carefully then enter:-"
							+ "\n" + "[1]=you have to enter first alphabets in CAPITAL letter" + "\n"
							+ "[2]=Other word then first can be in small alphabets " + "\n"
							+ "[3]=you have enter ATLEAST 4 alphabets " + "\n" + "[4]=please try again");
		}
	}

	private void userLastNameCheckRegex()

	{
		System.out.println("enter your Last name:-");
		String lName = sc.next();

		String regex = "[A-Z]{1}[a-z]{2,20}$";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(lName);
		boolean b = m.matches();

		if (b == true) {
			System.out.println("You have entered  " + lName + "  the perfect Last name ---congrats");
		} else {
			System.out.println(
					"you have not entered first name according to Authincation rule of REGEX please read instruction carefully then enter:-"
							+ "\n" + "[1]=you have to enter first alphabets in CAPITAL letter" + "\n"
							+ "[2]=Other word then first can be in small alphabets " + "\n"
							+ "[3]=you have enter ATLEAST 4 alphabets " + "\n" + "[4]=please try again");
		}
	}

	private void userEmailCheckRegex()

	{
		System.out.println("enter your Email:-");
		String eMail = sc.next();

		String regex = "^[a-zA-Z0-9_.]+@[a-zA-Z.]+$";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(eMail);
		boolean b = m.matches();

		if (b == true) {
			System.out.println("You have entered  " + eMail + "  the correct Email---congrats");
		} else {
			System.out.println("you have not entered Email according to Authincation rule of REGEX please try again:-");

		}
	}

	private void userPhoneNumberCheckRegex()

	{
		System.out.println("enter your PhoneNumber:-");
		String phoneNumber = sc.next();

		String regex = "^([+][9][1]|[9][1]|[0]){0,1}([7-9]{1})([0-9]{9})$";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(phoneNumber);
		boolean b = m.matches();

		if (b == true) {
			System.out.println("You have entered  " + phoneNumber + "  the correct phone number---congrats");
		} else {
			System.out.println(
					"you have not entered phoneNumber according to Authincation rule of REGEX please try again:-");

		}
	}
//this userPassWard method saticfied all passward usecase requirment
	private void userPassWardCheckRegex()

	{
		System.out.println("enter your PassWard:-");
		String passWard = sc.next();

		String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#&$])(?=\\S+$).{4,10}$";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(passWard);
		boolean b = m.matches();

		if (b == true) {
			System.out.println("You have entered  " + passWard + "  correct passward ---congrats");
		} else {

			System.out.println(
					"You have entered wrong Password:- \n must have atleast 1 upper case \n one lower case \n one special character like @ # & $"
							+ " \n 1 numberic character \n length of password minimum be 4 maximum be 10");
		}
	}

}
