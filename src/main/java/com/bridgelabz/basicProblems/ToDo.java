package com.bridgelabz.basicProblems;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface ToDoList{
    String task();
    String assignedTo();
    String priority() default "MEDIUM";
}


class PendingTasks{
    @ToDoList(task = "Implement add to list functionality", assignedTo = "Sanya", priority = "HIGH")
    public void addTask(){
        System.out.println("Add functionality pending");
    }

    @ToDoList(task = "Implement view pending tasks functionality", assignedTo = "Sanya")
    public void getTask() {
        System.out.println("View tasks functionality incomplete!");
    }
}


public class ToDo{
    public static void main(String[] args) throws Exception {
        PendingTasks pending=new PendingTasks();
        Class<?> cls=pending.getClass();
        System.out.println("Pending tasks: ");

        Method m1=cls.getDeclaredMethod("addTask");
        if(m1.isAnnotationPresent(ToDoList.class)){
            ToDoList annotation=m1.getAnnotation(ToDoList.class);
            System.out.println("Method: " + m1.getName() + "\nTask: " + annotation.task() + "\nAssigned To: " + annotation.assignedTo() + "\nPriority: " + annotation.priority());
            pending.addTask();
        }

        Method m2=cls.getDeclaredMethod("getTask");
        if(m1.isAnnotationPresent(ToDoList.class)){
            ToDoList annotation=m2.getAnnotation(ToDoList.class);
            System.out.println("Method: " + m2.getName() + "\nTask: " + annotation.task() + "\nAssigned To: " + annotation.assignedTo() + "\nPriority: " + annotation.priority());
            pending.getTask();
        }

    }
}
