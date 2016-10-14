package utils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

public class FileUitls {

	public static void reName(File dir) {
		int x = 0;
		if (dir.isDirectory()) {//判断是否为文件夹
			//将该文件夹下所有的文件及文件夹存入数组中
			File nextDir[]= dir.listFiles();
			for (int i = 0; i < nextDir.length; i++) {
				//输出文件及文件夹名
				String name = nextDir[i].getName();
				int lastIndexOf = name.lastIndexOf("_");
				int indexOf = name.indexOf("道");
				String name2 = "159cai-"+name.substring(indexOf+1,lastIndexOf);

				File file = new File("F:/ddd/"+name2+".apk");
				nextDir[i].renameTo(file);
				System.out.println(name2);
				x ++;
			}
			System.out.println("共执行了"+x);
		}
	}

	public static void scanerFile(File dir) {
		if (dir.isDirectory()) {//判断是否为文件夹
			//将该文件夹下所有的文件及文件夹存入数组中
			File nextDir[]= dir.listFiles();
			for (int i = 0; i < nextDir.length; i++) {
				//输出文件及文件夹名
				System.out.println(nextDir[i].getName());
			}
		}

	}
	public static void writeFile(File dir,File out) {
		if (dir.isDirectory()) {//判断是否为文件夹
			//将该文件夹下所有的文件及文件夹存入数组中
			File nextDir[]= dir.listFiles();
			//创建文件输出流
			FileOutputStream fos;
			//创建字符输出流
			OutputStreamWriter osw;
			try {
				fos = new FileOutputStream(out);
				osw = new OutputStreamWriter(fos,"UTF-8");
				//创建输出缓冲流
				BufferedWriter bw = new BufferedWriter(osw);
				for (int i = 0; i < nextDir.length; i++) {
					// 这个for循环为了增强输出格式的可读性
					//输出文件及文件夹名
					String name = nextDir[i].getName();
					System.out.println(name);
					osw.write("UMENG_CHANNEL 渠道"+name+" "+name+"\r\n");
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
	
