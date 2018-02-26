/**
 * 
 * @author lahlaoi zineb
 *
 */
public class professeur extends personne implements salarie,collection {

	
	private Integer  nummerSomme;
	private String grade;
	public Module tableauModule[] ;
	
	public professeur(String nom, String email, Integer nummerSomme, String grade) {
		super(nom, email);
		this.nummerSomme = nummerSomme;
		this.grade = grade;
		tableauModule= new Module [4];
		for (int i = 0; i < 4; i++) {
	            this.tableauModule[i]=new Module();}

	

	}
	
	
	public Integer getNummerSomme() {
		return nummerSomme;
	}
	public void setNummerSomme(Integer nummerSomme) {
		this.nummerSomme = nummerSomme;
	}
	
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	
	 public Module[] getTableauModule() {
		return tableauModule;
	}
	public void setTableauModule(Module[] tableauModule) {
		this.tableauModule = tableauModule;
	}
	public float calculeVacances(int Nbrjours)
	 {int v;
	 v=Nbrjours/10;
	 return v;
	 }
	 public double calculeSalaire() {
	 	int i;
	 	int somme;
	 	double salaire;
	 	int s;
	 	somme=0;
	 	for(i=0;i<4;i++)
	 	{somme+=tableauModule[i].nbrHeures;}
	 	if(somme<=32)
		{s=somme*400;
		 salaire=s-(s*0.34);
		 return salaire+5000;
		}
		else {
			int j;
			j=somme-32;
			s=j*600 + 32*400;
			salaire=s-(s*0.17);
		return salaire+5000;}}
	 public double calculeSalaire(int nbrHeurs)
	 {return 0;}

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
	
	 


	 
	 
	
}