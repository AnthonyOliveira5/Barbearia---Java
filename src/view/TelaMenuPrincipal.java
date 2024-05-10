package view;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Dimension;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JDesktopPane;
import java.awt.Color;
import java.awt.Component;
import java.awt.BorderLayout;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import net.miginfocom.swing.MigLayout;
import javax.swing.SpringLayout;
import java.awt.FlowLayout;
import java.awt.CardLayout;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.DateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;

public class TelaMenuPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JDesktopPane desktop;
	public JMenuItem mntmNewSair;
	public JMenuItem mntmRelatorioAgendamento;
	public JMenuItem mntmCadastrarUsuario;
	public JMenu mnRelatorio;
	public JMenu mnMenuCadastro;
	public JLabel lblData;
	public JLabel lblUser;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaMenuPrincipal frame = new TelaMenuPrincipal();
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
	public TelaMenuPrincipal() {
		setTitle("Menu");
		addWindowListener(new WindowAdapter() {
		});
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 904, 542);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
	
		mnMenuCadastro = new JMenu("Cadastro");
		menuBar.add(mnMenuCadastro);
		
		JMenuItem mntmCadastrarCliente = new JMenuItem("Cliente");
		mntmCadastrarCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaCliente telaCliente = new TelaCliente();
				telaCliente.setVisible(true);
				desktop.add(telaCliente);
			}
		});
		mnMenuCadastro.add(mntmCadastrarCliente);
		
		mntmCadastrarUsuario = new JMenuItem("Usuario");
		mntmCadastrarUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaUsuario telaUsuario = new TelaUsuario();
				telaUsuario.setVisible(true);
				desktop.add(telaUsuario);
			}
		});
		mnMenuCadastro.add(mntmCadastrarUsuario);
		
		JMenuItem mntmCadastrarServico = new JMenuItem("Servico");
		mntmCadastrarServico.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaServico telaServico = new TelaServico();
				telaServico.setVisible(true);
				desktop.add(telaServico);
			}
		});
		mnMenuCadastro.add(mntmCadastrarServico);
		
		JMenu mnAgendamento = new JMenu("Agendamento");
		menuBar.add(mnAgendamento);
		
		mnRelatorio = new JMenu("Relatorio");
		menuBar.add(mnRelatorio);
		
		mntmRelatorioAgendamento = new JMenuItem("Mensal");
		mntmRelatorioAgendamento.setEnabled(false);
		mnRelatorio.add(mntmRelatorioAgendamento);
		
		JMenu mnNewMenu = new JMenu("Ajuda");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewSobre = new JMenuItem("Sobre");
		mntmNewSobre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//TelaSobre
				TelaSobre telaSobre = new TelaSobre();
				telaSobre.setVisible(true);
				
				
			}
		});
		mnNewMenu.add(mntmNewSobre);
		
		JMenu mnOpcoes = new JMenu("Opções");
		menuBar.add(mnOpcoes);
		
		mntmNewSair = new JMenuItem("Sair");
		mntmNewSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Caixa de Diálogo (Sim ou não)
				int sair = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja sair?","Atenção",JOptionPane.YES_NO_OPTION);
				if(sair == JOptionPane.YES_OPTION) {
					System.exit(0);
				}
			}
		});
		mnOpcoes.add(mntmNewSair);
		JPanel contentPane = new JPanel();
		contentPane.setFont(new Font("Arial Black", Font.PLAIN, 20));
		contentPane.setAlignmentY(Component.TOP_ALIGNMENT);
		contentPane.setAlignmentX(Component.LEFT_ALIGNMENT);
		contentPane.setPreferredSize(new Dimension(640, 480));
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));

		setContentPane(contentPane);
		
		desktop = new JDesktopPane();
		desktop.setBounds(0, 0, 640, 481);
		desktop.setPreferredSize(new Dimension(640, 480));
		
		JLabel lblNomeUser = new JLabel("USER:");
		lblNomeUser.setBounds(658, 90, 68, 29);
		lblNomeUser.setFont(new Font("Arial Black", Font.PLAIN, 20));
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(650, 245, 225, 225);
		lblNewLabel_2.setIcon(new ImageIcon(TelaMenuPrincipal.class.getResource("/icones/jpIcon.png")));
		
		JLabel lblNomeData = new JLabel("DATA:");
		lblNomeData.setBounds(658, 160, 69, 29);
		lblNomeData.setFont(new Font("Arial Black", Font.PLAIN, 20));
		contentPane.setLayout(null);
		desktop.setLayout(new CardLayout(0, 0));
		contentPane.add(desktop);
		contentPane.add(lblNomeUser);
		contentPane.add(lblNomeData);
		contentPane.add(lblNewLabel_2);
		
		lblData = new JLabel("----");
		lblData.setBounds(737, 163, 138, 22);
		lblData.setFont(new Font("Arial Black", Font.PLAIN, 20));
		contentPane.add(lblData);
		
		lblUser = new JLabel("----");
		lblUser.setBounds(736, 93, 129, 22);
		lblUser.setFont(new Font("Arial Black", Font.PLAIN, 20));
		contentPane.add(lblUser);
	
	}

}