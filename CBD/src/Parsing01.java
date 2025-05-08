public class Parsing01 {
    public static void main(String[] args) {
        //Declare and intitialize 3 Strings: shirtPrice, taxRate, and gibberish
        String shirtPrice = "15";
        String taxRate = "0.05";
        String gibberish = "887ds7nds87dsfs";







        //Parse shirtPrice and taxRate, and print the total tax
        double taxRate1 = Double.parseDouble(taxRate);
        int shirtPrice1 = Integer.parseInt(shirtPrice);
        System.out.println("Shirt Price: " + shirtPrice1);
        System.out.println("Tax Rate: " + taxRate1);
        System.out.println("Total Tax = " + shirtPrice1 * taxRate1);


        //Try to parse taxRate as an int
        int taxRate2 = Integer.parseInt(taxRate);
        System.out.println(taxRate2);
        //Try to parse gibberish as an int
        int gibberish1 = Integer.parseInt(gibberish);
        System.out.println(gibberish1);
    }

}