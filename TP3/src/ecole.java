
/**
* 
*
* @author LAHLAOI Zineb
*/

public class ecole {
	
	
public static void main(String[] args) {
	
	professeur p1 = new professeur("lahlaoi","lahlaoi@gmail.com",9,"grade1");
	professeur p2 = new professeur("mohamed","m@gmail.com",3,"grade2");
	
	doctorant d1 = new doctorant("zineb","zineb@g.com",2,"These1",p1);

	etudiant etu = new etudiant("tahar,","tahar@g.com",2);
	etudiant etud = new etudiant("latifa","latifa.email",1);
	
	Module m1 = new Module("M1",1,25,p1);
	Module m2 = new Module("M2",2,30,p2);
	departement dep1 = new departement("informatique",p1);
	
	filiere f1 = new filiere();

	p1.addObject(m1, 0);
    p2.addObject(m2, 0);
	
	System.out.println("le module de professeur mohemd est "+p1.getObject(0));
	System.out.println("le module de professeur ali est "+p2.getObject(0));
	
	dep1.addObject(p1, 0);
	dep1.addObject(p2, 1);
	dep1.addObject(d1, 2);
	System.out.println("le departement dep1 contient :");
	for (int i=0; i<3; i++) 
	{ 
	  System.out.println(dep1.getObject(i));
	}
	System.out.println("le salaire total de dep1 est "+dep1.masse_salariale());
 
	etu.addObject(m1, 0);
	etud.addObject(m2, 1);
	System.out.println("l'etudiante zineb a comme modules :");
	System.out.println(etu.getObject(0));
	System.out.println(etu.getObject(1));
	f1.addObject(etu, 0);
	//f1.removeObject(a,0);
	f1.addObject(etud, 1);

	System.out.println("La filiere f1 contient: ");
	System.out.println(f1.getObject(0));
	System.out.println(f1.getObject(1));

	

	
	}}