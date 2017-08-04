package tr.org.kamp.linux.files;

public abstract class File {

	
	protected String name;
	protected long size;
	protected String dataCreate;//olusturulan veri
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getSize() {
		return size;
	}
	public void setSize(long size) {
		this.size = size;
	}
	public String getDataCreate() {
		return dataCreate;
	}
	public void setDataCreate(String dataCreate) {
		this.dataCreate = dataCreate;
	}
	
	abstract void onClick();
	
	public File(String name, long size, String dataCreate) {
		
		this.name = name;
		this.size = size;
		this.dataCreate = dataCreate;
	}
		
    
	
	
	
}
