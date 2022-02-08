package com.bridgeabz.day9;

	import java.util.ArrayList;
	import java.util.HashMap;
	import java.util.Map;
	import java.util.Scanner;

	

	public class AddressBookMain {
		private static Scanner sc = new Scanner(System.in);
		private ArrayList<ContactPerson> contactArray = new ArrayList<>();
		private Map<String, ContactPerson> contactMap = new HashMap<>();


	public void addNewContact() {
		System.out.println("Enter First Name");
		String firstName = sc.next();
		System.out.println("Enter last Name");
		String lastName = sc.next();
		System.out.println("Enter the Address");
		String address = sc.next();
		System.out.println("Enter the City");
		String city = sc.next();
		System.out.println("Enter the State");
		String state = sc.next();
		System.out.println("Enter the Pincode");
		String pinCode = sc.next();
		System.out.println("Enter the Number");
		String phoneNumber = sc.next();
		System.out.println("Enter the Email");
		String emailId = sc.next();
		ContactPerson obj = new ContactPerson(firstName, lastName, address, city, state, pinCode, phoneNumber, emailId);
		contactArray.add(obj);
		contactMap.put(firstName, obj);
	}
	
	public void editContact() {

		System.out.println("Enter The First Name to edit the contact details");
		String fn = sc.next();
		ContactPerson obj = contactMap.get(fn);
		int check = 0;
		System.out.println("Person Found, What Do You Want To Edit");
		System.out.println("Enter\n1.lastName\n2.address\n3.city\n4.state\n5.Pincode\n6.phone\n7.email");
		check = sc.nextInt();
		switch (check) {
		case 1:
			System.out.println("Enter the last Name");
			String lastName = sc.next();
			obj.setLastName(lastName);
			break;
		case 2:
			System.out.println("Enter the Address");
			String address = sc.next();
			obj.setAddress(address);
			break;
		case 3:
			System.out.println("Enter the City");
			String city = sc.next();
			obj.setCity(city);
			break;
		case 4:
			System.out.println("Enter the State");
			String state = sc.next();
			obj.setState(state);
			break;
		case 5:
			System.out.println("Enter the Pincode");
			String pin = sc.next();
			obj.setPincode(pin);
			break;
		case 6:
			System.out.println("Enter the Number");
			String num = sc.next();
			obj.setPhoneNumber(num);
			break;
		case 7:
			System.out.println("Enter the Email");
			String em = sc.next();
			obj.setEmailId(em);
			break;
		default:
			System.out.println("Invalid Input");
		}
		
	}
	
	public void deleteContact() {
		System.out.println("Enter The First Name to delete the contact details");
		String fn = sc.next();
		ContactPerson obj = contactMap.get(fn);
		contactArray.remove(obj);
	}
	
	public void printContact() {
		System.out.println(contactArray);
	}
	
	public static void main(String[] args) {

		System.out.println("Welcome To Address Book System");
		AddressBookMain Contact1 = new AddressBookMain();
		boolean isExit = false;
		while (!isExit) {
			System.out.println("Enter  your choice \n1.Add new Contact \n2.Edit Contact \n3.Delete Contact \n4.Print Book \n5.Close");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				Contact1.addNewContact();
				break;
			case 2:
				Contact1.editContact();
				break;
			case 3:
				Contact1.deleteContact();
				break;
			case 4:
				Contact1.printContact();
				break;
			case 5:
				isExit = true;
				break;
			default:
				System.out.println("Invalid Input");
				break;
			}
		}
	}

	}