public class FirstClass {
    public static void main(String[] args) {
        Notebook notebook = new Notebook (600,3000, 2015);
        System.out.println("notebook.weight: " + notebook.weight + "  notebook.price: " + notebook.price + "  notebook.year: " + notebook.year);
       // notebook.checkPrice();
       // notebook.checkWeight();
        notebook.checkPriceAndYear();


        Notebook heavyNotebook = new Notebook (2000,5000, 2023);
        System.out.println("heavyNotebook.weight: " + heavyNotebook.weight + "  heavyNotebook.price: " + heavyNotebook.price + "  heavyNotebook.year: " + heavyNotebook.year);
        //heavyNotebook.checkPrice();
       // heavyNotebook.checkWeight();
        heavyNotebook.checkPriceAndYear();

        Notebook oldNotebook = new Notebook (1200,1000, 2005);
        System.out.println("oldNotebook.weight: " + oldNotebook.weight + "  oldNotebook.price: " + oldNotebook.price + "  oldNotebook.year: " + oldNotebook.year);
        //oldNotebook.checkPrice();
        //oldNotebook.checkWeight();
        oldNotebook.checkPriceAndYear();



        /*
        if (notebook.price < 1050){
            System.out.println("This notebook is cheap");
        } else {
            System.out.println("Drogi skubaniec");
        }

        String example = "Hello from FirstClass!";
        System.out.println(example); */
    }
}