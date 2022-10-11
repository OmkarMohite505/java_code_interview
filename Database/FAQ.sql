use iacsdmar22;

select * from emp;

select * from emp
order by sal desc;

# 3rd highest salary

select * from emp
order by sal desc
limit 2,1;

# 2nd Method
select * 
from emp e1
where 3-1=
(select count(distinct sal)
from emp e2
where e2.sal>e1.sal
);

#for Max
select * from emp where sal=(select max(sal) from emp);

#------------------

# Duplicate Rows

select * ,count(empno)
from emp
group by empno
having count(empno)>1;

select *, count(sal)
from emp
group by sal
having count(sal)>1;

# distinct values
select distinct(job)
from emp;

#Even Odd Records

#Even
select * from emp
where mod(empno,2)=0;

#Odd
select * from emp
where mod(empno,2)=1;





