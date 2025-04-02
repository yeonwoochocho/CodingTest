-- 코드를 입력하세요
SELECT year(SALES_DATE) as YEAR, month(SALES_DATE) as MONTH, GENDER, count(distinct os.USER_ID) as USERS
from USER_INFO ui
join ONLINE_SALE os on ui.USER_ID = os.USER_ID
where GENDER is not null
group by YEAR, MONTH, GENDER
order by YEAR, MONTH, GENDER