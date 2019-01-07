

import java.util.concurrent.TimeUnit;

public class ImageProxy implements Element {

	private String name;
	private Image image = null;
	public ImageProxy (String name) {
		this.name = name;
		
	}
	@Override
	public void add(Element e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void remove(Element e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void getChild(int index) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void print() {
		
		if(image == null) 
		{
			try {
				image = new Image(name);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		image.print();
		
	}
	
	

	
}
