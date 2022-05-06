CREATE TABLE issued_books (
`IID` int(11) NOT NULL AUTO_INCREMENT,
`UID` int(11) NOT NULL,
`BID` int(11) NOT NULL,
`book_name` varchar(50) NOT NULL,
`ISSUED_DATE` varchar(20) NOT NULL,
`PERIOD` int(11) NOT NULL,
PRIMARY KEY (`IID`),
KEY `UID` (`UID`),
KEY `BID` (`BID`),
CONSTRAINT `issued_books_ibfk_2` FOREIGN KEY (`BID`) REFERENCES `books` (`bid`),
CONSTRAINT `issued_books_ibfk_1` FOREIGN KEY (`UID`) REFERENCES `users` (`UID`)
);

select * from issued_books;
drop table issued_books;

delete from issued_books where uid=3;
INSERT INTO issued_books VALUES(1,2,3,"Let us see!","25 April 2022",7);  

select * from issued_books where uid=5;