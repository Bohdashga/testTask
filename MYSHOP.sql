USE [MyShop]

----Select product with product name that begins with ‘C’.
--SELECT * FROM Products WHERE ProductName LIKE 'C%';

----Select product with the smallest price.
--SELECT MIN(Price) AS  smallestprice FROM Products;

----Select cost of all products from the USA.
--SELECT Products.Price, Products.ProductName, Suppliers.Country
--FROM Suppliers
--INNER JOIN Products ON Suppliers.SupplierID = Products.SupplierID
--WHERE Country='USA';

----Select suppliers that supply Condiments.
--SELECT Suppliers.SupplierName, Categories.CategoryName, Products.ProductName
--FROM Products
--INNER JOIN Suppliers ON Products.SupplierID = Suppliers.SupplierID
--INNER JOIN Categories ON Products.CategoryID = Categories.CategoryID 
--WHERE CategoryName = 'Condiments';


----Add to database new supplier with name: ‘Norske Meierier’, city: ‘Lviv’, country: ‘Ukraine’ which
----will supply new product with name: ‘Green tea’, price: 10, and related to category with name:
----‘Beverages’.
--INSERT INTO Suppliers ( SupplierName, City, Country)
--VALUES  ('Norske Meierier','Lviv','Ukraine');
		

--INSERT INTO Products ( ProductName, CategoryID, Price)
--VALUES	('Green tea',1,10.00);




--SET IDENTITY_INSERT Products ON

--INSERT INTO Products (ProductID, ProductName, Products, CategoryID, Price)
--VALUES (1,'Chais',1,1,18.00),
--		(2,'Chang',1,1,19.00),
--		(3,'Aniseed Syrup',1,2,10.00),
--		(4,'Chef Anton’s Cajun Seasoning',2,2,22.00),
--		(5,'Chef Anton’s Gumbo Mix',2,2,21.35);

--SET IDENTITY_INSERT Products OFF

--SET IDENTITY_INSERT Suppliers ON

--INSERT INTO Suppliers (SupplierID, SupplierName, City, Country)
--VALUES  (1,'Exotic Liquid','London','UK'),
--		(2,'New Orleans Cajun Delights','New Orleans','USA'),
--		(3,'Grandma Kelly’s Homestead','Ann Arbor','USA'),
--		(4,'Tokyo Traders','Tokyo','Japan'),
--		(5,'Cooperativa de Quesos ‘Las Cabras’','Oviedo','Spain');

--SET IDENTITY_INSERT Suppliers OFF


--SET IDENTITY_INSERT Categories ON

--INSERT INTO Categories (CategoryID, CategoryName, Description)
--VALUES    (1,'Beverages','Soft drinks, coffees, teas, beers, and ales'),
	--		(2,'Condiments','Sweet and savory sauces, relishes, spreads, and seasonings'),
	--		(3,'Confections','Desserts, candies, and sweet breads'),
	--		(4,'Dairy Products','Cheeses'),
	--		(5,'Grains/Cereals','Breads, crackers, pasta, and cereal');

--SET IDENTITY_INSERT Categories OFF

----  CREATE TABLES

--CREATE TABLE Products (
--    ProductID int IDENTITY(1,1) NOT NULL PRIMARY KEY,
--    ProductName varchar(255),
--    SupplierID int,
--    CategoryID int,
--    Price double PRECISION
--);

--CREATE TABLE Suppliers (
--    SupplierID int IDENTITY(1,1) NOT NULL PRIMARY KEY,
--    SupplierName varchar(255),
--    City varchar(255),
--	Country varchar(255)
--);

--CREATE TABLE Categories (
--    CategoryID int IDENTITY(1,1) NOT NULL PRIMARY KEY,
--    CategoryName varchar(255),
--    Description varchar(255)
--);
