package com.test1;

import static org.junit.jupiter.api.Assertions.fail;

import java.util.ResourceBundle;

import org.junit.jupiter.api.Test;

class Demo1 {

	@Test
	void test() {
		fail("Not yet implemented");
	}	

	@Test
	public void test1() {
		//现在有100元，要买100只鸡，公鸡5元一只，母鸡3元一只，小鸡1元三只，求公鸡，母鸡，小鸡各几只
    	int gongji = 0;
    	int muji = 0;
    	int xiaoji = 0;
    	for(gongji = 0;gongji <= 20;gongji++) {
    		for (muji = 0; muji < 33; muji++) {
				xiaoji = 100 - gongji - muji;
				if((gongji * 5 + muji * 3 + xiaoji/3 == 100) && (gongji + muji + xiaoji == 100) && (xiaoji % 3 == 0)) {
					System.out.println("gongji=" + gongji + ",muji=" + muji + ",xiaoji="+xiaoji);
				}
			}
    	}
	}
	
	@Test
	public void test2() {
		int[] array = new int[] {44,12,-10,-8,22,100,0,-11};
		for (int i = 0; i < array.length; i++) {
			int t = i;
			for (int j = i; j <= array.length-1; j++) {
				if(array[t]>array[j]) {
					t = j;
				}
			}
			if(t != i) {
				int temp = array[t];
				array[t] = array[i];
				array[i] = temp;
			}
		}
		System.out.println();
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
	
	//输入两个正整数m和n，求其最大公约数和最小公倍数  
	@Test
	public void test3() {
		int m = 9;
		int n = 36;
		int max = m > n ? m : n;
		int min = m < n ? m : n;
		for (int i = min; i > 1; i--) {
			if((m % i == 0) && (n % i == 0)) {
				System.out.println(i);
				break;
			}
		}
		for (int j = max; j < m * n; j++) {
			if((j % m == 0) && (j % n == 0)) {
				System.out.println(j);
				break;
			}
		}
	}
	
	//一个数组，让数组的每个元素去除第一个元素，得到的商作为被除数所在位置的新值
	@Test
	public void test4() {
		int[] arr = new int[]{12,43,65,3,-8,64,2};
		for (int i = arr.length-1; i >= 0; i--) {
			arr[i] = arr[i]/arr[0];
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	@Test
	public void test5() {
		String str = "<img src=''/>,<img src=''/>,<img src=''/>,<img src=''/>";
		System.out.println(str.split(",").length);
		String[] strArr = str.split(",");
		for (int i = 0; i < strArr.length; i++) {
			System.out.println(strArr[i]);
		}
	}
}
