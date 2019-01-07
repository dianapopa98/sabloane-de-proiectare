
import java.util.ArrayList;
import java.util.List;

public class Chapter implements Element{

	private String title;
	private List<Element> subChapters = new ArrayList<Element>();
	
	public Chapter(String title){
		this.title = title;
	}
	
	public Chapter(String title, List<Element> subChapters){
		this.title = title;
		this.subChapters = subChapters;
	}
	
	@Override
	public void add(Element e) {
		subChapters.add(e);
		
	}
	@Override
	public void remove(Element e) {
		subChapters.remove(e);		
	}
	@Override
	public void getChild(int index) {
		subChapters.get(index);
		
	}
	@Override
	public void print() {
		System.out.println(title);
		for(Element elem : subChapters){
			elem.print();
	}
	public int createSubChapter(String title) {
		SubChapter subChapter = new SubChapter(title);
		subChapters.add(subChapter);
		return chapters.indexOf(chapter);
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public List<Element> getSubChapter() {
		return subChapters.get(index);s;
	}
	public void setSubChapters(List<Element> subChapters) {
		this.subChapters = subChapters;
	}
	
	

}
