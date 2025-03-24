import java.awt.*;
import java.awt.desktop.SystemEventListener;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

import Interface.Fish;
import Interface.Hawk;
import Interface.Rabbit;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Date now = new Date();
        System.out.println(now );
        Point point1 = new Point(1,2);
        System.out.println(point1);

        // array declaration
        int [] numbers =  new int[5];
        for(int i=0;i<5;i++)
            numbers[i] = i;

        numbers[3] = 10;
       // Arrays.sort(numbers);

        for(int i=0;i<5;i++)
        {
            System.out.println(numbers[i]);
        }

        numbers =  new int[10];
        for(int i=0;i<10;i++)
            numbers[i] = i;
        for(int i=0;i<10;i++)
        {
            System.out.println(numbers[i]);
        }
        ///  Grid int [] [] numbers = new int[2] [3];

        /// Implicit Casting
        /// byte > short > int > long > float > double
        short x = 2;
        int y = x+2;
        System.out.println(y);

        /// Explicit Casting
        double d = 1.1;
        int i = (int)d+2;
        System.out.println("i "+i);

        String st = "1";
        int si = Integer.parseInt(st)+2;
        System.out.println(si);

        /// Taking Input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Age: ");
        byte age = scanner.nextByte();
        System.out.println("Your age is "+age);

        String role = "Admin";
        switch(role) {
            case "Admin":
                System.out.println("You are an Admin");
                break;
            case "Moderator":
                System.out.println("You are a moderator");
                break;
            default:
                System.out.println("You are a guest");
                break;
        }

        Random random = new Random();

        int number = random.nextInt(70, 100);
        System.out.println(number);

        System.out.println(Math.PI);
        System.out.println(Math.pow(2,10));

        int id = 1;
        System.out.printf("%04d\n", id);

        ///  String
        String email = "test@gmail.com";
        String username = email.substring(0,email.indexOf("@"));
        String domain = email.substring(email.indexOf("@")+1);

        System.out.printf("%s @ %s\n",username,domain);

        String day = "friday";
        switch(day) {
            case "sunday","monday","tuesday","wednesday","thursday" ->
            {
                System.out.println("WeekDay");
            }
            case "friday", "saturday" -> System.out.println("Weekend");
            default -> System.out.println("Invalid day");
        }

        Friend friend1 = new Friend("Rakib");
        Friend friend2 = new Friend("Alam");
        Friend friend3 = new Friend("Bappi");
        System.out.println(Friend.count);
        System.out.println(friend1.name);

        Dog dog = new Dog();
        dog.eat();

        Animal animal = new Cat();
        animal.eat();

        Student student = new Student("Rakib", "Alam", 24, "Male", 3.38);
        student.showStudentInfo();

        Shape square = new Square(10);
        Shape rectangle = new Rectangle(10,12);

        square.display();
        rectangle.display();

        Fish fish = new Fish();
        Rabbit rabbit = new Rabbit();
        Hawk hawk = new Hawk();

        fish.hunt();
        rabbit.flee();
        hawk.hunt();

        ArrayList<Integer> list = new ArrayList<>();
        for(i=1;i<=10;i++)
        {
            list.add(i);
        }

        list.remove(9);
        list.set(0,5);

        Collections.sort(list);

        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.get(0));

        try{
            System.out.print("Enter a number: ");
            int val = scanner.nextInt();
            System.out.println(val);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input");
        }
        catch (ArithmeticException e) {
            System.out.println("Arithmetic exception");
        }
        catch (Exception e) {
            System.out.println("Exception");
        }
        finally {
            System.out.println("This is always executes");
        }

        System.out.println("Hello");

        /*** How to write a file ***/
        String filepath = "test.txt";
        String textContent = """
                I like Pizza.
                Buy me a Pizza.
                """;
        try(FileWriter writer = new FileWriter(filepath);){
            writer.write(textContent);
            System.out.println("File has been written");
        }
        catch (IOException e){
            System.out.println("Could not write file");
        }

        /*** How to write a file ***/
        /// using BufferedReader

        LocalTime time = LocalTime.now();
        LocalDate date = LocalDate.now();
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm:ss");
        String newDate = dateTime.format(formatter);
        System.out.println(time);
        System.out.println(date);
        System.out.println(newDate);

        Instant instant = Instant.now();
        System.out.println(instant);

        Timer timer = new Timer();
        TimerTask task = new TimerTask() {

            int count = 5;

            @Override
            public void run() {
                System.out.println("Task run");
                count--;
                if(count==0)
                {
                    System.out.println("Task finished");
                    timer.cancel();
                }
            }
        };
//        timer.schedule(task, 3000);
        timer.schedule(task,3000,1000); /// 3s a start hoye every 5s por por task run print hobe


        ///  Generics
        Product<String,Integer> product1 = new Product<>("apple", 280);
        Product<String, Integer> product2 = new Product<>("malta", 290);

        System.out.println(product1.getItem());

        HashMap<String, Integer> map = new HashMap<>();
        map.put("apple", 20);
        map.put("malta", 20);
        System.out.println(map);
        System.out.println(map.get("apple"));
        System.out.println(map.containsKey("malta"));

        for(String key : map.keySet()){
            System.out.println(key + " : $" + map.get(key));
        }

        Day days = Day.Sunday;

        switch(days){
            case Monday, Tuesday -> System.out.println("Weekday");
            case Sunday-> System.out.println("Weekend");
        }

///        Java Collections
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        System.out.println(list1);

        Stack<String> stack1 = new Stack<>();
        stack1.push("1");
        stack1.push("2");

        System.out.println(stack1.peek());
        System.out.println(stack1.pop());
        System.out.println(stack1.peek());

        Queue<String> queue1 = new LinkedList<>();
        queue1.offer("1");
        queue1.offer("2");
        queue1.offer("3");
        System.out.println(queue1);
        System.out.println(queue1.peek());
        System.out.println(queue1.poll());
        System.out.println(queue1.peek()); 

    }
}