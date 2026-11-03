package com.logicalstatements.pco;

import java.util.Scanner;

public class MetroManagementSystem {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String check;

		do {
			System.out.println("choose your purpose");
			System.out.println("1.Book Metro Ticket");
			System.out.println("2.Check Ticket Fare");
			System.out.println("3.Exit");

			check = sc.next();

			switch (check) {

			case "1":

				sc.nextLine();

				System.out.println("enter your current location");
				String CurrentLoc = sc.nextLine().trim();

				System.out.println("enter your starting point location");
				String StartingLoc = sc.nextLine().trim();

				System.out.println("enter your destination location");
				String DestinationLoc = sc.nextLine().trim();

				if (CurrentLoc.equalsIgnoreCase("Hyderabad") && (DestinationLoc.equalsIgnoreCase("Miyapur")
						|| DestinationLoc.equalsIgnoreCase("JNTU College")
						|| DestinationLoc.equalsIgnoreCase("KPHB Colony")
						|| DestinationLoc.equalsIgnoreCase("Kukatpally") || DestinationLoc.equalsIgnoreCase("Balanagar")
						|| DestinationLoc.equalsIgnoreCase("Moosapet")
						|| DestinationLoc.equalsIgnoreCase("Bharat Nagar")
						|| DestinationLoc.equalsIgnoreCase("Erragadda")
						|| DestinationLoc.equalsIgnoreCase("ESI Hospital")
						|| DestinationLoc.equalsIgnoreCase("SR Nagar") || DestinationLoc.equalsIgnoreCase("Ameerpet")
						|| DestinationLoc.equalsIgnoreCase("Punjagutta")
						|| DestinationLoc.equalsIgnoreCase("Irrum Manzil")
						|| DestinationLoc.equalsIgnoreCase("Khairatabad")
						|| DestinationLoc.equalsIgnoreCase("Lakdi-ka-pul")
						|| DestinationLoc.equalsIgnoreCase("Assembly") || DestinationLoc.equalsIgnoreCase("Nampally")
						|| DestinationLoc.equalsIgnoreCase("Gandhi Bhavan")
						|| DestinationLoc.equalsIgnoreCase("Osmania Medical College")
						|| DestinationLoc.equalsIgnoreCase("MGBS") || DestinationLoc.equalsIgnoreCase("Malakpet")
						|| DestinationLoc.equalsIgnoreCase("New Market")
						|| DestinationLoc.equalsIgnoreCase("Musarambagh")
						|| DestinationLoc.equalsIgnoreCase("Dilsukhnagar")
						|| DestinationLoc.equalsIgnoreCase("Chaitanyapuri")
						|| DestinationLoc.equalsIgnoreCase("Victoria Memorial")
						|| DestinationLoc.equalsIgnoreCase("LB Nagar") || DestinationLoc.equalsIgnoreCase("Nagole")
						|| DestinationLoc.equalsIgnoreCase("Uppal") || DestinationLoc.equalsIgnoreCase("Stadium")
						|| DestinationLoc.equalsIgnoreCase("NGRI") || DestinationLoc.equalsIgnoreCase("Habsiguda")
						|| DestinationLoc.equalsIgnoreCase("Tarnaka") || DestinationLoc.equalsIgnoreCase("Mettuguda")
						|| DestinationLoc.equalsIgnoreCase("Secunderabad East")
						|| DestinationLoc.equalsIgnoreCase("Parade Ground")
						|| DestinationLoc.equalsIgnoreCase("Paradise") || DestinationLoc.equalsIgnoreCase("Rasoolpura")
						|| DestinationLoc.equalsIgnoreCase("Prakash Nagar")
						|| DestinationLoc.equalsIgnoreCase("Begumpet")
						|| DestinationLoc.equalsIgnoreCase("Madhura Nagar")
						|| DestinationLoc.equalsIgnoreCase("Yousufguda")
						|| DestinationLoc.equalsIgnoreCase("Jubilee Hills Check Post")
						|| DestinationLoc.equalsIgnoreCase("Road No. 5 Jubilee Hills")
						|| DestinationLoc.equalsIgnoreCase("Peddamma Gudi")
						|| DestinationLoc.equalsIgnoreCase("Madhapur")
						|| DestinationLoc.equalsIgnoreCase("Durgam Cheruvu")
						|| DestinationLoc.equalsIgnoreCase("HITEC City") || DestinationLoc.equalsIgnoreCase("Raidurg")
						|| DestinationLoc.equalsIgnoreCase("JBS Parade Ground")
						|| DestinationLoc.equalsIgnoreCase("Secunderabad West")
						|| DestinationLoc.equalsIgnoreCase("Gandhi Hospital")
						|| DestinationLoc.equalsIgnoreCase("Musheerabad")
						|| DestinationLoc.equalsIgnoreCase("RTC X Roads")
						|| DestinationLoc.equalsIgnoreCase("Chikkadpally")
						|| DestinationLoc.equalsIgnoreCase("Narayanaguda")
						|| DestinationLoc.equalsIgnoreCase("Sultan Bazaar"))) {

					System.out.println("Ticket Booking Available");

				} else {

					System.out.println("Ticket Booking Not Available");

				}

				break;

			case "2":

				System.out.println("Check Ticket Fare");
				break;

			case "3":

				System.out.println("Exit");
				break;

			default:

				System.out.println("Invalid choice");

			}

		} while (!check.equals("3"));

		sc.close();
	}
}