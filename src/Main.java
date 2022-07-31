public class Main {
    public static void main(String[] args) {
        //задание 1
        System.out.println("Задание 1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника — " + fullName);
        System.out.println();
        //задание 2
        System.out.println("Задание 2");
        System.out.println(fullName.toUpperCase());
        System.out.println();
        //задание 3
        System.out.println("Задание 3");
        fullName = "Иванов Семён Семёнович";
        System.out.println(fullName.replace("ё", "е"));
        System.out.println();








    }
}