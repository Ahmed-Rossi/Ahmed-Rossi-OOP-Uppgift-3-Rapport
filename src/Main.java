import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        //En instans av klassen Cash
        Cash c1 = new Cash();
// Hur mycket sparar du varje månad?
        String moneyMonth = JOptionPane.showInputDialog(null, "Hur mycket vill du spara varje månad?");
        c1.money = Integer.parseInt(moneyMonth);

        //Hur många månader tänkte du spara?
        String monthMonth = JOptionPane.showInputDialog(null, "Hur många månader vill du spara?");
        c1.month = Integer.parseInt(monthMonth);


        JOptionPane.showMessageDialog(null, "Du kommer spara " + Cash.savePerYear(c1) + "kr varje år." +
                "\nDu kommer totalt ha sparat " + Cash.totalSave(c1) + "kr" +
                "\nDu kommer behöva spara i " + Cash.million(c1) + " månader för att spara till en miljon kr.");

    }
}
