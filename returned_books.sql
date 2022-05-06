CREATE TABLE returned_books (
`rid` int(11) NOT NULL AUTO_INCREMENT,
`bid` int(11) NOT NULL,
`uid` int(11) NOT NULL,
`return_date` varchar(50) NOT NULL,
`fine` int(11) NOT NULL DEFAULT '0',
PRIMARY KEY (`rid`),
KEY `uid` (`uid`),
KEY `bid` (`bid`),
CONSTRAINT `returned_books_ibfk_2` FOREIGN KEY (`bid`) REFERENCES `books` (`bid`),
CONSTRAINT `returned_books_ibfk_1` FOREIGN KEY (`uid`) REFERENCES `users` (`UID`)
);

select * from returned_books;
drop table returned_books;