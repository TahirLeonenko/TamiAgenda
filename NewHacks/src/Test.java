import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Frame;
import java.awt.FlowLayout;
import javax.swing.SpringLayout;
import java.awt.GridBagLayout;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.GridBagConstraints;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.concurrent.TimeUnit;
import java.awt.Panel;
import javax.swing.JEditorPane;
import javax.swing.JTextPane;
import javax.swing.DropMode;

public class Test extends JFrame {

	protected static final ActionListener timerStart = null;

	public JPanel contentPane;
	
	JLabel titleLabel;
	JButton open;
	JPanel agendaPane;
	private JPanel header;
	private JLabel lblNewLabel;
	private JPanel oneAM;
	private JEditorPane editorPane_1;
	private JLabel label;
	private JPanel twoAM;
	private JEditorPane editorPane_2;
	private JLabel label_1;
	private JPanel threeAM;
	private JEditorPane editorPane_3;
	private JLabel label_2;
	private JPanel fourAM;
	private JEditorPane editorPane_4;
	private JLabel label_3;
	private JPanel fiveAM;
	private JEditorPane editorPane_5;
	private JLabel label_4;
	private JPanel sixAM;
	private JEditorPane editorPane_6;
	private JLabel label_5;
	private JPanel sevenAM;
	private JEditorPane editorPane_7;
	private JLabel label_6;
	private JPanel eightAM;
	private JEditorPane editorPane_8;
	private JLabel label_7;
	private JPanel nineAM;
	private JEditorPane editorPane_9;
	private JLabel label_8;
	private JPanel tenAM;
	private JEditorPane editorPane_10;
	private JLabel label_9;
	private JPanel elevenAM;
	private JEditorPane editorPane_11;
	private JLabel label_10;
	private JPanel sectionTwo;
	private JPanel twelvePM;
	private JEditorPane editorPane_12;
	private JLabel label_11;
	private JPanel onePM;
	private JEditorPane editorPane_13;
	private JLabel label_12;
	private JPanel twoPM;
	private JEditorPane editorPane_14;
	private JLabel label_13;
	private JPanel threePM;
	private JEditorPane editorPane_15;
	private JLabel label_14;
	private JPanel fourPM;
	private JEditorPane editorPane_16;
	private JLabel label_15;
	private JPanel fivePM;
	private JEditorPane editorPane_17;
	private JLabel label_16;
	private JPanel sixPM;
	private JEditorPane editorPane_18;
	private JLabel label_17;
	private JPanel sevenPM;
	private JEditorPane editorPane_19;
	private JLabel label_18;
	private JPanel eightPM;
	private JEditorPane editorPane_20;
	private JLabel label_19;
	private JPanel ninePM;
	private JEditorPane editorPane_21;
	private JLabel label_20;
	private JPanel tenPM;
	private JEditorPane editorPane_22;
	private JLabel label_21;
	private JPanel elevenPM;
	private JEditorPane editorPane_23;
	private JLabel label_22;
	private JLabel lblNewLabel_1;
	private JLabel lblPotato;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Test frame = new Test();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
			
		
	}

	/**
	 * Create the frame.
	 */
	public Test() {
		
		ShowMenu showMenu = new ShowMenu();
		Pomodoro pomTimer = new Pomodoro();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1310, 773);							////////CREATE JFRAME//////////
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 51, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		open = new JButton("OPEN MY AGENDA");							////// OPEN AGENDA/////////////
		open.setEnabled(true);
		open.setBounds(521, 390, 206, 27);
		open.setFont(new Font("Tahoma", Font.PLAIN, 15));
		open.addActionListener(showMenu);
		contentPane.setLayout(null);
		contentPane.add(open);
		
		titleLabel = new JLabel("TAMI AGENDA");
		titleLabel.setEnabled(false);
		titleLabel.setBounds(374, 262, 519, 83);
		titleLabel.setForeground(Color.WHITE);
		titleLabel.setFont(new Font("Century", Font.PLAIN, 69));
		titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(titleLabel);
		
		header = new JPanel();
		header.setBounds(70, 24, 1136, 83);
		contentPane.add(header);
		header.setLayout(null);
		
		lblNewLabel_1 = new JLabel("TAMI AGENDA\r\n");
		lblNewLabel_1.setFont(new Font("Century", Font.BOLD | Font.ITALIC, 32));
		lblNewLabel_1.setBounds(22, 10, 481, 63);
		header.add(lblNewLabel_1);
		
		JButton pomButton = new JButton("Pomodoro Timer");
		pomButton.setFont(new Font("Century", Font.PLAIN, 14));
		pomButton.setBounds(845, 17, 224, 21);
		pomButton.addActionListener(pomTimer);
		header.add(pomButton);
		
		JButton settingsButton = new JButton("Settings");
		settingsButton.setFont(new Font("Century", Font.PLAIN, 14));
		settingsButton.setBounds(845, 45, 224, 21);
		header.add(settingsButton);
		
				
	}
	
	
	public void createMenuScreen() {
	
		titleLabel.setVisible(false);
		open.setVisible(false);
		
		JPanel sectionOne = new JPanel();
		sectionOne.setBounds(70, 121, 519, 571);			//////////// FIRST 12 HOURS OF THE DAY ///////////////
		contentPane.add(sectionOne);
		sectionOne.setLayout(null);
		
		JPanel midnight = new JPanel();
		midnight.setBackground(Color.WHITE);
		midnight.setBounds(10, 10, 499, 36);
		sectionOne.add(midnight);
		midnight.setLayout(null);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setBounds(133, 0, 366, 36);
		editorPane.setBackground(Color.LIGHT_GRAY);
		midnight.add(editorPane);
		
		lblNewLabel = new JLabel("12:00 AM");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));			
		lblNewLabel.setBounds(29, 10, 94, 13);
		midnight.add(lblNewLabel);
		
		oneAM = new JPanel();
		oneAM.setLayout(null);
		oneAM.setBackground(Color.WHITE);
		oneAM.setBounds(10, 56, 499, 36);
		sectionOne.add(oneAM);
		
		editorPane_1 = new JEditorPane();
		editorPane_1.setBackground(Color.LIGHT_GRAY);
		editorPane_1.setBounds(133, 0, 366, 36);
		oneAM.add(editorPane_1);
		
		label = new JLabel("1:00 AM");
		label.setFont(new Font("Tahoma", Font.BOLD, 16));
		label.setBounds(29, 10, 94, 13);
		oneAM.add(label);
		
		twoAM = new JPanel();
		twoAM.setLayout(null);
		twoAM.setBackground(Color.WHITE);
		twoAM.setBounds(10, 102, 499, 36);
		sectionOne.add(twoAM);
		
		editorPane_2 = new JEditorPane();
		editorPane_2.setBackground(Color.LIGHT_GRAY);
		editorPane_2.setBounds(133, 0, 366, 36);
		twoAM.add(editorPane_2);
		
		label_1 = new JLabel("2:00 AM");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_1.setBounds(29, 10, 94, 13);
		twoAM.add(label_1);
		
		threeAM = new JPanel();
		threeAM.setLayout(null);
		threeAM.setBackground(Color.WHITE);
		threeAM.setBounds(10, 148, 499, 36);
		sectionOne.add(threeAM);
		
		editorPane_3 = new JEditorPane();
		editorPane_3.setBackground(Color.LIGHT_GRAY);
		editorPane_3.setBounds(133, 0, 366, 36);
		threeAM.add(editorPane_3);
		
		label_2 = new JLabel("3:00 AM");
		label_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_2.setBounds(29, 10, 94, 13);
		threeAM.add(label_2);
		
		fourAM = new JPanel();
		fourAM.setLayout(null);
		fourAM.setBackground(Color.WHITE);
		fourAM.setBounds(10, 194, 499, 36);
		sectionOne.add(fourAM);
		
		editorPane_4 = new JEditorPane();
		editorPane_4.setBackground(Color.LIGHT_GRAY);
		editorPane_4.setBounds(133, 0, 366, 36);
		fourAM.add(editorPane_4);
		
		label_3 = new JLabel("4:00 AM");
		label_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_3.setBounds(29, 10, 94, 13);
		fourAM.add(label_3);
		
		fiveAM = new JPanel();
		fiveAM.setLayout(null);
		fiveAM.setBackground(Color.WHITE);
		fiveAM.setBounds(10, 240, 499, 36);
		sectionOne.add(fiveAM);
		
		editorPane_5 = new JEditorPane();
		editorPane_5.setBackground(Color.LIGHT_GRAY);
		editorPane_5.setBounds(133, 0, 366, 36);
		fiveAM.add(editorPane_5);
		
		label_4 = new JLabel("5:00 AM");
		label_4.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_4.setBounds(29, 10, 94, 13);
		fiveAM.add(label_4);
		
		sixAM = new JPanel();
		sixAM.setLayout(null);
		sixAM.setBackground(Color.WHITE);
		sixAM.setBounds(10, 286, 499, 36);
		sectionOne.add(sixAM);
		
		editorPane_6 = new JEditorPane();
		editorPane_6.setBackground(Color.LIGHT_GRAY);
		editorPane_6.setBounds(133, 0, 366, 36);
		sixAM.add(editorPane_6);
		
		label_5 = new JLabel("6:00 AM");
		label_5.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_5.setBounds(29, 10, 94, 13);
		sixAM.add(label_5);
		
		sevenAM = new JPanel();
		sevenAM.setLayout(null);
		sevenAM.setBackground(Color.WHITE);
		sevenAM.setBounds(10, 332, 499, 36);
		sectionOne.add(sevenAM);
		
		editorPane_7 = new JEditorPane();
		editorPane_7.setBackground(Color.LIGHT_GRAY);
		editorPane_7.setBounds(133, 0, 366, 36);
		sevenAM.add(editorPane_7);
		
		label_6 = new JLabel("7:00 AM");
		label_6.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_6.setBounds(29, 10, 94, 13);
		sevenAM.add(label_6);
		
		eightAM = new JPanel();
		eightAM.setLayout(null);
		eightAM.setBackground(Color.WHITE);
		eightAM.setBounds(10, 378, 499, 36);
		sectionOne.add(eightAM);
		
		editorPane_8 = new JEditorPane();
		editorPane_8.setBackground(Color.LIGHT_GRAY);
		editorPane_8.setBounds(133, 0, 366, 36);
		eightAM.add(editorPane_8);
		
		label_7 = new JLabel("8:00 AM");
		label_7.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_7.setBounds(29, 10, 94, 13);
		eightAM.add(label_7);
		
		nineAM = new JPanel();
		nineAM.setLayout(null);
		nineAM.setBackground(Color.WHITE);
		nineAM.setBounds(10, 424, 499, 36);
		sectionOne.add(nineAM);
		
		editorPane_9 = new JEditorPane();
		editorPane_9.setBackground(Color.LIGHT_GRAY);
		editorPane_9.setBounds(133, 0, 366, 36);
		nineAM.add(editorPane_9);
		
		label_8 = new JLabel("9:00 AM");
		label_8.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_8.setBounds(29, 10, 94, 13);
		nineAM.add(label_8);
		
		tenAM = new JPanel();
		tenAM.setLayout(null);
		tenAM.setBackground(Color.WHITE);
		tenAM.setBounds(10, 473, 499, 36);
		sectionOne.add(tenAM);
		
		editorPane_10 = new JEditorPane();
		editorPane_10.setBackground(Color.LIGHT_GRAY);
		editorPane_10.setBounds(133, 0, 366, 36);
		tenAM.add(editorPane_10);
		
		label_9 = new JLabel("10:00 AM");
		label_9.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_9.setBounds(29, 10, 94, 13);
		tenAM.add(label_9);
		
		elevenAM = new JPanel();
		elevenAM.setLayout(null);
		elevenAM.setBackground(Color.WHITE);
		elevenAM.setBounds(10, 525, 499, 36);
		sectionOne.add(elevenAM);
		
		editorPane_11 = new JEditorPane();
		editorPane_11.setBackground(Color.LIGHT_GRAY);
		editorPane_11.setBounds(133, 0, 366, 36);
		elevenAM.add(editorPane_11);
		
		label_10 = new JLabel("11:00 AM");
		label_10.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_10.setBounds(29, 10, 94, 13);
		elevenAM.add(label_10);
		
																		///////////// SECOND 12 HOURS OF THE DAY ///////////////
	
		sectionTwo = new JPanel();
		sectionTwo.setLayout(null);
		sectionTwo.setBounds(687, 121, 519, 571);
		contentPane.add(sectionTwo);
		
		twelvePM = new JPanel();
		twelvePM.setLayout(null);
		twelvePM.setBackground(Color.WHITE);
		twelvePM.setBounds(10, 10, 499, 36);
		sectionTwo.add(twelvePM);
		
		editorPane_12 = new JEditorPane();
		editorPane_12.setBackground(Color.LIGHT_GRAY);
		editorPane_12.setBounds(133, 0, 366, 36);
		twelvePM.add(editorPane_12);
		
		label_11 = new JLabel("12:00 PM");
		label_11.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_11.setBounds(29, 10, 94, 13);
		twelvePM.add(label_11);
		
		onePM = new JPanel();
		onePM.setLayout(null);
		onePM.setBackground(Color.WHITE);
		onePM.setBounds(10, 56, 499, 36);
		sectionTwo.add(onePM);
		
		editorPane_13 = new JEditorPane();
		editorPane_13.setBackground(Color.LIGHT_GRAY);
		editorPane_13.setBounds(133, 0, 366, 36);
		onePM.add(editorPane_13);
		
		label_12 = new JLabel("1:00 PM");
		label_12.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_12.setBounds(29, 10, 94, 13);
		onePM.add(label_12);
		
		twoPM = new JPanel();
		twoPM.setLayout(null);
		twoPM.setBackground(Color.WHITE);
		twoPM.setBounds(10, 102, 499, 36);
		sectionTwo.add(twoPM);
		
		editorPane_14 = new JEditorPane();
		editorPane_14.setBackground(Color.LIGHT_GRAY);
		editorPane_14.setBounds(133, 0, 366, 36);
		twoPM.add(editorPane_14);
		
		label_13 = new JLabel(" 2:00 PM");
		label_13.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_13.setBounds(29, 10, 94, 13);
		twoPM.add(label_13);
		
		threePM = new JPanel();
		threePM.setLayout(null);
		threePM.setBackground(Color.WHITE);
		threePM.setBounds(10, 148, 499, 36);
		sectionTwo.add(threePM);
		
		editorPane_15 = new JEditorPane();
		editorPane_15.setBackground(Color.LIGHT_GRAY);
		editorPane_15.setBounds(133, 0, 366, 36);
		threePM.add(editorPane_15);
		
		label_14 = new JLabel("3:00 PM");
		label_14.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_14.setBounds(29, 10, 94, 13);
		threePM.add(label_14);
		
		fourPM = new JPanel();
		fourPM.setLayout(null);
		fourPM.setBackground(Color.WHITE);
		fourPM.setBounds(10, 194, 499, 36);
		sectionTwo.add(fourPM);
		
		editorPane_16 = new JEditorPane();
		editorPane_16.setBackground(Color.LIGHT_GRAY);
		editorPane_16.setBounds(133, 0, 366, 36);
		fourPM.add(editorPane_16);
		
		label_15 = new JLabel("4:00 PM");
		label_15.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_15.setBounds(29, 10, 94, 13);
		fourPM.add(label_15);
		
		fivePM = new JPanel();
		fivePM.setLayout(null);
		fivePM.setBackground(Color.WHITE);
		fivePM.setBounds(10, 240, 499, 36);
		sectionTwo.add(fivePM);
		
		editorPane_17 = new JEditorPane();
		editorPane_17.setBackground(Color.LIGHT_GRAY);
		editorPane_17.setBounds(133, 0, 366, 36);
		fivePM.add(editorPane_17);
		
		label_16 = new JLabel("5:00 PM");
		label_16.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_16.setBounds(29, 10, 94, 13);
		fivePM.add(label_16);
		
		sixPM = new JPanel();
		sixPM.setLayout(null);
		sixPM.setBackground(Color.WHITE);
		sixPM.setBounds(10, 286, 499, 36);
		sectionTwo.add(sixPM);
		
		editorPane_18 = new JEditorPane();
		editorPane_18.setBackground(Color.LIGHT_GRAY);
		editorPane_18.setBounds(133, 0, 366, 36);
		sixPM.add(editorPane_18);
		
		label_17 = new JLabel("6:00 PM");
		label_17.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_17.setBounds(29, 10, 94, 13);
		sixPM.add(label_17);
		
		sevenPM = new JPanel();
		sevenPM.setLayout(null);
		sevenPM.setBackground(Color.WHITE);
		sevenPM.setBounds(10, 332, 499, 36);
		sectionTwo.add(sevenPM);
		
		editorPane_19 = new JEditorPane();
		editorPane_19.setBackground(Color.LIGHT_GRAY);
		editorPane_19.setBounds(133, 0, 366, 36);
		sevenPM.add(editorPane_19);
		
		label_18 = new JLabel("7:00 PM");
		label_18.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_18.setBounds(29, 10, 94, 13);
		sevenPM.add(label_18);
		
		eightPM = new JPanel();
		eightPM.setLayout(null);
		eightPM.setBackground(Color.WHITE);
		eightPM.setBounds(10, 378, 499, 36);
		sectionTwo.add(eightPM);
		
		editorPane_20 = new JEditorPane();
		editorPane_20.setBackground(Color.LIGHT_GRAY);
		editorPane_20.setBounds(133, 0, 366, 36);
		eightPM.add(editorPane_20);
		
		label_19 = new JLabel("8:00 PM");
		label_19.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_19.setBounds(29, 10, 94, 13);
		eightPM.add(label_19);
		
		ninePM = new JPanel();
		ninePM.setLayout(null);
		ninePM.setBackground(Color.WHITE);
		ninePM.setBounds(10, 424, 499, 36);
		sectionTwo.add(ninePM);
		
		editorPane_21 = new JEditorPane();
		editorPane_21.setBackground(Color.LIGHT_GRAY);
		editorPane_21.setBounds(133, 0, 366, 36);
		ninePM.add(editorPane_21);
		
		label_20 = new JLabel("9:00 PM");
		label_20.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_20.setBounds(29, 10, 94, 13);
		ninePM.add(label_20);
		
		tenPM = new JPanel();
		tenPM.setLayout(null);
		tenPM.setBackground(Color.WHITE);
		tenPM.setBounds(10, 473, 499, 36);
		sectionTwo.add(tenPM);
		
		editorPane_22 = new JEditorPane();
		editorPane_22.setBackground(Color.LIGHT_GRAY);
		editorPane_22.setBounds(133, 0, 366, 36);
		tenPM.add(editorPane_22);
		
		label_21 = new JLabel("10:00 PM");
		label_21.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_21.setBounds(29, 10, 94, 13);
		tenPM.add(label_21);
		
		elevenPM = new JPanel();
		elevenPM.setLayout(null);
		elevenPM.setBackground(Color.WHITE);
		elevenPM.setBounds(10, 525, 499, 36);
		sectionTwo.add(elevenPM);
		
		editorPane_23 = new JEditorPane();
		editorPane_23.setBackground(Color.LIGHT_GRAY);
		editorPane_23.setBounds(133, 0, 366, 36);
		elevenPM.add(editorPane_23);
		
		label_22 = new JLabel("11:00 PM");
		label_22.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_22.setBounds(29, 10, 94, 13);
		elevenPM.add(label_22);
		
		
		
	}
	
	public static void openPomodoro()
    {
        EventQueue.invokeLater(new Runnable()
        {
            @Override
            public void run()
            {
                JFrame pomodoro = new JFrame("Timer");
                pomodoro.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                try {
                }	
                 catch (Exception e) {
                   e.printStackTrace();
                }
                
          		pomodoro.setVisible(true);
        		pomodoro.setSize(500, 300);
        		pomodoro.setResizable(false);
        		pomodoro.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        		
        		JPanel pomPanel = new JPanel();
        		pomPanel.setBackground(Color.DARK_GRAY);
        		pomodoro.setContentPane(pomPanel);
        		
        		JLabel pomTime = new JLabel("potato");	//This is the label. You can’t make a box or thingy around the text as far as I know.
        		pomTime.setBounds(200, 100, 100, 40);
        		pomTime.setFont(new Font("Century", Font.PLAIN, 14));
        		pomTime.setHorizontalAlignment(SwingConstants.CENTER);
        		pomTime.setVisible(true);
        		pomTime.setLayout(null);
        		pomTime.setBackground(Color.WHITE);
        		pomTime.setForeground(Color.WHITE);
        		pomPanel.add(pomTime);

        		JButton startTimer = new JButton("START");
        		startTimer.setFont(new Font("Century", Font.PLAIN, 14));
        		startTimer.setBounds(200, 200, 100, 40);
        		startTimer.setVisible(true);
        		startTimer.addActionListener(new ActionListener() {
        			public void actionPerformed(ActionEvent e ) {	//in here you can put what the button does -Achilles
        				new Thread(new Runnable() {

							@Override
							public void run() {
								boolean z=true;
								while(z) {
								    boolean x=true;
								    boolean y=false;
								    boolean a=false;
								    long displayMinutes=24;
								    long startTime=System.currentTimeMillis();
								    pomTime.setText((displayMinutes+1)+"::00");
								    while(x)
								    {
								        try {
											TimeUnit.SECONDS.sleep(1);
										} catch (InterruptedException e) {
											// TODO Auto-generated catch block
											e.printStackTrace();
										}
								        long timePassed=System.currentTimeMillis()-startTime;
								        long secondsPassed=60-(timePassed/1000);//makes timer count down instead of up
								        if(secondsPassed==0)//when secondsPassed ==0 it restarts timer
								        {
							
								            startTime=System.currentTimeMillis();
								           
								        }
								        if(secondsPassed==59 && y) {//"y" was made false first because at 24::59 it wouldve made a minute pass which we dont want
								        	displayMinutes--;
								        	
								        }
								        if(secondsPassed==59 && !y) {//Makes "y" true, was put after the other if statements because after this loop it'll be 24:58 which wont trigger other if statement
								        	y=true;
								        }
								        if(displayMinutes==0 && secondsPassed==0)//Plays Bruh sound effect #3
								        {
								        	String filepath = "C:\\Users\\Tahir\\eclipse-workspace\\NewHacks\\Bruh\\bruh#3.wav";
								    		Bruh musicObject = new Bruh();
								    		musicObject.playMusic(filepath);
								        }
								        
							
								    pomTime.setText(displayMinutes+"::"+secondsPassed);
								    if(displayMinutes==0 && secondsPassed==0 && !a) {//makes timer go to 5 minutes after 25 minute timer done, also makes "a" true so that this if statement doesnt trigger when timer reaches 0 again
								    	displayMinutes=4;
								    	a=true;
								    }
								    if(displayMinutes==0 && secondsPassed==0 && a)//"a" was made true in last if statement so after 5 minute timer goes down it resets the entire loop and makes timer go back to 25 minutes
								    x=false;
								    }
									}
								
							} 
        		             
        		             
        		        }).start();         				
        			
        			}
        		});
        		pomPanel.setLayout(null);
        		pomPanel.add(startTimer);
 
            }

        });
    }
	
	public class ShowMenu implements ActionListener{
			
			public void actionPerformed(ActionEvent event){
				createMenuScreen();
			}
			
		}
	
	
	public class Pomodoro implements ActionListener{
			public void actionPerformed(ActionEvent event){
				openPomodoro();
			}
	}
}








