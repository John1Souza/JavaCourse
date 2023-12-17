package Lambdas;


import java.text.DecimalFormat;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class BinaryOperatorChallenge {
    public static void main(String[] args) {
        System.out.println("WELCOME TO OUR STORE DEAR CUSTOMER!!!!");
        System.out.println("PLEASE ENTER YOUR PRODUCTS DATA...");

        Product product = new Product("iPad", 3755.69, 0.15);

        System.out.println("GOOD!!!");

        System.out.println("<----------------------------------------------------------------------------->");
        // 1. A partir do produto calcular o preço real
        System.out.println("PRODUCT REAL PRICE");
        System.out.println();
        UnaryOperator<Double> realPrice = (price) ->
                product.price * (1-product.discount);

        double productWithDiscount = realPrice.apply(product.price);

        System.out.printf("The price of the product %s, considering %.2f%% of discount is: R$ %f",
                product.name, (product.discount * 100), productWithDiscount);

        System.out.println("\n<----------------------------------------------------------------------------->");
        // 2. Imposto Municipal: >= 2500 (8,5%)/ < 2500 (Isento)
        System.out.println("MUNICIPAL TAX CALCULATION");
        Function<Double, Double> municipalTax = (price) -> (price >= 2500) ? (price * 0.085) : price;

        Function<Double, Boolean> isItSubjectToAFee = (price) ->
                price >= 2500;

        boolean canYouApplyFee = realPrice.andThen(isItSubjectToAFee).apply(product.price);
        double productTaxPrice = realPrice.andThen(municipalTax).apply(product.price);

        double productValue = productWithDiscount + productTaxPrice;

        if(canYouApplyFee){
            System.out.println("\nConsidering that the product price " +
                    "is greater than the limit of R$ 2.5000,00");
            System.out.printf("we are applying the municipal tax of 8.50%%. " +
                            "\nTherefore, the value of you tax is R$ %f ",
                    realPrice.andThen(municipalTax).apply(product.price));
            System.out.printf("\nAdding the discounted product price of R$ %f " +
                    "and the tax of %f, \nyour product price without shipping is R$ %f ",
                    productWithDiscount,
                    productTaxPrice,
                    productValue);
        }else{
            System.out.println("\nConsidering that the product price is" +
                    " less than the limit of R$ 2.5000,00");
            System.out.printf("you are free of municipal tax 8.50%%, " +
                            "\nand the value of you product without shipping is R$ %f",
                    productWithDiscount);
        }
        System.out.println("\n<----------------------------------------------------------------------------->");


        // 3. frete: >= 3000 (100)/ < 3000 (50)
        System.out.println("SHIPPING CALCULATION");
        System.out.println();
        Function<Double, Boolean> isAvailableForShippingTax = (prod) -> prod >= 3000;
        boolean availableForShippingTax = isAvailableForShippingTax.apply(productValue);
        int shippingTaxPrice;
        if(availableForShippingTax){
            System.out.println("Your product shipping tax is: R$ 300,00");
            shippingTaxPrice = 300;
        }else{
            System.out.println("Your product shipping tax is: R$ 50,00");
            shippingTaxPrice = 50;
        }
        System.out.println("<----------------------------------------------------------------------------->");

        // 4. Arredondar: Deixar duas casas decimais
        System.out.println("PRODUCT PRICE WITH TWO DECIMALS PLACES");
        System.out.println();

        double finalValue1 = (productValue + shippingTaxPrice);
        DecimalFormat df = new DecimalFormat("#.##");

        System.out.printf("Your product price converted is R$ %s ",
                df.format(finalValue1));
        System.out.println("\n<----------------------------------------------------------------------------->");


        // 5. Formatar: R$ 1234,56

        System.out.println();
        System.out.printf("The final price of your product is R$ %s",
                df.format(finalValue1).replace(".", ","));
    }
}
