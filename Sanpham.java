package baitap;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class Sanpham {
String nameSP;
String idSP;
int sl;
float dongia;
String HSD;
String NSX;
public String getNameSP() {
	return nameSP;
public void setNameSP(String nameSP) {
	this.nameSP = nameSP;
}
public String getIdSP() {
	return idSP;
}
public void setIdSP(String idSP) {
	this.idSP = idSP;
}
public int getSl() {
	return sl;
}
public void setSl(int sl) {
	this.sl = sl;
}
public float getDongia() {
	return dongia;
}
public void setDongia(float dongia) {
	this.dongia = dongia;
}
public String getNSX() {
	return NSX;
}
public void setNSX(String NSX) {
	this.NSX = NSX;
}
public String getHSD() {
	return HSD;
}
public void setHSD(String HSD) {
	HSD = HSD;
}

public Sanpham() {
}
public Sanpham(String nameSP, String idSP, int sl, float dongia,String NSX, String HSD ) {
	this.nameSP=nameSP;
	this.idSP=idSP;
	this.sl=sl;
	this.dongia=dongia;
	this.NSX=NSX;
	this.HSD=HSD;
}
}

