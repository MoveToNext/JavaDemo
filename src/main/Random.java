package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import Bean.MyRunnable;
import Bean.NutritionFacts;
import Bean.ThreadPoolTest;
import Bean.NutritionFacts.Builder;
import temp.AFactory;
import temp.BFactory;
import temp.CFactory;
import temp.Child;
import temp.Factory;
import temp.Product;
import temp.Sun;
import utils.FileUitls;
import utils.RandomUtils;

public class Random {


	public static void main(String[] args) {
//		File file = new File("F:/ddd");
//		File file2 = new File("D:/3.txt");
//		FileUitls.reName(file);
			String webUrl1 = "http://www.bjtime.cn";//bjTime
	        String webUrl2 = "http://www.baidu.com";//�ٶ�
	        String webUrl3 = "http://www.taobao.com";//�Ա�
	        String webUrl4 = "http://www.ntsc.ac.cn";//�й���ѧԺ������ʱ����
	        String webUrl5 = "http://www.360.cn";//360
	        String webUrl6 = "http://www.beijing-time.org";//beijing-time
	        System.out.println(getWebsiteDatetime(webUrl1) + " [bjtime]");
	        System.out.println(getWebsiteDatetime(webUrl2) + " [�ٶ�]");
	        System.out.println(getWebsiteDatetime(webUrl3) + " [�Ա�]");
	        System.out.println(getWebsiteDatetime(webUrl4) + " [�й���ѧԺ������ʱ����]");
	        System.out.println(getWebsiteDatetime(webUrl5) + " [360��ȫ��ʿ]");
	        System.out.println(getWebsiteDatetime(webUrl6) + " [beijing-time]");
	}
	
	/**
     * ��ȡָ����վ������ʱ��
     * 
     * @param webUrl
     * @return
     * @author SHANHY
     * @date   2015��11��27��
     */
    private static String getWebsiteDatetime(String webUrl){
        try {
            URL url = new URL(webUrl);// ȡ����Դ����
            URLConnection uc = url.openConnection();// �������Ӷ���
            uc.connect();// ��������
            long ld = uc.getDate();// ��ȡ��վ����ʱ��
            Date date = new Date(ld);// ת��Ϊ��׼ʱ�����
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.CHINA);// �������ʱ��
            return sdf.format(date);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
