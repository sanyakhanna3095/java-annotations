package com.bridgelabz.basicProblems;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface TaskInfo {
    String priority();
    String assignedTo();
}


class TaskManager {

    @TaskInfo(priority = "High", assignedTo = "Sanya")
    public void completeReport() {
        System.out.println("Completing report");
    }

    @TaskInfo(priority = "Low", assignedTo = "Sehaj")
    public void archiveFiles() {
        System.out.println("Archiving files");
    }
}


public class CustomAnnotation {
    public static void main(String[] args) {
        Class<TaskManager> cls = TaskManager.class;

        for (Method method : cls.getDeclaredMethods()) {
            if (method.isAnnotationPresent(TaskInfo.class)) {
                TaskInfo task = method.getAnnotation(TaskInfo.class);
                System.out.println("Method: " + method.getName());
                System.out.println("Priority: " + task.priority());
                System.out.println("Assigned To: " + task.assignedTo());
                System.out.println();
            }
        }
    }
}
