package test6;

//Runtime和Process的简单应用


public class RunTime_ProcessDemo {
    public static void main(String[] args) throws Exception {
        Runtime rt = Runtime.getRuntime( ); // 生成Runtime对象
        System.out.println("Running notepad.exe...");
        Process pr = rt.exec("notepad.exe");
        // 等待进程终止
        int exitValue = pr.waitFor( );
        System.out.println("Stopping notepad.exe...");
        System.out.println("终止值:" + exitValue);
    }
}
