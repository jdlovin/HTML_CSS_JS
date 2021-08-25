class Book{
    public title: string;
    public author: string;
    public price: number;

    public getBookInfo(){
        console.log(`Book: title=${this.title}, Author=${this.author}, Price=${this.price}`)
    }
}

let hustlerz = new Book();
hustlerz.title = "Hustlerz anthem";
hustlerz.author = "Busta Rhymes";
hustlerz.price = 69.99;

hustlerz.getBookInfo();

let pimps = new Book();
pimps.title = "How to do taxes";
pimps.author = "Jordan Belfort";
pimps.price = 0.01;

pimps.getBookInfo();