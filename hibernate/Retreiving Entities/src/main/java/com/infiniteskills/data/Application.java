package com.infiniteskills.data;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Date;

import org.hibernate.Session;

import com.infiniteskills.data.entities.Account;
import com.infiniteskills.data.entities.Address;
import com.infiniteskills.data.entities.Bank;
import com.infiniteskills.data.entities.Credential;
import com.infiniteskills.data.entities.Transaction;
import com.infiniteskills.data.entities.User;

public class Application {

	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		try {
			org.hibernate.Transaction transaction = session.beginTransaction();
			
			Bank bank = (Bank) session.load(Bank.class, 123L);
			System.out.println("Method Executed");
			
			System.out.println(bank.getName());
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			session.close();
			HibernateUtil.getSessionFactory().close();
		}
	}

	private static Bank createBank() {
		Bank bank = new Bank();
		bank.setName("First United Federal");
		bank.setAddressLine1("103 Washington Plaza");
		bank.setAddressLine2("Suite 332");
		bank.setAddressType("PRIMARY");
		bank.setCity("New York");
		bank.setCreatedBy("Kevin Bowersox");
		bank.setCreatedDate(new Date());
		bank.setInternational(false);
		bank.setLastUpdatedBy("Kevin Bowersox");
		bank.setLastUpdatedDate(new Date());
		bank.setState("NY");
		bank.setZipCode("10000");
		return bank;
	}

	private static User createUser() {
		User user = new User();
		Address address = createAddress();
		user.setAddresses(Arrays.asList(new Address[]{createAddress()}));
		user.setBirthDate(new Date());
		user.setCreatedBy("Kevin Bowersox");
		user.setCreatedDate(new Date());
		user.setCredential(createCredential(user));
		user.setEmailAddress("test@test.com");
		user.setFirstName("John");
		user.setLastName("Doe");
		user.setLastUpdatedBy("system");
		user.setLastUpdatedDate(new Date());
		return user;
	}

	private static Credential createCredential(User user) {
		Credential credential = new Credential();
		credential.setUser(user);
		credential.setUsername("test_username");
		credential.setPassword("test_password");
		return credential;
	}

	private static Address createAddress() {
		Address address = new Address();
		address.setAddressLine1("101 Address Line");
		address.setAddressLine2("102 Address Line");
		address.setCity("New York");
		address.setState("PA");
		address.setZipCode("10000");
		address.setAddressType("PRIMARY");
		return address;
	}

	private static Transaction createNewBeltPurchase(Account account) {
		Transaction beltPurchase = new Transaction();
		beltPurchase.setAccount(account);
		beltPurchase.setTitle("Dress Belt");
		beltPurchase.setAmount(new BigDecimal("50.00"));
		beltPurchase.setClosingBalance(new BigDecimal("0.00"));
		beltPurchase.setCreatedBy("Kevin Bowersox");
		beltPurchase.setCreatedDate(new Date());
		beltPurchase.setInitialBalance(new BigDecimal("0.00"));
		beltPurchase.setLastUpdatedBy("Kevin Bowersox");
		beltPurchase.setLastUpdatedDate(new Date());
		beltPurchase.setNotes("New Dress Belt");
		beltPurchase.setTransactionType("Debit");
		return beltPurchase;
	}

	private static Transaction createShoePurchase(Account account) {
		Transaction shoePurchase = new Transaction();
		shoePurchase.setAccount(account);
		shoePurchase.setTitle("Work Shoes");
		shoePurchase.setAmount(new BigDecimal("100.00"));
		shoePurchase.setClosingBalance(new BigDecimal("0.00"));
		shoePurchase.setCreatedBy("Kevin Bowersox");
		shoePurchase.setCreatedDate(new Date());
		shoePurchase.setInitialBalance(new BigDecimal("0.00"));
		shoePurchase.setLastUpdatedBy("Kevin Bowersox");
		shoePurchase.setLastUpdatedDate(new Date());
		shoePurchase.setNotes("Nice Pair of Shoes");
		shoePurchase.setTransactionType("Debit");
		return shoePurchase;
	}

	private static Account createNewAccount() {
		Account account = new Account();
		account.setCloseDate(new Date());
		account.setOpenDate(new Date());
		account.setCreatedBy("Kevin Bowersox");
		account.setInitialBalance(new BigDecimal("50.00"));
		account.setName("Savings Account");
		account.setCurrentBalance(new BigDecimal("100.00"));
		account.setLastUpdatedBy("Kevin Bowersox");
		account.setLastUpdatedDate(new Date());
		account.setCreatedDate(new Date());
		return account;
	}
	
}
