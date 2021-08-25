var Student = /** @class */ (function () {
    function Student() {
        this.passMark = 40;
    }
    Student.prototype.getId = function () {
        return this.id;
    };
    Student.prototype.setId = function (value) {
        if (value < 0)
            throw new Error('Id can not be negative');
        this.id = value;
    };
    Student.prototype.setX = function (value) {
        this.x = value;
    };
    Student.prototype.getX = function () {
        return this.x;
    };
    return Student;
}());
var student = new Student();
student.setId(25);
student.setX('Bob');
console.log(student.getX());
student.setX(23);
console.log(student.getX());
console.log(student.getId());
