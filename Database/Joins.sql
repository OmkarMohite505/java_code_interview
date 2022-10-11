
use interview;

 create table students(
roll_no int,
name varchar(20),
address varchar(20),
phone int,
age int
);

create table courses(
course_no int,
course varchar(20)
);

drop table courses;


insert into students values (1, 'Kunal', 'Pune', 1988, 24);
insert into students values (3, 'omkar', 'Pune', 9999, 24);
insert into students values (4, 'Pratik', 'Pabal', 1868, 23);
insert into students values (5, 'Harsal', 'Bhosari', 1988, 22);

select * from students;

drop table students;
desc students;
desc courses;

create table courses(
roll_no int,
course_name varchar(20),
faculty varchar(20),
course_id int
);

insert into courses values (1, 'PG-DAC', 'XYZ', 11);
insert into courses values (6, 'PG-DBDA', 'AYZ', 12);
insert into courses values (7, 'PG-DITISS', 'ABC', 13);
insert into courses values (3, 'PG-DMC', 'QWE', 11);

select * from courses;

select students.name, students.address, students.phone, courses.course_id,
		courses.course_name, courses.faculty
from students
inner join courses
on students.roll_no = courses.roll_no;

select students.name, students.address, students.phone, courses.course_id,
		courses.course_name, courses.faculty
from students
left join courses
on students.roll_no = courses.roll_no;

select students.name, students.address, students.phone, courses.course_id,
		courses.course_name, courses.faculty
from students
right join courses
on students.roll_no = courses.roll_no;

select students.name, students.address, students.phone, courses.course_id,
		courses.course_name, courses.faculty
from students
left join courses
on students.roll_no = courses.roll_no
union
select students.name, students.address, students.phone, courses.course_id,
		courses.course_name, courses.faculty
from students
right join courses
on students.roll_no = courses.roll_no;

select students.name, students.address, students.phone, courses.course_id,
		courses.course_name, courses.faculty
from students
left join courses
on students.roll_no = courses.roll_no;

select students.name, students.address, students.phone, courses.course_id,
		courses.course_name, courses.faculty
from students
cross join courses;

select students.name, students.address, students.phone, courses.course_id,
		courses.course_name, courses.faculty
from students
cross join courses











