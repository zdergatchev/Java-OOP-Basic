package ShoppingSpree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Person> persons = new LinkedHashMap<>();
        Map<String, Product> products = new LinkedHashMap<>();
            String[] somePeoples = reader.readLine().split(";");
            for (String somePeople : somePeoples) {
                String[] tokens = somePeople.split("=");
                String name = tokens[0];
                double money = Double.parseDouble(tokens[1]);
                try{
                    Person person = new Person(name, money);
                    persons.putIfAbsent(person.getName(), person);
                } catch (IllegalArgumentException e){
                    System.out.println(e.getMessage());
                    return;
                }
            }
            String[] someProducts = reader.readLine().split(";");
            for (String someProduct : someProducts) {
                String[] tokens = someProduct.split("=");
                String name = tokens[0];
                double money = Double.parseDouble(tokens[1]);
                try{
                    Product product = new Product(name, money);
                    products.putIfAbsent(product.getName(), product);
                } catch (IllegalArgumentException e){
                    System.out.println(e.getMessage());
                    return;
                }
            }
            String command = "";

            while(!"END".equals((command = reader.readLine()))){
                String[] commands = command.split("\\s+");
                try{
                    persons.get(commands[0]).boughtProduct(products.get(commands[1]));
                } catch (IllegalArgumentException e){
                    System.out.println(e.getMessage());
                }
            }


        if(persons.size() != 0 && products.size() != 0){
            persons.entrySet().forEach(p -> {
                List<String> productsName = new ArrayList<>();
                if(p.getValue().getProducts().iterator().hasNext()){
                    p.getValue().getProducts().forEach(pr -> productsName.add(pr.getName()));
                } else {
                   productsName.add("Nothing bought");
                }
                System.out.println(p.getKey() + " - " + String.join(", ", productsName));
            });
        }
    }
}


