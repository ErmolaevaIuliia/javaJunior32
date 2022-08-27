package lesson19;

public class Tovar implements Comparable <Tovar>{
    private String name;
    private int price;
    private int salePrice;
    private int buyCount;
    private int reviewCount;
    private int rateCount;

    public Tovar() {
    }

    public Tovar(String name, int price, int salePrice, int buyCount, int reviewCount, int rateCount) {
        this.name = name;
        this.price = price;
        this.salePrice = salePrice;
        this.buyCount = buyCount;
        this.reviewCount = reviewCount;
        this.rateCount = rateCount;
    }

    public int getReviewCount() {
        return reviewCount;
    }

    public void setReviewCount(int reviewCount) {
        this.reviewCount = reviewCount;
    }

    public int getRateCount() {
        return rateCount;
    }

    public void setRateCount(int rateCount) {
        this.rateCount = rateCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(int salePrice) {
        this.salePrice = salePrice;
    }

    public int getBuyCount() {
        return buyCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Tovar tovar = (Tovar) o;

        if (price != tovar.price) return false;
        if (salePrice != tovar.salePrice) return false;
        if (buyCount != tovar.buyCount) return false;
        if (reviewCount != tovar.buyCount) return false;
        if (rateCount != tovar.rateCount) return false;
        return name != null ? name.equals(tovar.name) : tovar.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + price;
        result = 31 * result + salePrice;
        result = 31 * result + buyCount;
        result = 31 * result + reviewCount;
        result = 31 * result + rateCount;
        return result;
    }

    @Override
    public String toString() {
        return "Tovar{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", salePrice=" + salePrice +
                ", buyCount=" + buyCount +
                ", reviewCount=" + reviewCount +
                ", rateCount=" + rateCount +
                '}';
    }

    public void setBuyCount(int buyCount) {
        this.buyCount = buyCount;
    }

    @Override
    public int compareTo(Tovar o) {
        // this - первый товар
        // o - второй товар
        // по умолчанию - сортируем по цене от МИН к МАКС

        if (this.getPrice() != o.getPrice()){
            return this.getPrice() - o.getPrice();
        }
        if(this.getSalePrice() != o.getSalePrice()){
            return this.getSalePrice() - o.getSalePrice();
        }
        if(this.getBuyCount() != o.getBuyCount()){
            return this.getBuyCount() - o.getBuyCount();
        }
        if(this.getBuyCount() != o.getBuyCount()){
            return this.getBuyCount() - o.getBuyCount();
        }
        if(!this.getName().equals(o.getName())){
            return this.getName().compareTo(o.getName());
        }

        return 0;
    }
}
