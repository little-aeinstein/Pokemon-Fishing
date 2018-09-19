import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class StartPage extends JFrame implements KeyListener 
{
	private JPanel contentPane;
	private Image icon;

	//STARTPAGE PANEL
	private JPanel panelStart;
	private JLabel lblPokemonLogo;
	private ImageIcon imgPokemonLogo;
	private JButton btnNewGame;
	private JButton btnLoadGame;
	private JButton btnExitGame1;
	
	//CREDENTIALS PANEL
	private JPanel panelCredentials;
	private JTextField textFieldName;
	private JLabel lblEthan;
	private ImageIcon imgEthan ;
	private JLabel lblLyra;
	private ImageIcon imgLyra;
	private JLabel lblName;
	private JLabel lblGender;
	private JButton btnMale;
	private JButton btnFemale;
	private JButton btnBack;

	//INTRODUCTION PANEL
	private JPanel panelIntroduction;
	private JLabel lblNewLabel;
	private JButton btnNext;

	//HOW TO PLAY PANEL
	private JPanel panelHowToPlay;
	private JLabel lblHowToPlay;
	private JLabel lblHowToPlayList;
	private JButton btnStartGame;

	//MAPS PANEL
	private JPanel panelMaps;
	private JLabel lblMaps;
	private JLabel lblLakeOfRage;
	private JLabel lblUnionCave;
	private JLabel lblRoute119;
	private JLabel lblFioresSea;
	private JLabel lblMarineCave;
	private JButton btnLakeOfRage;
	private ImageIcon imgLakeOfRage;
	private JButton btnUnionCave;
	private ImageIcon imgUnionCave;
	private JButton btnRoute119;
	private ImageIcon imgRoute119;
	private JButton btnFioresSea;
	private ImageIcon imgFioresSea;
	private JButton btnMarineCave;
	private ImageIcon imgMarineCave;
	private JButton btnExitGame2;

	//POKEMART PANEL
	private JPanel panelPokeMart;
	private JLabel lblPokeMart;
	private JLabel lblRods;
	private JLabel lblGoodRod;
	private ImageIcon imgGoodRod;
	private JLabel lblSuperRod;
	private ImageIcon imgSuperRod;
	private JLabel lblMasterRod;
	private ImageIcon imgMasterRod;
	private JLabel lblTackeBoxes;
	private JLabel lblGoodTackleBox;
	private ImageIcon imgGoodTackleBox;
	private JLabel lblSuperTackleBox;
	private ImageIcon imgSuperTackleBox;
	private JLabel lblMasterTackleBox;
	private ImageIcon imgMasterTackleBox;
	private JLabel lblLures;
	private JLabel lblGreatLure;
	private ImageIcon imgGreatLure;
	private JLabel lblUltraLure;
	private ImageIcon imgUltraLure;
	private JLabel lblMasterLure;
	private ImageIcon imgMasterLure;
	private JLabel lblReels;
	private JLabel lblGreatReel;
	private ImageIcon imgGreatReel;
	private JLabel lblUltraReel;
	private ImageIcon imgUltraReel;
	private JLabel lblMasterReel;
	private ImageIcon imgMasterReel;
	private JLabel lblBoats;
	private JLabel lblSpeedBoat;
	private ImageIcon imgSpeedBoat;
	private JLabel lblSharpedoBoat;
	private ImageIcon imgSharpedoBoat;
	private JLabel lblLines;
	private JLabel lblGreatLine;
	private ImageIcon imgGreatLine;
	private JLabel lblUltraLine;
	private ImageIcon imgUltraLine;
	private JLabel lblMasterLine;
	private ImageIcon imgMasterLine;
	private JLabel lblMoneyLeft;
	private JLabel lblTotalPrice;
	private JCheckBox chckbxGoodRod;
	private JCheckBox chckbxSuperRod;
	private JCheckBox chckbxMasterRod;
	private JCheckBox chckbxGoodTackleBox;
	private JCheckBox chckbxSuperTackleBox;
	private JCheckBox chckbxMasterTackleBox;
	private JCheckBox chckbxGreatLure;
	private JCheckBox chckbxUltraLure;
	private JCheckBox chckbxMasterLure;
	private JCheckBox chckbxGreatReel;
	private JCheckBox chckbxUltraReel;
	private JCheckBox chckbxMasterReel;
	private JCheckBox chckbxSpeedBoat;
	private JCheckBox chckbxSharpedoBoat;
	private JCheckBox chckbxGreatLine;
	private JCheckBox chckbxUltraLine;
	private JCheckBox chckbxMasterLine;
	private JButton btnPurchase;
	private JButton btnExitShop;
	private JTextField textFieldMoneyLeft;
	private JTextField textFieldTotalPrice;

	//GAME PANEL
	private JPanel panelGame;
	private JLabel lblDay;
	private JLabel lblCharacter;
	private JLabel lblMapName;
	private JLabel lblMap;
	private JLabel lblMoney;
	private JLabel lblMovesLeft;
	private JLabel lblCastsLeft;
	private JLabel lblFame;
	private JLabel lblInstructions;
	private JButton btnReturnMaps;
	private JButton btnExitGame3;
	private JPanel PokemonShuffler;
	private JPanel panelNoEncountered;
	private JLabel lblNoEncountered;
	private JPanel panelPokemonCapture;
	private JLabel lblPokemonCapturePicture;
	private ImageIcon imgPokemonCapturePicture;
	private JLabel lblPokemonCapture;
	private JPanel panelTreasureFound;
	private JLabel lblTreasure;
	private ImageIcon imgTreasure;
	private JLabel lblTreasurePhrase;

	//BADGE PANEL
	private JPanel panelBadge;
	private JLabel lblLegendary;
	private ImageIcon imgLegendary;
	private JLabel lblLegendaryPhrase;
	private JLabel lblBadgePhrase;
	private JLabel lblBadge;
	private ImageIcon imgBadge;
	private JButton btnReturnToMaps;
	
	//FINISHED GAME
	private JPanel panelFinish;
	
	//OTHERS
	private FileInputStream file;
	private ObjectInputStream load;
	private Map chosenMap;
	private Player player;
	private Pokemon pokemonCaught;
	private int fame = 0;
        private ArrayList<Map> mapList;
        private ArrayList<FishingRod> rodList;
        private ArrayList<CustomizationRod> customRodList;
        private ArrayList<Boat> boatList;
        private ArrayList<TackleBox> boxList;
        private Engine aquaEngine;
        private int totalPrice=0;
        private JPanel panelLoad;
        private JLabel lblFileName;
        private JButton btnMainMenu_1;
        private JTextField textFieldFileName;
        private JButton btnEnter;
        private JLabel lblNewLabel_1;
        private JLabel lblEngine;
        private ImageIcon imgEngine;
        private JCheckBox chckbxEngine;
                
        
        private class PlayerActionListener implements ActionListener {
            private Player player;

            public PlayerActionListener(Player player) {
                this.player = player;
            }

            public void actionPerformed(ActionEvent e) {
                int money = player.getMoney();
                int totalPrice = Integer.parseInt(textFieldTotalPrice.getText());
                if(money >= totalPrice && totalPrice != 0)
                {
                    //btnPurchase.setEnabled(true);
                   textFieldMoneyLeft.setText(String.valueOf(money));
                   player.setBuyMoney(totalPrice);
                   lblMoney.setText("MONEY: P" + player.getMoney());
                   textFieldMoneyLeft.setText(""+player.getMoney());
                   
                   if(chckbxSpeedBoat.isSelected()==true)
                   {
                       player.setBoat(boatList.get(1));
                   }
                   if(chckbxSharpedoBoat.isSelected()==true)
                   {
                       player.setBoat(boatList.get(2));                       
                   }
                   if(chckbxGoodTackleBox.isSelected()==true)
                   {
                       player.setBox(boxList.get(1));
                   }
                   if(chckbxSuperTackleBox.isSelected()==true)
                   {
                       player.setBox(boxList.get(2));
                   }                  
                   if(chckbxMasterTackleBox.isSelected()==true)
                   {
                       player.setBox(boxList.get(3));
                   }                   
                   if(chckbxGoodRod.isSelected()==true)
                   {
                        player.getRod().resetRod();
                        player.setRod(rodList.get(1));
                   }                  
                   if(chckbxSuperRod.isSelected()==true)
                   {
                        player.getRod().resetRod();
                        player.setRod(rodList.get(2));
                   }      
                   if(chckbxMasterRod.isSelected()==true)
                   {
                        player.getRod().resetRod();
                        player.setRod(rodList.get(3));
                   } 
                   
                   if(chckbxGreatLure.isSelected()==true)
                   {
                        player.getRod().setLure(customRodList.get(0));
                   } 
                   
                   if(chckbxUltraLure.isSelected()==true)
                   {
                        player.getRod().setLure(customRodList.get(1));
                   }  
                   
                   if(chckbxMasterLure.isSelected()==true)
                   {
                        player.getRod().setLure(customRodList.get(2));
                   }                         
                   if(chckbxGreatLine.isSelected()==true)
                   {
                        player.getRod().setLure(customRodList.get(3));
                   } 
                   
                   if(chckbxUltraLine.isSelected()==true)
                   {
                        player.getRod().setLure(customRodList.get(4));
                   }  
                   
                   if(chckbxMasterLine.isSelected()==true)
                   {
                        player.getRod().setLure(customRodList.get(5));
                   }                         
                   if(chckbxGreatReel.isSelected()==true)
                   {
                        player.getRod().setLure(customRodList.get(6));
                   } 
                   
                   if(chckbxUltraReel.isSelected()==true)
                   {
                        player.getRod().setLure(customRodList.get(7));
                   }  
                   
                   if(chckbxMasterReel.isSelected()==true)
                   {
                        player.getRod().setLure(customRodList.get(8));
                   }                                       
                   if(chckbxEngine.isSelected()==true)
                   {
                        player.getBoat().setEngine(aquaEngine);
                   }                     
                   textFieldTotalPrice.setText("0");
                   
                   
                   chckbxSpeedBoat.setSelected(false);                                                       
                   chckbxSharpedoBoat.setSelected(false);    
                    chckbxEngine.setSelected(false);                  
                   chckbxGoodTackleBox.setSelected(false);                                                       
                   chckbxSuperTackleBox.setSelected(false);
                   chckbxMasterTackleBox.setSelected(false);     
                   
                   chckbxGoodRod.setSelected(false);                                                       
                   chckbxSuperRod.setSelected(false);
                   chckbxMasterRod.setSelected(false);     
                   
                   chckbxGreatLure.setSelected(false);                                                       
                   chckbxUltraLure.setSelected(false);
                   chckbxMasterLure.setSelected(false);  
               
                   chckbxGreatLine.setSelected(false);                                                       
                   chckbxUltraLine.setSelected(false);
                   chckbxMasterLine.setSelected(false);   

                   chckbxGreatReel.setSelected(false);                                                       
                   chckbxUltraReel.setSelected(false);
                   chckbxMasterReel.setSelected(false);                        
                }
            }
        }        
        
	
	public void graphicalMap(Player player, JLabel lblCharacter)
	{
		int xD = 0;
		for(int x=57;x<387;x+=30)
		{	
			int yD = 0;


			for(int y=57;y<387;y+=30)
			{

				if(xD==player.getY()+1 &&yD==player.getX()+1){
					System.out.println("" + player.getY() + player.getX());
					lblCharacter.setBounds(x, y, 30, 30);
				}
				
				yD++;
			}
			xD++;
		}
		
		
	}
	
	
	
	/**
	 * Create the frame.
	 */

	public StartPage(final Player player, final ArrayList<Map> mapList, final ArrayList<FishingRod> rodList, final ArrayList<CustomizationRod> customRodList, final ArrayList<Boat> boatList, final ArrayList<TackleBox> boxList, final Engine aquaEngine) {
		this.player = player;
		this.chosenMap = mapList.get(0);
                this.mapList = mapList;
                this.rodList = rodList;
                this.customRodList = customRodList;
                this.boatList = boatList;
                this.boxList = boxList;
                this.aquaEngine = aquaEngine;
		
		setFocusable(true);
		requestFocusInWindow(true);
		addKeyListener(this);
		
		icon = new javax.swing.ImageIcon("Images/pokemon_icon.jpeg").getImage();
		setIconImage(icon);
		setTitle("Pokemon Fishing");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 829, 571);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		setLocation(280, 120);
		

		/*----------------------------------------------------ALL OBJECT CLASSES---------------------------------------------------------*/



		
		
		
		
		
		/*----------------------------------------------------STARTING PAGE---------------------------------------------------------*/
		panelStart = new JPanel();
		contentPane.add(panelStart, "name_141224798243821");
		panelStart.setLayout(null);
		
		lblPokemonLogo = new JLabel("");
		lblPokemonLogo.setBounds(95, 51, 635, 244);
		imgPokemonLogo = new ImageIcon(this.getClass().getResource("/pokemon_logo.jpeg"));
		lblPokemonLogo.setIcon(imgPokemonLogo);
		panelStart.add(lblPokemonLogo);
		
		btnNewGame = new JButton("NEW GAME");
		btnNewGame.setFont(new Font("PixelGameFont", Font.PLAIN, 16));
		btnNewGame.setBounds(298, 346, 162, 30);
		panelStart.add(btnNewGame);
		
		btnLoadGame = new JButton("LOAD GAME");
		
		btnLoadGame.setFont(new Font("PixelGameFont", Font.PLAIN, 16));
		btnLoadGame.setBounds(298, 387, 162, 30);
		panelStart.add(btnLoadGame);
		
		btnExitGame1 = new JButton("EXIT GAME");
		btnExitGame1.setFont(new Font("PixelGameFont", Font.PLAIN, 16));
		btnExitGame1.setBounds(298, 428, 162, 30);
		panelStart.add(btnExitGame1);
		
		
		
		
	
		
		
		
		/*----------------------------------------------------CREDENTIAL PANEL---------------------------------------------------------*/
		panelCredentials = new JPanel();
		contentPane.add(panelCredentials, "name_141224810447871");
		panelCredentials.setLayout(null);
		
		lblEthan = new JLabel();
		lblEthan.setBounds(10, 60, 253, 474);
		imgEthan = new ImageIcon(this.getClass().getResource("/ethan.jpeg"));
		lblEthan.setIcon(imgEthan);
		panelCredentials.add(lblEthan);
		
		lblLyra = new JLabel();
		lblLyra.setBounds(520, 60, 253, 474);
		imgLyra = new ImageIcon(this.getClass().getResource("/lyra.jpeg"));
		lblLyra.setIcon(imgLyra);
		panelCredentials.add(lblLyra);
		
		
		
         
		lblName = new JLabel("ENTER YOUR NAME");
		lblName.setHorizontalAlignment(SwingConstants.CENTER);
		lblName.setFont(new Font("PixelGameFont", Font.PLAIN, 14));
		lblName.setBounds(273, 11, 231, 72);
		panelCredentials.add(lblName);
		
		lblGender = new JLabel("CHOOSE YOUR GENDER");
		lblGender.setHorizontalAlignment(SwingConstants.CENTER);
		lblGender.setFont(new Font("PixelGameFont", Font.PLAIN, 14));
		lblGender.setBounds(273, 178, 231, 72);
		panelCredentials.add(lblGender);
		
		btnMale = new JButton("MALE");
		btnMale.setFont(new Font("PixelGameFont", Font.PLAIN, 16));
		btnMale.setBounds(335, 261, 120, 30);
		panelCredentials.add(btnMale);
		
		btnFemale = new JButton("FEMALE");
		btnFemale.setFont(new Font("PixelGameFont", Font.PLAIN, 16));
		btnFemale.setBounds(335, 302, 120, 30);
		panelCredentials.add(btnFemale);
		
		btnBack = new JButton("BACK");
		btnBack.setFont(new Font("PixelGameFont", Font.PLAIN, 16));
		btnBack.setBounds(10, 11, 90, 30);
		panelCredentials.add(btnBack);
		
		textFieldName = new JTextField();
		textFieldName.setBackground(Color.WHITE);
		textFieldName.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldName.setFont(new Font("PixelGameFont", Font.PLAIN, 14));
		textFieldName.setBounds(274, 60, 228, 32);
		panelCredentials.add(textFieldName);
		textFieldName.setColumns(50);
		try
		{
		  file = new FileInputStream(textFieldName.getText()+".sav");
		}catch(Exception e)
		{
			
		}
//         load = new ObjectInputStream(file);

		/*----------------------------------------------------INTRODUCTION PANEL---------------------------------------------------------*/
		
		panelIntroduction = new JPanel();
		contentPane.add(panelIntroduction, "name_279047982995835");
		panelIntroduction.setLayout(null);
		
		//AAYUSIN KO PA ITO HAHAHA
		String message = "<html>WELCOME TO THE WORLD OF POKEMON FISHING! In this world, you play the role of a fisherman! But not just any fisherman content with just reeling in the pathetic Magikarp and Tentacool, no, you are after the big ones, the Catch of a Lifetime. Equipped with only your rod (and a couple of other things), a small boat, courage and a pure heart that beats only for fishing; your goal as an impatient fisherman is to capture the Legendary PokEmon- wherever region they may be, and be the Ultimate PokEmon Fishing Champion within 30 days!</html>";
		lblNewLabel = new JLabel(message.toUpperCase());
		lblNewLabel.setFont(new Font("PixelGameFont", Font.PLAIN, 16));
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setBounds(10, 69, 793, 217);
		panelIntroduction.add(lblNewLabel);
		
		btnNext = new JButton("NEXT");
		btnNext.setFont(new Font("PixelGameFont", Font.PLAIN, 16));
		btnNext.setBounds(324, 348, 120, 30);
		panelIntroduction.add(btnNext);
		
		
		/*----------------------------------------------------HOW TO PLAY PANEL---------------------------------------------------------*/
		panelHowToPlay = new JPanel();
		contentPane.add(panelHowToPlay, "name_142726270119641");
		panelHowToPlay.setLayout(null);
			
		lblHowToPlay = new JLabel("HOW TO PLAY");
		lblHowToPlay.setHorizontalAlignment(SwingConstants.CENTER);
		lblHowToPlay.setFont(new Font("PixelGameFont", Font.PLAIN, 32));
		lblHowToPlay.setBounds(190, 11, 440, 64);
		panelHowToPlay.add(lblHowToPlay);
		
		lblHowToPlayList = new JLabel("<html>W - MOVE UP<br>"
				+ "S - MOVE DOWN<br>" + "A - MOVE LEFT<br>" + "D - MOVE RIGHT<br><br>" + "F - CAST</html>");
		lblHowToPlayList.setHorizontalAlignment(SwingConstants.CENTER);
		lblHowToPlayList.setFont(new Font("PixelGameFont", Font.PLAIN, 32));
		lblHowToPlayList.setBounds(217, 61, 430, 284);
		panelHowToPlay.add(lblHowToPlayList);
		
		btnStartGame = new JButton("START GAME");
		btnStartGame.setFont(new Font("PixelGameFont", Font.PLAIN, 14));
		btnStartGame.setBounds(309, 376, 153, 36);
		panelHowToPlay.add(btnStartGame);
		
		
		/*----------------------------------------------------MAPS PANEL---------------------------------------------------------*/
		panelMaps = new JPanel();
		contentPane.add(panelMaps, "name_155722138852231");
		panelMaps.setLayout(null);
		
		
		
		lblMaps = new JLabel("MAPS");
		lblMaps.setHorizontalAlignment(SwingConstants.CENTER);
		lblMaps.setFont(new Font("PixelGameFont", Font.PLAIN, 20));
		lblMaps.setBounds(323, 11, 185, 51);
		panelMaps.add(lblMaps);
		
		lblLakeOfRage = new JLabel("LAKE OF RAGE");
		lblLakeOfRage.setFont(new Font("PixelGameFont", Font.PLAIN, 16));
		lblLakeOfRage.setBounds(56, 69, 122, 28);
		panelMaps.add(lblLakeOfRage);
		
		lblUnionCave = new JLabel("UNION CAVE");
		lblUnionCave.setFont(new Font("PixelGameFont", Font.PLAIN, 16));
		lblUnionCave.setBounds(253, 69, 122, 28);
		panelMaps.add(lblUnionCave);
		
		lblRoute119 = new JLabel("ROUTE 119");
		lblRoute119.setEnabled(false);
		lblRoute119.setFont(new Font("PixelGameFont", Font.PLAIN, 16));
		lblRoute119.setBounds(455, 69, 122, 28);
		panelMaps.add(lblRoute119);

		lblFioresSea = new JLabel("FIORE'S SEA");
		lblFioresSea.setEnabled(false);
		lblFioresSea.setFont(new Font("PixelGameFont", Font.PLAIN, 16));
		lblFioresSea.setBounds(56, 281, 122, 28);
		panelMaps.add(lblFioresSea);
		
		lblMarineCave = new JLabel("MARINE CAVE");
		lblMarineCave.setEnabled(false);
		lblMarineCave.setFont(new Font("PixelGameFont", Font.PLAIN, 16));
		lblMarineCave.setBounds(253, 281, 122, 28);
		panelMaps.add(lblMarineCave);
	
		btnLakeOfRage = new JButton();
		btnLakeOfRage.setBounds(28, 100, 170, 170);
		imgLakeOfRage = new ImageIcon(this.getClass().getResource("/lake_of_rage_small.jpeg"));
		btnLakeOfRage.setIcon(imgLakeOfRage);
		panelMaps.add(btnLakeOfRage);
		
		btnUnionCave = new JButton("");
		btnUnionCave.setBounds(222, 100, 170, 170);
		imgUnionCave = new ImageIcon(this.getClass().getResource("/union_cave_small.jpeg"));
		btnUnionCave.setIcon(imgUnionCave);
		panelMaps.add(btnUnionCave);
		
		btnRoute119 = new JButton("");
		btnRoute119.setEnabled(false);
		btnRoute119.setBounds(416, 100, 170, 170);
		imgRoute119 = new ImageIcon(this.getClass().getResource("/route119_small.jpeg"));
		btnRoute119.setIcon(imgRoute119);
		panelMaps.add(btnRoute119);
		
		btnFioresSea = new JButton();
		btnFioresSea.setEnabled(false);
		btnFioresSea.setBounds(28, 305, 170, 170);
		imgFioresSea = new ImageIcon(this.getClass().getResource("/fiore's_sea_small.jpeg"));
		btnFioresSea.setIcon(imgFioresSea);
		panelMaps.add(btnFioresSea);
		
		btnMarineCave = new JButton("");
		btnMarineCave.setEnabled(false);
		btnMarineCave.setBounds(222, 305, 170, 170);
		imgMarineCave = new ImageIcon(this.getClass().getResource("/marine_cave_small.jpeg"));
		btnMarineCave.setIcon(imgMarineCave);
		panelMaps.add(btnMarineCave);
		
		btnExitGame2 = new JButton("EXIT GAME");
		btnExitGame2.setFont(new Font("PixelGameFont", Font.PLAIN, 14));
		btnExitGame2.setBounds(683, 11, 120, 30);
		panelMaps.add(btnExitGame2);
		
		
		
		
		/*----------------------------------------------------POKEMART PANEL---------------------------------------------------------*/
		panelPokeMart = new JPanel();
		contentPane.add(panelPokeMart, "name_159133001421432");
		panelPokeMart.setLayout(null);

		
		lblPokeMart = new JLabel("POKEMART");
		lblPokeMart.setHorizontalAlignment(SwingConstants.CENTER);
		lblPokeMart.setFont(new Font("PixelGameFont", Font.PLAIN, 18));
		lblPokeMart.setBounds(340, 11, 133, 35);
		panelPokeMart.add(lblPokeMart);
                
                lblEngine = new JLabel("ENGINE", (Icon) null, SwingConstants.CENTER);
		lblEngine.setFont(new Font("PixelGameFont", Font.PLAIN, 12));
		imgEngine = new ImageIcon(this.getClass().getResource("/engine.jpeg"));
		lblEngine.setIcon(imgEngine);
		lblEngine.setBounds(392, 429, 169, 54);
		panelPokeMart.add(lblEngine);
                		
                final JCheckBox chckbxEngine = new JCheckBox("P1000");
		chckbxEngine.setFont(new Font("PixelGameFont", Font.PLAIN, 12));
		chckbxEngine.setBounds(431, 490, 109, 23);
		panelPokeMart.add(chckbxEngine);

		lblRods = new JLabel("RODS");
		lblRods.setHorizontalAlignment(SwingConstants.CENTER);
		lblRods.setFont(new Font("PixelGameFont", Font.PLAIN, 18));
		lblRods.setBounds(21, 58, 89, 24);
		panelPokeMart.add(lblRods);
		
		lblGoodRod = new JLabel("GOOD ROD",SwingConstants.CENTER);
		lblGoodRod.setFont(new Font("PixelGameFont", Font.PLAIN, 12));
		lblGoodRod.setBounds(21, 90, 88, 24);
		imgGoodRod = new ImageIcon(this.getClass().getResource("/good_rod.jpeg"));
		lblGoodRod.setIcon(imgGoodRod);
		panelPokeMart.add(lblGoodRod);
		
		lblSuperRod = new JLabel("SUPER ROD", (Icon) null, SwingConstants.CENTER);
		lblSuperRod.setFont(new Font("PixelGameFont", Font.PLAIN, 12));
		lblSuperRod.setBounds(21, 156, 97, 24);
		imgSuperRod = new ImageIcon(this.getClass().getResource("/super_rod.jpeg"));
		lblSuperRod.setIcon(imgSuperRod);
		panelPokeMart.add(lblSuperRod);
		
		lblMasterRod = new JLabel("MASTER ROD", (Icon) null, SwingConstants.CENTER);
		lblMasterRod.setFont(new Font("PixelGameFont", Font.PLAIN, 12));
		lblMasterRod.setBounds(21, 219, 126, 38);
		imgMasterRod = new ImageIcon(this.getClass().getResource("/master_rod.jpeg"));
		lblMasterRod.setIcon(imgMasterRod);
		panelPokeMart.add(lblMasterRod);

		lblTackeBoxes = new JLabel("TACKLE BOXES");
		lblTackeBoxes.setHorizontalAlignment(SwingConstants.CENTER);
		lblTackeBoxes.setFont(new Font("PixelGameFont", Font.PLAIN, 18));
		lblTackeBoxes.setBounds(190, 58, 149, 24);
		panelPokeMart.add(lblTackeBoxes);
	
		lblGoodTackleBox = new JLabel("GOOD TACKLEBOX", (Icon) null, SwingConstants.CENTER);
		lblGoodTackleBox.setFont(new Font("PixelGameFont", Font.PLAIN, 12));
		lblGoodTackleBox.setBounds(200, 90, 139, 30);
		imgGoodTackleBox = new ImageIcon(this.getClass().getResource("/good_tackle_box.jpeg"));
		lblGoodTackleBox.setIcon(imgGoodTackleBox);
		panelPokeMart.add(lblGoodTackleBox);
		
		lblSuperTackleBox = new JLabel("SUPER TACKLEBOX", (Icon) null, SwingConstants.CENTER);
		lblSuperTackleBox.setFont(new Font("PixelGameFont", Font.PLAIN, 12));
		lblSuperTackleBox.setBounds(200, 156, 150, 30);
		imgSuperTackleBox = new ImageIcon(this.getClass().getResource("/super_tackle_box.jpeg"));
		lblSuperTackleBox.setIcon(imgSuperTackleBox);
		panelPokeMart.add(lblSuperTackleBox);
		
		lblMasterTackleBox = new JLabel("MASTER TACKLEBOX", (Icon) null, SwingConstants.CENTER);
		lblMasterTackleBox.setFont(new Font("PixelGameFont", Font.PLAIN, 12));
		lblMasterTackleBox.setBounds(200, 215, 162, 45);
		imgMasterTackleBox = new ImageIcon(this.getClass().getResource("/master_tackle_box.jpeg"));
		lblMasterTackleBox.setIcon(imgMasterTackleBox);
		panelPokeMart.add(lblMasterTackleBox);

		lblLures = new JLabel("LURES");
		lblLures.setHorizontalAlignment(SwingConstants.CENTER);
		lblLures.setFont(new Font("PixelGameFont", Font.PLAIN, 18));
		lblLures.setBounds(431, 57, 89, 35);
		panelPokeMart.add(lblLures);
		
		lblGreatLure = new JLabel("GREAT LURE", (Icon) null, SwingConstants.CENTER);
		lblGreatLure.setFont(new Font("PixelGameFont", Font.PLAIN, 12));
		lblGreatLure.setBounds(418, 90, 115, 30);
		imgGreatLure = new ImageIcon(this.getClass().getResource("/great_lure.jpeg"));
		lblGreatLure.setIcon(imgGreatLure);
		panelPokeMart.add(lblGreatLure);
		
		lblUltraLure = new JLabel("ULTRA LURE", (Icon) null, SwingConstants.CENTER);
		lblUltraLure.setFont(new Font("PixelGameFont", Font.PLAIN, 12));
		lblUltraLure.setBounds(418, 156, 118, 30);
		imgUltraLure = new ImageIcon(this.getClass().getResource("/ultra_lure.jpeg"));
		lblUltraLure.setIcon(imgUltraLure);
		panelPokeMart.add(lblUltraLure);
		
		lblMasterLure = new JLabel("MASTER LURE", (Icon) null, SwingConstants.CENTER);
		lblMasterLure.setFont(new Font("PixelGameFont", Font.PLAIN, 12));
		lblMasterLure.setBounds(418, 219, 127, 30);
		imgMasterLure = new ImageIcon(this.getClass().getResource("/master_lure.jpeg"));
		lblMasterLure.setIcon(imgMasterLure);
		panelPokeMart.add(lblMasterLure);
		
		lblReels = new JLabel("REELS");
		lblReels.setHorizontalAlignment(SwingConstants.CENTER);
		lblReels.setFont(new Font("PixelGameFont", Font.PLAIN, 18));
		lblReels.setBounds(609, 58, 89, 35);
		panelPokeMart.add(lblReels);
		
		lblGreatReel = new JLabel("GREAT REEL", (Icon) null, SwingConstants.CENTER);
		lblGreatReel.setFont(new Font("PixelGameFont", Font.PLAIN, 12));
		lblGreatReel.setBounds(609, 90, 104, 30);
		imgGreatReel = new ImageIcon(this.getClass().getResource("/great_reel.jpeg"));
		lblGreatReel.setIcon(imgGreatReel);
		panelPokeMart.add(lblGreatReel);
		
		lblUltraReel = new JLabel("ULTRA REEL", (Icon) null, SwingConstants.CENTER);
		lblUltraReel.setFont(new Font("PixelGameFont", Font.PLAIN, 12));
		lblUltraReel.setBounds(609, 156, 107, 30);
		imgUltraReel = new ImageIcon(this.getClass().getResource("/ultra_reel.jpeg"));
		lblUltraReel.setIcon(imgUltraReel);
		panelPokeMart.add(lblUltraReel);
		
		lblMasterReel = new JLabel("MASTER REEL", (Icon) null, SwingConstants.CENTER);
		lblMasterReel.setFont(new Font("PixelGameFont", Font.PLAIN, 12));
		lblMasterReel.setBounds(609, 219, 117, 30);
		imgMasterReel = new ImageIcon(this.getClass().getResource("/master_reel.jpeg"));
		lblMasterReel.setIcon(imgMasterReel);
		panelPokeMart.add(lblMasterReel);
		
		lblBoats = new JLabel("BOATS");
		lblBoats.setHorizontalAlignment(SwingConstants.CENTER);
		lblBoats.setFont(new Font("PixelGameFont", Font.PLAIN, 18));
		lblBoats.setBounds(31, 302, 89, 35);
		panelPokeMart.add(lblBoats);
		
		lblSpeedBoat = new JLabel("SPEED BOAT", (Icon) null, SwingConstants.CENTER);
		lblSpeedBoat.setFont(new Font("PixelGameFont", Font.PLAIN, 12));
		lblSpeedBoat.setBounds(21, 338, 204, 56);
		imgSpeedBoat = new ImageIcon(this.getClass().getResource("/speed_boat.jpeg"));
		lblSpeedBoat.setIcon(imgSpeedBoat);
		panelPokeMart.add(lblSpeedBoat);
		
		lblSharpedoBoat = new JLabel("SHARPEDO BOAT", (Icon) null, SwingConstants.CENTER);
		lblSharpedoBoat.setFont(new Font("PixelGameFont", Font.PLAIN, 12));
		lblSharpedoBoat.setBounds(31, 429, 171, 69);
		imgSharpedoBoat = new ImageIcon(this.getClass().getResource("/sharpedo_boat.jpg"));
		lblSharpedoBoat.setIcon(imgSharpedoBoat);
		panelPokeMart.add(lblSharpedoBoat);
		
		lblLines = new JLabel("LINES");
		lblLines.setHorizontalAlignment(SwingConstants.CENTER);
		lblLines.setFont(new Font("PixelGameFont", Font.PLAIN, 18));
		lblLines.setBounds(263, 302, 89, 35);
		panelPokeMart.add(lblLines);
		
		lblGreatLine = new JLabel("GREAT LINE", (Icon) null, SwingConstants.CENTER);
		lblGreatLine.setFont(new Font("PixelGameFont", Font.PLAIN, 12));
		lblGreatLine.setBounds(243, 337, 132, 51);
		imgGreatLine = new ImageIcon(this.getClass().getResource("/great_line.jpg"));
		lblGreatLine.setIcon(imgGreatLine);
		panelPokeMart.add(lblGreatLine);
		
		lblUltraLine = new JLabel("ULTRA LINE", (Icon) null, SwingConstants.CENTER);
		lblUltraLine.setFont(new Font("PixelGameFont", Font.PLAIN, 12));
		lblUltraLine.setBounds(243, 429, 139, 54);
		imgUltraLine = new ImageIcon(this.getClass().getResource("/ultra_line.jpg"));
		lblUltraLine.setIcon(imgUltraLine);
		panelPokeMart.add(lblUltraLine);
		
		lblMasterLine = new JLabel("MASTER LINE", (Icon) null, SwingConstants.CENTER);
		lblMasterLine.setFont(new Font("PixelGameFont", Font.PLAIN, 12));
		lblMasterLine.setBounds(399, 337, 162, 54);
		imgMasterLine = new ImageIcon(this.getClass().getResource("/master_line.jpg"));
		lblMasterLine.setIcon(imgMasterLine);
		panelPokeMart.add(lblMasterLine);
		
		lblMoneyLeft = new JLabel("MONEY");
		lblMoneyLeft.setHorizontalAlignment(SwingConstants.RIGHT);
		lblMoneyLeft.setFont(new Font("PixelGameFont", Font.PLAIN, 10));
		lblMoneyLeft.setBounds(609, 355, 70, 25);
		panelPokeMart.add(lblMoneyLeft);
		
		lblTotalPrice = new JLabel("TOTAL PRICE");
		lblTotalPrice.setHorizontalAlignment(SwingConstants.LEFT);
		lblTotalPrice.setFont(new Font("PixelGameFont", Font.PLAIN, 10));
		lblTotalPrice.setBounds(606, 381, 73, 25);
		panelPokeMart.add(lblTotalPrice);
		
		
		
		
		

		chckbxGoodRod = new JCheckBox("P3000");
		chckbxGoodRod.setFont(new Font("PixelGameFont", Font.PLAIN, 12));
		chckbxGoodRod.setBounds(31, 121, 109, 23);
		panelPokeMart.add(chckbxGoodRod);
		
		chckbxSuperRod = new JCheckBox("P8000");
		chckbxSuperRod.setFont(new Font("PixelGameFont", Font.PLAIN, 12));
		chckbxSuperRod.setBounds(31, 189, 109, 23);
		panelPokeMart.add(chckbxSuperRod);
		
		chckbxMasterRod = new JCheckBox("P20000");
		chckbxMasterRod.setFont(new Font("PixelGameFont", Font.PLAIN, 12));
		chckbxMasterRod.setBounds(31, 264, 109, 23);
		panelPokeMart.add(chckbxMasterRod);
		
		chckbxGoodTackleBox = new JCheckBox("P1500");
		chckbxGoodTackleBox.setFont(new Font("PixelGameFont", Font.PLAIN, 12));
		chckbxGoodTackleBox.setBounds(210, 127, 109, 23);
		panelPokeMart.add(chckbxGoodTackleBox);
		
		chckbxSuperTackleBox = new JCheckBox("P2000");
		chckbxSuperTackleBox.setFont(new Font("PixelGameFont", Font.PLAIN, 12));
		chckbxSuperTackleBox.setBounds(210, 193, 109, 23);
		panelPokeMart.add(chckbxSuperTackleBox);
		
		chckbxMasterTackleBox = new JCheckBox("P2500");
		chckbxMasterTackleBox.setFont(new Font("PixelGameFont", Font.PLAIN, 12));
		chckbxMasterTackleBox.setBounds(210, 264, 109, 23);
		panelPokeMart.add(chckbxMasterTackleBox);
		
		chckbxGreatLure = new JCheckBox("P500");
		chckbxGreatLure.setFont(new Font("PixelGameFont", Font.PLAIN, 12));
		chckbxGreatLure.setBounds(428, 127, 109, 23);
		panelPokeMart.add(chckbxGreatLure);
		
		chckbxUltraLure = new JCheckBox("P700");
		chckbxUltraLure.setFont(new Font("PixelGameFont", Font.PLAIN, 12));
		chckbxUltraLure.setBounds(431, 188, 109, 23);
		panelPokeMart.add(chckbxUltraLure);
		
		chckbxMasterLure = new JCheckBox("P900");
		chckbxMasterLure.setFont(new Font("PixelGameFont", Font.PLAIN, 12));
		chckbxMasterLure.setBounds(431, 256, 109, 23);
		panelPokeMart.add(chckbxMasterLure);
		
		chckbxGreatReel = new JCheckBox("P800");
		chckbxGreatReel.setFont(new Font("PixelGameFont", Font.PLAIN, 12));
		chckbxGreatReel.setBounds(619, 127, 109, 23);
		panelPokeMart.add(chckbxGreatReel);
		
		chckbxUltraReel = new JCheckBox("P950");
		chckbxUltraReel.setFont(new Font("PixelGameFont", Font.PLAIN, 12));
		chckbxUltraReel.setBounds(619, 189, 109, 23);
		panelPokeMart.add(chckbxUltraReel);
		
		chckbxMasterReel = new JCheckBox("P1000");
		chckbxMasterReel.setFont(new Font("PixelGameFont", Font.PLAIN, 12));
		chckbxMasterReel.setBounds(619, 256, 109, 23);
		panelPokeMart.add(chckbxMasterReel);
		
		chckbxSpeedBoat = new JCheckBox("P3500");
		chckbxSpeedBoat.setFont(new Font("PixelGameFont", Font.PLAIN, 12));
		chckbxSpeedBoat.setBounds(48, 401, 109, 23);
		panelPokeMart.add(chckbxSpeedBoat);
		
		chckbxSharpedoBoat = new JCheckBox("P5000");
		chckbxSharpedoBoat.setFont(new Font("PixelGameFont", Font.PLAIN, 12));
		chckbxSharpedoBoat.setBounds(48, 505, 109, 23);
		panelPokeMart.add(chckbxSharpedoBoat);
		
		chckbxGreatLine = new JCheckBox("P700");
		chckbxGreatLine.setFont(new Font("PixelGameFont", Font.PLAIN, 12));
		chckbxGreatLine.setBounds(263, 395, 109, 23);
		panelPokeMart.add(chckbxGreatLine);
		
		chckbxUltraLine = new JCheckBox("P800");
		chckbxUltraLine.setFont(new Font("PixelGameFont", Font.PLAIN, 12));
		chckbxUltraLine.setBounds(263, 490, 109, 23);
		panelPokeMart.add(chckbxUltraLine);
		
		chckbxMasterLine = new JCheckBox("P900");
		chckbxMasterLine.setFont(new Font("PixelGameFont", Font.PLAIN, 12));
		chckbxMasterLine.setBounds(431, 398, 109, 23);
		panelPokeMart.add(chckbxMasterLine);
		
		
		
		
		
		textFieldMoneyLeft = new JTextField(String.valueOf(player.getMoney()));
		textFieldMoneyLeft.setEditable(false);
		textFieldMoneyLeft.setBounds(689, 355, 86, 20);
		panelPokeMart.add(textFieldMoneyLeft);
		textFieldMoneyLeft.setColumns(10);
		
		textFieldTotalPrice = new JTextField("0");
		textFieldTotalPrice.setEditable(false);
		textFieldTotalPrice.setBounds(689, 381, 86, 20);
		panelPokeMart.add(textFieldTotalPrice);
		textFieldTotalPrice.setColumns(10);
		
		
		btnPurchase = new JButton("PURCHASE");
		btnPurchase.setEnabled(false);
		btnPurchase.setFont(new Font("PixelGameFont", Font.PLAIN, 12));
		btnPurchase.setBounds(573, 429, 218, 30);
		panelPokeMart.add(btnPurchase);
		
		btnExitShop = new JButton("EXIT SHOP");
		btnExitShop.setFont(new Font("PixelGameFont", Font.PLAIN, 12));
		btnExitShop.setBounds(573, 470, 218, 30);
		panelPokeMart.add(btnExitShop);
		panelGame = new JPanel();
		contentPane.add(panelGame, "name_175264791409056");
		panelGame.setLayout(null);
		
		
		
		
		/*----------------------------------------------------GAME PANEL-----------------------------------------------*/
		

			
		lblDay = new JLabel("Day " + player.getDay());
		lblDay.setHorizontalAlignment(SwingConstants.CENTER);
		lblDay.setFont(new Font("PixelGameFont", Font.BOLD, 18));
		lblDay.setBounds(10, 11, 81, 37);
		panelGame.add(lblDay);
		
	
		/*CHARACTER DEPENDS ON THE MALE-FEMALE BUTTON ACTION*/
		lblCharacter = new JLabel("");
		panelGame.add(lblCharacter);
				
		//NAME OF THE MAP DEPENDS ON THE CHOSEN MAP
		lblMapName = new JLabel();
		lblMapName.setHorizontalAlignment(SwingConstants.CENTER);
		lblMapName.setFont(new Font("PixelGameFont", Font.BOLD, 18));
		lblMapName.setBounds(143, 50, 195, 37);
		panelGame.add(lblMapName);
		
		lblMap = new JLabel();
		lblMap.setBounds(87, 87, 330, 330);
		panelGame.add(lblMap);
		
		lblMoney = new JLabel("MONEY: P" + player.getMoney());
		lblMoney.setHorizontalAlignment(SwingConstants.LEFT);
		lblMoney.setFont(new Font("PixelGameFont", Font.BOLD, 12));
		lblMoney.setBounds(443, 317, 1000, 25);
		panelGame.add(lblMoney);
		

		lblMovesLeft = new JLabel("MOVES LEFT: " + player.getBoat().getCurrentMove());
		lblMovesLeft.setHorizontalAlignment(SwingConstants.LEFT);        
		lblMovesLeft.setFont(new Font("PixelGameFont", Font.BOLD, 12));
		lblMovesLeft.setBounds(443, 344, 110, 25);
		panelGame.add(lblMovesLeft);

		
		lblCastsLeft = new JLabel("CASTS LEFT: " + player.getTackleBox().getCurrentCast());
		lblCastsLeft.setHorizontalAlignment(SwingConstants.LEFT);
		lblCastsLeft.setFont(new Font("PixelGameFont", Font.BOLD, 12));
		lblCastsLeft.setBounds(443, 369, 110, 25);
		panelGame.add(lblCastsLeft);

		
		lblFame = new JLabel("FAME: " + chosenMap.getFame());
		lblFame.setHorizontalAlignment(SwingConstants.LEFT);
		lblFame.setFont(new Font("PixelGameFont", Font.BOLD, 12));
		lblFame.setBounds(443, 392, 81, 25);
		panelGame.add(lblFame);

		
		lblInstructions = new JLabel("<html>W - MOVE UP <br>S - MOVE DOWN<br>A - MOVE LEFT<br>D - MOVE RIGHT<br>F - CAST");
		lblInstructions.setVerticalAlignment(SwingConstants.TOP);
		lblInstructions.setFont(new Font("PixelGameFont", Font.PLAIN, 12));
		lblInstructions.setBounds(97, 428, 330, 80);
		panelGame.add(lblInstructions);
		
		btnReturnMaps = new JButton("RETURN TO MAPS");
		btnReturnMaps.setFont(new Font("PixelGameFont", Font.PLAIN, 11));
		btnReturnMaps.setBounds(656, 11, 147, 25);
		panelGame.add(btnReturnMaps);
		
		btnExitGame3 = new JButton("EXIT GAME");
		btnExitGame3.setFont(new Font("PixelGameFont", Font.PLAIN, 11));
		btnExitGame3.setBounds(656, 39, 147, 25);
		panelGame.add(btnExitGame3);
		
		/*----------POKEMON ENCOUNTERED IN LAKE OF RAGE*/
		PokemonShuffler = new JPanel();
		PokemonShuffler.setBackground(new Color(0, 250, 154));
		PokemonShuffler.setBounds(433, 87, 275, 215);
		panelGame.add(PokemonShuffler);
		PokemonShuffler.setLayout(new CardLayout(0, 0));
		
		
		//NO ENCOUNTERED
		panelNoEncountered = new JPanel();
		panelNoEncountered.setBackground(new Color(0, 250, 154));
		PokemonShuffler.add(panelNoEncountered, "name_178449873306917");
		panelNoEncountered.setLayout(null);
		
		
		lblNoEncountered = new JLabel("<html><center>YOU ENCOUNTERED NOTHING.</center></html>");
		lblNoEncountered.setBounds(10, 81, 255, 58);
		lblNoEncountered.setHorizontalAlignment(SwingConstants.CENTER);
		lblNoEncountered.setFont(new Font("PixelGameFont", Font.PLAIN, 20));
		panelNoEncountered.add(lblNoEncountered);
		
		//MAGIKARP CAPTURED
		panelPokemonCapture = new JPanel();
		panelPokemonCapture.setBackground(new Color(0, 250, 154));
		PokemonShuffler.add(panelPokemonCapture, "name_177778641196483");
		panelPokemonCapture.setLayout(null);
		
		
		lblPokemonCapturePicture = new JLabel("");
		lblPokemonCapturePicture.setBounds(60, 11, 148, 125);
		panelPokemonCapture.add(lblPokemonCapturePicture);
		
		
		lblPokemonCapture = new JLabel("<html><center>YOU ENCOUNTERED A POKEMON BUT FAILED TO CAPTURE IT</center></html>");
		lblPokemonCapture.setHorizontalAlignment(SwingConstants.CENTER);
		lblPokemonCapture.setFont(new Font("PixelGameFont", Font.PLAIN, 10));
		lblPokemonCapture.setBounds(10, 150, 255, 54);
		panelPokemonCapture.add(lblPokemonCapture);
		

		//TREASURE CAPTURED
		panelTreasureFound = new JPanel();
		panelTreasureFound.setBackground(new Color(0, 250, 154));
		PokemonShuffler.add(panelTreasureFound, "name_188358623183974");
		panelTreasureFound.setLayout(null);

		
		lblTreasure = new JLabel("");
		lblTreasure.setBounds(125, 75, 24, 24);
		imgTreasure = new ImageIcon(this.getClass().getResource("/pearl.jpeg"));
		lblTreasure.setIcon(imgTreasure);
		panelTreasureFound.add(lblTreasure);
		
		lblTreasurePhrase = new JLabel("YOU FOUND A PEARL");
		lblTreasurePhrase.setHorizontalAlignment(SwingConstants.CENTER);
		lblTreasurePhrase.setFont(new Font("PixelGameFont", Font.PLAIN, 10));
		lblTreasurePhrase.setBounds(59, 142, 162, 14);
		panelTreasureFound.add(lblTreasurePhrase);
		
		
		
		
		
		/*----------------------------------------------------BADGE PANEL-----------------------------------------------*/
		panelBadge = new JPanel();
		contentPane.add(panelBadge, "name_245581228839514");
		panelBadge.setLayout(null);
		
		lblLegendary = new JLabel("");
		lblLegendary.setBounds(323, 51, 148, 125);
		panelBadge.add(lblLegendary);
		
		lblLegendaryPhrase = new JLabel("CONGRATULATIONS, YOU HAVE SUCCESSFULLY CAPTURED THE LEGENDARY POKEMON.");
		lblLegendaryPhrase.setHorizontalAlignment(SwingConstants.CENTER);
		lblLegendaryPhrase.setFont(new Font("PixelGameFont", Font.PLAIN, 14));
		lblLegendaryPhrase.setBounds(55, 209, 686, 30);
		panelBadge.add(lblLegendaryPhrase);
		
		lblBadgePhrase = new JLabel("BY DOING SO, YOU HAVE RETRIEVED THE SCALE BADGE. ");
		lblBadgePhrase.setHorizontalAlignment(SwingConstants.CENTER);
		lblBadgePhrase.setFont(new Font("PixelGameFont", Font.PLAIN, 14));
		lblBadgePhrase.setBounds(185, 367, 447, 30);
		panelBadge.add(lblBadgePhrase);
		
		lblBadge = new JLabel("");
		lblBadge.setBounds(393, 297, 30, 30);
		panelBadge.add(lblBadge);
		
		
		btnReturnToMaps = new JButton("RETURN TO MAPS");
		btnReturnToMaps.setFont(new Font("PixelGameFont", Font.PLAIN, 12));
		btnReturnToMaps.setBounds(322, 430, 162, 30);
		panelBadge.add(btnReturnToMaps);
		
		
		/*----------------------------------------------------FINISH GAME PANEL-----------------------------------------------*/
		panelFinish = new JPanel();
		contentPane.add(panelFinish, "name_356631288858688");
		panelFinish.setLayout(null);
		
		lblNewLabel_1 = new JLabel("CONGRATULATIONS!! YOU CAPTURED ALL LEGENDARY POKEMONS AND YOU RETRIEVED ALL BADGES. YOU ARE TRULY A POKEMON FISHING CHAMPION");
		lblNewLabel_1.setBounds(390, 138, 46, 14);
		panelFinish.add(lblNewLabel_1);
		
		panelLoad = new JPanel();
		contentPane.add(panelLoad, "name_568174522632592");
		panelLoad.setLayout(null);
		
		lblFileName = new JLabel("ENTER THE FILENAME");
		lblFileName.setFont(new Font("PixelGameFont", Font.PLAIN, 20));
		lblFileName.setHorizontalAlignment(SwingConstants.CENTER);
		lblFileName.setBounds(241, 94, 294, 43);
		panelLoad.add(lblFileName);
		
		btnMainMenu_1 = new JButton("MAIN MENU");
		
		btnMainMenu_1.setFont(new Font("PixelGameFont", Font.PLAIN, 16));
		btnMainMenu_1.setBounds(308, 345, 162, 30);
		panelLoad.add(btnMainMenu_1);
		
		textFieldFileName = new JTextField();
		textFieldFileName.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldFileName.setFont(new Font("PixelGameFont", Font.PLAIN, 14));
		textFieldFileName.setColumns(50);
		textFieldFileName.setBackground(Color.WHITE);
		textFieldFileName.setBounds(268, 138, 228, 32);
		panelLoad.add(textFieldFileName);
		
		btnEnter = new JButton("ENTER");
		
		btnEnter.setFont(new Font("PixelGameFont", Font.PLAIN, 16));
		btnEnter.setBounds(308, 179, 162, 30);
		panelLoad.add(btnEnter);
		
		
		
	
		
		
		
		
		
		
		
		
		
		/*----------------------------------------------------ALL BUTTON ACTIONS-----------------------------------------------*/
		/*-------------------------------------------------------STARTING PAGE------------------------------------------------*/
		
		btnNewGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				panelStart.setVisible(false);
				panelCredentials.setVisible(true);
				
			}
		});
		
		
		btnLoadGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelStart.setVisible(false);
				panelLoad.setVisible(true);
			}
		});
		
		btnExitGame1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		
		
		
		
		
		
		/*----------------------------------------CREDENTIAL PANEL---------------------------------------------*/
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelCredentials.setVisible(false);
				panelStart.setVisible(true);
			}
		});
		
		btnMale.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelCredentials.setVisible(false);
				
				ImageIcon imgCharacter = new ImageIcon(this.getClass().getResource("/ethan_icon.png"));
				lblCharacter.setIcon(imgCharacter);
				panelIntroduction.setVisible(true);
				
				
			}
		});
		
		
		btnFemale.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelCredentials.setVisible(false);
				
				ImageIcon imgCharacter = new ImageIcon(this.getClass().getResource("/lyra_icon.png"));
				lblCharacter.setIcon(imgCharacter);
				
				panelIntroduction.setVisible(true);
			}
		});
		
		
		
		/*-----------------------------------------------INTRODUCTION PANEL*----------------------------------------------------*/
		
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelIntroduction.setVisible(false);
				panelHowToPlay.setVisible(true);
			}
		});
		
		
		
		/*-----------------------------------------------HOW TO PLAY PANEL*----------------------------------------------------*/
		btnStartGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelHowToPlay.setVisible(false);
				
				if(btnStartGame.getText().equals("RETURN GAME"))
				panelMaps.setVisible(true);
				
				else if(btnStartGame.getText().equals("MAIN MENU"))
				panelStart.setVisible(true);
				
				else
					panelMaps.setVisible(true);
					
			}
		});
		
		
		
		
		
		
		/*---------------------------------------------------MAPS PANEL---------------------------------------------------*/
		btnLakeOfRage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelMaps.setVisible(false);
				chosenMap = mapList.get(0);
				lblMapName.setText("LAKE OF RAGE");
				ImageIcon imgMap = new ImageIcon(this.getClass().getResource("/lake_of_rage.jpeg"));
				lblMap.setIcon(imgMap);
				
                player.setCurrentMap(chosenMap);
                player.setXY(player.getCurrentMap().getPortX(),player.getCurrentMap().getPortY());
                player.getRod().setLine(chosenMap.getLine());
                player.getRod().setLure(chosenMap.getLure());
                player.getRod().setReel(chosenMap.getReel());
                if(player.getBoat()!=boatList.get(3))
                	player.getBoat().setEngine(chosenMap.getEngine());
				
                lblFame.setText("FAME: " + player.getCurrentMap().getFame());
				panelGame.setVisible(true);
				graphicalMap(player, lblCharacter);


				
			}
		});
		
		btnUnionCave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panelMaps.setVisible(false);
				chosenMap = mapList.get(1);
				lblMapName.setText("UNION CAVE");
				
				lblCharacter.setBounds(237, 387, 30, 30);
				ImageIcon imgMap = new ImageIcon(this.getClass().getResource("/union_cave.jpeg"));
				lblMap.setIcon(imgMap);
				
			    player.setCurrentMap(chosenMap);
                player.setXY(player.getCurrentMap().getPortX(),player.getCurrentMap().getPortY());
                player.getRod().setLine(chosenMap.getLine());
                player.getRod().setLure(chosenMap.getLure());
                player.getRod().setReel(chosenMap.getReel());
                if(player.getBoat()!=boatList.get(3))
              	player.getBoat().setEngine(chosenMap.getEngine());
				
                lblFame.setText("FAME: " + player.getCurrentMap().getFame());
				panelGame.setVisible(true);
				graphicalMap(player, lblCharacter);
			}
		});
		
		btnRoute119.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panelMaps.setVisible(false);
				chosenMap = mapList.get(2);
				lblMapName.setText("ROUTE 119");
				
				ImageIcon imgMap = new ImageIcon(this.getClass().getResource("/route119.jpeg"));
				lblMap.setIcon(imgMap);
				
				lblCharacter.setBounds(87, 87, 30, 30);
			    player.setCurrentMap(chosenMap);
                player.setXY(player.getCurrentMap().getPortX(),player.getCurrentMap().getPortY());
                player.getRod().setLine(chosenMap.getLine());
                player.getRod().setLure(chosenMap.getLure());
                player.getRod().setReel(chosenMap.getReel());
                if(player.getBoat()!=boatList.get(3))
                player.getBoat().setEngine(chosenMap.getEngine());
				
                lblFame.setText("FAME: " + player.getCurrentMap().getFame());
				panelGame.setVisible(true);
				graphicalMap(player, lblCharacter);
			}
		});
		
		btnFioresSea.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panelMaps.setVisible(false);
				chosenMap = mapList.get(3);
				lblMapName.setText("FIORE'S SEA ");
				
				lblCharacter.setBounds(87, 387, 30, 30);
				ImageIcon imgMap = new ImageIcon(this.getClass().getResource("/fiore's_sea.jpeg"));
				lblMap.setIcon(imgMap);
				
			    player.setCurrentMap(chosenMap);
                player.setXY(player.getCurrentMap().getPortX(),player.getCurrentMap().getPortY());
                player.getRod().setLine(chosenMap.getLine());
                player.getRod().setLure(chosenMap.getLure());
                player.getRod().setReel(chosenMap.getReel());
                if(player.getBoat()!=boatList.get(3))
                player.getBoat().setEngine(chosenMap.getEngine());
         	
                lblFame.setText("FAME: " + player.getCurrentMap().getFame());
				panelGame.setVisible(true);
				graphicalMap(player, lblCharacter);
			}
		});
		
		btnMarineCave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panelMaps.setVisible(false);
				chosenMap = mapList.get(4);
				lblMapName.setText("MARINE CAVE");
				
				lblCharacter.setBounds(237, 387, 30, 30);
				ImageIcon imgMap = new ImageIcon(this.getClass().getResource("/marine_cave.jpeg"));
				lblMap.setIcon(imgMap);
				
			    player.setCurrentMap(chosenMap);
                player.setXY(player.getCurrentMap().getPortX(),player.getCurrentMap().getPortY());
                player.getRod().setLine(chosenMap.getLine());
                player.getRod().setLure(chosenMap.getLure());
                player.getRod().setReel(chosenMap.getReel());
                if(player.getBoat()!=boatList.get(3))player.getBoat().setEngine(chosenMap.getEngine());
				
                lblFame.setText("FAME: " + player.getCurrentMap().getFame());
				panelGame.setVisible(true);
				graphicalMap(player, lblCharacter);
			}
		});
		
		btnExitGame2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	
		
		
		
		
		
	/*---------------------------------------------------POKEMART PANEL---------------------------------------------------*/
		//--------------------CHECKBOXES--------------------------------
chckbxEngine.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent event) {
		    	int price = 0;
				int totalPrice = 0;
		    	
		        JCheckBox cb = (JCheckBox) event.getSource();
		        
		        if (cb.isSelected())
		        
		        	if(cb == chckbxEngine)
		        	{
		        		price = aquaEngine.getCost();
		        		totalPrice = price + Integer.parseInt(textFieldTotalPrice.getText());
		        	}
		        
		        if(cb.isSelected() == false)
		        {
		        	price = aquaEngine.getCost();
		        	totalPrice = Integer.parseInt(textFieldTotalPrice.getText()) - price;		            
		        }

		        textFieldTotalPrice.setText(String.valueOf(totalPrice));
		        
		        int money = Integer.parseInt(textFieldMoneyLeft.getText());
				int PriceCheck = Integer.parseInt(textFieldTotalPrice.getText());
				
				if(money >= totalPrice && PriceCheck != 0)
				{
					btnPurchase.setEnabled(true);
				}
				
				else
					btnPurchase.setEnabled(false);
		        
				
		    }
		});                
		chckbxGoodRod.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent event) {
		    	int price = 0;
				int totalPrice = 0;
		    	
		        JCheckBox cb = (JCheckBox) event.getSource();
		        
		        if (cb.isSelected())
		        
		        	if(cb == chckbxGoodRod)
		        	{
		        		price = rodList.get(1).getCost();
		        		totalPrice = price + Integer.parseInt(textFieldTotalPrice.getText());
                                        if(chckbxSuperRod.isSelected()==true)
                                        {
                                            chckbxSuperRod.setSelected(false);
                                            totalPrice-=8000;
                                        }
                                        if(chckbxMasterRod.isSelected()==true)
                                        {
                                            chckbxMasterRod.setSelected(false);
                                            totalPrice-=20000;                                        
                                        }
		        	}
		        
		        if(cb.isSelected() == false)
		        {
		        	price = rodList.get(1).getCost();
		        	totalPrice = Integer.parseInt(textFieldTotalPrice.getText()) - price;		            
		        }

		        textFieldTotalPrice.setText(String.valueOf(totalPrice));
		        
		        int money = Integer.parseInt(textFieldMoneyLeft.getText());
				int PriceCheck = Integer.parseInt(textFieldTotalPrice.getText());
				
				if(money >= totalPrice && PriceCheck != 0)
				{
					btnPurchase.setEnabled(true);
				}
				
				else
					btnPurchase.setEnabled(false);
		        
				
		    }
		});
		
		chckbxSuperRod.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent event) {
		    	int price = 0;
				int totalPrice = 0;
		    	
		        JCheckBox cb = (JCheckBox) event.getSource();
		        
		        if (cb.isSelected()) 	
		        	if(cb == chckbxSuperRod)
		        	{
		        		price = rodList.get(2).getCost();
		        		totalPrice = price + Integer.parseInt(textFieldTotalPrice.getText());                                        if(chckbxSuperRod.isSelected()==true)
                                        if(chckbxGoodRod.isSelected()==true){
                                            chckbxGoodRod.setSelected(false);
                                            totalPrice-=3000;
                                        }
                                        if(chckbxMasterRod.isSelected()==true)
                                        {
                                            chckbxMasterRod.setSelected(false);
                                            totalPrice-=20000;                                        
                                        }
                                                                             
		    		}
		        
		        if(cb.isSelected() == false)
		        {
		        	price = rodList.get(2).getCost();
		        	totalPrice = Integer.parseInt(textFieldTotalPrice.getText()) - price;
		        }
		        
		        
		        
		        textFieldTotalPrice.setText(String.valueOf(totalPrice));
		        
		        int money = Integer.parseInt(textFieldMoneyLeft.getText());
				int PriceCheck = Integer.parseInt(textFieldTotalPrice.getText());
				
				if(money >= totalPrice && PriceCheck != 0)
				{
					btnPurchase.setEnabled(true);
				}
				
				else
					btnPurchase.setEnabled(false);
		    }
		});
		
		chckbxMasterRod.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent event) {
		    	int price = 0;
				int totalPrice = 0;
		    	
		        JCheckBox cb = (JCheckBox) event.getSource();
		        
		        if (cb.isSelected()) 
		        	if(cb == chckbxMasterRod)
		        	{
                                    price = rodList.get(3).getCost();
                                    totalPrice = price + Integer.parseInt(textFieldTotalPrice.getText());
                                        if(chckbxGoodRod.isSelected()==true){
                                            chckbxGoodRod.setSelected(false);
                                            totalPrice-=3000;
                                        }
                                        if(chckbxSuperRod.isSelected()==true)
                                        {
                                            chckbxSuperRod.setSelected(false);
                                            totalPrice-=8000;                                        
                                        }                                                                        
		        	}
		        
		        if(cb.isSelected() == false)
		        {
		        	price = rodList.get(3).getCost();
		        	totalPrice = Integer.parseInt(textFieldTotalPrice.getText()) - price;		            
		        }
		        
		        textFieldTotalPrice.setText(String.valueOf(totalPrice));
		        
		        int money = Integer.parseInt(textFieldMoneyLeft.getText());
				int PriceCheck = Integer.parseInt(textFieldTotalPrice.getText());
				
				if(money >= totalPrice && PriceCheck != 0)
				{
					btnPurchase.setEnabled(true);
				}
				
				else
					btnPurchase.setEnabled(false);
		    }
		});
		
		chckbxGreatLure.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent event) {
		    	int price = 0;
				int totalPrice = 0;
		    	
		        JCheckBox cb = (JCheckBox) event.getSource();
		        
		        if (cb.isSelected()) 
		        	if(cb == chckbxGreatLure)
		        	{
                                    price = customRodList.get(0).getCost();
                                    totalPrice = price + Integer.parseInt(textFieldTotalPrice.getText());
                                    if(chckbxUltraLure.isSelected()==true){
                                        chckbxUltraLure.setSelected(false);
                                        totalPrice-=700;
                                    }
                                    if(chckbxMasterLure.isSelected()==true)
                                    {
                                        chckbxMasterLure.setSelected(false);
                                        totalPrice-=900;                                        
                                    }


		        	}
		        
		        if(cb.isSelected() == false) 
		        {
		        	price = customRodList.get(0).getCost();
		        	totalPrice = Integer.parseInt(textFieldTotalPrice.getText()) - price;		            
		        }
		        
		        textFieldTotalPrice.setText(String.valueOf(totalPrice));
		        
		        int money = Integer.parseInt(textFieldMoneyLeft.getText());
				int PriceCheck = Integer.parseInt(textFieldTotalPrice.getText());
				
				if(money >= totalPrice && PriceCheck != 0)
				{
					btnPurchase.setEnabled(true);
				}
				
				else
					btnPurchase.setEnabled(false);
		    }
		});
		
		chckbxUltraLure.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent event) {
		    	int price = 0;
				int totalPrice = 0;
		    	
		        JCheckBox cb = (JCheckBox) event.getSource();
		        
		        if (cb.isSelected()) 
		        	if(cb == chckbxUltraLure)
		        	{
                                    price = customRodList.get(1).getCost();
                                    totalPrice = price + Integer.parseInt(textFieldTotalPrice.getText());
                                    if(chckbxGreatLure.isSelected()==true){
                                        chckbxGreatLure.setSelected(false);
                                        totalPrice-=500;
                                    }
                                    if(chckbxMasterLure.isSelected()==true)
                                    {
                                        chckbxMasterLure.setSelected(false);
                                        totalPrice-=900;                                        
                                    }                                    

                                    
		        	}
		        
		        if(cb.isSelected() == false)
		        {
		        	price = customRodList.get(1).getCost();
		        	totalPrice = Integer.parseInt(textFieldTotalPrice.getText()) - price;		            
		        }
		        
		        textFieldTotalPrice.setText(String.valueOf(totalPrice));
		        
		        int money = Integer.parseInt(textFieldMoneyLeft.getText());
				int PriceCheck = Integer.parseInt(textFieldTotalPrice.getText());
				
				if(money >= totalPrice && PriceCheck != 0)
				{
					btnPurchase.setEnabled(true);
				}
				
				else
					btnPurchase.setEnabled(false);
		    }
		});
		
		chckbxMasterLure.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent event) {
		    	int price = 0;
				int totalPrice = 0;
		    	
		        JCheckBox cb = (JCheckBox) event.getSource();
		        
		        if (cb.isSelected()) 
		        	if(cb == chckbxMasterLure)
		        	{
                                    price = customRodList.get(2).getCost();
                                    totalPrice = price + Integer.parseInt(textFieldTotalPrice.getText());
                                    if(chckbxGreatLure.isSelected()==true){
                                        chckbxGreatLure.setSelected(false);
                                        totalPrice-=500;
                                    }
                                    if( chckbxUltraLure.isSelected()==true)
                                    {
                                        chckbxUltraLure.setSelected(false);
                                        totalPrice-=700;                                        
                                    }                                           
                                
		        	}
		        
		        if(cb.isSelected() == false) 
		        {
		        	price = customRodList.get(2).getCost();
		        	totalPrice = Integer.parseInt(textFieldTotalPrice.getText()) - price;		            
		        }
		        
		        textFieldTotalPrice.setText(String.valueOf(totalPrice));
		        
		        int money = Integer.parseInt(textFieldMoneyLeft.getText());
				int PriceCheck = Integer.parseInt(textFieldTotalPrice.getText());
				
				if(money >= totalPrice && PriceCheck != 0)
				{
					btnPurchase.setEnabled(true);
				}
				
				else
					btnPurchase.setEnabled(false);
		    }
		});
		
		chckbxGreatLine.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent event) {
		    	int price = 0;
				int totalPrice = 0;
		    	
		        JCheckBox cb = (JCheckBox) event.getSource();
		        
		        if (cb.isSelected()) 
		        	if(cb == chckbxGreatLine)
		        	{
                                    price = customRodList.get(3).getCost();
                                    totalPrice = price + Integer.parseInt(textFieldTotalPrice.getText());
                                    if(chckbxUltraLine.isSelected()==true){
                                    chckbxUltraLine.setSelected(false);
                                        totalPrice-=800;
                                    }
                                    if( chckbxMasterLine.isSelected()==true)
                                    {
                                    chckbxMasterLine.setSelected(false);  
                                        totalPrice-=900;                                        
                                    }    

                                  
		        	}
		        
		       	if(cb.isSelected() == false)
		        {
		        	price = customRodList.get(3).getCost();
		        	totalPrice = Integer.parseInt(textFieldTotalPrice.getText()) - price;		            
		        }
		        
		       	textFieldTotalPrice.setText(String.valueOf(totalPrice));
		       	
		        int money = Integer.parseInt(textFieldMoneyLeft.getText());
				int PriceCheck = Integer.parseInt(textFieldTotalPrice.getText());
				
				if(money >= totalPrice && PriceCheck != 0)
				{
					btnPurchase.setEnabled(true);
				}
				
				else
					btnPurchase.setEnabled(false);
		    }
		});
		
		chckbxUltraLine.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent event) {
		    	int price = 0;
				int totalPrice = 0;
		    	
		        JCheckBox cb = (JCheckBox) event.getSource();
		        
		        if (cb.isSelected()) 
		        	if(cb == chckbxUltraLine)
		        	{
                                    price = customRodList.get(4).getCost();
                                    totalPrice = price + Integer.parseInt(textFieldTotalPrice.getText());
                                    if(chckbxGreatLine.isSelected()==true){
                                    chckbxGreatLine.setSelected(false);
                                        totalPrice-=700;
                                    }
                                    if( chckbxMasterLine.isSelected()==true)
                                    {
                                    chckbxMasterLine.setSelected(false);  
                                        totalPrice-=900;                                        
                                    }                                        

                                     
		        	}
		        
		       	if(cb.isSelected() == false)
		        {
		        	price = customRodList.get(4).getCost();
		        	totalPrice = Integer.parseInt(textFieldTotalPrice.getText()) - price;		            
		        }
		        
		       	textFieldTotalPrice.setText(String.valueOf(totalPrice));
		       	
		        int money = Integer.parseInt(textFieldMoneyLeft.getText());
				int PriceCheck = Integer.parseInt(textFieldTotalPrice.getText());
				
				if(money >= totalPrice && PriceCheck != 0)
				{
					btnPurchase.setEnabled(true);
				}
				
				else
					btnPurchase.setEnabled(false);
		    }
		});
		
		chckbxMasterLine.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent event) {
		    	int price = 0;
				int totalPrice = 0;
		    	
		        JCheckBox cb = (JCheckBox) event.getSource();
		        
		        if (cb.isSelected()) 
		        	if(cb == chckbxMasterLine)
		        	{
                                    price = customRodList.get(5).getCost();
                                    totalPrice = price + Integer.parseInt(textFieldTotalPrice.getText());
                                    if(chckbxGreatLine.isSelected()==true){
                                    chckbxGreatLine.setSelected(false);
                                        totalPrice-=700;
                                    }
                                    if( chckbxUltraLine.isSelected()==true)
                                    {
                                    chckbxUltraLine.setSelected(false);
                                        totalPrice-=800;                                        
                                    }     
                             
		        	}
		        
		       	if(cb.isSelected() == false) 
		        {
		        	price = customRodList.get(5).getCost();
		        	totalPrice = Integer.parseInt(textFieldTotalPrice.getText()) - price;		            
		        }
		        
		       	textFieldTotalPrice.setText(String.valueOf(totalPrice));
		       	
		        int money = Integer.parseInt(textFieldMoneyLeft.getText());
				int PriceCheck = Integer.parseInt(textFieldTotalPrice.getText());
				
				if(money >= totalPrice && PriceCheck != 0)
				{
					btnPurchase.setEnabled(true);
				}
				
				else
					btnPurchase.setEnabled(false);
		    }
		});
		
		chckbxGreatReel.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent event) {
		    	int price = 0;
				int totalPrice = 0;
		    	
		        JCheckBox cb = (JCheckBox) event.getSource();
		        
		        if (cb.isSelected()) 
		        	if(cb == chckbxGreatReel)
		        	{
                                    price = customRodList.get(6).getCost();
                                    totalPrice = price + Integer.parseInt(textFieldTotalPrice.getText());
                                    if(chckbxUltraReel.isSelected()==true){
                                    chckbxUltraReel.setSelected(false);
                                        totalPrice-=950;
                                    }
                                    if( chckbxMasterReel.isSelected()==true)
                                    {
                                    chckbxMasterReel.setSelected(false); 
                                        totalPrice-=1000;                                        
                                    }    
                                     
		        	}
		        
		       	if(cb.isSelected() == false)
		        {
		        	price = customRodList.get(6).getCost();
		        	totalPrice = Integer.parseInt(textFieldTotalPrice.getText()) - price;		            
		        }
		        
		       	textFieldTotalPrice.setText(String.valueOf(totalPrice));
		       	
		        int money = Integer.parseInt(textFieldMoneyLeft.getText());
				int PriceCheck = Integer.parseInt(textFieldTotalPrice.getText());
				
				if(money >= totalPrice && PriceCheck != 0)
				{
					btnPurchase.setEnabled(true);
				}
				
				else
					btnPurchase.setEnabled(false);
		    }
		});
		
		chckbxUltraReel.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent event) {
		    	int price = 0;
				int totalPrice = 0;
		    	
		        JCheckBox cb = (JCheckBox) event.getSource();
		        
		        if (cb.isSelected()) 
		        	if(cb == chckbxUltraReel)
		        	{
                                    price = customRodList.get(7).getCost();
                                    totalPrice = price + Integer.parseInt(textFieldTotalPrice.getText());
                                    if(chckbxGreatReel.isSelected()==true){
                                    chckbxGreatReel.setSelected(false);
                                        totalPrice-=800;
                                    }
                                    if( chckbxMasterReel.isSelected()==true)
                                    {
                                    chckbxMasterReel.setSelected(false); 
                                        totalPrice-=1000;                                        
                                    }    
                                                                         

                                   
		        	}
		        
		       	if(cb.isSelected() == false) 
		        {
		        	price = customRodList.get(7).getCost();
		        	totalPrice = Integer.parseInt(textFieldTotalPrice.getText()) - price;		            
		        }
		        
		       	textFieldTotalPrice.setText(String.valueOf(totalPrice));
		       	
		        int money = Integer.parseInt(textFieldMoneyLeft.getText());
				int PriceCheck = Integer.parseInt(textFieldTotalPrice.getText());
				
				if(money >= totalPrice && PriceCheck != 0)
				{
					btnPurchase.setEnabled(true);
				}
				
				else
					btnPurchase.setEnabled(false);
		    }
		});
		
		chckbxMasterReel.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent event) {
		    	int price = 0;
				int totalPrice = 0;
		    	
		        JCheckBox cb = (JCheckBox) event.getSource();
		        
		        if (cb.isSelected()) 
		        	if(cb == chckbxMasterReel)
		        	{
                                    price = customRodList.get(8).getCost();
                                    totalPrice = price + Integer.parseInt(textFieldTotalPrice.getText());
                                    if(chckbxGreatReel.isSelected()==true){
                                    chckbxGreatReel.setSelected(false);
                                        totalPrice-=800;
                                    }
                                    if( chckbxUltraReel.isSelected()==true)
                                    {
                                    chckbxUltraReel.setSelected(false); 
                                        totalPrice-=950;                                        
                                    }    
                                                                                                         
		        	}
		        
		       	if(cb.isSelected() == false) 
		        {
		        	price = customRodList.get(7).getCost();
		        	totalPrice = Integer.parseInt(textFieldTotalPrice.getText()) - price;		            
		        }
		        
		       	textFieldTotalPrice.setText(String.valueOf(totalPrice));
		       	
		        int money = Integer.parseInt(textFieldMoneyLeft.getText());
				int PriceCheck = Integer.parseInt(textFieldTotalPrice.getText());
				
				if(money >= totalPrice && PriceCheck != 0)
				{
					btnPurchase.setEnabled(true);
				}
				
				else
					btnPurchase.setEnabled(false);
		    }
		});
		
		chckbxGoodTackleBox.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent event) {
		    	int price = 0;
				int totalPrice = 0;
		    	
		        JCheckBox cb = (JCheckBox) event.getSource();
		        
		        if (cb.isSelected()) 
		        	if(cb == chckbxGoodTackleBox)
		        	{
                                    price = boxList.get(1).getCost();
                                    totalPrice = price + Integer.parseInt(textFieldTotalPrice.getText());
                                        if(chckbxSuperTackleBox.isSelected()==true)
                                        {
                                    chckbxSuperTackleBox.setSelected(false);
                                            totalPrice-=2000;
                                        }
                                        if(chckbxMasterTackleBox.isSelected()==true)
                                        {
                                    chckbxMasterTackleBox.setSelected(false);   
                                            totalPrice-=2500;                                        
                                        }                                    

                                   
		        	}
		        
		       	if(cb.isSelected() == false)
		        {
		        	price = boxList.get(1).getCost();
		        	totalPrice = Integer.parseInt(textFieldTotalPrice.getText()) - price;		            
		        }
		        
		       	textFieldTotalPrice.setText(String.valueOf(totalPrice));
		       	
		        int money = Integer.parseInt(textFieldMoneyLeft.getText());
				int PriceCheck = Integer.parseInt(textFieldTotalPrice.getText());
				
				if(money >= totalPrice && PriceCheck != 0)
				{
					btnPurchase.setEnabled(true);
				}
				
				else
					btnPurchase.setEnabled(false);
		    }
		});
		
		chckbxSuperTackleBox.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent event) {
		    	int price = 0;
				int totalPrice = 0;
		    	
		        JCheckBox cb = (JCheckBox) event.getSource();
		        
		        if (cb.isSelected()) 
		        	if(cb == chckbxSuperTackleBox)
		        	{
                                    price = boxList.get(2).getCost();
                                    totalPrice = price + Integer.parseInt(textFieldTotalPrice.getText());
                                        if(chckbxGoodTackleBox.isSelected()==true)
                                        {
                                    chckbxGoodTackleBox.setSelected(false);
                                            totalPrice-=1500;
                                        }
                                        if(chckbxMasterTackleBox.isSelected()==true)
                                        {
                                    chckbxMasterTackleBox.setSelected(false);   
                                            totalPrice-=2500;                                        
                                        }                                                                                 
		        	}
		        
		       	if(cb.isSelected() == false) 
		        {
		        	price = boxList.get(2).getCost();
		        	totalPrice = Integer.parseInt(textFieldTotalPrice.getText()) - price;		            
		        }
		        
		       	textFieldTotalPrice.setText(String.valueOf(totalPrice));
		       	
		        int money = Integer.parseInt(textFieldMoneyLeft.getText());
				int PriceCheck = Integer.parseInt(textFieldTotalPrice.getText());
				
				if(money >= totalPrice && PriceCheck != 0)
				{
					btnPurchase.setEnabled(true);
				}
				
				else
					btnPurchase.setEnabled(false);
		    }
		});
		
		chckbxMasterTackleBox.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent event) {
		    	int price = 0;
				int totalPrice = 0;
		    	
		        JCheckBox cb = (JCheckBox) event.getSource();
		        
		        if (cb.isSelected()) 
		        	if(cb == chckbxMasterTackleBox)
		        	{
                                    price = boxList.get(3).getCost();
                                    totalPrice = price + Integer.parseInt(textFieldTotalPrice.getText());
                                        if(chckbxGoodTackleBox.isSelected()==true)
                                        {
                                    chckbxGoodTackleBox.setSelected(false);
                                            totalPrice-=1500;
                                        }
                                        if(chckbxSuperTackleBox.isSelected()==true)
                                        {
                                    chckbxSuperTackleBox.setSelected(false);  
                                            totalPrice-=2000;                                        
                                        }   
                                     
		        	}
		        
		       	if(cb.isSelected() == false)
		        {
		        	price = boxList.get(3).getCost();
		        	totalPrice = Integer.parseInt(textFieldTotalPrice.getText()) - price;		            
		        }
		        
		       	textFieldTotalPrice.setText(String.valueOf(totalPrice));
		       	
		        int money = Integer.parseInt(textFieldMoneyLeft.getText());
				int PriceCheck = Integer.parseInt(textFieldTotalPrice.getText());
				
				if(money >= totalPrice && PriceCheck != 0)
				{
					btnPurchase.setEnabled(true);
				}
				
				else
					btnPurchase.setEnabled(false);
		    }
		});
		
		chckbxSpeedBoat.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent event) {
		    	int price = 0;
				int totalPrice = 0;
		    	
		        JCheckBox cb = (JCheckBox) event.getSource();
		        
		        if (cb.isSelected()) 
		        	if(cb == chckbxSpeedBoat)
		        	{
                                    price = boatList.get(1).getCost();
                                    totalPrice = price + Integer.parseInt(textFieldTotalPrice.getText());
                                    if(chckbxSharpedoBoat.isSelected()==true)
                                        {
                                       
                                    chckbxSharpedoBoat.setSelected(false);   
                                            totalPrice-=5000;                                        
                                        }
		        	}
		        
		       	if(cb.isSelected() == false)
		        {
		        	price = boatList.get(1).getCost();
		        	totalPrice = Integer.parseInt(textFieldTotalPrice.getText()) - price;		            
		        }
		        
		       	textFieldTotalPrice.setText(String.valueOf(totalPrice));
		       	
		        int money = Integer.parseInt(textFieldMoneyLeft.getText());
				int PriceCheck = Integer.parseInt(textFieldTotalPrice.getText());
				
				if(money >= totalPrice && PriceCheck != 0)
				{
					btnPurchase.setEnabled(true);
				}
				
				else
					btnPurchase.setEnabled(false);
		    }
		});
		
		chckbxSharpedoBoat.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent event) {
		    	int price = 0;
				int totalPrice = 0;
		    	
		        JCheckBox cb = (JCheckBox) event.getSource();
		        
		        if (cb.isSelected())
		        	if(cb == chckbxSharpedoBoat)
		        	{
                                    price = boatList.get(2).getCost();
                                    totalPrice = price + Integer.parseInt(textFieldTotalPrice.getText());
                                    if(chckbxSpeedBoat.isSelected()==true)
                                        {
                                       
                                    chckbxSpeedBoat.setSelected(false);
                                            totalPrice-=3500;                                        
                                        }                

		        	}
		        
		       	if(cb.isSelected() == false) 
		        {
		        	price = boatList.get(2).getCost();
		        	totalPrice = Integer.parseInt(textFieldTotalPrice.getText()) - price;		            
		        }
		        
		       	textFieldTotalPrice.setText(String.valueOf(totalPrice));
		       	
		        int money = Integer.parseInt(textFieldMoneyLeft.getText());
				int PriceCheck = Integer.parseInt(textFieldTotalPrice.getText());
				
				if(money >= totalPrice && PriceCheck != 0)
				{
					btnPurchase.setEnabled(true);
				}
				
				else
					btnPurchase.setEnabled(false);
		    }
		});
		
			

		//ITEMS ARE PURCHASED
		btnPurchase.addActionListener(new PlayerActionListener(player));
		
		
	btnExitShop.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			panelPokeMart.setVisible(false);
			
			if(chosenMap == mapList.get(0))
			lblCharacter.setBounds(273, 273, 30, 30);
			else if(chosenMap == mapList.get(0))
				lblCharacter.setBounds(273, 387, 30, 30);
			else if(chosenMap == mapList.get(0))
				lblCharacter.setBounds(87, 87, 30, 30);
			else if(chosenMap == mapList.get(0))
				lblCharacter.setBounds(87, 387, 30, 30);
			else if(chosenMap == mapList.get(0))
				lblCharacter.setBounds(273, 387, 30, 30);
			
			panelGame.setVisible(true);
		}
	});
	
	/*---------------------------------------------------GAME PANEL---------------------------------------------------*/
	btnReturnMaps.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			panelGame.setVisible(false);
			panelMaps.setVisible(true);
		}
	});
	
	btnExitGame3.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
		}
	});
	
	
	
	
	/*----------------------------------------------------BADGE PANEL-----------------------------------------------*/
	
	btnReturnToMaps.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			panelBadge.setVisible(false);
			if(chosenMap==mapList.get(0))
                        {
                            btnRoute119.setEnabled(true);
                            lblRoute119.setEnabled(true);  
                            btnMarineCave.setEnabled(true);
                            lblMarineCave.setEnabled(true);
                        }
                        else if(chosenMap==mapList.get(1))
                        {
                            lblFioresSea.setEnabled(true);

                            btnFioresSea.setEnabled(true);
                        }
                        player.getBoat().resetMoves();
			player.getTackleBox().resetCast();  
			panelMaps.setVisible(true);
			
		}
	});
	
	
	
	
	
	
	
	
	
	
	
	
	btnEnter.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			
		}
	});
	
	}
	
	
	@Override
	public void keyPressed(KeyEvent e) {
		
		int c = e.getKeyCode();
		
		if(c == KeyEvent.VK_W)
		{
			System.out.println(player.move("W"));
			lblNoEncountered.setText("<html><center>YOU ENCOUNTERED NOTHING.</center></html>");
			lblNoEncountered.setFont(new Font("PixelGameFont", Font.PLAIN, 20));
			
			lblMovesLeft.setText("MOVES LEFT: " + player.getBoat().getCurrentMove());
			
			panelTreasureFound.setVisible(false);
			panelPokemonCapture.setVisible(false);
			panelBadge.setVisible(false);
			panelNoEncountered.setVisible(true);
		}
		if(c == KeyEvent.VK_S)
		{
			System.out.println(player.move("S"));
			lblNoEncountered.setText("<html><center>YOU ENCOUNTERED NOTHING.</center></html>");
			lblNoEncountered.setFont(new Font("PixelGameFont", Font.PLAIN, 20));
			panelTreasureFound.setVisible(false);
			panelPokemonCapture.setVisible(false);
			panelBadge.setVisible(false);
			
			lblMovesLeft.setText("MOVES LEFT: " + player.getBoat().getCurrentMove());
			panelNoEncountered.setVisible(true);
		}
		if(c == KeyEvent.VK_A)
		{
			System.out.println(player.move("A"));
			lblNoEncountered.setText("<html><center>YOU ENCOUNTERED NOTHING.</center></html>");
			lblNoEncountered.setFont(new Font("PixelGameFont", Font.PLAIN, 20));
			panelTreasureFound.setVisible(false);
			panelPokemonCapture.setVisible(false);
			panelBadge.setVisible(false);
			
			lblMovesLeft.setText("MOVES LEFT: " + player.getBoat().getCurrentMove());
			panelNoEncountered.setVisible(true);
		}
		if(c == KeyEvent.VK_D)
		{
			System.out.println(player.move("D"));
			lblNoEncountered.setText("<html><center>YOU ENCOUNTERED NOTHING.</center></html>");
			lblNoEncountered.setFont(new Font("PixelGameFont", Font.PLAIN, 20));

			lblMovesLeft.setText("MOVES LEFT: " + player.getBoat().getCurrentMove());
			
			panelTreasureFound.setVisible(false);
			panelPokemonCapture.setVisible(false);
			panelBadge.setVisible(false);
			panelNoEncountered.setVisible(true);
		}
		if(c == KeyEvent.VK_F)
		{
			String fishResult = player.fish();
			try{
			if(fishResult.equalsIgnoreCase("You have successfully captured wild "+chosenMap.tileFinder(player.getX(), player.getY()).getPokemon().getName()))
			{
                                player.getTackleBox().useOneCast();
				pokemonCaught = chosenMap.tileFinder(player.getX(), player.getY()).getPokemon();
				
				System.out.println("YOU HAVE SUCCESSFULLY CAPTURED WILD " + pokemonCaught.getName().toUpperCase());
				
				fame += chosenMap.tileFinder(player.getX(), player.getY()).getPokemon().getFame();
				imgPokemonCapturePicture = new ImageIcon(this.getClass().getResource("/"+pokemonCaught.getName()+ ".jpeg"));
				lblPokemonCapturePicture.setIcon(imgPokemonCapturePicture);
				lblPokemonCapture.setText("<html><center>YOU HAVE SUCCESSFULLY CAPTURED <br>WILD</center></html> " +pokemonCaught.getName().toUpperCase() + ".");
				
				panelNoEncountered.setVisible(false);
				panelTreasureFound.setVisible(false);
				panelBadge.setVisible(false);
				panelPokemonCapture.setVisible(true);
			}
			
			else if(fishResult.equalsIgnoreCase("You encountered the Pokemon but failed to capture it"))
			{
                player.getTackleBox().useOneCast();
				System.out.println("YOU ENCOUNTERED A POKEMON BUT FAILED TO CAPTURE IT.");
				
				lblNoEncountered.setText("<html><center>YOU ENCOUNTERED A POKEMON BUT FAILED TO CAPTURE IT.</center></html>");
				lblNoEncountered.setHorizontalAlignment(SwingConstants.CENTER);
				lblNoEncountered.setFont(new Font("PixelGameFont", Font.PLAIN, 16));
				
				panelTreasureFound.setVisible(false);
				panelPokemonCapture.setVisible(false);
				panelBadge.setVisible(false);
				panelNoEncountered.setVisible(true);
			}
			
			else if(fishResult.equalsIgnoreCase("You have successfully captured legendary pokemon "+chosenMap.tileFinder(player.getX(), player.getY()).getPokemon().getName()))
			{
				player.getTackleBox().useOneCast();
				pokemonCaught = chosenMap.tileFinder(player.getX(), player.getY()).getPokemon();
				panelGame.setVisible(false);
				
				
				
				
				//NAME NG BADGE
				if(chosenMap == mapList.get(0))
				{
					imgLegendary = new ImageIcon(this.getClass().getResource("/"+pokemonCaught.getName()+ ".jpeg"));
					lblLegendary.setIcon(imgLegendary);
					imgBadge = new ImageIcon(this.getClass().getResource("/scale_badge.jpeg"));
					lblBadge.setIcon(imgBadge);
					lblBadgePhrase.setText("BY DOING SO, YOU HAVE RETRIEVED THE SCALE BADGE");
                                        
				}
				
                                else if(chosenMap == mapList.get(1))
				{
					imgLegendary = new ImageIcon(this.getClass().getResource("/"+pokemonCaught.getName()+ ".jpeg"));
					lblLegendary.setIcon(imgLegendary);
					imgBadge = new ImageIcon(this.getClass().getResource("/shell_badge.jpeg"));
					lblBadge.setIcon(imgBadge);
					lblBadgePhrase.setText("BY DOING SO, YOU HAVE RETRIEVED THE SHELL BADGE");
				}
				
                                else if(chosenMap == mapList.get(2))
				{
					imgLegendary = new ImageIcon(this.getClass().getResource("/"+pokemonCaught.getName()+ ".jpeg"));
					lblLegendary.setIcon(imgLegendary);
					imgBadge = new ImageIcon(this.getClass().getResource("/coral_badge.jpeg"));
					lblBadge.setIcon(imgBadge);
					lblBadgePhrase.setText("BY DOING SO, YOU HAVE RETRIEVED THE CORAL BADGE");
				}
				
                                else if(chosenMap == mapList.get(3))
				{
					imgLegendary = new ImageIcon(this.getClass().getResource("/"+pokemonCaught.getName()+ ".jpeg"));
					lblLegendary.setIcon(imgLegendary);
					imgBadge = new ImageIcon(this.getClass().getResource("/droplt_badge.jpeg"));
					lblBadge.setIcon(imgBadge);
					lblBadgePhrase.setText("BY DOING SO, YOU HAVE RETRIEVED THE DROPLET BADGE");
				}
				
                                else if(chosenMap == mapList.get(4))
				{
					imgLegendary = new ImageIcon(this.getClass().getResource("/"+pokemonCaught.getName()+ ".jpeg"));
					lblLegendary.setIcon(imgLegendary);
					imgBadge = new ImageIcon(this.getClass().getResource("/legend_badge.jpeg"));
					lblBadge.setIcon(imgBadge);
					lblBadgePhrase.setText("BY DOING SO, YOU HAVE RETRIEVED THE LEGEND BADGE");
				}
				
				
				
				panelTreasureFound.setVisible(false);
				panelPokemonCapture.setVisible(false);
				panelNoEncountered.setVisible(false);
				panelBadge.setVisible(true);
			}
			
            else if(fishResult.equalsIgnoreCase("You cast the line but it seems that there are no longer any Pokemon living this tile."))
            {
            	
            	panelTreasureFound.setVisible(false);
				panelPokemonCapture.setVisible(false);
				panelBadge.setVisible(false);
				panelNoEncountered.setVisible(true);
            }
			
            else if(fishResult.equalsIgnoreCase("You failed to encounter the Pokemon."))
             {
            	player.getTackleBox().useOneCast();
                lblNoEncountered.setText("<html><center>YOU ENCOUNTERED NOTHING.</center></html>");
                lblNoEncountered.setFont(new Font("PixelGameFont", Font.PLAIN, 20));
                
                panelTreasureFound.setVisible(false);
                panelPokemonCapture.setVisible(false);
                panelBadge.setVisible(false);
                panelNoEncountered.setVisible(true); 
             }
			
             else if(fishResult.equalsIgnoreCase("Not enough fame to encounter the rare pokemon of this map."))
              {
            	 lblNoEncountered.setText("<html><center>YOU NEED 100 FAME TO ENCOUNTER THE LEGENDARY POKEMON.</center></html>");
 				 lblNoEncountered.setHorizontalAlignment(SwingConstants.CENTER);
 				 lblNoEncountered.setFont(new Font("PixelGameFont", Font.PLAIN, 16));
 				 
 				 panelTreasureFound.setVisible(false);
 				 panelPokemonCapture.setVisible(false);
 				 panelBadge.setVisible(false);
 				 panelNoEncountered.setVisible(true);
              }
			
           
             


                        }
                        catch(Exception K)
                        {   
                            try{ if(fishResult.equalsIgnoreCase("You have retrieved the "+player.getCurrentMap().tileFinder(player.getX(), player.getY()).getTreasure().getName()))
                                        {
                                           String treasureName = player.getCurrentMap().tileFinder(player.getX(), player.getY()).getTreasure().getName();
                                           player.getTackleBox().useOneCast();		
                                           imgTreasure = new ImageIcon(this.getClass().getResource("/"+ treasureName + ".jpeg"));
                                           lblTreasure.setIcon(imgTreasure);
                                           lblTreasurePhrase.setText("YOU FOUND A " + 	treasureName.toUpperCase() + ".");

                                           panelPokemonCapture.setVisible(false);
                                           panelNoEncountered.setVisible(false);
                                           panelBadge.setVisible(false);
                                           panelTreasureFound.setVisible(true);
                                        }
                                 else if(fishResult.equalsIgnoreCase("You failed to find the treasure."))
                                     {
                                         player.getTackleBox().useOneCast(); 


                                        lblNoEncountered.setText("<html><center>YOU FAILED TO FIND THE TREASURE.</center></html>");
                                                        lblNoEncountered.setHorizontalAlignment(SwingConstants.CENTER);
                                                        lblNoEncountered.setFont(new Font("PixelGameFont", Font.PLAIN, 16));

                                        panelPokemonCapture.setVisible(false);
                                        panelBadge.setVisible(false);
                                        panelTreasureFound.setVisible(false);
                                        panelNoEncountered.setVisible(true);
                                     }		
                            }
                            catch(Exception G)
                            {
                                if(fishResult.equalsIgnoreCase("You can't fish on the port."))
                                {
                                  lblNoEncountered.setText("<html><center>YOU CAN;T FISH ON THE PORT.</center></html>");
                                          lblNoEncountered.setHorizontalAlignment(SwingConstants.CENTER);
                                          lblNoEncountered.setFont(new Font("PixelGameFont", Font.PLAIN, 16));

                                   panelPokemonCapture.setVisible(false);
                                   panelBadge.setVisible(false);
                                   panelTreasureFound.setVisible(false);
                                   panelNoEncountered.setVisible(true);
                                }
                            }
                        }
			
			//System.out.println(player.fish());
				
			lblFame.setText("FAME: " +player.getCurrentMap().getFame());
			lblCastsLeft.setText("CASTS LEFT: " + player.getTackleBox().getCurrentCast());
			lblMoney.setText("MONEY: P" + player.getMoney());
			textFieldMoneyLeft.setText(""+player.getMoney());                        

		}
		
		this.graphicalMap(player, lblCharacter);
		
		//CHANGE MAP
		
		if(player.getDay() < 30)
		{
			if(player.checkBadges() == 0 && player.getCurrentMap().getnLegend() == 1)
			{          
			
				if(player.getBoat().getCurrentMove() < 0 || player.getTackleBox().getCurrentCast() == 0)
				{
					player.setXY(player.getCurrentMap().getPortX(),player.getCurrentMap().getPortY());
					
					//DISPLAY SHOP
					panelGame.setVisible(false);
					panelPokeMart.setVisible(true);          
					player.addDay();
					lblDay.setText("DAY " + player.getDay());
					

					
					player.getBoat().resetMoves();
					player.getTackleBox().resetCast();  
					
					lblMovesLeft.setText("MOVES LEFT: " + player.getBoat().getCurrentMove());
					lblFame.setText("FAME: " + player.getCurrentMap().getFame());
					lblCastsLeft.setText("CASTS LEFT: " + player.getTackleBox().getCurrentCast());
                                        this.graphicalMap(player, lblCharacter);
	            
				}
				
			}
			
			else  if(player.checkBadges()==0&&chosenMap.getnLegend()==0)
			{
				
				 //PAKITA YUNG PANEL
				
                chosenMap.setCustomization(player.getRod().getLure(),player.getRod().getLine(), player.getRod().getReel(),player.getBoat().getEngine());                            
                player.getRod().resetRod();  
			}
			
			else 
			{
				//PANEL CONGRATS YOU WIN
			
			}
				
		}
	
	btnMainMenu_1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			panelLoad.setVisible(false);
			panelStart.setVisible(true);
		}
	});
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {

		
	}
}
