package tr.org.kamp.linux.files;

import java.awt.List;
import java.lang.reflect.Executable;
import java.util.ArrayList;

public class HtmlFile extends TextFile {
	
	public HtmlFile(String name, long size, String dataCreate) {
		super(name, size, dataCreate);
		// TODO Auto-generated constructor stub
	}



	protected ExecutableFile browserh;
	protected ArrayList<HtmlFile> linksTo;
	
	
	
	



	public Executable getBrowser() {
		return browser;
	}



	public void setBrowser(Executable browser) {
		this.browser = browserCompatibleWith;
	}



	public ArrayList<HtmlFile> getLinksTo() {
		return linksTo;
	}



	public void setLinksTo(ArrayList<HtmlFile> linksTo) {
		this.linksTo = linksTo;
	}



	@Override
	 void onClick() {
		
	}



	@Override
	public void Open() {
		// TODO Auto-generated method stub
		
	}

	
	

}
