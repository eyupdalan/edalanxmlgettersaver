package xmlGetterSaver;

import org.w3c.dom.Document;

public class EDXmlGetterSaver {
	public Document _xmlDoc;
	public void setXmlDoc(Document _xmlDoc){
		this._xmlDoc=_xmlDoc;
	}
	public Document setXmlDoc(){
		return _xmlDoc;
	}
	
	public String _xmlUrl;
	public void setXmlUrl(String _xmlUrl){
		this._xmlUrl=_xmlUrl;
	}
	public String getXmlUrl(){
		return _xmlUrl;
	}
	
	public String _xmlLocalPath;
	public void setXmlLocalPath(String _xmlLocalPath){
		this._xmlLocalPath=_xmlLocalPath;
	}
	
	public EDXmlGetterSaver(String _xmlUrl){
		setXmlUrl(_xmlUrl);
	}
	
	public void GetXmlFromUrl(){
		
	}
}
