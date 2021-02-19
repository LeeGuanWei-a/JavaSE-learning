package test6;

//用同步方法实现线程同步

public class SynMethodBank extends Thread {
    // 银行账户
    private BankAccountSynMethod account;
    // 操作金额，正数为存钱，负数为取钱
    private double money;
    public SynMethodBank(String name, BankAccountSynMethod account, double money) {
        super(name);
        this.account = account;
        this.money = money;
    }
    // 线程任务
    public void run( ) {
        //调用account对象的同步方法
        this.account.access(money);
    }

    public static void main(String[] args) {
        // 创建一个银行账户实例
        BankAccountSynMethod myAccount = new BankAccountSynMethod("60001002", 5000);
        System.out.println("银行账户瑞有资金：" + myAccount.getBalance());
        // 创建多个线程，对账户进行存取钱操作
        SynMethodBank t1 = new SynMethodBank("T001", myAccount, -3000);
        SynMethodBank t2 = new SynMethodBank("T002", myAccount, -3000);
        SynMethodBank t3 = new SynMethodBank("T003", myAccount, 1000);
        SynMethodBank t4 = new SynMethodBank("T004", myAccount, -2000);
        SynMethodBank t5 = new SynMethodBank("T005", myAccount, 2000);
        // 启动线程
        t1.start( );
        t2.start( );
        t3.start( );
        t4.start( );
        t5.start( );
        // 等待所有子线程完成
        try {
            t1.join( );
            t2.join( );
            t3.join( );
            t4.join( );
            t5.join( );
        } catch (InterruptedException e) {
            e.printStackTrace( );
        }
        // 输出账户信息
        System.out.println("账号：" + myAccount.getBankNo( ) + ", 余额："+ myAccount.getBalance( ));
    }
}


class BankAccountSynMethod {
    // 银行账号
    private String bankNo;
    // 银行余额
    private double balance;
    // 构造方法
    public BankAccountSynMethod(String bankNo, double balance) {
        this.bankNo = bankNo;
        this.balance = balance;
    }
    // 同步方法,存取钱操作
    public synchronized void access(double money) {
        // 如果操作的金额money<0,则代表取钱操作,同时判断账户金额是否低于取钱金额
        if (money < 0 && balance < -money) {
            System.out.println(money+","+Thread.currentThread( ).getName( ) + "操作失败，余额不足！");
            // 返回
            return;
        } else {
            // 对账户金额进行操作
            balance += money;
            System.out.println(money+","+Thread.currentThread( ).getName( )
                    + "操作成功，目前账户余额为：" + balance);
            try {
                // 休眠100毫秒
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace( );
            }
        }
    }
    // getter/setter方法
    public String getBankNo( ) {
        return bankNo;
    }
    public void setBankNo(String bankNo) {
        this.bankNo = bankNo;
    }
    public double getBalance( ) {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
}
