package oopIntro;

public class Main 
{

    public static void main(String[] args)
    {
        Product product1 =new Product();
        product1.setId(1);
        product1.setName("Lenovo V14");
        product1.setDetail("8 GB RAM");
        product1.setDiscount(10);
        product1.setUnitPrice(16000);
        System.out.println(product1.getUnitPriceAfterDiscount());
        
        Product product2 =new Product();
        product2.setId(2);
        product2.setName("Lenovo V15");
        product2.setDetail("16 GB RAM");
        product2.setDiscount(5);
        product2.setUnitPrice(20000);
        System.out.println(product2.getUnitPriceAfterDiscount());
        
        Product product3 =new Product();
        product3.setId(3);
        product3.setName("Lenovo V16");
        product3.setDetail("32 GB RAM");
        product3.setDiscount(15);
        product3.setUnitPrice(23000);
        System.out.println(product3.getUnitPriceAfterDiscount());
        
        Product[] urunler = {product1,product2,product3}; 
        
        Category category1 = new Category();
        category1.setId(1);
        category1.setName("Ýçecek");
       
        
        Category category2 = new Category();
        category2.setId(2);
        category2.setName("Yiyecek");
        
        System.out.println(category1.getName());
        System.out.println(category2.getName());
        
        
    }

}

