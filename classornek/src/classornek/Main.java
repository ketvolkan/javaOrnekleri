package classornek;

public class Main {

	public static void main(String[] args) {
		ogrenci[] ogr = new ogrenci[2];
		ogr[0]=new ogrenci("Volkan","Ket","Aydýn",19);	
		ogr[1]=new ogrenci("Nazmi","Becerik","Aydýn",23);	
		ogretmen ogrtmn = new ogretmen("Engin","Demiroð","Bilinmiyor",30);
		
		ogrtmn.katilma(ogr[0]);
		ogrtmn.katilma(ogr[1]);
	
		ogrtmn.puanDegistir(ogr[0], 30);
		
		ogr[0].puanGoster();
		
		ogrtmn.puanDegistir(ogr[0], -20);
		ogrtmn.puanDegistir(ogr[1], 49);
		
		ogr[1].puanGoster();
		ogr[0].puanGoster();
		
	}

}
