## MariaDB 세팅
```sql
-- 모든 IP로 접근 가능한 유저 생성
CREATE USER 'market'@'%' IDENTIFIED BY 'password';

-- DB 생성
CREATE DATABASE marketdb;

-- 모든 권한을 줌
GRANT ALL PRIVILEGES ON marketdb.* TO 'market'@'%';
```