package classornek;

public class ogrenci 
{
	String Ad;
	String Soyad;
	String Memleket;
	int Yas;
	int puan=50;	
	public ogrenci(String ad,String soyad,String memleket,int i)
	{
		Ad = ad;
		Soyad = soyad;
		Memleket = memleket;
		Yas = i;
	}
	public void puanGoster() 
	{
		System.out.println(Ad+" "+Soyad+"-->"+puan);
	}
}

