package Gestionnaire;

import java.awt.Component;
import java.awt.Image;

import javax.swing.DefaultListCellRenderer;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

import dao.hibernate.DAOHibernateServeur;

import metier.Personne;
import metier.Serveur;

public class RendererListPersonne implements ListCellRenderer {

protected DefaultListCellRenderer defaultRenderer = new DefaultListCellRenderer();
	
	
	public RendererListPersonne()
	{
		
	}
	
	public Component getListCellRendererComponent(JList list, Object value,
			int index, boolean isSelected, boolean cellHasFocus){
		DAOHibernateServeur daoServeur= new DAOHibernateServeur();
		Serveur s=new Serveur();
		try {
			s=daoServeur.load(0);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		JLabel renderer = (JLabel) defaultRenderer.getListCellRendererComponent(list, value, index,
		        isSelected, cellHasFocus);

		Personne a = (Personne) list.getModel().getElementAt(index);
		String[] lien = a.getPhoto().split("/");
//		lien[0] = "WebContent";
		String link = s.getUrl();
		for(int i=1;i<lien.length;i++)
			link+="/"+lien[i];
		ImageIcon k = new ImageIcon(link);
		System.out.println(link);
		Image temp=k.getImage().getScaledInstance(48, 48, Image.SCALE_DEFAULT);
//		System.out.println(k.getDescription());
		renderer.setIcon(new ImageIcon(temp));
		
		renderer.setText(a.toString());
	 	
		
		return renderer;
	}

}
