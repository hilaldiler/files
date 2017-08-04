package tr.org.kamp.linux.files;

public class PlainTextFile extends TextFile {

	public PlainTextFile(String name, long size, String dataCreate) {
		super(name, size, dataCreate);
	}


	protected String[] lines;
	

	



	public String[] getLines() {
		return lines;
	}



	public void setLines(String[] lines) {
		this.lines = lines;
	}


	@Override
	public void onClick() {
		
	}
	



}
