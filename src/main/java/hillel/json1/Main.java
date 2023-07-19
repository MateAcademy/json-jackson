package hillel.json1;

import hillel.json1.db.ProductDB;
import hillel.json1.model.Product;

/**
 * @author Serhii Klunniy
 */
public class Main {


    public static void main(String[] args) {
        /**
         *  Хотим с консоли добавить несколько товаров
         *  add - мы добавляем товар,
         *  print - выводим в консоль все товары
        */

        System.out.println(ProductDB.getProductArrayList());

    }
}
