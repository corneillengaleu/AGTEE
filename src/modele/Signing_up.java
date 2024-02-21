package modele;

public class Signing_up {
	String lname;
	String fname;
	String mail;
	String password;
	int number;
	public Signing_up(String lname, String fname, String mail, String password, int number) {
		this.lname = lname;
		this.fname = fname;
		this.mail = mail;
		this.password = password;
		this.number = number;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
	/*
	// Mot de passe de 4 à 8 caractères nécessitant des chiffres et des alphabets des deux cas
	private static final String PASSWORD_REGEX =
	        "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{4,8}$";
	private static final Pattern PASSWORD_PATTERN =
	Pattern.compile(PASSWORD_REGEX);

	String password1 = "Stream@Java8";

	// Valider un mot de passe
	if (PASSWORD_PATTERN.matcher(password).matches()) {
	    System.out.print("The Password " + password + " is valid");
	}
	else {
	    System.out.print("The Password " + password + " isn't valid");
	*/
}
