package org.Lesson303_3_1.JavaStringMethods;

public class stringsCompared_EqualsMethod {
    public static void main(String args[]){
        String s1="PerScholas";
        String s2="PerScholas";
        String s3=new String("PerScholas");
        String s4="Teksystem";

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s4));
    }
}
