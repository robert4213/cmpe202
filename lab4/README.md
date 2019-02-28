## Ding Tai Feng project

# Table
Responsibility: Contain the list of aviliable table number. Return aviliable table's number, how many remain table. Allow to add and delete table.

Collborator: None

# Customer
Responsibility:Store and provide Costumer's name, phone number, and number of people. 

Collborator: None

# Table2
Responsibility: Inheritance from Table, and use Handler interface. Contain the list of aviliable number of table with 2 seats.Allow to return aviliable table's number according to how many people come. Add and remove table, return aviliable table's number. If the number of people is larger than 2, send customer to calss Table4.

Collborator: Table,Customer,Table4

# Table4
Responsibility: Inheritance from Table, and use Handler interface. Contain the list of aviliable number of table with 4 seats.Allow to return aviliable table's number according to how many people come. Add and remove table, return aviliable table's number. If the number of people is larger than 4, send customer to calss Table8.

Collborator: Table,Customer,Table8

# Table8
Responsibility: Inheritance from Table, and use Handler interface. Contain the list of aviliable number of table with 8 seats.Allow to return aviliable table's number according to how many people come. Add and remove table, return aviliable table's number.

Collborator: Table,Customer


# CustomerList
Responsibility:Contain a list for all customers. Add customer. Allow to assign a table to the customer on the top of the list. Send and receive information to check in.

Collborator: Table2,Customer


# Design pattern
Chain of responsibility
Explaination: In this project, we have several table objects which has different aviliable seats. So in my program, when customer object comes, it'll first check table with 2 seats, if it's not suitable, then send customer object to next table, table4. Sane for table4 to table8.

Contain odject: 

Client: customers object in customerList. Served with FIFO order.

ConcreteHandler: table2, table4, table8
