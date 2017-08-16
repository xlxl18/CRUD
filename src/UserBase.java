
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

public class UserBase {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static ArrayList<User> list = new ArrayList<User>();

    private static void  createUser()  {
        try {
            String name, surname, login, password, number;
            System.out.println("Введите имя:");
            name = reader.readLine();
            System.out.println("Введите фамилию:");
            surname = reader.readLine();
            System.out.println("Введите номер телефона:");
            number = reader.readLine();
            System.out.println("Введите логин:");
            login = reader.readLine();
            System.out.println("Введите пароль:");
            password = reader.readLine();
            User user = new User(name, surname, number, login, password);
            list.add(user);
            System.out.print("Пользователь: ");
            System.out.print(user.getName());
            System.out.println(" успешно создан");
        }

        catch (IOException e){
        System.out.println("Упс! Ошибочка!");
        }

    }


    private static void viewUser() {
        for (User user : list) {
            System.out.println("Пользователь" + user.getName());
            System.out.println("Имя: " + user.getName());
            System.out.println("Фамилия: " + user.getSurname());
            System.out.println("Номер: " + user.getNumber());
            System.out.println("Логин: " + user.getLogin());
            System.out.println("Пароль: " + user.getPassword());
        }
    }

    private static void removeUser() {
        try {
            System.out.println("Введите имя пользователя, которого хотите удалить.");
            String nameForDelete = reader.readLine();
            for (Iterator<User> iterator = list.iterator(); iterator.hasNext(); )
                if (iterator.next().getName().equals(nameForDelete)) iterator.remove();
        }

        catch (IOException e) {
        System.out.println("Упс! Ошибочка!");
        }
    }

    private static void modifyUser(){
        try {
            System.out.println("Введите имя пользователя, которого хотите редактировать.");
            String nameForModify = reader.readLine();
            for (User user : list) {
                if (nameForModify.equals(object.getName())) {
                    System.out.println("Введите имя:");
                    object.setName(reader.readLine());
                    System.out.println("Введите фамилию:");
                    object.setSurname(reader.readLine());
                    System.out.println("Введите номер телефона:");
                    object.setNumber(reader.readLine());
                    System.out.println("Введите логин:");
                    object.setLogin(reader.readLine());
                    System.out.println("Введите пароль:");
                    object.setPassword(reader.readLine());

                }
            }
        }
        catch(IOException e){
        System.out.println("Упс! Ошибочка!");
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean flag = true;
        while (flag = true) {
            System.out.println("Добрый день, добро пожаловать в мою программу.\n Что вы хотите сделать?\n1.Создать пользователя;\n2.Просмотреть всех пользователей;\n3.Удалить пользователя;\n4.Изменить пользователя;\n5.Выйти из программы.");
            try {
                int answer = Integer.parseInt(reader.readLine());

                switch (answer) {
                    case 1:
                        createUser();
                        break;
                    case 2:
                        viewUser();
                        break;
                    case 3:
                        removeUser();
                        break;
                    case 4:
                        modifyUser();
                        break;
                    case 5:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Вы ввели неправильный номер команды. Пожалуйста попробуйте еще раз!");
                        flag=false;
                }
            }
            catch(NumberFormatException e){
                System.out.println("Ты дебил! И ввел не то!");
            }
        }
    }
}
