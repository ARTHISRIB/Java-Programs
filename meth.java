import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        System.out.println("Enter the task:");
       Scanner sc=new Scanner(System.in);
         String task=sc.nextLine();
         todolist x = new todolist();
         x.todo(task);
    }
}
class todolist{
    void todo(String task){
        if(task.isBlank()){
            System.out.println("Task is not entered");
            return;
        }
        else{
            System.out.println("Task is added to the list");
        System.out.println("Task added: " + task);
    }
}
}
