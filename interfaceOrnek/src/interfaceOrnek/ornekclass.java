package interfaceOrnek;

public class ornekclass implements classinterface
{

	
	public void topla(int... sayilar) 
	{
		int toplam =0;
		for (int i : sayilar) {
			toplam +=i;
		}
		System.out.println(toplam);	
	}

	
	public void cikar(int... sayilar) 
	{
		int fark =0;
		for (int i : sayilar) {
			fark -=i;
		}
		System.out.println(fark);
	}

	
	public void carp(int... sayilar) 
	{
		int carpim =1;
		for (int i : sayilar) {
			carpim *=i;
		}
		System.out.println(carpim);	
	}

	
	public void bol(int sayi1, int sayi2) 
	{
		
		System.out.println(sayi1/sayi2);
	}

}
