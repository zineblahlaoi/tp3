
public class filiere implements collection {
	private int numeroSection;
	public etudiant tableauEtudiant[] ;
public professeur chefSection;
public filiere() {
	tableauEtudiant =new etudiant [20];
	for(int i=0;i<20;i++)
	{this.tableauEtudiant[i]=new etudiant();
	
}
}
public int getNumeroSection() {
	return numeroSection;
}
public void setNumeroSection(int numeroSection) {
	this.numeroSection = numeroSection;
}
public professeur getChefSection() {
	return chefSection;
}
public void setChefSection(professeur chefSection) {
	this.chefSection = chefSection;
}
public Boolean addObject(Object o, int i) {
	
	tableauEtudiant[i]= (etudiant) o;
	return true;
}


public Boolean removeObject(Object o, int i) {
	tableauEtudiant[i]= null;
	return true;
}


public Object getObject(int i) {
return tableauEtudiant[i];
}

}
