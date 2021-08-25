class Book{
    public title: string;
    public author: string;
    public price: number;

    constructor(title: string, author: string, price: number){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public getBookInfo(){
        console.log(`Book: title=${this.title}, Author=${this.author}, Price=${this.price}`)
    }
}

let taxEvasion = new Book('Taxes', 'Pablo Escobar', 30);
let traffic = new Book('Without borders', 'Pablo Escobar', 40);

traffic.getBookInfo();
taxEvasion.getBookInfo();