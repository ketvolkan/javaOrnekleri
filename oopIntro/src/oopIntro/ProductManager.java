package oopIntro;

public class ProductManager 
{

    public void addToCart(Product product) 
    {
        System.out.println(product.getName()+" Sepete ekleme kodu çaðýrýldý.");
    }

    public void deleteToCart() 
    {
        System.out.println("Sepetten çýkarma kodu çaðýrýldý.");
    }
    public void updateToCart() 
    {
        System.out.println("Sepet güncelleme kodu çaðýrýldý.");
    }
}