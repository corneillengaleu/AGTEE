package modele;


public class Student {
	String fname,lname,physical,classeroom,adress,nationality,naissance,lieu;
	String gender;String name;

public Student(String fname, String lname, String physical, String classeroom, String adress, String nationality,
		String naissance, String lieu, String gender) {
	super();
	this.fname = fname;
	this.lname = lname;
	this.physical = physical;
	this.classeroom = classeroom;
	this.adress = adress;
	this.nationality = nationality;
	this.naissance = naissance;
	this.lieu = lieu;
	this.gender = gender;
}
public Student(String name, String classeroom,String gender,String naissance ,String lieu,String physical, String nationality, String adress) {
	this.name = name;
	this.physical = physical;
	this.classeroom = classeroom;
	this.adress = adress;
	this.nationality = nationality;
	this.naissance = naissance;
	this.lieu = lieu;
	this.gender = gender;
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getNaissance() {
	return naissance;
}
public void setNaissance(String naissance) {
	this.naissance = naissance;
}
public String getLieu() {
	return lieu;
}
public void setLieu(String lieu) {
	this.lieu = lieu;
}
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public String getLname() {
	return lname;
}
public void setLname(String lname) {
	this.lname = lname;
}
public String getPhysical() {
	return physical;
}
public void setPhysical(String physical) {
	this.physical = physical;
}
public String getClasseroom() {
	return classeroom;
}
public void setClasseroom(String classeroom) {
	this.classeroom = classeroom;
}
public String getAdress() {
	return adress;
}
public void setAdress(String adress) {
	this.adress = adress;
}
public String getNationality() {
	return nationality;
}
public void setNationality(String nationality) {
	this.nationality = nationality;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}


}
