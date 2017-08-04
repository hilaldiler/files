package tr.org.kamp.linux.files;

import java.lang.reflect.Executable;

public class DataFile extends BinaryFile{



	protected String compressionFormat;
	protected Executable opensWith;
	protected boolean [] bits;
	
	
	public DataFile(String name, long size, String dataCreate, String compressionFormat, Executable opensWith,
			boolean[] bits) {
		super(name, size, dataCreate);
		this.compressionFormat = compressionFormat;
		this.opensWith = opensWith;
		this.bits = bits;
	}
	
	DataFile(String compressionFormat,ExecutableFile opensWith){
		this.compressionFormat;
		this.opensWith;
	}
	
	public String getCompressionFormat() {
		return compressionFormat;
	}
	public void setCompressionFormat(String compressionFormat) {
		this.compressionFormat = compressionFormat;
	}
	public Executable getOpensWith() {
		return opensWith;
	}
	public void setOpensWith(Executable opensWith) {
		this.opensWith = opensWith;
	}
	public boolean[] getBits() {
		return bits;
	}
	public void setBits(boolean[] bits) {
		this.bits = bits;
	}
	
	@Override
	BinaryFile getCopy() {
		return new BinaryFile(getCompressionFormat(),getOpensWith());
	}
	@Override
	void onClick() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	

}
