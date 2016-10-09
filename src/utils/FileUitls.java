package utils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

public class FileUitls {

	public static void scanerFile(File dir) {
		if (dir.isDirectory()) {//�ж��Ƿ�Ϊ�ļ���
            //�����ļ��������е��ļ����ļ��д���������
        File nextDir[]= dir.listFiles(); 
        for (int i = 0; i < nextDir.length; i++) {
            // ���forѭ��Ϊ����ǿ�����ʽ�Ŀɶ���
            //����ļ����ļ�����
            System.out.println(nextDir[i].getName());
        }
	}
}
	
	public static void writeFile(File dir,File out) {
		if (dir.isDirectory()) {//�ж��Ƿ�Ϊ�ļ���
            //�����ļ��������е��ļ����ļ��д���������
        File nextDir[]= dir.listFiles(); 
      //�����ļ������
        FileOutputStream fos;
        //�����ַ������
        OutputStreamWriter osw;
		try {
			fos = new FileOutputStream(out);
			osw = new OutputStreamWriter(fos,"UTF-8");
			 //�������������
			BufferedWriter bw = new BufferedWriter(osw);
			for (int i = 0; i < nextDir.length; i++) {
	            // ���forѭ��Ϊ����ǿ�����ʽ�Ŀɶ���
	            //����ļ����ļ�����
				String name = nextDir[i].getName();
	            System.out.println(name);
	            osw.write("UMENG_CHANNEL ����"+name+" "+name+"\r\n");
	            osw.flush();
	        }
			osw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        
	}
	}
}
	
