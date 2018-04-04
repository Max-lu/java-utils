package cn.maxlu.test;

import java.util.Arrays;

public class StringTest {
    public static void main(String[] args) {
        //四个反斜杠在字符串中表示两个斜杠
        //split 方法实际上是使用正则来匹配，在正则中两个反斜杠表示一个斜杠
        //所以在这里需要使用四个反斜杠
        String[] split = "hello\\world".split("\\\\");
        System.out.println(Arrays.toString(split));
    }
}
