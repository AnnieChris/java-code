package com.training.mars;

import java.util.Scanner;

public class EBCalculate {

	public static void main(String[] args) {

		Scanner scanner = null;
		try {
			scanner = new Scanner(System.in);
			System.out.println("Enter the number of customers");
			int count = scanner.nextInt();
			Customer[] customers = new Customer[count];
			System.out.println("Enter the customer data values in the format 'consumer number, name, unit consumption' ");

			int i = 0;
			String customerData = null;
			while (i < count) {

				System.out.println("Enter customer data " + (i + 1) + " : ");
				customerData = scanner.next();

				try {
					if (validateInput(customerData)) {

						customers[i] = new Customer(customerData);
						i++;
					}
				} catch (Exception e) {

					System.out.println("Error - " + e.getMessage() + " Please re-enter.");
				}
			}
			for (Customer customer : customers) {

				System.out.println(customer);
			}
		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}

	private static boolean validateInput(String customerData) throws MinimumUnitsException {

		if (customerData.equals("") || customerData.split(",").length != 3) {

			System.out.println("Invalid customer data. Please re-enter.");
			return false;
		}
		if (Integer.parseInt(customerData.split(",")[2]) < 50) {

			throw new MinimumUnitsException("No of units can not be less than 50.");
		}

		return true;
	}

}

class MinimumUnitsException extends Exception {
	public MinimumUnitsException(String errorMessage) {
		super(errorMessage);
	}
}

class Customer {

	String name;
	int customerNo;
	int noOfUnits;
	double bill = 50;

	public Customer(String customerData) {
		super();
		this.customerNo = Integer.parseInt(customerData.split(",")[0]);
		this.name = customerData.split(",")[1];
		this.noOfUnits = Integer.parseInt(customerData.split(",")[2]);
		this.bill = noOfUnits > 1000 ? (0.75 * noOfUnits) : (noOfUnits > 500 ? noOfUnits : (noOfUnits > 200 ? (1.25 * noOfUnits) : 50));

	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", customerNo=" + customerNo + ", noOfUnits=" + noOfUnits + ", bill=" + bill
				+ "]";
	}

}
