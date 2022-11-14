import javax.swing.JOptionPane;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        motto();
        Event ziDeNastere =  new Event("NR.EV.",35);
        Event Nunta = new Event(nrEvenimenttt(), nrInvitatiii());
        ziDeNastere = getData(ziDeNastere);
        Nunta = getData(Nunta);
        System.out.println("Detalii zi de nastere: ");
        System.out.print("\nNr eveniment: " + ziDeNastere.getNumarEveniment() + "\nNr invitati: " + ziDeNastere.getNumarInvitati()+"\nPret total: " + ziDeNastere.getPretEveniment());
        if(ziDeNastere.isLargeEvent() == true)
            System.out.println("\nEvenimentul este unul mare");
        if(ziDeNastere.isLargeEvent() == false)
            System.out.println("\nEvenimentul este unul mic");
        System.out.println("\n\nDetalii nunta: ");
        System.out.print("\nNr eveniment: " + Nunta.getNumarEveniment() + "\nNr invitati: " + Nunta.getNumarInvitati()+"\nPret totaL: " + Nunta.getPretEveniment());
        if(Nunta.isLargeEvent() == true)
            System.out.println("\nEvenimentul este unul mare");
        if(Nunta.isLargeEvent() == false)
            System.out.println("\nEvenimentul este unul mic");
    }

    public static void motto() {
        JOptionPane.showMessageDialog(null, "********************************************************" +
                "\n * Carly’s makes the food that makes it a party. *" + "\n \"*************************************************\"");
    }

    public static String nrEvenimenttt() {
        Scanner numarEv = new Scanner(System.in);
        System.out.println("Introduceti nr de invitati la ziua de nastere  >>> ");
        return numarEv.nextLine();
    }
    public static int nrInvitatiii() {
        Scanner inputDevice = new Scanner(System.in);
        System.out.print("Introduceti nr de invitati la nunta >>> ");
        return inputDevice.nextInt();
    }
    public static Event getData(Event info)
    {
        String nrEvent = "";
        int numarInvitati = 0;
        info.setNumarEveniment(nrEvent);
        info.setNumarInvitati(numarInvitati);
        info.getPretEveniment();
        return info;
    }
}