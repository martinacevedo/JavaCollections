package com.collections;

import java.util.Map;
import java.util.HashMap;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public final class App {
    private App() {
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
        //testMap();
        //testStack();
        testQueue();
    }

    private static void testQueue() {
        Queue<Integer> q = new LinkedList<>();
        
        for (int i = 0; i < 23; i++) {
            q.add(i);
        }

        while (!q.isEmpty()) {
            int i = q.poll();
            System.out.print(i + " ");
        }
    }

    private static void testStack() {
        Stack<Integer> stack = new Stack<Integer>(); 
    
        stack.push(1);
        stack.push(2);
        stack.push(3);
        while (!stack.isEmpty()) {
            int i = stack.pop();
            System.out.println(i);
        }
    }

    private static void testMap() {
        Map<String, String> m = new HashMap<>();
        m.put("2", "222");
        m.put("1", "111");
        System.out.println(m);
    }
   
}
