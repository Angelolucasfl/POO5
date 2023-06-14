package CoercaoDowncastingUpcasting;

public class Main {

	public static void main(String[] args) {
		
        // Upcasting 
        Ave ave = new Pombo();
        ave.comer();
        
     // Downcasting 
        Pombo pombo = (Pombo) ave;
        pombo.comer(); 
        pombo.trigo(); 


        // Upcasting com instanceof
        Ave ave2 = new Papagaio();
        if (ave2 instanceof Papagaio) {
            Papagaio p = (Papagaio) ave2;
            p.comer();
            p.noz();
        } else {
            System.out.println("A referência não aponta para um papagaio.");
        }
        }

	}

