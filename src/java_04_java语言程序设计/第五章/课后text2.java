package java_04_java语言程序设计.第五章;

/**5.7
 * ( 财务应用程序 ： 计算将来的学费 ） 假设今年某大学的学费为 10 000 美元 ， 学费的年增长率为 5 % 。
 — 年后 ， 学费将是 10 500 美元 。 编写程序 ， 计算丨 0 年后的学费 . 以及从现在开始的丨 0 年后算
 起 ， 4 年内总学费是多少 ？
 */
public class 课后text2 {
    public static void main(String[] args){
        double money=10000;
        for(int i=0;i<10;i++)
            money=money*(1+0.05);
        System.out.printf("10年后的学费为：%.2f\n",money);
        double sum=0;
        for(int i=0;i<4;i++){
            sum=sum+money;
            money=money*(1+0.05);
        }
        System.out.printf("从现在开始的十年后算起，4年内总学费为：%.2f",sum);
    }
}
