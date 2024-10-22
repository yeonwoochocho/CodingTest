-- 코드를 입력하세요
SELECT u.user_id, u.nickname, sum(b.price) as total_sales
from used_goods_board b join used_goods_user u on b.writer_id = u.user_id
WHERE STATUS = 'DONE'
GROUP BY USER_ID,NICKNAME
HAVING SUM(b.PRICE) >= 700000
order by sum(b.price)