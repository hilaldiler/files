package tr.org.kamp.linux.files;

public abstract class BinaryFile extends File{
	
	

	 public BinaryFile(String name, long size, String dataCreate) {
		super(name, size, dataCreate);
	}

	abstract BinaryFile getCopy();

}
