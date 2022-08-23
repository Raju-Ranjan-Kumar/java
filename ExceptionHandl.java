class ExceptionHandl
{
    public static void main(String []args)
    {
        int balance=5000;
        int withdrawAmount=6000;
        try
        {
            if(balance<withdrawAmount)
            throw new ArithmeticException("Insufficient balance");
            balance=balance-withdrawAmount;
            System.out.println("Transaction Successfully Completed");
        }
        catch(ArithmeticException e)
        {
            System.out.println("Exception:"+e.getMessage());
        }
            System.out.println("Program continue");
    }
}