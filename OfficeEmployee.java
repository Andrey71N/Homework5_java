package lesson5;

public class OfficeEmployee {

    String Fullname;
    String jobtitle;
    String email;
    String telephone;
    int salary;
    int age;




}



    class OfficeEmployeeAccounting{



        public static void main(String[] args) {


            OfficeEmployee employee1 = new OfficeEmployee();

            employee1.Fullname = "Petrov Ilya Sergeevich";
            employee1.jobtitle = "GM";
            employee1.email = "rhhhhjy@gmail.com";
            employee1.telephone = "+7_989_506_23_13";
            employee1.salary = 300_000;
            employee1.age = 52;








            OfficeEmployee employee2 = new OfficeEmployee();

            employee2.Fullname = "Shadow Irina Vladimirovna";
            employee2.jobtitle = "Engineer";
            employee2.email = "EgTop@gmail.com";
            employee2.telephone = "+7_907_536_43_13";
            employee2.salary = 100_000;
            employee2.age = 42;




            OfficeEmployee employee3 = new OfficeEmployee();

            employee3.Fullname = "Poletov Igor Sergeevich ";
            employee3.jobtitle = "Manager";
            employee3.email = "YYY@gmail.com";
            employee3.telephone = "+7_928_556_46_93";
            employee3.salary = 80_000;
            employee3.age = 37;





            OfficeEmployee employee4 = new OfficeEmployee();

            employee4.Fullname = "Smirnova Taisiya Ivanovna";
            employee4.jobtitle = "Foreman";
            employee4.email = "Uynnn@gmail.com";
            employee4.telephone = "+7_902_567_21_78";
            employee4.salary = 43_000;
            employee4.age = 27;






            OfficeEmployee employee5 = new OfficeEmployee();

            employee5.Fullname = "Bocharkin Sergey Petrovich";
            employee5.jobtitle = "Handyman";
            employee5.email = "Rfvvv@gmail.com";
            employee5.telephone = "+7_989_506_23_13";
            employee5.salary = 25_000;
            employee5.age = 28;








            System.out.println(employee1.Fullname + " " +  employee1.jobtitle + " " +  employee1.email + " " +  employee1.telephone + " " + employee1.salary + " " + employee1.age );

            if (employee1.age > 40){
                System.out.println("Сотрудник Petrov Ilya Sergeevich старше 40 лет");
            }
            System.out.println(employee2.Fullname + " " +  employee2.jobtitle + " " +  employee2.email + " " +  employee2.telephone + " " + employee2.salary + " " + employee2.age );

            if (employee2.age > 40){
                System.out.println("Сотрудник Shadow Irina Vladimirovna старше 40 лет");
            }
            System.out.println(employee3.Fullname + " " +  employee3.jobtitle + " " +  employee3.email + " " +  employee3.telephone + " " + employee3.salary + " " + employee3.age );

            if (employee3.age > 40){
                System.out.println("Сотрудник Poletov Igor Sergeevich старше 40 лет");
            }
            System.out.println(employee4.Fullname + " " +  employee4.jobtitle + " " +  employee4.email + " " +  employee4.telephone + " " + employee4.salary + " " + employee4.age );

            if (employee4.age > 40){
                System.out.println("Сотрудник Smirnova Taisiya Ivanovna старше 40 лет");
            }

            System.out.println(employee5.Fullname + " " +  employee5.jobtitle + " " +  employee5.email + " " +  employee5.telephone + " " + employee5.salary + " " + employee5.age );

            if (employee5.age > 40){
                System.out.println("Сотрудник Bocharkin Sergey Petrovich старше 40 лет");
            }










        }






    }




