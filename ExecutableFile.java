package tr.org.kamp.linux.files;

import java.lang.reflect.Executable;
import java.util.ArrayList;

public class ExecutableFile extends BinaryFile implements Openable{
	
	
	protected String platform;
	protected byte[] contents;
	
	
	
	
    /*yürütelebilir dosya*/
	

	
	public String getPlatform() {
		return platform;
	}
	public ExecutableFile(String name, long size, String dataCreate, String platform, byte[] contents) {
		super(name, size, dataCreate);
		this.platform = platform;
		this.contents = contents;
	}


	public void setPlatform(String platform) {
		this.platform = platform;
	}
	public byte[] getContents() {
		return contents;
	}
	public void setContents(byte[] contents) {
		this.contents = contents;
	}
	
	@Override
	BinaryFile getCopy() {
		return null;
	}
	
	@Override
	 void onClick() {
		
	}


	@Override
	public void Open() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
	

	

	
	
	

	

}
