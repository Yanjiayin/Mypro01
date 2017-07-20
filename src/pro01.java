import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.Properties;

public class pro01 {
	public static void main(String[] args){
		Properties pro=new Properties();
		try{
			
			InputStream in =new BufferedInputStream (new FileInputStream("C://Users//yanj//workspace//Mypro01//src//pro1.properties")); 
			pro.load(in);     ///加载属性列表//		
			pro.setProperty("Year", "2017");	
//            Iterator<String> it=pro.stringPropertyNames().iterator();
//             while(it.hasNext()){
//                 String key=it.next();
//                 System.out.println(key+"="+pro.getProperty(key));
//			}
			for(Object key:pro.keySet()){
				System.out.println(key+"="+pro.get(key));
			}            
             in.close();
             
             String outProFilePath = "C://Users//yanj//workspace//Mypro01//src//pro1.properties";
             String outXmlFilePath ="C://Users//yanj//workspace//Mypro01//src//pro1.xml";
             OutputStream oFile = new FileOutputStream(outProFilePath);//true表示追加打开
             pro.store(oFile, "The New properties file");//将Properties类对象的属性列表保存到输出流中
             oFile.close();
             OutputStream outXml = new FileOutputStream(outXmlFilePath);  
             pro.storeToXML(outXml, "从Properties对象导出到xml文件中");  
		}catch(Exception e){
            System.out.println(e);
        }
		
	}
}
