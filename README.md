# CompanyA2
Assignment 2 OOADJ 

A Company has a Manager, TechLead and Developer as its Employee. The
Company creates Task for its Employee. This Task contains attributes such as
taskName, taskType, taskStatus, taskLevel, taskSize, effortRequired. After the
Task gets created by the Company it will be given to its Employee. Task can be
Opened and Executed by the Employee. If the taskLevel is 3, then it will be
Opened and Executed by Manager, if it is 2, it will be Opened by the Manager
(meaning manager has a task clearance level of 3 and 2) and Executed by the
TechLead, and if 1 will be Opened by the TechLead and Executed by the
Developer. Design the UML and implement the same using appropriate design
patterns.
Note: Design the application in such a way that extensibility is easy. 
It should be
easy to add new types of Employee, new actions that can be performed on the
task (Opened, Executed, etc.).
