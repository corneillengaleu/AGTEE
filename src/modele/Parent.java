package modele;

public class Parent {

	String fname,lname,profession,mail;
	int numberchil,tel1,tel2;
	public Parent(String fname, String lname, String profession, int numberchil, int tel1, int tel2,String mail) {
		this.fname = fname;
		this.lname = lname;
		this.profession = profession;
		this.numberchil = numberchil;
		this.tel1 = tel1;
		this.tel2 = tel2;
		this.mail=mail;
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
	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	public int getNumberchil() {
		return numberchil;
	}
	public void setNumberchil(int numberchil) {
		this.numberchil = numberchil;
	}
	public int getTel1() {
		return tel1;
	}
	public void setTel1(int tel1) {
		this.tel1 = tel1;
	}
	public int getTel2() {
		return tel2;
	}
	public void setTel2(int tel2) {
		this.tel2 = tel2;
	}
}
