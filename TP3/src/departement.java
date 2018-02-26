
public class departement implements collection{
	String nom;
	professeur chefDepartement;
	personne tableauMembre[];
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public professeur getChefDepartement() {
		return chefDepartement;
	}
	public void setChefDepartement(professeur chefDepartement) {
		this.chefDepartement = chefDepartement;
	}
	
	public departement(String nom, professeur chefDepartement) {
		super();
		this.nom = nom;
		this.chefDepartement = chefDepartement;
tableauMembre= new personne[20];


}
	public Boolean addObject(Object o, int i) {
		if( o instanceof professeur) {tableauMembre[i]=(professeur) o;}
		else tableauMembre[i]=(doctorant) o;
		return true;
	}


	public Boolean removeObject(Object o, int i) {
		if( o instanceof professeur) {tableauMembre[i]=null;}
		else tableauMembre[i]=null;		return true;
	}


	public Object getObject(int i) {
		 return tableauMembre[i];
	}
	public double masse_salariale() {
		double sal =0;
		for(int i=0;i<10;i++) {
			if (tableauMembre[i] instanceof professeur)
			sal+=((professeur) tableauMembre[i]).calculeSalaire();
			}
		
		return sal;
	}
	}
