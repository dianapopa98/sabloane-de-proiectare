
public class Main {
	public static void main (String []args){
		
		//lab 1 & 2
		
		Book noapteBuna = new Book("Noapte buna, copii!");
		Book discoTitanic = new Book("Disco Titanic");
		
		Author gheo = new Author ("Radu Pavel Gheo");
		Author rpGheo = new Author ("Radu Pavel Gheo");
		
		noapteBuna.addAuthor(gheo);
		discoTitanic.addAuthor(rpGheo);
		
		int indexChapterOne = discoTitanic.createChapter("Capitolul 1");
		Chapter chp1 = discoTitanic.getChapter(indexChapterOne);
		int indexSubChapterOneOne = chp1.createSubChapter("Subcapitolul 1.1");
		SubChapter scOneOne = chp1.getSubChapter(indexSubChapterOneOne);
		
		scOneOne.createNewParagraph("Paragraph 1");
		scOneOne.createNewParagraph("Paragraph 2");
		scOneOne.createNewParagraph("Paragraph 3");
		scOneOne.createNewImage("Image 1");
		scOneOne.createNewParagraph("Paragraph 4");
		scOneOne.createNewTable("Table 1");
		scOneOne.createNewParagraph("Paragraph 5");

		//Lab 4
		/* Image Code (slow)
		long startTime = System.currentTimeMillis();
		Image img1 = new Image("Pamela Anderson");
		Image img2 = new Image("Kim Kardashian");
		Image img3 = new Image("Kirby Griffin");
		Section playboyS1 = new Section("Front Cover");
		playboyS1.add(img1);
		Section playboyS2 = new Section("Summer Girls");
		playboyS2.add(img2);
		playboyS2.add(img3);
		Book playboy = new Book("Playboy");
		playboy.addContent(playboyS1);
		playboy.addContent(playboyS2);
		long endTime = System.currentTimeMillis();
		System.out.println("Creation of the content took " + (endTime - startTime) + " milliseconds");
			
		startTime = System.currentTimeMillis();
		playboyS1.print();
		endTime = System.currentTimeMillis();
		
		System.out.println("Printing of the section 1 took " + (endTime - startTime) + " milliseconds");
			
		startTime = System.currentTimeMillis();
		playboyS1.print();
		endTime = System.currentTimeMillis();
		
		System.out.println("Printing again the section 1 took " + (endTime - startTime) + " milliseconds");
		*/
		
		// Image Proxy Code (fast)
		long startTime = System.currentTimeMillis();
		ImageProxy img1 = new ImageProxy("Pamela Anderson");
		ImageProxy img2 = new ImageProxy("Kim Kardashian");
		ImageProxy img3 = new ImageProxy("Kirby Griffin");
		Section playboyS1 = new Section("Front Cover");
		playboyS1.add(img1);
		Section playboyS2 = new Section("Summer Girls");
		playboyS2.add(img2);
		playboyS2.add(img3);
		Book playboy = new Book("Playboy");
		playboy.addContent(playboyS1);
		playboy.addContent(playboyS2);
		long endTime = System.currentTimeMillis();
		System.out.println("Creation of the content took " + (endTime - startTime) + " milliseconds");
		
		startTime = System.currentTimeMillis();
		playboyS1.print();
		endTime = System.currentTimeMillis();
		
		System.out.println("Printing of the section 1 took " + (endTime - startTime) + " milliseconds");
			
		startTime = System.currentTimeMillis();
		playboyS1.print();
		endTime = System.currentTimeMillis();
		
		System.out.println("Printing again the section 1 took " + (endTime - startTime) + " milliseconds");

		
		//Lab 5
		
		Section cap1 = new Section("Capitolul 1");
		Paragraph p1 = new Paragraph("Paragraph 1");
		cap1.add(p1);
		Paragraph p2 = new Paragraph("Paragraph 2");
		cap1.add(p2);
		Paragraph p3 = new Paragraph("Paragraph 3");
		cap1.add(p3);
		Paragraph p4 = new Paragraph("Paragraph 4");
		cap1.add(p4);
			
		System.out.println("Printing without Alignment");
		System.out.println();
		cap1.print();
			
		p1.setAlignStrategy(new Align_Center());
		p2.setAlignStrategy(new Align_Right());
		p3.setAlignStrategy(new Align_Left());
			
		System.out.println();
		System.out.println("Printing with Alignment");
		System.out.println();
		cap1.print();

		//Lab 6
		
		cap1.add(new ImageProxy("ImageOne"));
		cap1.add(new Image("ImageTwo"));
		cap1.add(new Paragraph("Some text"));
		cap1.add(new Table("Table 1"));
		
		BookStatistics stats = new BookStatistics();
		cap1.accept(stats);
		stats.printStatistics();

	}
}
