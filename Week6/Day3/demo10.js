var Book = /** @class */ (function () {
    function Book() {
    }
    Book.prototype.getBookInfo = function () {
        console.log("Book: title=" + this.title + ", Author=" + this.author + ", Price=" + this.price);
    };
    return Book;
}());
var hustlerz = new Book();
hustlerz.title = "Hustlerz anthem";
hustlerz.author = "Busta Rhymes";
hustlerz.price = 69.99;
hustlerz.getBookInfo();
var pimps = new Book();
pimps.title = "How to do taxes";
pimps.author = "Jordan Belfort";
pimps.price = 0.01;
pimps.getBookInfo();
