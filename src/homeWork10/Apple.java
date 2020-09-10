package homeWork10;

public enum Apple {
    Jonatan(10), Goldendel(9), RedDel(8), Winesap, Cortland(6);
    private int price;

    Apple(int price) {
        this.price = price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    Apple() {
        this.price = -1;
    }


    int getPrice() {
        return price;
    }
}

