class Employee{
    public id:  number;
    public firstName: string;
    public lastName: string;
    public email: string;

    public getFullName(){
        console.log(`${this.firstName} ${this.lastName}`)
    }
}

class FullTimeEmployee extends Employee{
    public annualSalary: number;
}

class PartTimeEmployee extends Employee{
    public hourSalary: number;
}

let fte = new FullTimeEmployee();
fte.firstName = 'Paul';
fte.lastName = 'Wall';
fte.getFullName();

let pte = new PartTimeEmployee();
pte.firstName = 'Kevin';
pte.lastName = 'Love';
pte.getFullName();