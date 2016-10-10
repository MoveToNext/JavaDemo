package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
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
		File file = new File("F:/ddd");
		File file2 = new File("D:/3.txt");
		FileUitls.reName(file);
	}
}
