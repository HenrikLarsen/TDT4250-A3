# TDT4250-A3
Third assignment in TDT4250 Advanced Software Design

Model To Model (M2M) transformation of Ecore model to HTML using xHTML1.

* Ecore project (model): TDT4250.assignment.program
* Transformation project: TDT4250.assignment.hmtl

Constraints
------
* Checks if the courses have atleast 5 credits. (OCL constraint)
* Checks if the coursecode is on the right format, using regex. Regex used: "[A-Z]{2,3}[1-9]{4}" (manually Java constraint)
* Checks if each semesters contains courses summarizing in a total of 30 credits (validated using OCL).

Derived feature
------
Name attribute in the Semester is computed from the semestercode like: name = "semester" + code.
Implemented by changing getter method getName() after generating code using Genmodel.

Model structure
------
Department with courses and programs (study plans). A program includes multiple semesters and courses with optional specializations (single or multiple). A courses included in a semester can be mandatory or elective.

![Imgur Image](https://i.imgur.com/9H9FvDd.png)


Improvements from assignment 1
------
Based on feedback, the following model improvements have been done:

* Add a top level object i.e. Department where courses are contained
* Add a datatype for spring/fall in semesters
* Remove numbers from courses
* Rename "code" attributes
* Add a constraint that check that the credit for each semester is 30

Sample.xmi
------
![Imgur Image](https://i.imgur.com/PpvA2Re.png)

Generated HTML
------
![Imgur Image](https://i.imgur.com/evy8A0B.png)
