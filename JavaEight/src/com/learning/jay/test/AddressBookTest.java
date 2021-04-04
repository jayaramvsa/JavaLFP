package com.learning.jay.test;

import com.learning.jay.domain.User;
import com.learning.jay.util.CustomerDataUtil;
import org.junit.Assert;
import org.junit.Test;

public class AddressBookTest {

    @Test
    public void createUser() {
        try {
            User createUserTest = CustomerDataUtil.createUser("Jayaram", "Arunachalam",
                    "jvsa@gmail.com", "+91 99900 77880", "V!jay3bava");
            Assert.assertEquals("Jayaram", createUserTest.getFirstName());
        } catch (Exception exception) {
            System.err.println("** Exception Message" + exception);
        }
    }

    /**
     * <p>Failure Test for Invalid First Name </p>
     *
     * @throws Exception
     */
    @Test(expected = Exception.class)
    public void nameFailure() throws Exception {

        User createUserTest = CustomerDataUtil.createUser("jayaram", "Arunachalam",
                "jvsa@gmail.com", "+91 99900 77880", "V!jay3bava");
    }

    /**
     * <p>Failure Test for Invalid emailId </p>
     *
     * @throws Exception
     */
    @Test(expected = Exception.class)
    public void emailFailure() throws Exception {
        User createUserTest = CustomerDataUtil.createUser("Jayaram", "Arunachalam",
                "jvsa@gmail", "+91 99900 77880", "V!jay3bava");
        Assert.assertEquals("null",createUserTest.getEmailId());
    }

    /**
     * <p>Failure Test for Invalid PhoneNo </p>
     *
     * @throws Exception
     */
    @Test(expected = Exception.class)
    public void phoneFailure() throws Exception {
        User createUserTest = CustomerDataUtil.createUser("Jayaram", "Arunachalam",
                "jvsa@gmail", "+9199900 77880", "V!jay3bava");
        Assert.assertEquals("null",createUserTest.getPhoneNo());
    }

    /**
     * <p>Failure Test for Invalid Password </p>
     *
     * @throws Exception
     */
    @Test(expected = Exception.class)
    public void passwordFailure() throws Exception {
        User createUserTest = CustomerDataUtil.createUser("Jayaram", "Arunachalam",
                "jvsa@gmail", "+9199900 77880", "daaeefdsf");
        Assert.assertEquals("null",createUserTest.getPassword());
    }

}
