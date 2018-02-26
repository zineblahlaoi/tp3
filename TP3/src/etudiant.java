/**
 * 
 * @author lahlaoi zineb
 *
 */
public class etudiant extends personne implements collection {

	
	
	
	private Integer  nummerEtudiant;
	public Module tableauModule[] ;
	
	public etudiant() {
		super();
	}


	public etudiant(String nom,String email,Integer nummerEtudiant) {
		super(nom,email);
		this.nummerEtudiant=nummerEtudiant;
		
	tableauModule= new Module [6];
	for (int i = 0; i < 6; i++) {
        this.tableauModule[i]=new Module();}

	}
	

	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Integer getNummerEtudiant() {
		return nummerEtudiant;
	}
	public void setNummerEtudiant(Integer nummerEtudiant) {
		this.nummerEtudiant = nummerEtudiant;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}


	public Boolean addObject(Object o, int i) {
		
		tableauModule[i]= (Module) o;
		return true;
	}


	public Boolean removeObject(Object o, int i) {
		tableauModule[i]= null;
		return true;
	}


	public Object getObject(int i) {
	return tableauModule[i];
	}
	
	
	
	public String toString() {
		return "Etudiant [nom=" + nom + ", nummerEtudiant=" + nummerEtudiant + ", email=" + email + "]";
	}
	
	public void afficher()
	{
		System.out.println(toString());
	}
	
	

}


