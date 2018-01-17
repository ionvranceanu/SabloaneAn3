package lab1;

public class DocumentStatVisitor implements Visitor{
	
	private int imageCounter = 0;
	private int paragrafCounter = 0;
	private int tabelCounter = 0;
	private int sectiuneCounter = 0;
	public void visitImageProxy(Imagine img) {
		this.imageCounter++;
		
	}

	public void visitImage(Imagine img) {
		imageCounter++;
	}

	public void visitParagraf(Paragraf paragraf) {
		this.paragrafCounter++;
	}

	public void visitTabel(Tabel tabel) {
		this.tabelCounter++;
	}

	public void visitSectiune(Sectiune sectiune) {
		this.sectiuneCounter++;
	}

	public int getImageCounter() {
		return imageCounter;
	}

	public int getParagrafCounter() {
		return paragrafCounter;
	}

	public int getTabelCounter() {
		return tabelCounter;
	}

	public int getSectiuneCounter() {
		return sectiuneCounter;
	}
	
	public void printStatic()
	{
		System.out.print("\nNr. Imag:"  + imageCounter + "\nNr. Paragrafe:"  + paragrafCounter + "\nNr. Tabele:"  + tabelCounter + "\nNr. Sectiuni:"  + sectiuneCounter);
	}

}
