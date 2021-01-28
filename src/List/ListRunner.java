package List;

import java.util.Scanner;

public class ListRunner {

    public static void main(String[] args) {
        ToDoList list = new ToDoList();
        printOut();
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        while (number != 0){

            switch (number){
                case 1 :
                    System.out.println("Введите задачу, которую нужно добавить");
                    scan.nextLine();
                    String task1 = scan.nextLine();
                    list.addToList(task1);
                    System.out.println("Выберите, что хотите дальше сделать");
                    number = scan.nextInt();

                    break;
                case 2 :
                    list.printToDoList();
                    System.out.println("Выберите, что хотите дальше сделать");
                    number = scan.nextInt();

                    break;
                case 3 :
                    System.out.println("Введите задачу, которую нужно обновить");
                    scan.nextLine();
                    String task3 = scan.nextLine();
                    System.out.println("Введите номер задачи");
                    int numb = scan.nextInt();
                    list.changeTask(numb, task3);
                    System.out.println("Выберите, что хотите дальше сделать");
                    number = scan.nextInt();

                    break;
                case 4 :
                    System.out.println("введите задание которое нужно удалить");
                    String str4 = scan.nextLine();
                    list.removeTask(str4);
                    System.out.println("Выберите, что хотите дальше сделать");
                    number = scan.nextInt();

                    break;
                case 5 :
                    System.out.println("введите таск, чтобы уыидеть приоритет");
                    scan.nextLine();
                    String str5 = scan.nextLine();
                    System.out.println(list.getTaskPriority(str5));
                    System.out.println("Выберите, что хотите дальше сделать");
                    number = scan.nextInt();

                    break;
                case 6 :
                    System.out.println("введите номер позиции и задание");
                    int numb6 = scan.nextInt();
                    String str6 = scan.nextLine();
                    list.changeTask(numb6, str6);
                    System.out.println("Выберите, что хотите дальше сделать");
                    number = scan.nextInt();
                    break;
                default:
                    System.out.println("Вы ввели неверное число");
                    break;
            }
        }

    }

    private static void printOut(){
        System.out.println("Введите число, чтобы получить результат: \n"
                + " 1 добавить новое задание в todolist\n"
                + "2 вывести все задания\n"
                + "3 обновить задание\n"
                + "4 удалить задание из списка\n"
                + " 5 показать приоритет таска в листе\n"
                + " 6 добавить задание на конкретную позицию\n"
                + " 0 выход");
    }
}
