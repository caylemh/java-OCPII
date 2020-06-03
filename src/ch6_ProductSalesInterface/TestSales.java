package ch6_ProductSalesInterface;

public class TestSales {
    public static void main(String[] args) {
        CrushedRock rock1 = new CrushedRock(12, 10, 50);
        SalesCalcs rock2 = new CrushedRock(12, 10, 50);
        System.out.println("Sales Price: " + rock1.calcSalesPrice());
        System.out.println("Sales Price: " + rock2.calcSalesPrice());

        SalesCalcs[] itemList = new SalesCalcs[6];

        itemList[0] = new CrushedRock(12, 10, 50);
        itemList[1] = new CrushedRock(8, 6, 10);
        itemList[2] = new RedPaint(10, 8, 25);
        itemList[3] = new Widget(6, 5, 10);
        itemList[4] = new Widget(14, 12, 20);
        itemList[5] = new WidgetPro(15,14,45,"sturdy");

        System.out.println("==Sales Report==");
        for(SalesCalcs item:itemList){
            item.printItemReport();
        }

        SalesCalcs.printItemArray(itemList);

    }
}