public class Human {

    String name;
    String town;
    int yearOfBirth;
    String job;

    Human (String name, String town, int yearOfBirth, String job) {

        // Проверка дня рождения на отрицательное значение
        if (yearOfBirth > 0) {
            this.yearOfBirth = yearOfBirth;
        } else {
            this.yearOfBirth = 0;
        }

        // Если не указано имя
        if ((name == null || name.length() == 0)) {
            this.name = "_Информация не указана_";
        } else {
            this.name = name;
        }

        // Если не указан город проживания
        if ((town == null || town.length() == 0)) {
            this.town = "_Информация не указана_";
        } else {
            this.town = town;
        }

        // Если не указана должность
        if ((job == null || job.length() == 0)) {
            this.job = "[ Информация не указана ]";
        } else {
            this.job = job;
        }

    }

    void printHuman() {

            System.out.println("Привет! Меня зовут " + name + ".\n" +
                    "Я из города " + town + ".\n" +
                    "Мне " + yearOfBirth + " лет.\n" +
                    "Работаю на должности - " + job + ".\nБудем знакомы!");
        System.out.println("-----------------------------------------------------------");
    }

}