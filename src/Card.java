import javax.swing.*;

public class Card {
   String recName;
   String xmasMessage;
   String sender;

    public Card() {
        initCard();
    }

    public void initCard() {
        recName = JOptionPane.showInputDialog("Enter recipient name");
        xmasMessage = "Merry Christmas and Happy New Year";
        sender = JOptionPane.showInputDialog("Enter sender name");
    }

    public void printCard() {
        System.out.println(recName);
        System.out.println();
        System.out.println(xmasMessage);
        System.out.println();
        System.out.println(sender);
    }


}
