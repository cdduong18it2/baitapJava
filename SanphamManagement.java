package baitap;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Enumeration;
import java.util.Vector;
public class SanphamManagement {
Vector list = new Vector();
public SanphamManagement() {
	while(true)
	{
		System.out.println("Quan Li San Pham ");
		System.out.println("1. Nhap Thong Tin San Pham ");
		System.out.println("2. Xem Thong Tin San Pham ");
		int n;
		Scanner key = new Scanner(System.in);
		System.out.println("Chon Chuc Nang : ");
		n=key.nextInt();
		switch(n) {
		case 1: NhapTT();
		break;
		case 2: InTT();
		break;
		}
	}
}
public void NhapTT() {
	int n;
	Scanner key = new Scanner(System.in);
	System.out.println("Nhap tong so luong san pham: ");
	n = Integer.parseInt(key.nextLine());
	for(int i=1;i<=n;i++) {
		System.out.println("Nhap ten san pham: ");
		String nameSP = key.nextLine();
		System.out.println("Nhap ID: ");
		String idSP = key.nextLine();
		System.out.println("Don gia SP: ");
		Float dongia = key.nextFloat();
		key.nextLine();
		System.out.println("So luong: ");
		int sl = key.nextInt();
		key.nextLine();
		System.out.println("Ngay san xuat mat hang: ");
		SimpleDateFormat nsx = new SimpleDateFormat("yyyy-mm-dd");
		String NSX = key.nextLine();
		System.out.println("Han su dung san pham:  ");
		SimpleDateFormat hansudung = new SimpleDateFormat("yyyy-mm-dd");
		String HSD = key.nextLine();
		Sanpham SP = new Sanpham(nameSP,idSP,sl,dongia,NSX,HSD);
		list.add(SP);
	}
}
	public void InTT( ) {
		Enumeration eSanpham = list.elements();
		int i = 1;
		while(eSanpham.hasMoreElements()) {
		Sanpham sanpham = (Sanpham)eSanpham.nextElement();
		System.out.println("Ten San Pham: "+sanpham.getNameSP());
		System.out.println("ID SP: "+sanpham.getIdSP());
		System.out.println("Don gia mat hang: "+sanpham.getDongia());
		System.out.println("So luong san pham: "+sanpham.getSl());
		System.out.println("Ngay san xuat mat hang: "+sanpham.getNSX());
		System.out.println("Han su dung san pham: "+sanpham.getHSD());
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SanphamManagement();
	}
}
