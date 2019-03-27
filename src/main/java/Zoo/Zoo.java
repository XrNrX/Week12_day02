package Zoo;

import Animals.Animal;
import Staff.Employee;

import java.util.ArrayList;

public class Zoo {

    private ArrayList<Animal> animals;
    private ArrayList<Employee> employees;

    public Zoo(){
        this.animals = new ArrayList<Animal>();
        this.employees = new ArrayList<Employee>();

    }

    public int countAnimals(){
        return animals.size();
    }

    public int countEmployees(){
        return animals.size();
    }

    public void addAnimal(Animal animal){
        this.animals.add(animal);
    }

    public void addEmployee(Employee employee){
        this.employees.add(employee);
    }

}
