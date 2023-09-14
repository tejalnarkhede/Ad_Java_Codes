import javax.swing.*;
import java.awt.event.*;

public class SregisterPage extends Frame {
	
	JLabel lRegForm;
	JLabel lFName;
	JTextField tFName;
	JLabel lLName;
	JTextField tLName;
	JLabel lMobNo;
	JTextField tMobNo;
	JLabel lCourse;
	JCheckbox[] cBoxCourses;
	JLabel lGender;
	JCheckboxGroup cBoxGender;
	JCheckbox cBoxMale;
	JCheckbox cBoxFemale;
	JCheckbox cBoxOther;
	JLabel lAddress;
	JTextArea tAddress;
	JButton bSubmit;
	
	public static String courses[] = {"Java-2","Android","JSP","ST","SC"};
	
	public SregisterPage() {
		
		addWindowListener(new WindowAdapter(){  
			public void windowClosing(WindowEvent e) {  
				dispose();  
	        }  
	    });
		
		
		setSize(450,700);    
		initComponents();
		lRegForm.setBounds(40,50,360,20);	
		
		lFName.setBounds(50,100,120,20);
		tFName.setBounds(180,100,120,20);
		
		lLName.setBounds(50,140,120,20);
		tLName.setBounds(180,140,120,20);
		
		lMobNo.setBounds(50,180,120,20);
		tMobNo.setBounds(180,180,120,20);
		
		lCourse.setBounds(50,220,150,20);
		
		int y= 250;
		
		for(int i=0; i<5; i++) {
			cBoxCourses[i].setBounds(180,y,100,20);
			y += 25;
		}
		
		
		lGender.setBounds(50,380,150,20);
		
		cBoxMale.setBounds(180,410,100,20);
		cBoxFemale.setBounds(180,435,100,20);
		cBoxOther.setBounds(180,460,100,20);
		
		lAddress.setBounds(50,500,120,20);
		tAddress.setBounds(180,500,120,70);
		bSubmit.setBounds(160,600,100,35);
		
		add(lRegForm);
		add(lFName);
		add(lLName);
		add(tFName);
		add(lLName);
		add(tLName);
		add(lMobNo);
		add(tMobNo);
		add(lCourse);
		for(int i=0; i<5; i++)
			add(cBoxCourses[i]);
		add(lGender);
		add(cBoxMale);
		add(cBoxFemale);
		add(cBoxOther);
		add(lAddress);
		add(tAddress);
		add(bSubmit);
		setLayout(null);
		setVisible(true);
		
	}
	
	// function to init the Components 
	public void initComponents() {
		Font fLabel = new Font("Serif",Font.PLAIN,18);
		
		this.lRegForm = new JLabel("Course Regestration Form");
		lRegForm.setFont(new Font("Serif",Font.BOLD,24));
		
		this.lFName = new JLabel("First Name ");
		lFName.setFont(fLabel);
		
		this.lLName = new JLabel("Last Name ");
		lLName.setFont(fLabel);
		
		this.lMobNo = new JLabel("Mobile No. ");
		lMobNo.setFont(fLabel);
		
		this.lCourse = new JLabel("Select Courses ");
		lCourse.setFont(fLabel);
		
		cBoxCourses = new JCheckbox[5];
		for(int i=0; i<5; i++)
			cBoxCourses[i] = new Checkbox(courses[i]);
			
		this.lGender = new JLabel("Select Gender ");
		lGender.setFont(fLabel);
		
		this.lAddress = new JLabel("Address ");
		lAddress.setFont(fLabel);
		
		this.tFName = new JTextField();
		this.tLName = new JTextField();
		this.tMobNo = new JTextField();
		
		this.cBoxGender = new JCheckboxGroup();
		this.cBoxMale = new JCheckbox("Male",cBoxGender,false);
		this.cBoxFemale = new JCheckbox("Female",cBoxGender,false);
		this.cBoxOther = new JCheckbox("Other",cBoxGender,false); 
		
		
		this.tAddress = new JTextArea();
		this.bSubmit = new JButton("Submit");
		bSubmit.setFont(fLabel);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		System.out.println("Submit button is clicked...");
	}
	public static void main(String args[]) {
		new  SregisterPage();
	}
	
}