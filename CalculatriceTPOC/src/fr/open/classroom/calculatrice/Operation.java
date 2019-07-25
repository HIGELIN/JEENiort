package fr.open.classroom.calculatrice;

public class Operation {
	private Double valeur1 = 0d;
    private String operateur;
    private Double valeur2 = 0d;
    private Double resultat;
    String str = new String();
     
    public Operation (Double valeur1, String operateur, Double valeur2) {
        this.valeur1 = valeur1;
        this.operateur = operateur;
        this.valeur2 = valeur2;
        

	        if (this.operateur.equals("+")) {
	            this.resultat = this.valeur1 + this.valeur2;
	        }
	        else if (this.operateur.equals("-")) {
	            this.resultat = this.valeur1 - this.valeur2;
	        }
	        else if (this.operateur.equals("x")) {
	            this.resultat = this.valeur1 * this.valeur2;
	        }
	        else {
				if(valeur2 == 0)	//traitement de la division par 0
				{
					System.out.println("Ereur : Tantative de division par 0");
				}
				else
					this.resultat = valeur1 / valeur2;
			}
       
    }
    
    public String toString()
	{

		switch(this.operateur) 
		{
		case "+":
		{
			str ="La somme de "+ this.valeur1+" et de "+this.valeur2+" donne "+this.resultat;
			return str;
		}
		case "-":
		{
			str ="La différence de "+ this.valeur1+" et de "+this.valeur2+" donne "+this.resultat;
			return str;
		}
		case "x":
		{
			str ="Le produit de "+ this.valeur1+" par "+this.valeur2+" donne "+this.resultat;
			return str;
		}
		case "/":
		{
			str ="Le quotien de "+ this.valeur1+" par "+this.valeur2+" donne "+this.resultat;
			return str;
		}
		default :
			return null;

		}

	}
    
}

