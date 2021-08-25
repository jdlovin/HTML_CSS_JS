var Book = /** @class */ (function () {
    function Book(title, author, price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    Book.prototype.getBookInfo = function () {
        console.log("Book: title=" + this.title + ", Author=" + this.author + ", Price=" + this.price);
    };
    return Book;
}());
var taxEvasion = new Book('Taxes', 'Pablo Escobar', 30);
var traffic = new Book('Without borders', 'Pablo Escobar', 40);
traffic.getBookInfo();
taxEvasion.getBookInfo();
