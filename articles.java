public class Article {
    private String name;
    private float price;
    private int number;

    public Article(String name, float price, int number) {
        //nom du produit
        this.name = name;

        //prix du produit
        this.price = price;

        //quantité du produit
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public float getPrice(){
        return price;
    }

    public void setPrice(float price){
        this.price = price;
    }

    public int getNumber(int number){
        return number;
    }

    public void setNumber(int number){
        this.number = number;
    }
}