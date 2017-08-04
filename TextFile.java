package tr.org.kamp.linux.files;

public abstract class TextFile extends File implements Openable{
	
	protected String encoding;
	protected long numChars;
	
	public TextFile(String name, long size, String dataCreate) {
		super(name, size, dataCreate);
	}
	
	
	public String getEncoding() {
		return encoding;
	}
	public void setEncoding(String encoding) {
		this.encoding = encoding;
	}
	public long getNumChars() {
		return numChars;
	}
	public void setNumChars(long numChars) {
		this.numChars = numChars;
	}
	
	
	
	

}
