class Student{
    private id: number;
    private name: string;
    private passMark = 40;
    private x;

    getId(){
        return this.id;
    }

    setId(value){
        if(value < 0)
            throw new Error('Id can not be negative')
        this.id = value;
    }

    setX(value){
        this.x = value
    }

    getX(){
        return this.x;
    }
}

let student = new Student();
student.setId(25);

student.setX('Bob');
console.log(student.getX());
student.setX(23);
console.log(student.getX());

console.log(student.getId());