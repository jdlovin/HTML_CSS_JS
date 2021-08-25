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
    return Student;
}());
var student = new Student();
student.setId(25);
console.log(student.getId());
