package cacciaDrago;
public class Cavaliere {
	public void colpisciDrago(Thread drago) {
		System.out.println("\n[!] IL CACCIATORE SCAGLIA UNA FRECCIA! [!]\n");
		drago.interrupt(); 
	}
}
