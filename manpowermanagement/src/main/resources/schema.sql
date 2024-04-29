Create Table Client(
    CLI_ID Varchar(50) Not Null PRIMARY KEY,
    CLI_Name Varchar(50) Not Null
);

Create Table Projects(
    Proj_Id Varchar(50) Not Null PRIMARY KEY,
    Proj_Name Varchar(50) Not Null,
    Proj_Duration Varchar(50) Not Null,
    Proj_Status Varchar(50) Not Null,
    Cli_Id Varchar(50) references Client(CLI_ID) Not Null
);

Create Table Employees
(
    Emp_Id Varchar(50) Not Null Primary KEY,
    Emp_Name Varchar(50) Not Null,
    Emp_Type Number(2) Not Null,
    Emp_Mail Varchar(50) Not Null,
    Emp_Phone Number(10) Not Null,
    Emp_Designation Varchar(50) Not Null,
    Emp_Skills Varchar(50) Not Null,
    Proj_Id Varchar(50) references Projects(Proj_Id) Not Null
);

Create Table Users
(
    email Varchar(225) UNIQUE Not Null PRIMARY KEY,
    Password Varchar(225) Not Null
);