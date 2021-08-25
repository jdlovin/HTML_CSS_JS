class Student{
    private id: number;
    private name: string;
    private passMark = 40;

    getId(){
        return this.id;
    }

    setId(value){
        if(value < 0)
            throw new Error('Id can not be negative')
        this.id = value;
    }
}

let student = new Student();
student.setId(25);

console.log(student.getId());