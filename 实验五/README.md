# 实验五 古诗词文本处理

#### 实验目的

1.掌握字符串String及其常用方法的使用

2.掌握输入输出流的使用

#### 业务要求

1.每7个汉字加入一个标点符号，奇数时加“，”，偶数时加“。”；

2.允许提供输入参数，统计古诗中某个字或词出现的次数。


#### 设计思路

1.对所给的长字符串进行每七个字划分，然后进行标点操作

2.统计字符串内指定的字或词

3.将处理后的诗词写入TXT文件

#### 关键代码

1. 标点操作

```
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
```
2.统计操作

```
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
```

3.文件写入操作

```
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
```

#### 流程图
![输入图片说明](%E6%B5%81%E7%A8%8B%E5%9B%BE.png)


#### 实验结果
![输入图片说明](%E5%AE%9E%E9%AA%8C%E7%BB%93%E6%9E%9C.png)

#### 感想与体会
通过本次实验掌握了字符串String及其常用方法的使用。程序中主要运用了StringBuffer的insert、setCharAt、indexOf知识点，重要的是需要在程序中一次次的去实验，得到想要的结果。遇到的唯一困难是indexOf这个知识点，之后很快就解决了问题。本次实验让我理解了许多String的知识点，希望在接下来的学习中能够熟练使用。