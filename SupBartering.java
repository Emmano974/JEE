import java.util.Scanner;

public class SupBartering{
    // Les entrées et les sorties
    private double expenses,income;

    //nombre d'objet à troquer dans la plateforme
    private Article [] articles= new Article[100]; 

    static Scanner input= new Scanner(System.in);

    //Créer un nouvel article
    public Article creatNewArticle() {
        String articleName=null;
        int articleNumber=0;
        float price=0;

        while(articleName==null || price==0){
            System.out.print("Nom d'article : ");
            articleName=input.nextLine();
            System.out.print("Prix : ");
            price=input.nextFloat();
            input.nextLine();
            System.out.println();
        }

        return new Article(articleName, articleNumber, price);
    }

    public void addToArticle() {
        for(int x=0; x<articles.length; x++) {
            if(articles[x]==null) {
                articles[x]=creatNewArticle();
                x=articles.length;
            }
        }
    }
    
    // afficher la liste d'objet
    public void printAll() {
        for(int x = 0; x<articles.length; x++) {
            if (articles[x]!=null) {
                System.out.println("Nom de l'article : "+articles[x].getName()+" et le prix est de : "+article[x].getPrice);
            }
        }
    }

    //achat de l'objet
    public void buyArticle() {
        int articleNumber=-1, quantity=0;

        while(articleNumber<0 || articles[articleNumber]==null) {
            System.out.print("Numéro d'article acheté : ");
            articleNumber=input.nextInt()-1;
            input.nextLine();
        }

        System.out.println();

        while(quantity<1) {
            System.out.print("Nombre d'article troqué :");
            quantity=input.nextInt();
            input.nextLine();
        }
    
        articles[articleNumber].setName(articles[articleNumber].getName()+quantity);
        expenses+=articles[articleNumber].getPrice()*quantity;

    }

    public void result () {
        System.out.println(income-expenses+ " Euro");
    }

    //vendre de l'objets
    public void sellArticle() {
        int articleNumber=-1, quantity=0;

        while(articleNumber<0 || articles[articleNumber]==null) {
            System.out.print("Numéro d'article vendu : ");
            articleNumber=input.nextInt()-1;
            input.nextLine();
        }

        System.out.println();

        while(quantity<1) {
            System.out.print("Nombre d'article troqué :");
            quantity=input.nextInt();

        }
        articles[articleNumber].setName(articles[articleNumber].getName()-quantity);
        income+=articles[articleNumber].getPrice()*quantity;
    }
}