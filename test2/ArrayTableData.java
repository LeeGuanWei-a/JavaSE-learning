package test2;//Arrays数组存储表格数据


import java.util.Arrays;

public class ArrayTableData {
    public static void main(String[] args) {
        Object[] emp1 = {1001,"李观伟",22};
        Object[] emp2 = {1002,"张三",18};
        Object[] emp3 = {1003,"李四",20};

        Object[][] tableData = new Object[3][];
        tableData[0] = emp1;
        tableData[1] = emp2;
        tableData[2] = emp3;

        for (Object[] temp:tableData){
            System.out.println(Arrays.toString(temp));
        }


    }
}
