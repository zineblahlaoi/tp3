
public class doctorant extends etudiant implements salarie {

	String SujetThese;
	professeur Encadrant;
	public doctorant() {
		super();
	}
	
	public doctorant(String nom,String email,Integer nummerEtudiant,String sujetThese,  professeur Encadrant) {
		super(nom,email,nummerEtudiant);
		SujetThese = sujetThese;
		this.Encadrant = Encadrant;
	}

	public String getSujetThese() {
		return SujetThese;
	}
	public void setSujetThese(String sujetThese) {
		SujetThese = sujetThese;
	}
	public professeur getEncadrant() {
		return Encadrant;
	}
	public void setEncadrant(professeur Encadrant) {
		this.Encadrant =Encadrant;
	}
	
 public float calculeVacances(int Nbrjours)
{int v;
v=Nbrjours/10;
return v;
}
public double calculeSalaire(int Nbrheurs) {
	int s;
	double salaire;
	if(Nbrheurs<=32)
	{s=Nbrheurs*400;
	 salaire=s-(s*0.34);
	 return salaire+5000;
	}
	else {
		s=Nbrheurs*600;
		salaire=s-(s*0.17);}
	return salaire+5000;}
public double calculeSalaire() {
	return 0;
}



}
