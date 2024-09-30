package org.Lesson303_5.Loops_Itteration;
/*
for loop structure: looks like C

for (initialize action; continuation-condition; after-iteration-action){
    //loop body
    statement(s);
}
 */
public class forLoopOne {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 1; i <= n; ++i) {
            System.out.println("Java is fun!");
        }
    }
}
