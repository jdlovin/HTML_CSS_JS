class Employee{
    id;
    firstName;
    lastName;
    email;
    phone;

    getFullName(){
        console.log(`${this.firstName} ${this.lastName}`);
    }
}

class FullTimeEmployee extends Employee{
    annualSalary;
}

class PartTimeEmployee extends Employee{
    hourSalary;
}

let fte = new FullTimeEmployee();
fte.firstName = 'Bob';
fte.lastName = 'Smith';

let pte = new PartTimeEmployee();
pte.firstName = 'Homer';
pte.lastName = 'Simpson';

fte.getFullName();
pte.getFullName();