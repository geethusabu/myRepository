package oops;
import java.util.*;
interface animalDetails{
	public void dogs();
	public void cats();
	public void Guineapigs();
}
interface birdDetails{
	public void Amazonparrots();
}
interface order{
	public void ordermanagement();
}
class PetAnimals implements animalDetails{
  int breed,option,catbreed,catoption,pigbreed,pigoption,opti;
  Scanner sc = new Scanner(System.in);
	@Override
	public void dogs() {
		System.out.println("Select the breed : \n 1.German Shepherd\n 2. Bulldog \n 3. Labrador Retriever") ; 
		breed = sc.nextInt();
//		do {
		System.out.println(".........MENU.......\n 1.View description \n 2.View pet details \n 3.View Food details \n 4.Make order");
		option = sc.nextInt();
		
			 switch(option) 
			   	{
			   case 1:
				   if(breed==1) 
				   	{
					   System.out.println("    Breed : GERMAN SHEPHERD\n" + "    Life expectancy : 9 – 13 years\n    colours : Black, White, Black & Tan"
					   		+ "    Weight : Male: 30–40 kg, Female: 22–32 kg \n    Height: Male :  60–65 cm, Female: 55–60 cm\n   "
					   		+ " Temperament : Curious, Intelligent, Stubborn, Alert, Loyal, Watchful, Confident, Protective, Obedient, Courageous, Brave");
				   	}
				   else if(breed==2) 
				   	{
					   System.out.println("    Breed : BULLDOG\\n\" + \"    Life expectancy : 8 – 10 years\\n    colours : White, Fawn, Piebald, Brindle & White\"\r\n"
					   		+ "				   		+ \"    Weight : Female: 18–23 kg, Male: 23–25 kg\\n    Height: Female: 31–40 cm, Male: 31–40 cm\\n   \"\r\n"
					   		+ "				   		+ \" Temperament : Willful, Docile, Friendly, Gregarious");
				   	}
				   else if(breed ==3)
				   	{
					   System.out.println("    Breed : LABRADOR RETRIEVER\\n\" + \"    Life expectancy : 10 – 12 years (Adult)\\n    colours : Black, Chocolate, Yellow, White\"\r\n"
					   		+ "				   		+ \"    Weight : Male: 29–36 kg, Female: 25–32 kg\\n    Height: Male: 57–62 cm, Female: 55–60 cm\\n   \"\r\n"
					   		+ "				   		+ \" Temperament : Even Tempered, Intelligent, Kind, Outgoing, Agile, Trusting, Gentle");
				   	}
				   else
				   {
					   System.out.println("please select a valid option :-(");
				   }
				   break;
			   case 2:
				   if(breed == 1)
				   	{
					   System.out.println("> Breed : German Shepherd \n Gender : Male \n Age : 2 Years \n weight :36kg \n height : 60cm \n Price : 10000rs");
					   System.out.println("_________________________");
					   System.out.println();
					   System.out.println("> Breed : German Shepherd \n Gender : Female \n Age : 1 Years \n weight :32kg \n height : 59cm \n Price : 8000rs");
				   	}
				   else if(breed == 2)
				   {
					   System.out.println("Breed : Bulldog \n Gender : Male \n Age : 3 Years \n weight :20kg \n height : 40cm \n Price : 10000rs");
					   System.out.println("_________________________");
					   System.out.println();
					   System.out.println("Breed : Bulldog \n Gender : Female \n Age : 1 Years \n weight :23kg \n height : 50cm \n Price : 15000rs");

				   }
				   else if(breed == 3) 
				   {
					   System.out.println("Breed : Labrador Retriever \n Gender : Male \n Age : 5 Years \n weight :50kg \n height : 60cm \n Price : 10000rs");
					   System.out.println("_________________________");
					   System.out.println();
					   System.out.println("Breed : Labrador Retriever \n Gender : Male \n Age : 1 Years \n weight :30kg \n height : 40cm \n Price : 12000rs");
					   
				   }
				   break;
			   case 3:
				   if(breed==1) 
				   	{
					   System.out.println(" 1. Canidae All Life Stages Multi-Protein Formula\n 2. Wellness Core Large Breed Adult\n 3. Nutro Ultra Adult Dog Food.");
				   	}
				   else if(breed ==2) {
					   System.out.println("1. Pupper Chicken Topper.\n 2. Royal Canin Breed Health Nutrition Bulldog \n 3. Merrick Texas Beef and Sweet Potato");
					   
				   }
				   else if(breed == 3) {
					   System.out.println("1.Royal Canin German Shepherd Adult\n 2.Chappi Adult Dry Dog Food \3.Pedigree PRO Expert Nutrition");
				   }
				   else {
					   System.out.println("Enter valid option");
				   }
				   break;
			   case 4:
				     System.out.println("Order confirmed. hold tight..!!:-)");
				     break;
				default : System.out.println("Invalid choice .. Please enter a valid choice");
//				System.out.println("Do u want to continue ???press 1 for yes 2 for no");
//				 opti = sc.nextInt();
			   	}	
//		}while(opti == 1);
		  				
	}

	@Override
	public void cats() {
		System.out.println("Select the breed : \n 1. Persian Cat\n 2.  Himalayan Cat ") ; 
		catbreed = sc.nextInt();
		System.out.println(".........MENU.......\n 1.View description \n 2.View pet details \n 3.View Food details \n 4.Make order");
		catoption = sc.nextInt();
		switch(catoption)
		{
		case 1:
			if(catbreed==1)
			{
				System.out.println("    Breed : Persian Cat\\n\" + \"    Life expectancy : 11 – 15 years\\n    colours : Black, Chocolate, Yellow, White\"\r\n"
				   		+ "				   		+ \"    Weight : Male: 3.2-5.4 kg , Female: 2.5–3.2 kg\\n    Height: Male:20-25 cm, Female: 20-25 cm\\n   \"\r\n"
				   		+ "				   		+ \" Temperament : gentle, quiet, docile ");
			}
			else if(catbreed==2)
			{
				System.out.println("    Breed : Himalayan Cat\\n\" + \"    Life expectancy : 11 – 15 years\\n    colours : Black, Chocolate, Yellow, White\"\r\n"
				   		+ "				   		+ \"    Weight : Male: 3.2-5.4 kg , Female: 2.5–3.2 kg\\n    Height: Male:20-25 cm, Female: 20-25 cm\\n   \"\r\n"
				   		+ "				   		+ \" Temperament : gentle, quiet, docile ");
			}
			else
			{
				System.out.println("Invalid option....!!");
			}
			break;
		case 2:
			if(catbreed == 1)
		   	{
			   System.out.println("Breed : Persian Cat \n Gender : Male \n Age : 2 Years \n weight :3.6kg \n height : 20cm \n Price : 10000rs \n colour : white");
			   System.out.println("_________________________");
			   System.out.println();
			   System.out.println("Breed : Persian Ca \n Gender : Female \n Age : 1 Years \n weight :3.2kg \n height : 25cm \n Price : 8000rs \n colour : black");
		   	}
			else if(catbreed == 2)
		   	{
			   System.out.println("Breed : Himalayan Cat \n Gender : Male \n Age : 2 Years \n weight :3.6kg \n height : 20cm \n Price : 10000rs \n colour : white");
			   System.out.println("_________________________");
			   System.out.println();
			   System.out.println("Breed : Himalayan Ca \n Gender : Female \n Age : 1 Years \n weight :3.2kg \n height : 25cm \n Price : 8000rs \n colour : black");
		   	}
			else
			{
				System.out.println("Invalid option...!!!");
			}
			break;
		case 3:
			if(catbreed==1) 
		   	{
			   System.out.println(" 1. Royal Canin  \n 2. Me-O Persian Cat Adult \n 3. Maxi Persian Adult Dry Cat Food");
		   	}
		   else if(catbreed ==2) {
			   System.out.println("1.Royal Canin Hair.\n 2. Farmina Vet Life Ultrahypo Feline Formula Cat Food\n 3. Grain Zero Persian And Long Coat Dry Cat Food");
			   
		   }
		   else {
			   System.out.println("Enter valid option");
		   }
			break;
			
		 case 4:
		     System.out.println("Order confirmed. hold tight..!!:-)");
		     break;
		default : System.out.println("Invalid choice .. Please enter a valid choice");
			
		}
	}


	@Override
	public void Guineapigs() {
		System.out.println("Select the breed : \n 1. Skinny pig \n 2.  American Guinea Pig\r\n"
				+ " ") ; 
		pigbreed = sc.nextInt();
		System.out.println(".........MENU.......\n 1.View description \n 2.View pet details \n 3.View Food details \n 4.Make order");
		pigoption = sc.nextInt();	
		switch(pigoption)
		{
		case 1:
			if(pigbreed==1)
			{
				System.out.println("    Breed : Skinny pig \\n\" + \"    Life expectancy : 5–7 years \\n    colours : Black, Chocolate, Yellow, White\"\r\n"
				   		+ "				   		+ \"    Weight :0.9 – 1.2 kg (Male, Adult \n    Height: 20 – 40 cm (Adult) \\n   \"\r\n"
				   		+ "				   		+ \" Temperament : gentle, quiet ");
			}
			else if(pigbreed==2)
			{
				System.out.println("    Breed : American Guinea Pig \\n\" + \"    Life expectancy : 5–7 years \\n    colours : Black, Chocolate, Yellow, White\"\r\n"
				   		+ "				   		+ \"    Weight :0.9 – 1.2 kg (Male, Adult \n    Height: 20 – 40 cm (Adult) \\n   \"\r\n"
				   		+ "				   		+ \" Temperament : gentle, quiet ");
			}
			else
			{
				System.out.println("invalid option..!!!");
			}
			break;
		case  2:
			if(pigbreed == 1)
		   	{
			   System.out.println("Breed : Skinny pig t \n Gender : Male \n Age : 2 Years \n weight :3.6kg \n height : 20cm \n Price : 10000rs \n colour : white");
			   System.out.println("_________________________");
			   System.out.println();
			   System.out.println("Breed :  American Guinea Pig \n Gender : Female \n Age : 1 Years \n weight :3.2kg \n height : 25cm \n Price : 8000rs \n colour : black");
		   	}
			else
			{
				System.out.println("invalid option..!!!");
			}
		break;
		case 3:
			if(pigbreed==1) 
		   	{
			   System.out.println(" 1. Spinach  \n 2. Timothy,  \n 3. Grasses");
		   	}
			else if(pigbreed == 2) {
				System.out.println(" 1. Harringtons Small Animal Optimum Guinea Pig Food\r\n"
						+ "  \n 2. JiMMy Dora Diet Guinea Pig Food\r\n"
						+ "  \n 3. Boltz Premium Guinea Pig Food\r\n");
						
			}
		break;
		 case 4:
		     System.out.println("Order confirmed. hold tight..!!:-)");
		     break;
		default : System.out.println("Invalid choice .. Please enter a valid choice");
			
		}
	}

	
}
class PetBirds implements  birdDetails,order{
 Scanner sc = new Scanner(System.in);
 int specious,option;
	@Override
	public void Amazonparrots() {
		System.out.println("Select the Specious : \n 1.Yellow-headed amazon \n 2. Turquoise-fronted amazon") ; 
		specious = sc.nextInt();
		System.out.println(".........MENU.......\n 1.View description \n 2.View pet details \n 3.View Food details ");
		option = sc.nextInt();
		switch(option)
		{
		case 1:
			if(specious==1)
			{
				System.out.println("    Specious : Yellow-headed amazon \\n\" + \"    Life expectancy : 30 + years \\n    colours : Green\"\r\n"
				   		+ "				   		+ \"    Weight :520 g\\n   \"\r\n" 
				   		+ "				   		+ \" Sounds : Vocal communicator \n Interaction  : Social");
			}
			else if(specious==2)
			{
				System.out.println("    Specious : Turquoise-fronted amazon \\n\" + \"    Life expectancy : 30 + years \\n    colours : Green\"\r\n"
				   		+ "				   		+ \"    Weight :275-510 g \\n   \"\r\n" 
				   		+ "				   		+ \" Sounds : Vocal communicator \n Interaction  : Social");
			}
			else
			{
				System.out.println("invalid option..!!!");
			}
		
			break;
		case 2:
			if(specious == 1)
		   	{
			   System.out.println("Specious : Yellow-headed amazon t \n Gender : Male \n Age : 2 Years \n weight :506g \n height : 20cm \n Price : 10000rs \n colour : green");
			   System.out.println("_________________________");
			   System.out.println();
			   System.out.println("Specious : Yellow-headed amazon \n Gender : Female \n Age : 1 Years \n weight :580g \n height : 25cm \n Price : 8000rs \n colour : yellow");
		   	}
			else if(specious == 2)
			{
				System.out.println("Specious : Turquoise-fronted amazon t \n Gender : Male \n Age : 2 Years \n weight :506g \n height : 20cm \n Price : 10000rs \n colour : green");
				   System.out.println("_________________________");
				   System.out.println();
				   System.out.println("Specious : Turquoise-fronted amazon \n Gender : Female \n Age : 1 Years \n weight :580g \n height : 25cm \n Price : 8000rs \n colour : yellow");		
		    }
			else {System.out.println("Invalid option");}
			break;
		case 3:
			if(specious==1) 
		   	{
			   System.out.println(" 1. Classic Avi-Cakes for Parrots  \n 2. Fruit Delight Avi-Cakes for Parrots \n 3.Premium Daily Diet for Parrots");
		   	}
		   else if(specious ==2) {
			   System.out.println("1.Fruit Delight Avi-Cakes.\n 2. Tropical Fruit Nutri-Berries \n 3.Premium Daily Diet for Parrots ");
			   
		   }
		   else {
			   System.out.println("Enter valid option");
		   }
			break;
		default : System.out.println("Invalid choice .. Please enter a valid choice");
		}
	}
	@Override
	public void ordermanagement() {
		System.out.println("Do u want to make an order ?? press 1 for yes 2 for no..!");
		int opt = sc.nextInt();
		System.out.println("Select a bird 1.Yellow-headed amazon  2. Turquoise-fronted amazon ");
		int b = sc.nextInt();
		System.out.println("order confirmed..!!");
	}

	
	
}
public class PetShoppgm {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int opti;
		PetAnimals d = new PetAnimals();
		PetBirds p=new PetBirds();
		System.out.println("Welcome to Lafeber Company");
		System.out.println("____________________________\n");
		do {
			System.out.println("...MENU... \n 1.Animals \n 2.Birds");
			int opt = s.nextInt();
			if(opt==1) 
				{
				  System.out.println("1.Dogs  2. Cats  3. Guinea pigs");
				  int ch = s.nextInt();
				  if(ch==1) {
					  d.dogs();
				  }
				  else if(ch==2) {d.cats();}
				  else {d.Guineapigs();}
//					
				}
			else {
				p.Amazonparrots();
				System.out.println("Press 1.Order 2.Exit");
				int o = s.nextInt();
				if(o==1) {
					p.ordermanagement();
				}
				else{
					System.exit(o);
				}
			}
			  System.out.println("Do you want to continue ??press 1.yes 2.No");
			  opti=s.nextInt();

		}while(opti!=2);
		

	}

}
