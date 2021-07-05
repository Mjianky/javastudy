package com.maojianguo.javase.exception.homework;

import java.util.Scanner;

/*
* 编写程序模拟用户注册：
1、程序开始执行时，提示用户输入“用户名”和“密码”信息。
2、输入信息之后，后台java程序模拟用户注册。
3、注册时用户名要求长度在[6-14]之间，小于或者大于都表示异常。

注意：
	完成注册的方法放到一个单独的类中。
	异常类自定义即可。

	class UserService {
		public void register(String username,String password){
			//这个方法中完成注册！
		}
	}

	编写main方法，在main方法中接收用户输入的信息，在main方法
	中调用UserService的register方法完成注册。*/
public class UserService {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("UerName:");
        String userName = s.nextLine();
        System.out.print("Password:");
        String passWord = s.nextLine();
        try {
            register(userName, passWord);
        } catch (RegisterException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void register(String userName, String password) throws RegisterException {
        if (userName.length() < 6)
            throw new RegisterException("用户名不得小于6个字符");
        else if (userName.length() > 14)
            throw new RegisterException("用户名不得大于14个字符");
        System.out.println("注册成功");
    }
}
