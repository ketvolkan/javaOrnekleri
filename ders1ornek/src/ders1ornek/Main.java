package ders1ornek;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Random;
import java.util.Collections;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		int sayi1=3;
		int sayi2 = 4;
		//if
		if(sayi1<sayi2)
		{
			System.out.println("sayi 1 B?y?kt?r day????");
		}
		else if(sayi1>sayi2)
		{
			System.out.println("sayi 2 B?y?kt?r day????");
		}
		else 
		{
			System.out.println("sayilar e?it day????");	
		}
		//dizi
		String[] isimler = {"Ali","?brahim","Volkan","Nazmi","Mehmet","Ahmet"};
		//2boyutlu dizi
		String[][] isimlers = {{"ddd","aaa","dd"},{"dd"},{"aa","ss"},{"dd","aa"}};
		int[][] dama =  new int[8][8];
		//foreach
		System.out.println("-------------");
		for(String item : isimler) {
			System.out.println(item);
		}
		//for
		System.out.println("-------------");
		//Sort-Reverse
		Arrays.sort(isimler);
		Collections.reverse(Arrays.asList(isimler)); 
		for (int i = 0;i<isimler.length;i++) {
			System.out.println(isimler[i]);	
		}
		//say? asalm?
		System.out.println("-------------");
		System.out.println(asalmi(23));
		//Say? M?kkemmel mi
		System.out.println("-------------");
		System.out.println(mukkemmelMi(28));
		//2 sayi arkada? say?lar m?
		System.out.println("-------------");
		System.out.println(arkadasSayilarMi(220,284));
		//2 sayi arkada? say?lar m?
		System.out.println("-------------");
		tekrarlanmayanDizi(30);
	}
	
	public static String asalmi(int sayi)
	{	
		boolean kontrol = false;
		String durum = "";
		for (int i = 3; i <sayi; i++) 
		{
			if(sayi%i==0)
			{
				kontrol = true;
			}	
		}
		if(kontrol)
		{
			durum ="Asal de?ildir";
		}
		else 
		{
			durum = "Asal";
		}
		return durum;
	}
	public static String mukkemmelMi(int sayi)
	{	
		int bolenler = 0;
		String durum = "";
		for (int i = 1; i <sayi; i++) 
		{
			if(sayi%i==0)
			{
				bolenler +=i;
			}	
		}
		if(sayi == bolenler)
		{
			durum ="Mukkemmel Sayi";
		}
		else 
		{
			durum = "Mukkemmel Sayi de?il";
		}
		return durum;
	}
	public static String arkadasSayilarMi(int sayi,int sayi2)
	{	
		int bolenler = 0;
		int bolenler2 = 0;
		String durum = "";
		for (int i = 1; i <sayi; i++) 
		{
			if(sayi%i==0)
			{
				bolenler +=i;
			}	
		}
		for (int i = 1; i <sayi2; i++) 
		{
			if(sayi2%i==0)
			{
				bolenler2 +=i;
			}	
		}
		if(bolenler == sayi2 && bolenler2 == sayi)
		{
			durum ="Arkadas Sayilar";
		}
		else 
		{
			durum = "Arkadas Sayilar De?iller";
		}
		return durum;
	}
	public static void tekrarlanmayanDizi(int boyut) 
	{
		int[] dizi = new int[boyut];
		Random rnd = new Random();
		boolean kontrol = false;
		for (int i = 0; i < dizi.length; i++) 
		{
			kontrol = false;
			int randomsayi = rnd.nextInt(boyut);
			for (int j = 0; j < dizi.length; j++) 
			{
				if(dizi[j] == randomsayi) 
				{
					kontrol = true;				
				}
			}
			if(!kontrol)
			{
				dizi[i] = randomsayi;
				System.out.println(dizi[i]);				
			}
			else 
			{
				i--;
			}		
		}
	}
}
