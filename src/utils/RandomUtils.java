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
	 * 获取随机数 start - end 获取一个
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
	 * 获取不同的数字 范围（1 - 6）
	 * @param count 需要获得几个不同的数字
	 * @return 数组
	 */
	public static Object[] getRandomThree(int count) {
	    Random random = new Random();
        Object[] values = new Object[count];
        HashSet<Integer> hashSet = new HashSet<Integer>();
        
        // 生成随机数字并存入HashSet
        while(hashSet.size() < values.length){
            hashSet.add(random.nextInt(6) + 1);
        }
        
        values = hashSet.toArray();
        
        // 遍历数组并打印数据
        for(int i = 0;i < values.length;i++){
            System.out.print(values[i] + "\t");
        }
        return values;
	}
	
	public static void getK3XingTai(int[] item) {
		Arrays.sort(item);
		if (item[0] == item[1] && item[1] == item[2]) {
			System.out.println("三同号");
			
		}else if (item[0] == item[1] || item[1] == item[2] || item[0] == item[2]) {
			System.out.println("二同号");
		}else if (item[2] - item[0] == 2) {
			System.out.println("三连号");
		}else {
			System.out.println("三不同号");
		}
		
//		System.out.println(item[0]);
//		System.out.println(item[1]);
//		System.out.println(item[2]);
//		Pattern p=Pattern.compile("(\\d{3})\1"); 
//		Matcher m=p.matcher("678678"); 
//		System.out.println("m.matches()"+m.matches());
	}
}
