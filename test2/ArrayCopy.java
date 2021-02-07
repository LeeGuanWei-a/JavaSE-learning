package test2;//数组的拷贝,删除，指定位置索引删除，数组扩容

import java.util.Arrays;

public class ArrayCopy {
    public static void main(String[] args) {
        arrayCopy();
        System.out.println("######### " );
        arrayDelete();
        System.out.println("######### " );
        String[] s ={"赵","钱","孙","李","周","吴","郑","王"};
        removeElement(s,1);
        System.out.println("######### " );
        s = extendRange(s);
    }

    //数组的拷贝
    public static void arrayCopy(){
        String[] a = {"aa","bb","cc","dd","ee"};
        String[] b = new String[10];
        System.arraycopy(a,0,b,0,5);

        for (int i= 0;i < b.length;i++){
            System.out.println(i+"= " + b[i]);
        }
    }

    //数组内容删除
    public static void arrayDelete(){
        String[] a = {"aa","bb","cc","dd","ee"};

        System.arraycopy(a,3,a,3-1,a.length-3);
        a[a.length-1] = null;

        for (int i= 0;i < a.length;i++){
            System.out.println(i+"= " + a[i]);
        }
    }

    //删除数组中的指定位置的索引元素，并将原数组返回
    public static String[] removeElement(String[] s,int index){
        System.arraycopy(s,index+1,s,index,s.length-index-1);
        s[s.length-1] = null;
        for (int i= 0;i < s.length;i++){
            System.out.println(i+"= " + s[i]);
        }
        return s;
    }

    //数组的扩容
    public static String[] extendRange(String[] s1){
        //String[] s1 ={"a","b","c"};

        String[] s2 = new String[s1.length+10];

        System.arraycopy(s1,0,s2,0,s1.length);

        for (String temp:s2){
            System.out.println(temp);
        }
        return s2;
    }

}
