 
import java.awt.*; 

  
public class RailwayReservation 
    extends Frame 
 { 
  
    // Components of the Form 
    private Container c; 
     private Label title; 
    private Label name; 
  private TextField tname; 
    private Label cl; 
    private TextField tclass; 
    private Label gender; 
    private CheckboxGroup cbg;
    private Checkbox male; 
    private Checkbox female; 
 
    private Label doj; 
    private Choice date; 
    private Choice month; 
    private Choice year; 
    private Label board; 
    private TextArea tadd; 
    private CheckBox term; 
    private Button sub; 
    private Button reset; 
    private TextArea tout; 
    private Label res; 
    private TextArea resadd; 
  
    private String dates[] 
        = { "1", "2", "3", "4", "5", 
            "6", "7", "8", "9", "10", 
            "11", "12", "13", "14", "15", 
            "16", "17", "18", "19", "20", 
            "21", "22", "23", "24", "25", 
            "26", "27", "28", "29", "30", 
            "31" }; 
    private String months[] 
        = { "Jan", "feb", "Mar", "Apr", 
            "May", "Jun", "July", "Aug", 
            "Sup", "Oct", "Nov", "Dec" }; 
    private String years[] 
        = { "1995", "1996", "1997", "1998", 
            "1999", "2000", "2001", "2002", 
            "2003", "2004", "2005", "2006", 
            "2007", "2008", "2009", "2010", 
            "2011", "2012", "2013", "2014", 
            "2015", "2016", "2017", "2018", 
            "2019","2020","2021","2022" }; 
  
    // constructor, to initialize the components 
    // with default values. 
    public RailwayReservation() 
    { 
        setTitle("Railway Reservation Form"); 
        setBounds(300, 90, 900, 600); 
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
        setResizable(false); 
  
        c = getContentPane(); 
        c.setLayout(null);
        
        
  
        title = new Label("Registration Form"); 
        title.setFont(new Font("Arial", Font.PLAIN, 30)); 
        title.setSize(300, 30); //width,height
        title.setLocation(300, 30);//x,y 
        c.add(title); 
  
        name = new Label("Name"); 
        name.setFont(new Font("Arial", Font.PLAIN, 20)); 
        name.setSize(100, 20); 
        name.setLocation(100, 100); 
        c.add(name); 
  
        tname = new TextField(); 
        tname.setFont(new Font("Arial", Font.PLAIN, 15)); 
        tname.setSize(190, 20); 
        tname.setLocation(200, 100); 
        c.add(tname); 
  
        cl = new Label("Class"); 
        cl.setFont(new Font("Arial", Font.PLAIN, 20)); 
        cl.setSize(100, 20); 
        cl.setLocation(100, 150); 
        c.add(cl); 
  
        tclass = new TextField(); 
        tclass.setFont(new Font("Arial", Font.PLAIN, 15)); 
        tclass.setSize(150, 20); 
        tclass.setLocation(200, 150); 
        c.add(tclass); 
  
        gender = new Label("Gender"); 
        gender.setFont(new Font("Arial", Font.PLAIN, 20)); 
        gender.setSize(100, 20); 
        gender.setLocation(100, 200); 
        c.add(gender); 
  
        male = new Checkbox("Male",cbg,true); 
        male.setFont(new Font("Arial", Font.PLAIN, 15)); 
        male.setSelected(true); 
        male.setSize(75, 20); 
        male.setLocation(200, 200); 
        c.add(male); 
  
        female = new Checkbox("Female",cbg,false); 
        female.setFont(new Font("Arial", Font.PLAIN, 15)); 
        female.setSelected(false); 
        female.setSize(80, 20); 
        female.setLocation(275, 200); 
        cbg.add(female); 
  
  
        doj = new Label("Date Of Journey"); 
        doj.setFont(new Font("Arial", Font.PLAIN, 20)); 
        doj.setSize(100, 20); 
        doj.setLocation(100, 250); 
        c.add(doj); 
  
        date = new Choice(dates); 
        date.setFont(new Font("Arial", Font.PLAIN, 15)); 
        date.setSize(50, 20); 
        date.setLocation(200, 250); 
        c.add(date); 
  
        month = new Choice(months); 
        month.setFont(new Font("Arial", Font.PLAIN, 15)); 
        month.setSize(60, 20); 
        month.setLocation(250, 250); 
        c.add(month); 
  
        year = new Choice(years); 
        year.setFont(new Font("Arial", Font.PLAIN, 15)); 
        year.setSize(60, 20); 
        year.setLocation(320, 250); 
        c.add(year); 
  
        board = new Label("Boarding At"); 
        board.setFont(new Font("Arial", Font.PLAIN, 20)); 
        board.setSize(100, 20); 
        board.setLocation(100, 300); 
        c.add(board); 
  
        tadd = new TextArea(); 
        tadd.setFont(new Font("Arial", Font.PLAIN, 15)); 
        tadd.setSize(200, 75); 
        tadd.setLocation(200, 300); 
        tadd.setLineWrap(true); 
        c.add(tadd); 
  
        term = new CheckBox("Accept Terms And Conditions."); 
        term.setFont(new Font("Arial", Font.PLAIN, 15)); 
        term.setSize(250, 20); 
        term.setLocation(150, 400); 
        c.add(term); 
  
        sub = new Button("Submit"); 
        sub.setFont(new Font("Arial", Font.PLAIN, 15)); 
        sub.setSize(100, 20); 
        sub.setLocation(150, 450); 

        c.add(sub); 
  
        reset = new Button("Reset"); 
        reset.setFont(new Font("Arial", Font.PLAIN, 15)); 
        reset.setSize(100, 20); 
        reset.setLocation(270, 450); 
     
        c.add(reset); 
  
        tout = new TextArea(); 
        tout.setFont(new Font("Arial", Font.PLAIN, 15)); 
        tout.setSize(300, 400); 
        tout.setLocation(500, 100); 
        tout.setLineWrap(true); 
        tout.setEditable(false); 
        c.add(tout); 
  
        res = new Label(""); 
        res.setFont(new Font("Arial", Font.PLAIN, 20)); 
        res.setSize(500, 25); 
        res.setLocation(100, 500); 
        c.add(res); 
  
        resadd = new TextArea(); 
        resadd.setFont(new Font("Arial", Font.PLAIN, 15)); 
        resadd.setSize(200, 75); 
        resadd.setLocation(580, 175); 
        resadd.setLineWrap(true); 
        c.add(resadd); 
  
        setVisible(true); 
    } 
  
 public static void main(String[] args)
{
	new RailwayReservation();	
}  
  
} 
  

