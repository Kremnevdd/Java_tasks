public class Basket {
    private static int allGoodsCount = 0;
    private static int allGoodsPrice = 0;
    private int goodsCount = 0;
    private static int count = 0;
    private String items = "";
    private int totalPrice = 0;
    private int limit;
    private double totalWeight = 0;

    public Basket() {
        increaseCount(1);
        items = "Список товаров:";
        this.limit = 1000000;
    }

    public Basket(int limit) {
        this();
        this.limit = limit;
    }

    public Basket(String items, int totalPrice) {
        this();
        this.items = this.items + items;
        this.totalPrice = totalPrice;
    }

    public static void increaseAllPrice(int totalPrice) {
        allGoodsPrice = allGoodsPrice + totalPrice;

    }

    public static void increaseAllGoods(int goodsCount) {
        allGoodsCount = allGoodsCount + goodsCount;
    }

    public static int averageAllPrice(int allGoodsPrice, int allGoodsCount) {
        return allGoodsPrice / allGoodsCount;
    }

    public static int averageBasketPrice(int allGoodsPrice, int count) {
        return allGoodsPrice/count;
    }

    public static int getCount() {
        return count;
    }

    public static void increaseCount(int count) {
        Basket.count = Basket.count + count;
    }

    public void add(String name, int price) {
        add(name, price, 1);
    }

    public void add(String name, int price, int goodsCount) {
        add(name, price, goodsCount, 0);
    }

    public void clear() {
        items = "";
        totalPrice = 0;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public boolean contains(String name) {
        return items.contains(name);
    }

    public void print(String title) {
        System.out.println(title);
        if (items.isEmpty()) {
            System.out.println("Корзина пуста");
        } else {
            System.out.println(items);
        }
    }

    public void add(String name, int price, double weight) {
        add(name, price, 1, weight);


    }

    public void add(String name, int price, int goodsCount, double weight) {
        boolean error = false;
        if (contains(name)) {
            error = true;
        }

        if (totalPrice + goodsCount * price >= limit) {
            error = true;
        }

        if (error) {
            System.out.println("Error occured :(");
            return;
        }


        if (weight == 0) {
            items = items + "\n" + name + " - " +
                    goodsCount + " шт. - " + price;
        }
        if (weight != 0) {
            items = items + "\n" + name + " - " +
                    goodsCount + " шт. - " + weight + " грамм - " + price;
        }


        totalPrice = totalPrice + goodsCount * price;
        totalWeight = totalWeight + weight * goodsCount;
        increaseAllGoods(goodsCount);
        increaseAllPrice(totalPrice);


    }

    public double getWeight() {
        return totalWeight;
    }

}
