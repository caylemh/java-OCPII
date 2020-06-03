package ch6_ProductSalesInterface;

public interface SalesCalcs {
    public static final String reportTitle="\n==Static List Report==";

    public String getName();
    public double calcSalesPrice();
    public double calcCost();
    public double calcProfit();

    public static void printItemArray(SalesCalcs[] items){
        System.out.println(reportTitle);
        for(SalesCalcs item:items){
            System.out.println("--" + item.getName() + " Report--");
            System.out.println("\tSales Price: " + item.calcSalesPrice());
            System.out.println("\tCost: " + item.calcCost());
            System.out.println("\tProfit: " + item.calcProfit());
        }
    }

    public default void printItemReport(){
        System.out.println("--" + this.getName() + " Report--");
        System.out.println("\tSales Price: " + this.calcSalesPrice());
        System.out.println("\tCost: " + this.calcCost());
        System.out.println("\tProfit: " + this.calcProfit());
    }
}
