package advance3.assignment2;

public class AccountTester {
    public void acceptCustomerInfo()
    {
        System.out.println("\n\n\tPlease enter the details of the customer");
        System.out.print("Customer ID:");
        String custId=Readdata.acceptstring();
        System.out.print("Customer Name:");
        String custName=Readdata.acceptstring();
        System.out.println("Account Id:");
        String accId=Readdata.acceptstring();
        System.out.println("Balance:");
        String balance=Readdata.acceptstring();

        Customer customer=new Customer();
        customer.setCustomerId(Integer.parseInt(custId));
        customer.setCustomerName(custName);
        customer.setAccountNo(Integer.parseInt(accId));
        customer.setBalance(Double.parseDouble(balance));

        int status=new AccountFileDB().saveAccount(customer);

        if(status==0)
        {
            System.out.println("Your Details are saved");
            Readdata.acceptstring();
            System.out.println("\n\n\n\n\n\n");
        }
        else
        {
            System.out.println("Your Details cannot be saved try again later");
            Readdata.acceptstring();
            System.out.println("\n\n\n\n\n\n");
        }

    }

    public void displayCustInfo()
    {
        System.out.print("\n\nPlease Enter Customer ID:");
        String custId=Readdata.acceptstring();
        Customer customer=new AccountFileDB().getCustomer(Integer.parseInt(custId));

        if(customer!=null)
        {
            System.out.println("Customer ID:"+customer.getCustomerId());
            System.out.println("Customer Name:"+customer.getCustomerName());
            System.out.println("Account Number:"+customer.getAccountNo());
            System.out.println("Acccount Balance:"+customer.getBalance());
        }

        else
        {
            System.out.println("Invalid CustomerID");
            Readdata.acceptstring();
            System.out.println("\n\n\n\n\n\n");
        }
    }


    public void customerMenu()
    {
        while(true)
        {
            System.out.println();
            System.out.println("\tCustomer Menu");

            System.out.println("1. Add Customer");
            System.out.println("2. Get Customer Info");
            System.out.println("3. Exit");
            System.out.print("\n Enter option:");
            String optedValue=Readdata.acceptstring();
            int option=Integer.parseInt(optedValue);


            switch(option)
            {
                case 1: acceptCustomerInfo(); break;
                case 2:displayCustInfo(); break;
                case 3: System.exit(0); break;

                default: System.out.println("Enter a Valid Option");

                    Readdata.acceptstring();

            }
        }

    }

}
