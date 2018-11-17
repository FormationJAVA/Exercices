package OOExo;

public class PorteMoney {

	private int [] pieces = new int [6];
	private final int [] pvaleur= {5,10,20,50,100,200};

	public PorteMoney ()
	{
		int [] p = {0,0,0,0,0,0};
		pieces = p;
	}
	
	public PorteMoney (int p5,int p10,int p20,int p50,int p100,int p200)
	{
		int [] p = {p5,p10,p20,p50,p100,p200};
		pieces = p;
		
	}
	
	public PorteMoney (PorteMoney pm)
	{
		pieces = pm.pieces;
	}
	
	public PorteMoney (int p[])
	{
		pieces = p;
	}
	/**
	 * méthode qui retourne la somme d'argent présente dans le porte money 
	 * @return somme d'agent totale dans le porte money*/
	public int getTotal ()
	{
		int somme = 0;
		for (int i =0;i<pieces.length;++i)
		{
			somme += pieces[i]*pvaleur[i];
		}
		return somme;
	}
	/**
	 * méthode qui teste si le porte money est vide*/
	public boolean estVide ()
	{	
		return getTotal() > 0 ? false : true;
			
	}
	public void inserer (int p[]) 
	{
		int n = pieces.length;
		if (p.length == n)
		{
			for (int i =0;i<n;++i)
			{
				pieces[i]+= p[i];
			}
		}
	}
	/**
	 * Méthode qui Ajouter une somme d'aregt au porte money sous forme de pieces d'argent */
	public boolean ajouter (int somme)
	{
		boolean out = false;
		int i =pvaleur.length;
		int b;
		while (somme >0 && i>0)
		{

			if (somme >= pvaleur[i-1])
			{

				b = (int)(somme/pvaleur[i-1]);

				somme -= pvaleur[i-1] * b;
				pieces[i-1] += b;
				
				
			}
			--i;
		} 
		out = somme == 0 ? true: false;  
		return  out;
	}
	public int getP5 ()
	{
		return pieces[0]; 
	}
	public int getP10 ()
	{
		return pieces[1]; 
	}
	public int getP20 ()
	{
		return pieces[2]; 
	}
	public int getP50 ()
	{
		return pieces[3]; 
	}
	public int getP100 ()
	{
		return pieces[4]; 
	}
	public int getP200 ()
	{
		return pieces[5]; 
	}
	/**
	 * méthode qui transforme une instance porte money à un objet string*/
	public String toString()
	{
		String header1 = "Type de piece";
		String header2 = "Nombre de pieces";
		String line;
		String s = header1 + " | " + header2 +"\n";//premiere ligne
		int a;
		/*Lignes de données*/
		for (int i =0;i<this.pieces.length;++i)
		{
			line ="";
			line += this.pvaleur[i];
			a=line.length();
			for (int j=0;j<(header1.length() - a + 1 ); ++j )
			{
				line+=" ";
			}
			line+="| "+ this.pieces[i];
			line+= "\n";
			s+=line;
		}
		line="";
		for (int j=0;j<(header1.length() + header2.length() + 3 ); ++j )
		{
			line+="-";
		}
		line+= "\n";
		s+=line;
		/*Derniere ligne total*/
		line="";
		line+="Total";
		a=line.length();
		for (int j=0;j<(header1.length() - a + 1 ); ++j )
		{
			line+=" ";
		}
		line+="| "+ this.getTotal();
		line+= "\n";
		s+=line;
		return s;
	}
	/**
	 * Méthode qui retire une somme d'argent du porte money
	 * @param somme la somme d'argent*/
	public boolean retirer (int somme)
	{
		boolean out = true;
		int n =pieces.length;
		int b;//resultat de division
		if (somme > getTotal())
		{
			out = false;
		}
		else 
		{
			int i=n;
			while (somme >0 && i>0)
			{
				if (somme >= pvaleur[i-1] || somme > getRest(i-1))
				{
					b = (int)(somme/pvaleur[i-1]);
					if (b>pieces[i-1])
					{
						somme -= pvaleur[i-1] * pieces[i-1];
						pieces[i-1] = 0;
					}//if b>pieces
					else 
					{
						somme -= pvaleur[i-1] * b;
						pieces[i-1] -= b;
						if (somme > getRest(i-1) )
						{
							pieces[i-1] -= 1;
							somme = pvaleur[i-1] -somme;
							ajouter(somme);
							break;
						}//if som > getrest
					}//else
					
					
				}// if som>pval
				--i;
			}//while
			out = true;
		}//else 
		return out;
	}
	/**
	 * Méthode qui calcul la somme d'argent présente dans le porte money de 0 à n-1
	 * @param n l'indice d'arret*/
	private int getRest(int n)
	{
		int somme = 0;
		for (int i =0;i<n;++i)
		{
			somme += pieces[i]*pvaleur[i];
		}
		return somme;
		
	}
}
