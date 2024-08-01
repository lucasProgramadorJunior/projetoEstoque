package frames;

	import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import Diu.frameDiuCadas;

	
	public class HomeWindow implements ActionListener{
	
		JPanel subBarra;
		JPanel barra;
		JLabel IconEmp;
		JMenuItem cadastrarDiu;
		JMenuItem cadastrarTipo;
		JMenuItem cadastrarMaterial;
		private int alturaSubBarra = 27;
		
		
		
		public HomeWindow(){
			
			ImageIcon imagemOriginal = new ImageIcon("C://Users//vanil//Downloads//IconWindows-removebg-preview.png//");
			
			Image imagemModificar = imagemOriginal.getImage();
			Image imagem = imagemModificar.getScaledInstance(60, 60, Image.SCALE_SMOOTH);
			ImageIcon imagemIcon = new ImageIcon(imagem);
			
			IconEmp = new JLabel(); 
			IconEmp.setIcon(imagemIcon);
			IconEmp.setBounds(10, 10, imagemIcon.getIconWidth(), imagemIcon.getIconHeight());
			IconEmp.setVisible(true);
			
			
			
			JFrame home = new JFrame();
			home.setTitle("Prexeco");
			home.setSize(1000,700);
			home.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			home.setLayout(null);
			home.getContentPane().setBackground(Color.blue);
			
			
			
			
			
			// criando uma subBarra para colocar o menu bar
			subBarra = new JPanel();
			subBarra.setBackground(Color.GRAY);
			subBarra.setLayout(new BorderLayout());
			
			
			
			
			
			//criando e definindo redeas para a barra de menu
			JMenuBar barraDeMenu = new JMenuBar();
			JMenu cadastro = new JMenu("Cadastros");
			JMenu movimentacao = new JMenu("Movimentações");
			JMenu entradas = new JMenu("Entradas");
			JMenu kardex = new JMenu("Relatorios");
			cadastrarDiu = new JMenuItem("Cadastrar Diu");
			cadastrarTipo = new JMenuItem("Cadastrar Tipo");
			cadastrarMaterial = new JMenuItem("Cadastrar Mat.");
			
			
			
			
			
			//adicionar acao
			cadastrarDiu.addActionListener(this);
			cadastrarTipo.addActionListener(this);
			cadastrarMaterial.addActionListener(this);
			
			
			
			cadastro.add(cadastrarDiu);
			cadastro.add(cadastrarTipo);
			cadastro.add(cadastrarMaterial);
			barraDeMenu.add(cadastro);
			barraDeMenu.add(movimentacao);
			barraDeMenu.add(entradas);
			subBarra.add(barraDeMenu, BorderLayout.WEST);
			
			
			
			
			barra = new JPanel();
			barra.setBackground(Color.LIGHT_GRAY);
			barra.setLayout(null);
			barra.add(subBarra);
			barra.add(IconEmp);
			
			
			
			
			home.add(barra);
			home.addComponentListener(new ComponentAdapter(){
				public void componentResized(ComponentEvent e) {
					adjustPanelSizes(home);
				}
			});
			adjustPanelSizes(home);
			
			
			
			
			home.setVisible(true);
	}
		
		
		
		
		public void adjustPanelSizes(JFrame home) {
			int largura = home.getWidth();
	        
	        barra.setBounds(0, 0, largura, 100);
	        subBarra.setBounds(0, barra.getHeight() - alturaSubBarra, largura, alturaSubBarra);
	        
	        // Atualiza e repinta os painéis para refletir as mudanças de tamanho.
	        barra.revalidate();
	        barra.repaint();
	        subBarra.revalidate();
	        subBarra.repaint();
	      
	        
	        
	        
		}
		
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==cadastrarDiu) {
				frameDiuCadas framediucadas = new frameDiuCadas();
			}
		}
		
		
}

	
	
	
	
	
	
	
	
	
