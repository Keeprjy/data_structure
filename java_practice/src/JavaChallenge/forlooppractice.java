package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class forlooppractice {
	public long Factorial(long n) {
		if(n == 0) return 1;
		else return n * Factorial(n - 1);
	}
	
	public int dpFactorial(int n) {
		int res = 1;
		List<Integer> nums = new ArrayList<>();
		for(int i =0; i <= n; i++) {
			nums.add(0);
		}
		for(int i = 1; i <= n; i++) {
			res = res * i;
			nums.set(i, res);
		}
		System.out.println("nums = " + nums);
		return nums.get(n);
	}
	
	public long Fib(long n) {
		if(n <= 1) return n;
		else return Fib(n -1) + Fib(n - 2);
	}
	
	public int CalculateFibonacci(int n) {
	    int dp[] = new int[n + 1];
	    dp[0] = 0;
	    dp[1] = 1;
	    for (int i = 2; i <= n; i++) {
	        dp[i] = dp[i - 1] + dp[i - 2];
	    }
	    return dp[n];
  }
	
	
	
    public boolean setWay(int[][] map,int i,int j){
        if(map[6][5]==2){
            return true;
        }else{
            if(map[i][j]==0){
                map[i][j]=2;//假设该点可以走通
                if(setWay(map,i+1,j)){//向下走
                    return true;
                }else if(setWay(map,i,j+1)){//向右走
                    return true;
                }else if(setWay(map,i-1,j)){//向上走
                    return true;
                }else if(setWay(map,i,j-1)){//向左走
                    return true;
                }else{
                    //该点走不通，为死路
                    map[i][j]=3;
                    return false;
                }
            }else{//map[i][j]!=0
                return false;
            }
        }
    }
    
    

	public static void main(String[] args) {
		forlooppractice t = new forlooppractice();
		System.out.println(t.Factorial(9));
		System.out.println(t.Fib(6));
		System.out.println(t.dpFactorial(9));
		System.out.println(t.CalculateFibonacci(9));
		
        //使用数组代替迷宫
        int[][] map = new int[8][7];
        //初始化map
        for (int i = 0; i < 7; i++) {
            map[0][i]=1;
            map[7][i]=1;
        }
        for (int i = 0; i < 8; i++) {
            map[i][0]=1;
            map[i][6]=1;
        }
        map[3][1]=1;
        map[3][2]=1;
        //调用小球探路的方法
        t.setWay(map,1,1);
        //打印地图
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(map[i][j]+" ");
            }
            System.out.println();
        }
		
	}

}

 