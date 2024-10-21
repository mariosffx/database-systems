select sum(credits * points)
from takes, course, grade_points
where takes.grade = grade_points.grade and
      takes.course_id = course.course_id and
      ID = '12345';



select sum(credits * points)/sum(credits) as GPA
from takes, course, grade_points
where takes.grade = grade_points.grade and
      takes.course_id = course.course_id and
      ID = '12345';



select ID, sum(credits * points)/sum(credits) as GPA
from takes, course, grade_points
where takes.grade = grade_points.grade and
      takes.course_id = course.course_id
group by ID;


