import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Product> products = getProductList();
        for (Product p:products) {
            System.out.println(p.toString());
        }
    }

    static ArrayList<Product> getProductList () throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj nazwę pliku:");
        String fileName = sc.nextLine();
        sc.close();
        File file = new File(fileName);
        Scanner scFile = new Scanner(file);
        ArrayList<Product> products = new ArrayList<>();
        while (scFile.hasNextLine()){
            String[] productString = scFile.nextLine().split(";");
            products.add(new Product(productString[0],Integer.parseInt(productString[1])));
        }
        products.sort(Comparator.comparing(Product::getName));
        return products;
    }
}
