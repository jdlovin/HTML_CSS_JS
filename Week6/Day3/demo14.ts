class Calculator{
    x: number;
    y: number;

    constructor(x?: number, y?: number){
        this.y = y;
        this.x = x;
    }

    addNumber(){
        console.log(this.x + this.y);
    }
}


let calculator = new Calculator(10, 40);
calculator.x = 20;
calculator.y = 40;
calculator.addNumber();