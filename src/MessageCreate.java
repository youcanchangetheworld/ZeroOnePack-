import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class MessageCreate {
    public MessageCreate() {
        Random random = new Random();
        FileWriter writer = null;
        try {
            writer = new FileWriter("ZeroOne/src/message",false);
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入物品个数：");
            String num = sc.next();
            writer.write("物品个数="+num+"\n");
            System.out.println("请输入背包空间：");
            String kongjian = sc.next();
            writer.write("背包容量="+kongjian+"\n");
            for (int i = 1; i < 101; i++) {
                int zhiliang = random.nextInt(4)+1;
                String s = "第" + i + "个物品的质量="+zhiliang;
                writer.write(s+"\n");
                int jiazhi = random.nextInt(200)+1;
                writer.write("第"+i+"个物品的价值="+jiazhi+"\n");
            }
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (writer != null){
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
