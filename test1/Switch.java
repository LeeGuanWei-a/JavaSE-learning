package test1;//switch语句的使用
//多值判断建议使用switch语句，但是也可以用if-else if-else语句

import java.util.Arrays;

public class Switch {
    public static void main(String[] args) {
        int month=(int)(1+12*Math.random());        //计算【1,12】的随机数
        System.out.println("月份： " + month);
        switch (month){
        case 1:
            System.out.println("一月份 " );
            break;                                  //switch语句要到一个break才结束运行
            //break;                                //如果不写break;则当month=1时，显示一月份，二月份
        case 2:
            System.out.println("二月份 " );
            break;
        case 3:
            System.out.println("三月份 " );
            break;
        case 4:
            System.out.println("四月份 " );
            break;
        case 5:
            System.out.println("五月份 " );
            break;
        case 6:
            System.out.println("六月份 " );
            break;
        case 7:
            System.out.println("七月份 " );
            break;
        default:
            System.out.println("其他月份 " );
            break;
        }
        System.out.println("##################################### " );

        char a='a';
        int rand=(int)(26*Math.random());
        char b=(char)(a+rand);
        System.out.println(b+" 是");
        switch (b){
            case 'a':                           //多个case可以表示为同一个结果
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("元音字母 " );
                break;
            case 'y':
            case 'w':
                System.out.println("半元音字母 " );
                break;
            default:
                System.out.println("辅音字母 "  );

        }

    }
}
