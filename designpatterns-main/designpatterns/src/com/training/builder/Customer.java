package com.training.builder;


public class Customer {
	private final String firstName;
	private final String lastName;
	private final String middleName;
	private final String streetAddress;
	private final String city;
	private final String state;
	private final String zipCode;
	private final String homePhone;
	private final String cellPhone;
	private final String email;
	
	
	private Customer(Builder builder) {
		this.firstName = builder.firstName;
		this.lastName = builder.lastName;
		this.middleName = builder.middleName;
		this.streetAddress = builder.streetAddress;
		this.city = builder.city;
		this.state = builder.state;
		this.zipCode = builder.zipCode;
		this.homePhone = builder.homePhone;
		this.cellPhone = builder.cellPhone;
		this.email = builder.email;
	}
	
	
	@Override
	public String toString() {
		return "Customer [firstName=" + firstName + ", lastName=" + lastName + ", middleName=" + middleName
				+ ", streetAddress=" + streetAddress + ", city=" + city + ", state=" + state + ", zipCode=" + zipCode
				+ ", homePhone=" + homePhone + ", cellPhone=" + cellPhone + ", email=" + email + "]";
	}


	public static class Builder {
		// Required parameters
		private final String firstName;
		private final String lastName;
		
		// Optional parameters
		private String middleName = null;
		private String streetAddress = null;
		private String city = null;
		private String state = null;
		private String zipCode = null;
		private String homePhone = null;
		private String cellPhone = null;
		private String email = null;
		
		public Builder(String firstName, String lastName) {
			this.firstName = firstName;
			this.lastName = lastName;
		}
		
		public Builder middleName(String middleName) {
			this.middleName = middleName;
			return this;
		}
		
		public Builder streetAddress(String streetAddress) {
			this.streetAddress = streetAddress;
			return this;
		}
		
		public Builder city(String city) {
			this.city = city;
			return this;
		}
		
		public Builder state(String state) {
			this.state = state;
			return this;
		}
		
		public Builder zipCode(String zipCode) {
			this.zipCode = zipCode;
			return this;
		}
		
		public Builder cellPhone(String cellPhone) {
			this.cellPhone = cellPhone;
			return this;
		}
		
		public Builder homePhone(String homePhone) {
			this.homePhone = homePhone;
			return this;
		}
		
		public Builder email(String email) {
			this.email = email;
			return this;
		}
		
		public Customer build() {
			return new Customer(this);
		}
	}
	
	
	
	public static void main(String[] args) {
		Customer customer = new Customer.Builder("Gajendran", "Ganesapandian")
									.streetAddress("3rd st,vadapalani")
									.city("Chennai")
									.state("Tamilnadu")
									.zipCode("600026")
									.build();
		System.out.println(customer);
		
		Customer emailCustomer = new Customer.Builder("Anand","suresh")
								.email("test@yahoo.com")
								.build();
		System.out.println(emailCustomer);
		
	}

}