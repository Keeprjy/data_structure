package Java_Test;

import JavaChallenge.myString7;

public class Java_Test7 {

	public static void main(String[] args) {
		myString7 str1 = new myString7("Hello Javakkkkk,");
		myString7 str2 = new myString7("Hello Java,");
		//isEmpty
		System.out.println("1. isEmpty()的输出结果 = " + str1.isEmpty());
		//length（）
		str1.length();
		System.out.println("2. 长度" + str1.length());
		//charAt()
		System.out.println("3. charAt()测试第9位是 = " + str1.charAt(9));
		
		
		//CompareTo();
		int result = str1.compareTo(str2);
		System.out.println("4. compareTo测试，str1与str2差多少字节 = " + result);
//////////////		//CompareToIgnoreCase()
		int result2 = str1.compareToIgnoreCase(str2);
		System.out.println("5. compareToIgnoreCase测试，str1与str2差多少字节 = " + result2);
		
		
		//toString
		System.out.println("6. toString测试 = " + str1.toString());
		
		//indexOf
		System.out.println("7.1 indexOf测试 当ch = 3 时" + str1.indexOf(3));
		
		
		
		
		
		
		System.out.println("str1 str2 地址值是否相等" + (str1 == str2)); //判断字符串是否相等
		System.out.println("str1 str2 内容是否相等？" + (str1.equals(str2)));//判断俩字符串内容是否相等
		
		myString7 str3 = new myString7("Hello World,");
		System.out.println(str3.concat(str1));//字符串拼接
		System.out.println(str3.concat(str1).concat(str2));//字符串连续拼接
		
		System.out.println(str3.startsWith(new myString7("Hello")));//判断字符串是否已经Hello开头
		System.out.println(str3.startsWith(new myString7("Hello1")));//判断字符串是否已经Hello1开发
		
		System.out.println(new myString7("字符串变小写： I am a java Programmer. I Love Java").toLowerCase());//字符串变小写
		System.out.println(new myString7("字符串变大写： I am a java programmer. I love Java").toUpperCase());//字符串变大写
		
		System.out.println("***************************************************************************************************");
		

	}

}
