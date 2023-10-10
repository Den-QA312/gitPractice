package com.digital.utils;

import com.digital.models.Student;
import com.github.javafaker.Faker;

public class FakeDataProvider {

    Faker faker = new Faker();

    public String generateFakerName(){
        return faker.name().name();

    }
    public String generateLastName(){
        return faker.name().lastName();
    }

    public String generateFakeEmail() {

        return faker.internet().emailAddress();
    }

    public String generateFakePhoneNumber(){
        return faker.number().digits(10);
    }

    public String generateFakeCurrentAddress() {
        return faker.address().fullAddress();
    }

    public String generateFakePermanentAddress() {
        return faker.address().streetName() + " " + faker.address().streetAddressNumber();
    }
    public String generateFakeAge (){
        return faker.number().digits(2);
    }
    public String generateFakeSalary () {
        return faker.number().digits(4);
    }

    public Student createFakeStudent (){
        Student student = new Student();
        student.setFirstName(generateFakerName());
        student.setLastName(generateLastName());
        student.setEmail(generateFakeEmail());
        student.setPhoneNumber(generateFakePhoneNumber());
        student.setCurrentAddress(generateFakeCurrentAddress());
        student.setAge(generateFakeAge());
        student.setSalary(generateFakeSalary());

        return student;
    }
}