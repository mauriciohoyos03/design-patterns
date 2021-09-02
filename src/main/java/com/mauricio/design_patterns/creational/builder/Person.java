package com.mauricio.design_patterns.creational.builder;


/*
    1. First of all you need to create a static nested class and then copy all the arguments
    from the outer class to the Builder class. We should follow the naming convention and if the class
    name is Computer then builder class should be named as ComputerBuilder.
    2. Java Builder class should have a public constructor with all the required attributes as parameters.
    3. Java Builder class should have methods to set the optional parameters and it should return
    the same Builder object after setting the optional attribute.
    4. The final step is to provide a build() method in the builder class that will return
    the Object needed by client program. For this we need to have a private constructor in the Class
    with Builder class as argument.
*/
public class Person {
    private String name;
    private String lastName;
    private int age;
    private double weight;
    private double height;
    private String fathersName;
    private String mothersName;

    private Person(PersonBuilder builder) {
        this.name = builder.name;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.weight = builder.weight;
        this.height = builder.height;
        this.fathersName = builder.fathersName;
        this.mothersName = builder.mothersName;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public String getFathersName() {
        return fathersName;
    }

    public String getMothersName() {
        return mothersName;
    }

    public static class PersonBuilder {
        private String name;
        private String lastName;
        private int age;
        private double weight;
        private double height;
        private String fathersName;
        private String mothersName;

        public PersonBuilder(String name, String lastName){
            this.name = name;
            this.lastName = lastName;
        }

        public PersonBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public PersonBuilder setWeight(double weight) {
            this.weight = weight;
            return this;
        }

        public PersonBuilder setHeight(double height) {
            this.height = height;
            return this;
        }

        public PersonBuilder setFathersName(String fathersName) {
            this.fathersName = fathersName;
            return this;
        }

        public PersonBuilder setMothersName(String mothersName) {
            this.mothersName = mothersName;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", height=" + height +
                ", fathersName='" + fathersName + '\'' +
                ", mothersName='" + mothersName + '\'' +
                '}';
    }
}