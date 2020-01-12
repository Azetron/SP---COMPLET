package l3;

import java.util.ArrayList;

public class ImageProxy implements Element,Observable{
		public String Nume;
		public Image realImage = null;
		private ArrayList<Observer> observersList=new ArrayList<>();
		private String oldValue;
		public ImageProxy() {}
		public ImageProxy(String n){
			this.Nume = n;
		}
		public String getNume() {
			return Nume;
		}
		public void setNume(String nume) {
			Nume = nume;
		}
		@Override
		public void print() {
			if(realImage == null) {
				realImage=new Image(Nume);
			}
			realImage.print();
			
		}
		@Override
		public void accept(Visitor v) {
			v.visit(this);
			
		}
		@Override
		public void setNewValue(String newValue) {
			oldValue=this.Nume;
			this.Nume=newValue;
			notifyObserver();
		}
		@Override
		public Element copy() {
			// TODO Auto-generated method stub
			return null;
		}
		@Override
		public void addObserver(Observer o) {
			observersList.add(o);
			
		}
		@Override
		public void removeObserver(Observer o) {
			observersList.remove(o);
			
		}
		@Override
		public void notifyObserver() {
			for(Observer i:observersList) {
				i.update(oldValue, this.Nume);
			}
			
		}
			
		
}
