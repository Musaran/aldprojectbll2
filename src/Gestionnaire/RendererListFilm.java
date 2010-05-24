package Gestionnaire;

import java.awt.Component;
import java.awt.Image;
import java.util.ArrayList;

import javax.swing.DefaultListCellRenderer;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

import metier.Film;

public class RendererListFilm implements ListCellRenderer {

	protected DefaultListCellRenderer defaultRenderer = new DefaultListCellRenderer();
	
	
	public RendererListFilm()
	{
		
	}
	
	public Component getListCellRendererComponent(JList list, Object value,
			int index, boolean isSelected, boolean cellHasFocus){
		// TODO Auto-generated method stub
		
		JLabel renderer = (JLabel) defaultRenderer.getListCellRendererComponent(list, value, index,
		        isSelected, cellHasFocus);

		Film a = (Film) list.getModel().getElementAt(index);
		String[] lien = a.getAffiche().split("/");
//		lien[0] = "WebContent";
		String link =a.getUrlAffiche();
		for(int i=1;i<lien.length;i++)
			link+="/"+lien[i];
		ImageIcon k = new ImageIcon(link);
		Image temp=k.getImage().getScaledInstance(48, 48, Image.SCALE_DEFAULT);
//		System.out.println(k.getDescription());
		renderer.setIcon(new ImageIcon(temp));
		
		renderer.setText(a.toString());
	 
		
		
		
		
		return renderer;
	}

}
