public class main {
    public static void main(String[], args) {
        SupBartering shop=new Shop();
        shop.addToArticle();
        shop.addToArticle();

        shop.buyArticle();

        shop.printAll();

        shop.result();

        shop.sellArticle();
    }
}

