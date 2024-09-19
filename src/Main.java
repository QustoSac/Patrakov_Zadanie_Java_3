import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    }

    //задание 1
    /////////////////////////////////
    class Person {
        private String name;
        private int age;
        private String gender;

        public Person(String name, int age, String gender) {
            this.name = name;
            this.age = age;
            this.gender = gender;
        }

        public void displayInfo() {
            System.out.println("Name: " + name + ", Age: " + age + ", Gender: " + gender);
        }

        public void increaseAge() {
            this.age++;
        }

        public void changeName(String newName) {
            this.name = newName;
        }
    }

    /////////////////////////////////
    //задание 2
    /////////////////////////////////

    class Worker extends Person {
        private double salary;

        public Worker(String name, int age, String gender, double salary) {
            super(name, age, gender);
            this.salary = salary;
        }

        public double getSalary() {
            return salary;
        }
    }

    class Manager extends Worker {
        private Worker[] subordinates;

        public Manager(String name, int age, String gender, double salary, Worker[] subordinates) {
            super(name, age, gender, salary);
            this.subordinates = subordinates;
        }

        public Worker[] getSubordinates() {
            return subordinates;
        }
    }

    /////////////////////////////////
    //задание 3
    /////////////////////////////////

    interface Animal {
        void makeSound();
    }

    class Dog implements Animal {
        public void makeSound() {
            System.out.println("Woof!");
        }
    }

    class Cat implements Animal {
        public void makeSound() {
            System.out.println("Meow!");
        }
    }

    class Cow implements Animal {
        public void makeSound() {
            System.out.println("Moo!");
        }
    }

    /////////////////////////////////
    //задание 4
    /////////////////////////////////

    abstract class Transport {
        abstract void move();
    }

    class Car extends Transport {
        public void move() {
            System.out.println("Car drives.");
        }
    }

    class Bike extends Transport {
        public void move() {
            System.out.println("Bike pedals.");
        }
    }
    /////////////////////////////////
    //задание 5
    /////////////////////////////////

    class Book {
        private String title;
        private String author;
        private int year;

        public Book(String title, String author, int year) {
            this.title = title;
            this.author = author;
            this.year = year;
        }

        public String getTitle() {
            return title;
        }

        public String getAuthor() {
            return author;
        }

        public int getYear() {
            return year;
        }

        public void displayInfo() {
            System.out.println("Title: " + title + ", Author: " + author + ", Year: " + year);
        }
    }

    class Library {
        private ArrayList<Book> books = new ArrayList<>();

        public void addBook(Book book) {
            books.add(book);
        }

        public void searchByAuthor(String author) {
            for (Book book : books) {
                if (book.getAuthor().equals(author)) {
                    book.displayInfo();
                }
            }
        }

        public void searchByYear(int year) {
            for (Book book : books) {
                if (book.getYear() == year) {
                    book.displayInfo();
                }
            }
        }
    }

    /////////////////////////////////
    //задание 6
    /////////////////////////////////

    class BankAccount {
        private String accountNumber;
        private double balance;

        public BankAccount(String accountNumber, double balance) {
            this.accountNumber = accountNumber;
            this.balance = balance;
        }

        public String getAccountNumber() {
            return accountNumber;
        }

        public double getBalance() {
            return balance;
        }

        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
                System.out.println("Deposited: " + amount);
            } else {
                System.out.println("Deposit amount must be positive.");
            }
        }

        public void withdraw(double amount) {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
                System.out.println("Withdrew: " + amount);
            } else {
                System.out.println("Insufficient balance or invalid amount.");
            }
        }

        public void displayBalance() {
            System.out.println("Account: " + accountNumber + ", Balance: " + balance);
        }
    }

    /////////////////////////////////
    //задание 7
    /////////////////////////////////

    class Counter {
        private static int objectCount = 0;

        public Counter() {
            objectCount++;
        }

        public static int getObjectCount() {
            return objectCount;
        }
    }

    /////////////////////////////////
    //задание 8
    /////////////////////////////////

    abstract class Shape {
        abstract double getArea();
    }

    class Circle extends Shape {
        private double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        public double getArea() {
            return Math.PI * radius * radius;
        }
    }

    class Rectangle extends Shape {
        private double width;
        private double height;

        public Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }

        public double getArea() {
            return width * height;
        }
    }

    /////////////////////////////////
    //задание 9
    /////////////////////////////////

    class Animal_Move {
        void move() {
            System.out.println("Animal is moving.");
        }
    }

    class dog extends Animal_Move {
        @Override
        void move() {
            System.out.println("dog is running");
        }
    }

    class cat extends Animal_Move {
        @Override
        void move() {
            System.out.println("cat is тыгыдык");
        }
    }

    class cow extends Animal_Move {
        @Override
        void move() {
            System.out.println("cow is running...");
        }
    }


    /////////////////////////////////
    //задание 10
    /////////////////////////////////

    class Student {
        private String name;
        private String group;
        private double grade;

        public Student(String name, String group, double grade) {
            this.name = name;
            this.group = group;
            this.grade = grade;
        }

        public String getName() {
            return name;
        }

        public String getGroup() {
            return group;
        }

        public double getGrade() {
            return grade;
        }

        public void displayInfo() {
            System.out.println("Name: " + name + ", Group: " + group + ", Grade: " + grade);
        }
    }

    class University {
        private ArrayList<Student> students = new ArrayList<>();

        public void addStudent(Student student) {
            students.add(student);
        }

        public void sortByName() {
            students.sort(Comparator.comparing(Student::getName));
        }

        public void filterByGrade(double gradeThreshold) {
            for (Student student : students) {
                if (student.getGrade() >= gradeThreshold) {
                    student.displayInfo();
                }
            }
        }
    }

    /////////////////////////////////
    //задание 11
    /////////////////////////////////

    class Product {
        private String name;
        private double price;
        private int quantity;

        public Product(String name, double price, int quantity) {
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }

        public String getName() {
            return name;
        }

        public double getPrice() {
            return price;
        }

        public int getQuantity() {
            return quantity;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }

        public void displayInfo() {
            System.out.println("Product: " + name + ", Price: " + price + ", Quantity: " + quantity);
        }
    }

    class Store {
        private ArrayList<Product> products = new ArrayList<>();

        public void addProduct(Product product) {
            products.add(product);
        }

        public void removeProduct(String productName) {
            products.removeIf(product -> product.getName().equals(productName));
        }

        public Product searchProductByName(String productName) {
            for (Product product : products) {
                if (product.getName().equals(productName)) {
                    return product;
                }
            }
            return null;
        }
    }

    /////////////////////////////////
    //задание 12
    /////////////////////////////////

    interface PaymentSystem {
        void pay(double amount);
        void refund(double amount);
    }

    class CreditCard implements PaymentSystem {
        public void pay(double amount) {
            System.out.println("Paid " + amount + " with Credit Card.");
        }

        public void refund(double amount) {
            System.out.println("Refunded " + amount + " to Credit Card.");
        }
    }

    class PayPal implements PaymentSystem {
        public void pay(double amount) {
            System.out.println("Paid " + amount + " with PayPal.");
        }

        public void refund(double amount) {
            System.out.println("Refunded " + amount + " to PayPal.");
        }
    }

    /////////////////////////////////
    //задание 13
    /////////////////////////////////

    class UniqueID {
        private static int idCounter = 0;
        private int id;

        public UniqueID() {
            this.id = ++idCounter;
        }

        public int getId() {
            return id;
        }
    }

    /////////////////////////////////
    //задание 14
    /////////////////////////////////

    class Point {
        private int x;
        private int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }
    }

    class Rectangle2 {
        private Point topLeft;
        private Point bottomRight;

        public Rectangle2(Point topLeft, Point bottomRight) {
            this.topLeft = topLeft;
            this.bottomRight = bottomRight;
        }

        public double getArea() {
            int width = Math.abs(bottomRight.getX() - topLeft.getX());
            int height = Math.abs(bottomRight.getY() - topLeft.getY());
            return width * height;
        }
    }

    /////////////////////////////////
    //задание 15
    /////////////////////////////////

    class ComplexNumber {
        private double real;
        private double imaginary;

        public ComplexNumber(double real, double imaginary) {
            this.real = real;
            this.imaginary = imaginary;
        }

        public ComplexNumber add(ComplexNumber other) {
            return new ComplexNumber(this.real + other.real, this.imaginary + other.imaginary);
        }

        public ComplexNumber subtract(ComplexNumber other) {
            return new ComplexNumber(this.real - other.real, this.imaginary - other.imaginary);
        }

        public ComplexNumber multiply(ComplexNumber other) {
            double realPart = this.real * other.real - this.imaginary * other.imaginary;
            double imaginaryPart = this.real * other.imaginary + this.imaginary * other.real;
            return new ComplexNumber(realPart, imaginaryPart);
        }

        public ComplexNumber divide(ComplexNumber other) {
            double denominator = other.real * other.real + other.imaginary * other.imaginary;
            double realPart = (this.real * other.real + this.imaginary * other.imaginary) / denominator;
            double imaginaryPart = (this.imaginary * other.real - this.real * other.imaginary) / denominator;
            return new ComplexNumber(realPart, imaginaryPart);
        }

        public void display() {
            System.out.println(real + " + " + imaginary + "i");
        }
    }

    /////////////////////////////////
    //задание 16
    /////////////////////////////////

    class Matrix {
        private int[][] matrix;

        public Matrix(int[][] matrix) {
            this.matrix = matrix;
        }

        public Matrix add(Matrix other) {
            int rows = matrix.length;
            int cols = matrix[0].length;
            int[][] result = new int[rows][cols];

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    result[i][j] = this.matrix[i][j] + other.matrix[i][j];
                }
            }
            return new Matrix(result);
        }

        public Matrix multiply(Matrix other) {
            int rows = this.matrix.length;
            int cols = other.matrix[0].length;
            int[][] result = new int[rows][cols];

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    for (int k = 0; k < this.matrix[0].length; k++) {
                        result[i][j] += this.matrix[i][k] * other.matrix[k][j];
                    }
                }
            }
            return new Matrix(result);
        }

        public void display() {
            for (int[] row : matrix) {
                for (int val : row) {
                    System.out.print(val + " ");
                }
                System.out.println();
            }
        }
    }

    /////////////////////////////////
    //задание 17
    /////////////////////////////////

    class Player {
        private String name;
        private int health;
        private Weapon weapon;

        public Player(String name, int health, Weapon weapon) {
            this.name = name;
            this.health = health;
            this.weapon = weapon;
        }

        public void attack(Enemy enemy) {
            enemy.takeDamage(weapon.getDamage());
            System.out.println(name + " attacked " + enemy.getName() + " with " + weapon.getName());
        }
    }

    class Enemy {
        private String name;
        private int health;

        public Enemy(String name, int health) {
            this.name = name;
            this.health = health;
        }

        public void takeDamage(int damage) {
            this.health -= damage;
            System.out.println(name + " took " + damage + " damage.");
        }

        public String getName() {
            return name;
        }
    }

    class Weapon {
        private String name;
        private int damage;

        public Weapon(String name, int damage) {
            this.name = name;
            this.damage = damage;
        }

        public int getDamage() {
            return damage;
        }

        public String getName() {
            return name;
        }
    }

    /////////////////////////////////
    //задание 18
    /////////////////////////////////

    class ProductOrder {
        private String name;
        private double price;

        public ProductOrder(String name, double price) {
            this.name = name;
            this.price = price;
        }

        public double getPrice() {
            return price;
        }

        public String getName() {
            return name;
        }

        public void displayInfo() {
            System.out.println("Product: " + name + ", Price: " + price);
        }
    }

    class Customer {
        private String name;
        private ArrayList<Order> orders;

        public Customer(String name) {
            this.name = name;
            this.orders = new ArrayList<>();
        }

        public void addOrder(Order order) {
            orders.add(order);
        }

        public ArrayList<Order> getOrderHistory() {
            return orders;
        }
    }

    class Order {
        private ArrayList<ProductOrder> products;

        public Order() {
            this.products = new ArrayList<>();
        }

        public void addProduct(ProductOrder product) {
            products.add(product);
        }

        public double getTotalCost() {
            double total = 0;
            for (ProductOrder product : products) {
                total += product.getPrice();
            }
            return total;
        }

        public void displayOrder() {
            for (ProductOrder product : products) {
                product.displayInfo();
            }
            System.out.println("Total cost: " + getTotalCost());
        }
    }

    /////////////////////////////////
    //задание 19
    /////////////////////////////////

    class Device {
        private String brand;

        public Device(String brand) {
            this.brand = brand;
        }

        public void turnOn() {
            System.out.println(brand + " device is turning on.");
        }

        public void turnOff() {
            System.out.println(brand + " device is turning off.");
        }
    }

    class Smartphone extends Device {
        public Smartphone(String brand) {
            super(brand);
        }

        public void takePhoto() {
            System.out.println("Taking a photo with the smartphone.");
        }
    }

    class Laptop extends Device {
        public Laptop(String brand) {
            super(brand);
        }

        public void compileCode() {
            System.out.println("Compiling code on the laptop.");
        }
    }

    /////////////////////////////////
    //задание 20
    /////////////////////////////////

    class Game {
        private char[][] board;
        private char currentPlayer;

        public Game() {
            board = new char[3][3];
            currentPlayer = 'X';
            initializeBoard();
        }

        private void initializeBoard() {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    board[i][j] = '-';
                }
            }
        }

        public void printBoard() {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(board[i][j] + " ");
                }
                System.out.println();
            }
        }

        public boolean isBoardFull() {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (board[i][j] == '-') {
                        return false;
                    }
                }
            }
            return true;
        }

        public void changePlayer() {
            currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
        }

        public boolean placeMark(int row, int col) {
            if (row >= 0 && col >= 0 && row < 3 && col < 3) {
                if (board[row][col] == '-') {
                    board[row][col] = currentPlayer;
                    return true;
                }
            }
            return false;
        }

        public boolean checkForWin() {
            return (checkRows() || checkColumns() || checkDiagonals());
        }

        private boolean checkRows() {
            for (int i = 0; i < 3; i++) {
                if (board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer) {
                    return true;
                }
            }
            return false;
        }

        private boolean checkColumns() {
            for (int i = 0; i < 3; i++) {
                if (board[0][i] == currentPlayer && board[1][i] == currentPlayer && board[2][i] == currentPlayer) {
                    return true;
                }
            }
            return false;
        }

        private boolean checkDiagonals() {
            return ((board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer) ||
                    (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer));
        }
    }

    class Player2 {
        private String name;
        private char symbol;

        public Player2(String name, char symbol) {
            this.name = name;
            this.symbol = symbol;
        }

        public String getName() {
            return name;
        }

        public char getSymbol() {
            return symbol;
        }
    }
}

