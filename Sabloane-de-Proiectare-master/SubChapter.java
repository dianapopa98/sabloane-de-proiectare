
import java.util.ArrayList;
import java.util.List;

public class SubChapter implements Element{

	private String title;
	private List<Element> Paragraphs = new ArrayList<Element>();
  	private List<Element> Images = new ArrayList<Element>();
  	private List<Element> Tables = new ArrayList<Element>();
	
	public SubChapter(String title){
		this.title = title;
	}
	
	public SubChapter(String title, List<Element> subChapters){
		this.title = title;
		this.subChapters = subChapters;
	}
	
	@Override
	public void add(Element e) {
		Paragraphs.add(e);
		
	}
	@Override
	public void remove(Element e) {
		Paragraphs.remove(e);		
	}
	@Override
	public void getChild(int index) {
		Paragraphs.get(index);
		
	}
	@Override
	public void print() {
		System.out.println("Subchapter: " + title);
		for(Element elem : Paragraphs){
			elem.print();
	}
  
	public int createNewParagraph(String title) {
		Paragraph paragraph = new Paragraph(title);
		Paragraphs.add(paragraph);
		return Paragraphs.indexOf(paragraph);
  }
  
  public int createNewImage(String title) {
		Image image = new Image(title);
		Images.add(image);
		return Images.indexOf(image);
  }
  
  public int createNewTable(String title) {
		Table table = new Table(title);
		Tables.add(table);
		return Tables.indexOf(table);
  }
  
	public String getTitle() {
		return title;
	}
  
	public void setTitle(String title) {
		this.title = title;
	}
  
	public List<Element> getSubChapter() {
		return subChapters.get(index);s;
	}
  
	public void setParagraphs(List<Element> paragraphs) {
		this.Paragraphs = paragraphs;
	}
	
	

}
