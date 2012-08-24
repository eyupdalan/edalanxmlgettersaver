package xmlGetterSaver;

public class TestClasses {
	public static void main(String[] args){
		System.out.println("Test class!");
		
		EDXmlGetterSaver xgs=new EDXmlGetterSaver("http://www.tcmb.gov.tr/kurlar/today.xml","C:\\Users\\edalan.KITAPYURDU\\Desktop\\test.xml");
		xgs.GetXmlFromUrl();
		System.out.println("xml file is taken");
		xgs.SaveXmlToLocal();
		System.out.println("xml file is saved");
	}
}

