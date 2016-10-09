package utils;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RandomUtils {

	public static String x = "abc";
	public static String xx = x+"---ttt";
	/**
	 * ��ȡ����� start - end ��ȡһ��
	 * @param start
	 * @param end
	 * @return
	 */
	public static int getRandom(int start,int end){
		Random rand = new Random();
		int randNum = rand.nextInt(end-start+1)+start;
		return randNum;
	}
	
	/**
	 * ��ȡ��ͬ������ ��Χ��1 - 6��
	 * @param count ��Ҫ��ü�����ͬ������
	 * @return ����
	 */
	public static Object[] getRandomThree(int count) {
	    Random random = new Random();
        Object[] values = new Object[count];
        HashSet<Integer> hashSet = new HashSet<Integer>();
        
        // ����������ֲ�����HashSet
        while(hashSet.size() < values.length){
            hashSet.add(random.nextInt(6) + 1);
        }
        
        values = hashSet.toArray();
        
        // �������鲢��ӡ����
        for(int i = 0;i < values.length;i++){
            System.out.print(values[i] + "\t");
        }
        return values;
	}
	
	public static void getK3XingTai(int[] item) {
		Arrays.sort(item);
		if (item[0] == item[1] && item[1] == item[2]) {
			System.out.println("��ͬ��");
			
		}else if (item[0] == item[1] || item[1] == item[2] || item[0] == item[2]) {
			System.out.println("��ͬ��");
		}else if (item[2] - item[0] == 2) {
			System.out.println("������");
		}else {
			System.out.println("����ͬ��");
		}
		
//		System.out.println(item[0]);
//		System.out.println(item[1]);
//		System.out.println(item[2]);
//		Pattern p=Pattern.compile("(\\d{3})\1"); 
//		Matcher m=p.matcher("678678"); 
//		System.out.println("m.matches()"+m.matches());
	}
}
