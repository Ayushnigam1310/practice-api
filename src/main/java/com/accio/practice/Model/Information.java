package com.accio.practice.Model;

public class Information {
    private String name;
    private String email;
    private String password;
    private int number;
    private int age;

    public Information(String name, String email, String password, int number, int age)
    {
        this.name = name;
        this.email = email;
        this.password = password;
        this.number = number;
        this.age = age;
    }
    public String getName()
    {
        return name;
    }
    public String getEmail()
    {
        return email;
    }
    public String getPassword()
    {
        return password;
    }
    public int getNumber()
    {
        return number;
    }
    public int getAge()
    {
        return age;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public void setEmail(String email)
    {
        this.email = email;
    }
    public void setPassword(String password)
    {
        this.password = password;
    }
    public void setNumber(int number)
    {
        this.number = number;
    }
    public void setAge(int age)
    {
        this.age = age;
    }

}
