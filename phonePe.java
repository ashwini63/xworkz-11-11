class phonePe{
	public static void payment(long mobilenum)
	{
	System.out.println("recharge plan for the number" +mobilenum+" "+"is done successfully");
	}
	public static void payment(String DTH)
	{
	System.out.println("your" +DTH+ "number bill paid");
	}
	public static void payment(int meterId, String name, int amount)
	{
	System.out.println("electricity bill" +meterId+ "of" +name+ "rs" +amount+ "is paid");
	}
	public static void payment(int creditcardnum, int amount)
	{
	System.out.println("credit card bill paid successfully" +creditcardnum+ "of amount" +amount);
	}
	public static void main(String []args)
	{
	phonePe.payment(1100021121);
	phonePe.payment("DTH765498321");
	phonePe.payment(987654,"divi",4000);
	phonePe.payment(196398,40000);
	}
}