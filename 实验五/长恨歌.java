package experiment_5;

import java.util.Scanner;
import java.io.*;

public class 长恨歌 {
    public static String str1 = "";

    public static void word_part(String str, int num) {
        int index = 0;
        try {
            while (index != str.length()) {
                if (index % 2 == 0) {
                    str1 += str.substring(index, index + num) + ",";
                    index += num;
                }
                if (index % 2 == 1) {
                    str1 += str.substring(index, index + num) + "。" + "\n";
                    index += num;
                }
            }
            System.out.println(str1);
        } catch (IndexOutOfBoundsException Io) {
            System.out.println("字符串总字数除不尽");
        }
    }

    public static void word_count(String str, String str1) {
        int count = 0;
        int index = 0;

        while ((index = str.indexOf(str1)) != -1) {
            index = index + str1.length();
            str = str.substring(index, str.length());
            count++;
        }
        System.out.println("'" + str1 + "'" + "出现的次数为：" + count);
    }

    public static void file_write(String str, String dizhi) {
        FileWriter writer;
        try {
            writer = new FileWriter(dizhi);
            writer.write(str);
            writer.flush();
            writer.close();
        } catch (Exception e) {
            System.out.println("有错误");
        }
    }

    public static void main(String[] args) {
        String str = "汉皇重色思倾国御宇多年求不得杨家有女初长成养在深闺人未识天生丽质难自弃一朝选在君王侧回眸一笑百媚生六宫粉黛无颜色春寒赐浴华清池温泉水滑洗凝脂侍儿扶起娇无力始是新承恩泽时云鬓花颜金步摇芙蓉帐暖度春宵春宵苦短日高起从此君王不早朝承欢侍宴无闲暇春从春游夜专夜后宫佳丽三千人三千宠爱在一身金屋妆成娇侍夜玉楼宴罢醉和春姊妹弟兄皆列士可怜光采生门户遂令天下父母心不重生男重生女骊宫高处入青云仙乐风飘处处闻缓歌慢舞凝丝竹尽日君王看不足渔阳鼙鼓动地来惊破霓裳羽衣曲九重城阙烟尘生千乘万骑西南行";
        word_part(str, 7);
        Scanner input = new Scanner(System.in);
        String w = input.next();
        word_count(str, w);
        // System.out.println(str1);
        file_write(str1, "E:\\FirstJava\\src\\experiment_5\\长恨歌.txt");
    }
}
