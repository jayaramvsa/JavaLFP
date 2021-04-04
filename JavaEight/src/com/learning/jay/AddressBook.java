package com.learning.jay;

import com.learning.jay.domain.Person;
import com.learning.jay.domain.User;
import com.learning.jay.util.CustomerDataUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {

    public static void main(String[] args) throws Exception {
        System.out.println("*** Welcome to AddressBook solution ***");
        Person person = new Person();
        Scanner scanner = new Scanner(System.in);
        // Enter Details Using Java Console
        CustomerDataUtil.createCustomerData(person, scanner);
        List<Person> personList = new ArrayList<>();
        personList.add(person);
        CustomerDataUtil.deleteCustomerDataUsingFirstName(personList, scanner);
        System.out.println("*** The List value is **" + personList.size());

        //Add User Details
        try {
            List<User> userList = new ArrayList<>();
            userList.add(CustomerDataUtil.createUser("Jayaram", "Arunachalam",
                    "jayaramvsa@gmail.com", "+91 91000 81000", "P0dago!o"));
            System.out.println("Value of the User is ::" + userList.get(0));
        } catch (Exception exception) {
            System.err.println("** Exception Occurred during Data insertion *** \n" + exception);
        } finally {
            scanner.close();
        }


    }
}
