import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.TitledBorder;
public class JTableExample {
   public static void main(String[] args) {
      JFrame frame = new JFrame();
      JPanel panel = new JPanel();
     
      String[][] rec = {
         { "001", "ABC", "25000" },
         { "002", "DEF", "20000" },
         { "003", "GHI", "35000" },
         { "004", "JKL", "23000" },
         { "005", "MNO", "40000" },
         { "006", "PQR", "38000" },
         { "007", "STU", "45000" },
         { "008", "VWX", "36000" }
      };
      String[] header = { "Id", "Employee", "Salary" };
      JTable table = new JTable(rec, header);
      panel.add(new JScrollPane(table));
      frame.add(panel);
      frame.setSize(550, 400);
      frame.setVisible(true);
   }
}