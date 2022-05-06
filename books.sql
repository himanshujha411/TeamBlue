CREATE TABLE books (
`bid` int(11) NOT NULL AUTO_INCREMENT,
`book_name` varchar(50) NOT NULL,
`book_author` varchar(50) NOT NULL,
`book_price` int(11) NOT NULL,
`book_status` varchar(50) NOT NULL,
PRIMARY KEY (`bid`)
);

select * from books;
drop table books;

INSERT INTO books VALUES('001','C Programming','Yashwant Kanetkar',250,'Not Issued');  
INSERT INTO books VALUES('002','C++ Programming','RD Sharma',500,'Not Issued'); 
INSERT INTO books VALUES('003','Java Programming','William',398,'Not Issued'); 
INSERT INTO books VALUES('004','Python Programming','Shakespeare',750,'Not Issued'); 
INSERT INTO books VALUES('005','R Programming','RS Aggarwal',830,'Not Issued'); 

select bid,book_name from books where bid=5 and book_status="Not Issued";

select bid,book_name from books where bid=5 and book_status='Not Issued';
