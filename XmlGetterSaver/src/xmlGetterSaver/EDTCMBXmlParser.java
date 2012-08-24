package xmlGetterSaver;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class EDTCMBXmlParser {
	public Document _xmlDoc;
	public void setXmlDoc(Document _xmlDoc){
		this._xmlDoc=_xmlDoc;
	}
	public Document getXmlDoc(){
		return _xmlDoc;
	}
	
	public EDTCMBXmlParser(Document _xmlDoc){
		setXmlDoc(_xmlDoc);
	}
	
	public Date GetXmlDate(){
		Date date=new Date();
		try{
			NodeList nList=_xmlDoc.getElementsByTagName("Tarih_Date");
			Element tarih=(Element)nList.item(0);
			
			String trh=tarih.getAttribute("Date");
			
			SimpleDateFormat dateFormat=new SimpleDateFormat("MM/dd/yyyy");
			date=dateFormat.parse(trh);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return date;
	}
	
	public ArrayList<String> GetCurrecyList(){
		ArrayList<String> currencyList=new ArrayList<String>();
		
		NodeList nList=_xmlDoc.getElementsByTagName("Currency");
		for (int i = 0; i < nList.getLength(); i++) {
			Element currency=(Element)nList.item(i);
			currencyList.add(getTextValue(currency,"Isim"));			
		}
		
		return currencyList;
	}
	
	private String getTextValue(Element ele, String tagName) {
		String textVal = null;
		NodeList nl = ele.getElementsByTagName(tagName);
		if(nl != null && nl.getLength() > 0) {
			Element el = (Element)nl.item(0);
			textVal = el.getFirstChild().getNodeValue();
		}

		return textVal;
	}
	
	
}
