package oopIntro;

public class ProductManager 
{

    public void addToCart(Product product) 
    {
        System.out.println(product.getName()+" Sepete ekleme kodu �a��r�ld�.");
    }

    public void deleteToCart() 
    {
        System.out.println("Sepetten ��karma kodu �a��r�ld�.");
    }
    public void updateToCart() 
    {
        System.out.println("Sepet g�ncelleme kodu �a��r�ld�.");
    }
}