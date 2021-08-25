var Calculator = /** @class */ (function () {
    function Calculator(x, y) {
        this.y = y;
        this.x = x;
    }
    Calculator.prototype.addNumber = function () {
        console.log(this.x + this.y);
    };
    return Calculator;
}());
var calculator = new Calculator(10, 40);
calculator.x = 20;
calculator.y = 40;
calculator.addNumber();
