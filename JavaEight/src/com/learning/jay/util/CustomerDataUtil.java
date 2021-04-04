package com.learning.jay.util;

import com.learning.jay.domain.Person;
import com.learning.jay.domain.User;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class CustomerDataUtil {

    /**
     * <p>Method used to create Person Object using given Command Line</p>
     * @param person
     * @param scanner
     */
    public static void createCustomerData(Person person, Scanner scanner) {
        System.out.println("*** Enter your firstName ***");
        person.setFirstName(scanner.nextLine());
        System.out.println("*** Enter your lastName ***");
        person.setLastName(scanner.nextLine());
        System.out.println("*** Enter your address ***");
        person.setAddress(scanner.nextLine());
        System.out.println("*** Enter your city ***");
        person.setCity(scanner.nextLine());
        System.out.println("*** Enter your state ***");
        person.setState(scanner.nextLine());
        System.out.println("*** Enter your zipCode ***");
        person.setZipCode(scanner.nextLine());
        System.out.println("*** Enter your emailId ***");
        person.setEmailId(scanner.nextLine());
        System.out.println("*** Enter your mobileNo ***");
        person.setMobileNo(scanner.nextLine());
    }

    /**
     * <p>This Method is used to delete the Customer Record using First Name</p>
     *
     * @param personList
     * @param scanner
     */
    public static void deleteCustomerDataUsingFirstName(List<Person> personList, Scanner scanner) {
        System.out.println("*** Enter firstName that needs to be deleted ***");
        String strFirstName = scanner.nextLine();
        System.out.println("*** The FirstName is  ***" + strFirstName);
        Iterator<Person> itrPerson = personList.iterator();
        while (itrPerson.hasNext()) {
            Person personToBeDeleted = itrPerson.next();
            if (personToBeDeleted.getFirstName().equalsIgnoreCase(strFirstName)) {
                itrPerson.remove();
                return;
            }
        }
    }

    /**
     * <p>This method is used to Create User Data and Validate for the given input</p>
     * @param strFistName
     * @param strLastName
     * @param strEmailId
     * @param strPhoneNo
     * @param strPassWord
     * @return
     * @throws Exception
     */
    public static User createUser(String strFistName, String strLastName, String strEmailId, String strPhoneNo, String strPassWord) throws Exception {
        if (Validation.validateUserDetails(strFistName, strLastName, strEmailId, strPhoneNo, strPassWord)) {
            return (new User(strFistName, strLastName, strEmailId, strPhoneNo, strPassWord));
        } else {
            return null;
        }

    }
}
