package com.bl.adp;

import java.util.List;
import java.util.Scanner;

public class AddressBook {
    public static void main(String args[]) {
        //Displaying the Weelcome Message
        System.out.println("Welcome to Address Book Program");

        AddressBook addressBook = new AddressBook();
        addressBook.addcontactdetails();
    }

    //Adding the details
    public void addcontactdetails() {
        ContactPerson contactPerson = new ContactPerson();
        System.out.println("enter the details");
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter first name");
        contactPerson.firstname = scanner.next();
        System.out.println("enter last name");
        contactPerson.lastname = scanner.next();
        System.out.println("enter address");
        contactPerson.address = scanner.next();
        System.out.println("enter city");
        contactPerson.city = scanner.next();
        System.out.println("enter state");
        contactPerson.state = scanner.next();
        System.out.println("enter pin code");
        contactPerson.pincode = scanner.nextInt();
        System.out.println("enter mobile number");
        contactPerson.phonenumber = scanner.nextInt();
        System.out.println("enter email id");
        contactPerson.email = scanner.next();

        Contacts contacts = new Contacts();
        contacts.add(contactPerson);

        System.out.println("The contact details:");
        System.out.println("first name:" + contactPerson.firstname);
        System.out.println("Last name:" + contactPerson.lastname);
        System.out.println("Address:" + contactPerson.address);
        System.out.println("City:" + contactPerson.city);
        System.out.println("Pin code" + contactPerson.pincode);
        System.out.println("State:" + contactPerson.state);
        System.out.println("Phone Number:" + contactPerson.phonenumber);
        System.out.println("Email:" + contactPerson.email);


    }
}