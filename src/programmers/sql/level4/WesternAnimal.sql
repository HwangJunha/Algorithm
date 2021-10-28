-- https://programmers.co.kr/learn/courses/30/lessons/59045
SELECT ANIMAL_INS.ANIMAL_ID, ANIMAL_INS.ANIMAL_TYPE, ANIMAL_INS.NAME  FROM ANIMAL_INS
inner join ANIMAL_OUTS
on ANIMAL_INS.ANIMAL_ID = ANIMAL_OUTS.ANIMAL_ID
where ANIMAL_INS.SEX_UPON_INTAKE != ANIMAL_OUTS.SEX_UPON_OUTCOME
ORDER BY ANIMAL_INS.ANIMAL_ID;