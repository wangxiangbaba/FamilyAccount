package com.company;

public class FamilyAccount {

    public static void main(String[] args) {
        // write your code here
        boolean isFlag=true;
        String details="收入\t\t\t\t\t\t账户余额\t\t\t\t\t\t收支金额\t\t\t\t\t\t说明\n";/**用于记录用户的收入的支出详情*/
        int balance=10000;
        while(isFlag){
            System.out.println("--------家庭收支记账软件--------\n");
            System.out.println("          1.收支明细\n");
            System.out.println("          2.登记收入\n");
            System.out.println("          3.登记支出\n");
            System.out.println("          4.退出   \n");
            System.out.println("          请选择（1~4）\n");
            /**获取用户的选择*/
            char selection=Utility.readMenuSelection();
            switch (selection){
                case '1':
                    System.out.println("--------1.收支明细--------");
                    System.out.println(details);
                    System.out.println("-------------------------------------------------------------------------------------------------\n");
                    break;
                case '2':
                    System.out.println(" --------2.登记收入--------");
                    System.out.print(" 本次收入金额：");
                    int money=Utility.readNumber();
                    System.out.print(" 本次收入说明：");
                    String info1 =   Utility.readString();
                    balance +=  money;
                    details +=  ("收入\t\t\t\t\t\t"+balance+"\t\t\t\t\t\t"+money+"\t\t\t\t\t"+"\t"+info1+"\n");
                    System.out.println("--------登记完成--------");
                    break;
                case '3':
                    System.out.println("--------3.登记支出--------");
                    System.out.print(" 本次支出金额：");
                    int outMoney=Utility.readNumber();
                    System.out.print(" 本次支出说明：");
                    String info2 =   Utility.readString();
                    if(balance>=outMoney){
                        balance-=outMoney;
                    }   else{
                        System.out.print("支出超出账户额度，支付失败");
                    }
                    details +=  ("支出\t\t\t\t\t\t"+balance+"\t\t\t\t\t\t"+outMoney+"\t\t\t\t\t"+"\t"+info2+"\n");
                    System.out.println("--------登记完成--------");

                    break;
                case '4':
                    //System.out.println("          请选择（1~4）");
                    System.out.println("确认是否退出(Y/N)\n");
                    char isExit=Utility.readConfirmSelection();
                    if(isExit=='Y'){
                        isFlag=false;
                    }
            }
        }
    }
}
