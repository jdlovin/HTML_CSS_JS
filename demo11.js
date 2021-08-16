class Book {

    constructor(title, author, price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    getBookInfo(){
        console.log('Book: title=' + this.title + ', Author= '+this.author + ', Price= ' + this.price);
    }
}

const Book1 = new Book('Title 100', 'Author 100', 10.99);

Book1.getBookInfo();