package com.neuedu.rubblishRecycling.client;

import com.neuedu.rubblishRecycling.contreller.UserContreller;
import com.neuedu.rubblishRecycling.entity.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class rubbishRecycle {
    public static void main(String[] args) {
        hazardousRubbish hazardousRubbish = new hazardousRubbish();
        kitchenRubbish kitchenRubbish = new kitchenRubbish();
        recoverableRubbish recoverableRubbish = new recoverableRubbish();
//        kitchenTrashcan kitchenTrashcan = new kitchenTrashcan();
        System.out.println("“山烟涵树色，江水映霞晖”，保护环境人人有责，垃圾分类从你做起，一起来动手来创造美好家园吧！");
        Users users = new Users();
        Scanner sc = new Scanner(System.in);
        UserContreller uc = new UserContreller();
        List<hazardousRubbish> hr = new ArrayList<>();//有害垃圾
        List<kitchenRubbish> kr = new ArrayList<>(); //厨房垃圾
        List<recoverableRubbish> rr = new ArrayList<>();//可回收垃圾
        List<kitchenTrashcan> kt = new ArrayList<>();//厨房垃圾桶
        List<recoverableTrashcan> rt = new ArrayList<>();//可回收垃圾桶
        List<hazardousTrashcan> ht = new ArrayList<>();//有害垃圾桶
//        jump1:
        while (true) {
            System.out.println("欢迎来到：胡海之威试炼");
            System.out.println("输入1注册------输入2登陆------输入9退出");
            int x = sc.nextInt();
            switch (x) {
                case 1:
                    //注册
                    while (true) {
                        System.out.println("注册：请输入用户名");
                        String name = sc.next();
                        System.out.println("注册：请输入密码");
                        int psd = sc.nextInt();
                        String register = uc.register(name, psd);
                        System.out.println(register);
                        if (register.equals("用户已经存在，请重新输入")) {
                            continue;
                        } else {
                            break;
                        }
                    }
                case 2:
                    //登陆
                    System.out.println("登陆：请输入用户名");
                    String name = sc.next();
                    System.out.println("登陆：请输入密码");
                    int psd = sc.nextInt();
                    String login = uc.login(name, psd);
                    System.out.println(login);
                    if (login.equals("登陆失败!请重新输入")) {
                        continue;
                    } else {
                        break;
                    }
                default:
                    System.out.println("输入又误，重新输入");
                    continue;
                case 9:
                    return;
            }
            break;
        }

        System.out.println("欢迎来到胡海之威-试炼");
        System.out.println("------------------");
        System.out.println("“山烟涵树色，江水映霞晖”，保护环境人人有责，垃圾分类从你做起，" +
                "一起来动手来创造美好家园吧！");
        int star = 0;
       while (star != 9){
            System.out.println("输入1进入试炼，开始回收垃圾");
            star = sc.nextInt();
            switch (star){
                case 1:
                    Random r = new Random();
                    int ii = r.nextInt(5);
                    for (int i = 0; i < ii; i++) {
                        int type = r.nextInt(3);

                        System.out.println("系统随机为你分配的垃圾"+(i));
                        if(recoverableRubbish.getType() == type){
                            System.out.println("垃圾类型:"+type+"---"+recoverableRubbish.getName());
                            rr.add(recoverableRubbish);
                        }else if(hazardousRubbish.getType() == type){
                            System.out.println("垃圾类型:"+type+"---"+hazardousRubbish.getName());
                            hr.add(hazardousRubbish);
                        }else if(kitchenRubbish.getType() == type){
                            System.out.println("垃圾类型:"+type+"---"+kitchenRubbish.getName());
                            kr.add(kitchenRubbish);
                        }
                    }
                    break;
                default:
                    System.out.println("输入有误，重新输入");
                    continue;
            }
            break;
        }

        while (true){
           if(kr.size() > 0 || rr.size() >0 || hr.size() > 0){
               System.out.println("====================================");
               System.out.println("附近有三个垃圾桶，分类投放会有积分加成！");
               System.out.println("0:"+new kitchenTrashcan().getName());
               System.out.println("1:"+new recoverableTrashcan().getName());
               System.out.println("2:"+new hazardousTrashcan().getName());
               System.out.println("请选择你要投放的垃圾类型");
               int select = sc.nextInt();
               System.out.println("请选择投放的垃圾桶名称");
               int ljt = sc.nextInt();
               jump:
               switch (select){
                   case 0:
                       if(kr.size()>0){
                           if(ljt==new kitchenTrashcan().getType()){
                               System.out.println("已投放！恭喜你获得1分");
                               users.setIntegral(users.getIntegral()+1);
                               kr.remove(kitchenRubbish);
                               System.out.println("kr容器大小"+kr.size());
                               break jump;
                           }else{
                               System.out.println("未投放！看来你需要重新学习垃圾分类");
                               System.out.println("积分-1");
                               users.setIntegral(users.getIntegral()-1);
                               break jump;
                           }
                       }else {
                           System.out.println("没有该垃圾");
                           continue;
                       }

                   case 1:
                       if(rr.size()>0){
                           if(ljt == new recoverableTrashcan().getType()){
                               System.out.println("已投放！恭喜你获得1分");
                               users.setIntegral(users.getIntegral()+1);
                               rr.remove(recoverableRubbish);
                               System.out.println("rr容器大小"+rr.size());
                               break jump;
                           }else{
                               System.out.println("已投放！看来你需要重新学习垃圾分类");
                               System.out.println("积分-1");
                               users.setIntegral(users.getIntegral()-1);
                               break jump;
                           }
                       }else {
                           System.out.println("没有该垃圾");
                           continue;
                       }

                   case 2:
                       if(hr.size()>0){
                           if(ljt == new hazardousTrashcan().getType()){
                               System.out.println("已投放！恭喜你获得1分");
                               users.setIntegral(users.getIntegral()+1);
                               hr.remove(hazardousRubbish);
                               System.out.println("hr容器大小"+hr.size());
                               break jump;
                           }else{
                               System.out.println("已投放！看来你需要重新学习垃圾分类");
                               System.out.println("积分-1");
                               users.setIntegral(users.getIntegral()-1);
                               break jump;
                           }
                       }else {
                           System.out.println("没有该垃圾");
                           continue;
                       }
                   default:
                       System.out.println("输入有误，重新输入");
                       continue;
               }
           }else {
               if(users.getIntegral() == 1){
                   users.setChenghao("小垃圾");
               }else if(users.getIntegral() ==2 ){
                   users.setChenghao("垃圾学徒");
               }else if(users.getIntegral() == 3){
                   users.setChenghao("垃圾大师");
               }else if(users.getIntegral() > 3){
                   users.setChenghao("垃圾大使");
               }else {
                   users.setChenghao("垃圾");
               }
               System.out.println("垃圾已经全部分类");
               System.out.println("您已获得称号"+ users.getChenghao());
               return;
           }
        }
    }

}
