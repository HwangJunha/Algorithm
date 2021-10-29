--https://programmers.co.kr/learn/courses/30/lessons/59043
SELECT ANIMAL_INS.ANIMAL_ID, ANIMAL_INS.NAME FROM ANIMAL_INS
inner join ANIMAL_OUTS
on ANIMAL_INS.ANIMAL_ID = ANIMAL_OUTS.ANIMAL_ID
where to_char(ANIMAL_INS.DATETIME,'YYYY-MM-DD HH24:MI:SS') > to_char(ANIMAL_OUTS.DATETIME,'YYYY-MM-DD HH24:MI:SS')
ORDER BY ANIMAL_INS.DATETIME;