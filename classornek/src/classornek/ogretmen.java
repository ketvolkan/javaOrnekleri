package classornek;
import java.time.LocalDate;

public class ogretmen 
{
	String Ad,Soyad,Memleket;
	int Yas;	
	public ogretmen(String ad,String soyad,String memleket,int yas)
	{
		Ad = ad;
		Soyad = soyad;
		Memleket = memleket;
		Yas = yas;
	}
	public static void katilma(ogrenci katilan)
	{
		LocalDate suan = LocalDate.now(); 
		System.out.println(katilan.Ad+" "+katilan.Soyad+" Tarihte:"+suan+" Kat?ld?");
	}
	public static void puanDegistir(ogrenci ogr,int ekleme)
	{
		ogr.puan += ekleme;
	}
}
