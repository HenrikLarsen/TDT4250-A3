# TDT4250-A1
First assignment in TDT4250 Advanced Software Design

About
------
Study plan (program) with semesters, courses and specializations. A program includes multiple semesters with optional specializations (single or multiple). Every courses included in a semester can be mandatory or elective.


Constraints
------
* Checks if the courses have atleast 5 credits. (OCL constraint)
* Checks if the coursecode is on the right format, using regex. Regex used: "[A-Z]{2,3}[1-9]{4}" (manually Java constraint)

Derived feature
------
Name attribute in the Semester is computed from the semestercode like: name = "semester" + code.
Implemented by changing getter method getName() after generating code using Genmodel.

Model structure
------

![Imgur Image](https://i.imgur.com/aJZGIE8.png)

Sample.xmi
------
![Imgur Image](https://i.imgur.com/X75MTRU.png)
