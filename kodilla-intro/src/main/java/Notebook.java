public class Notebook {
    int weight;
    int price;
    int year;
    public Notebook(int weight, int price, int year){
        this.weight = weight;
        this.price = price;
        this.year = year;

}
public void checkPrice (){
        if (this.price < 1050){
            System.out.println("Taniusieńki");
        } else if (this.price > 1050 && this.price < 4000) {
            System.out.println("Spoko cena");
        } else if (this.price > 4000) {
            System.out.println("Drogi skubaniec");
        }
}

public void checkWeight(){
    if (this.weight < 1000) {
        System.out.println("Leciutki");
    } else if (this.weight > 1100 && this.weight < 1500) {
        System.out.println("Normalnie wazy");
    } else {
        System.out.println("No tego pustaka to nie chcesz nosic w plecaku");
    }
}

    public void checkPriceAndYear (){
        if (this.price < 1050){
            System.out.println("Taniusieńki");
        } else if (this.price > 1050 && this.price < 4000) {
            System.out.println("Spoko cena");
        } else if (this.price > 4000) {
            System.out.println("Drogi skubaniec");
        }

        if (this.year < 2014){
            System.out.println(" i już trochę leciwy\n");
        } else if (this.year > 2014 && this.year < 2022) {
            System.out.println(" i nie aż taki stary\n");
        } else if (this.year > 2022) {
            System.out.println(" i śieżutki sprzęcik\n");
        }
    }


}



