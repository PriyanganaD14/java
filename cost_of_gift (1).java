class Gift
{
    public static void main(String args[])
    {
        int sweaterPrize=68;
        int sweaterAmount=3;
        int computerGamePrize=75;
        int computerGameAmount=1;
        int braceletsPrize=43;
        int braceletsAmmount=2;
        int returningbracelentAmount=1;
        int computerGameRebate=10;

        int purchasingPrize=(sweaterPrize*sweaterAmount)+(computerGamePrize*computerGameAmount)+(braceletsPrize*braceletsAmmount);
        int discountAndRebate=(braceletsPrize*returningbracelentAmount)+computerGameRebate;
        int finalPrize=(purchasingPrize-discountAndRebate);

        System.out.println("Final Gift Prize is $ "+finalPrize);
    }
}