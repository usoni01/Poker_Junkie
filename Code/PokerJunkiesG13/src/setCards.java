import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class setCards {
GUI front;
String card;

	

	 ImageIcon c2 = new ImageIcon(new ImageIcon("icon/cards/2C.png").getImage().getScaledInstance(60, 80, Image.SCALE_DEFAULT));
		ImageIcon d2 = new ImageIcon(new ImageIcon("icon/cards/2D.png").getImage().getScaledInstance(60, 80, Image.SCALE_DEFAULT));
		ImageIcon h2 = new ImageIcon(new ImageIcon("icon/cards/2H.png").getImage().getScaledInstance(60, 80, Image.SCALE_DEFAULT));
		ImageIcon s2 = new ImageIcon(new ImageIcon("icon/cards/2S.png").getImage().getScaledInstance(60, 80, Image.SCALE_DEFAULT));
		
		ImageIcon c3 = new ImageIcon(new ImageIcon("icon/cards/3C.png").getImage().getScaledInstance(60, 80, Image.SCALE_DEFAULT));
		ImageIcon d3 = new ImageIcon(new ImageIcon("icon/cards/3D.png").getImage().getScaledInstance(60, 80, Image.SCALE_DEFAULT));
		ImageIcon h3 = new ImageIcon(new ImageIcon("icon/cards/3H.png").getImage().getScaledInstance(60, 80, Image.SCALE_DEFAULT));
		ImageIcon s3 = new ImageIcon(new ImageIcon("icon/cards/3S.png").getImage().getScaledInstance(60, 80, Image.SCALE_DEFAULT));
		
		ImageIcon c4 = new ImageIcon(new ImageIcon("icon/cards/4C.png").getImage().getScaledInstance(60, 80, Image.SCALE_DEFAULT));
		ImageIcon d4 = new ImageIcon(new ImageIcon("icon/cards/4D.png").getImage().getScaledInstance(60, 80, Image.SCALE_DEFAULT));
		ImageIcon h4 = new ImageIcon(new ImageIcon("icon/cards/4H.png").getImage().getScaledInstance(60, 80, Image.SCALE_DEFAULT));
		ImageIcon s4 = new ImageIcon(new ImageIcon("icon/cards/4S.png").getImage().getScaledInstance(60, 80, Image.SCALE_DEFAULT));
		
		
		ImageIcon c5 = new ImageIcon(new ImageIcon("icon/cards/5C.png").getImage().getScaledInstance(60, 80, Image.SCALE_DEFAULT));
		ImageIcon d5 = new ImageIcon(new ImageIcon("icon/cards/5D.png").getImage().getScaledInstance(60, 80, Image.SCALE_DEFAULT));
		ImageIcon h5 = new ImageIcon(new ImageIcon("icon/cards/5H.png").getImage().getScaledInstance(60, 80, Image.SCALE_DEFAULT));
		ImageIcon s5 = new ImageIcon(new ImageIcon("icon/cards/5S.png").getImage().getScaledInstance(60, 80, Image.SCALE_DEFAULT));
		
		
		ImageIcon c6 = new ImageIcon(new ImageIcon("icon/cards/6C.png").getImage().getScaledInstance(60, 80, Image.SCALE_DEFAULT));
		ImageIcon d6 = new ImageIcon(new ImageIcon("icon/cards/6D.png").getImage().getScaledInstance(60, 80, Image.SCALE_DEFAULT));
		ImageIcon h6 = new ImageIcon(new ImageIcon("icon/cards/6H.png").getImage().getScaledInstance(60, 80, Image.SCALE_DEFAULT));
		ImageIcon s6 = new ImageIcon(new ImageIcon("icon/cards/6S.png").getImage().getScaledInstance(60, 80, Image.SCALE_DEFAULT));
		
		ImageIcon c7 = new ImageIcon(new ImageIcon("icon/cards/7C.png").getImage().getScaledInstance(60, 80, Image.SCALE_DEFAULT));
		ImageIcon d7 = new ImageIcon(new ImageIcon("icon/cards/7D.png").getImage().getScaledInstance(60, 80, Image.SCALE_DEFAULT));
		ImageIcon h7 = new ImageIcon(new ImageIcon("icon/cards/7H.png").getImage().getScaledInstance(60, 80, Image.SCALE_DEFAULT));
		ImageIcon s7 = new ImageIcon(new ImageIcon("icon/cards/7S.png").getImage().getScaledInstance(60, 80, Image.SCALE_DEFAULT));
		
		
		ImageIcon c8 = new ImageIcon(new ImageIcon("icon/cards/8C.png").getImage().getScaledInstance(60, 80, Image.SCALE_DEFAULT));
		ImageIcon d8 = new ImageIcon(new ImageIcon("icon/cards/8D.png").getImage().getScaledInstance(60, 80, Image.SCALE_DEFAULT));
		ImageIcon h8 = new ImageIcon(new ImageIcon("icon/cards/8H.png").getImage().getScaledInstance(60, 80, Image.SCALE_DEFAULT));
		ImageIcon s8 = new ImageIcon(new ImageIcon("icon/cards/8S.png").getImage().getScaledInstance(60, 80, Image.SCALE_DEFAULT));
		
		
		ImageIcon c9 = new ImageIcon(new ImageIcon("icon/cards/9C.png").getImage().getScaledInstance(60, 80, Image.SCALE_DEFAULT));
		ImageIcon d9 = new ImageIcon(new ImageIcon("icon/cards/9D.png").getImage().getScaledInstance(60, 80, Image.SCALE_DEFAULT));
		ImageIcon h9 = new ImageIcon(new ImageIcon("icon/cards/9H.png").getImage().getScaledInstance(60, 80, Image.SCALE_DEFAULT));
		ImageIcon s9 = new ImageIcon(new ImageIcon("icon/cards/9S.png").getImage().getScaledInstance(60, 80, Image.SCALE_DEFAULT));
		
		
		ImageIcon c10 = new ImageIcon(new ImageIcon("icon/cards/10C.png").getImage().getScaledInstance(60, 80, Image.SCALE_DEFAULT));
		ImageIcon d10 = new ImageIcon(new ImageIcon("icon/cards/10D.png").getImage().getScaledInstance(60, 80, Image.SCALE_DEFAULT));
		ImageIcon h10 = new ImageIcon(new ImageIcon("icon/cards/10H.png").getImage().getScaledInstance(60, 80, Image.SCALE_DEFAULT));
		ImageIcon s10 = new ImageIcon(new ImageIcon("icon/cards/10S.png").getImage().getScaledInstance(60, 80, Image.SCALE_DEFAULT));
		
		
		ImageIcon ca = new ImageIcon(new ImageIcon("icon/cards/AC.png").getImage().getScaledInstance(60, 80, Image.SCALE_DEFAULT));
		ImageIcon da = new ImageIcon(new ImageIcon("icon/cards/AD.png").getImage().getScaledInstance(60, 80, Image.SCALE_DEFAULT));
		ImageIcon ha = new ImageIcon(new ImageIcon("icon/cards/AH.png").getImage().getScaledInstance(60, 80, Image.SCALE_DEFAULT));
		ImageIcon sa = new ImageIcon(new ImageIcon("icon/cards/AS.png").getImage().getScaledInstance(60, 80, Image.SCALE_DEFAULT));
		
		ImageIcon cj = new ImageIcon(new ImageIcon("icon/cards/JC.png").getImage().getScaledInstance(60, 80, Image.SCALE_DEFAULT));
		ImageIcon dj = new ImageIcon(new ImageIcon("icon/cards/JD.png").getImage().getScaledInstance(60, 80, Image.SCALE_DEFAULT));
		ImageIcon hj = new ImageIcon(new ImageIcon("icon/cards/JH.png").getImage().getScaledInstance(60, 80, Image.SCALE_DEFAULT));
		ImageIcon sj = new ImageIcon(new ImageIcon("icon/cards/JS.png").getImage().getScaledInstance(60, 80, Image.SCALE_DEFAULT));
		
		
		ImageIcon ck = new ImageIcon(new ImageIcon("icon/cards/KC.png").getImage().getScaledInstance(60, 80, Image.SCALE_DEFAULT));
		ImageIcon dk = new ImageIcon(new ImageIcon("icon/cards/KD.png").getImage().getScaledInstance(60, 80, Image.SCALE_DEFAULT));
		ImageIcon hk = new ImageIcon(new ImageIcon("icon/cards/KH.png").getImage().getScaledInstance(60, 80, Image.SCALE_DEFAULT));
		ImageIcon sk = new ImageIcon(new ImageIcon("icon/cards/KS.png").getImage().getScaledInstance(60, 80, Image.SCALE_DEFAULT));
		
		ImageIcon cq = new ImageIcon(new ImageIcon("icon/cards/QC.png").getImage().getScaledInstance(60, 80, Image.SCALE_DEFAULT));
		ImageIcon dq = new ImageIcon(new ImageIcon("icon/cards/QD.png").getImage().getScaledInstance(60, 80, Image.SCALE_DEFAULT));
		ImageIcon hq = new ImageIcon(new ImageIcon("icon/cards/QH.png").getImage().getScaledInstance(60, 80, Image.SCALE_DEFAULT));
		ImageIcon sq = new ImageIcon(new ImageIcon("icon/cards/QS.png").getImage().getScaledInstance(60, 80, Image.SCALE_DEFAULT));
	
	
		
		public void set(JLabel lable, Card cardx)
		{
			this.card=cardx.card();
			
			 if(card.equals("c2"))
			{
				lable.setIcon(c2);
				
			}
			
			else if(card.equals("d2"))
			{
				lable.setIcon(d2);
				
			}
			else if(card.equals("h2"))
			{
				lable.setIcon(h2);
				
			}
			else if(card.equals("s2"))
			{
				lable.setIcon(s2);
				
			}
			
			
			 
			else if(card.equals("c3"))
			{
				lable.setIcon(c3);
				
			}
			
			else if(card.equals("d3"))
			{
				lable.setIcon(d3);
				
			}
			else if(card.equals("h3"))
			{
				lable.setIcon(h3);
				
			}
			else if(card.equals("s3"))
			{
				lable.setIcon(s3);
				
			}
			
			 
			else if(card.equals("c4"))
			{
				lable.setIcon(c4);
			}
			
			else if(card.equals("d4"))
			{
				lable.setIcon(d4);
				
			}
			else if(card.equals("h4"))
			{
				lable.setIcon(h4);
				
			}
			else if(card.equals("s4"))
			{
				lable.setIcon(s4);
				
			}
			
			 
			else if(card.equals("c5"))
			{
				lable.setIcon(c5);
			}
			
			else if(card.equals("d5"))
			{
				lable.setIcon(d5);
				
			}
			else if(card.equals("h5"))
			{
				lable.setIcon(h5);
				
			}
			else if(card.equals("s5"))
			{
				lable.setIcon(s5);
				
			}
			
			 
			else if(card.equals("c6"))
			{
				lable.setIcon(c6);
			}
			
			else if(card.equals("d6"))
			{
				lable.setIcon(d6);
				
			}
			else if(card.equals("h6"))
			{
				lable.setIcon(h6);
				
			}
			else if(card.equals("s6"))
			{
				lable.setIcon(s6);
				
			}
			
			 
			else if(card.equals("c7"))
			{
				lable.setIcon(c7);
			}
			
			else if(card.equals("d7"))
			{
				lable.setIcon(d7);
				
			}
			else if(card.equals("h7"))
			{
				lable.setIcon(h7);
				
			}
			else if(card.equals("s7"))
			{
				lable.setIcon(s7);
				
			}
			
			 
			else if(card.equals("c8"))
			{
				lable.setIcon(c8);
			}
			
			else if(card.equals("d8"))
			{
				lable.setIcon(d8);
				
			}
			else if(card.equals("h8"))
			{
				lable.setIcon(h8);
				
			}
			else if(card.equals("s8"))
			{
				lable.setIcon(s8);
				
			}
			
			 
			else if(card.equals("c9"))
			{
				lable.setIcon(c9);
			}
			
			else if(card.equals("d9"))
			{
				lable.setIcon(d9);
				
			}
			else if(card.equals("h9"))
			{
				lable.setIcon(h9);
				
			}
			else if(card.equals("s9"))
			{
				lable.setIcon(s9);
				
			}
			
			 
			else if(card.equals("ct"))
			{
				lable.setIcon(c10);
			}
			
			else if(card.equals("dt"))
			{
				lable.setIcon(d10);
				
			}
			else if(card.equals("ht"))
			{
				lable.setIcon(h10);
				
			}
			else if(card.equals("st"))
			{
				lable.setIcon(s10);
				
			}
			
			 
			else if(card.equals("ca"))
			{
				lable.setIcon(ca);
			}
			
			else if(card.equals("da"))
			{
				lable.setIcon(da);
				
			}
			else if(card.equals("ha"))
			{
				lable.setIcon(ha);
				
			}
			else if(card.equals("sa"))
			{
				lable.setIcon(sa);
				
			}
			
			 
			else if(card.equals("ck"))
			{
				lable.setIcon(ck);
			}
			
			else if(card.equals("dk"))
			{
				lable.setIcon(dk);
				
			}
			else if(card.equals("hk"))
			{
				lable.setIcon(hk);
				
			}
			else if(card.equals("sk"))
			{
				lable.setIcon(sk);
				
			}
			
			 
			else if(card.equals("cq"))
			{
				lable.setIcon(cq);
			}
			
			else if(card.equals("dq"))
			{
				lable.setIcon(dq);
				
			}
			else if(card.equals("hq"))
			{
				lable.setIcon(hq);
				
			}
			else if(card.equals("sq"))
			{
				lable.setIcon(sq);
				
			}
			
			 
			else if(card.equals("cj"))
			{
				lable.setIcon(cj);
			}
			
			else if(card.equals("dj"))
			{
				lable.setIcon(dj);
				
			}
			else if(card.equals("hj"))
			{
				lable.setIcon(hj);
				
			}
			else if(card.equals("sj"))
			{
				lable.setIcon(sj);
				
			}
			
			 
			
			
		}
		
		
		

		
}
