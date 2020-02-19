drop table Category;
CREATE TABLE Category
(
  CATEGORY_CODE      VARCHAR2(6 BYTE) NOT NULL,
  NAME      VARCHAR2(40 BYTE),
  DEPTH      NUMBER(1),
  SUPER_CATEGORY_CODE VARCHAR2(6 BYTE),
  CAT_ORDER    NUMBER(3),
  CREATE_ID      VARCHAR2(20 BYTE),
  CREATE_DATE    DATE
);

INSERT INTO CATEGORY (CATEGORY_CODE, NAME, DEPTH, CAT_ORDER, CREATE_DATE, CREATE_ID) VALUES ('A', '유형별', 1, 1, SYSDATE, 'SYSTEM');
INSERT INTO CATEGORY (CATEGORY_CODE, NAME, DEPTH, CAT_ORDER, CREATE_DATE, CREATE_ID) VALUES ('B', '라인별', 1, 2, SYSDATE, 'SYSTEM');
INSERT INTO CATEGORY (CATEGORY_CODE, NAME, DEPTH, CAT_ORDER, CREATE_DATE, CREATE_ID) VALUES ('C', '고민별', 1, 3, SYSDATE, 'SYSTEM');
INSERT INTO CATEGORY (CATEGORY_CODE, NAME, DEPTH, CAT_ORDER, CREATE_DATE, CREATE_ID) VALUES ('D', 'NEW', 1, 4, SYSDATE, 'SYSTEM');
INSERT INTO CATEGORY (CATEGORY_CODE, NAME, DEPTH, CAT_ORDER, CREATE_DATE, CREATE_ID) VALUES ('E', 'BEST', 1, 5, SYSDATE, 'SYSTEM');
INSERT INTO CATEGORY (CATEGORY_CODE, NAME, SUPER_CATEGORY_CODE, DEPTH, CAT_ORDER, CREATE_DATE, CREATE_ID) VALUES ('UM', '팩/마스크', 'A', 2, 2, SYSDATE, 'SYSTEM');
INSERT INTO CATEGORY (CATEGORY_CODE, NAME, SUPER_CATEGORY_CODE, DEPTH, CAT_ORDER, CREATE_DATE, CREATE_ID) VALUES ('UC', '페이스메이크업', 'A', 2, 3, SYSDATE, 'SYSTEM');
INSERT INTO CATEGORY (CATEGORY_CODE, NAME, SUPER_CATEGORY_CODE, DEPTH, CAT_ORDER, CREATE_DATE, CREATE_ID) VALUES ('UN', '컬러메이크업', 'A', 2, 4, SYSDATE, 'SYSTEM');
INSERT INTO CATEGORY (CATEGORY_CODE, NAME, SUPER_CATEGORY_CODE, DEPTH, CAT_ORDER, CREATE_DATE, CREATE_ID) VALUES ('UD', '클렌징', 'A', 2, 5, SYSDATE, 'SYSTEM');
INSERT INTO CATEGORY (CATEGORY_CODE, NAME, SUPER_CATEGORY_CODE, DEPTH, CAT_ORDER, CREATE_DATE, CREATE_ID) VALUES ('UF', '바디', 'A', 2, 7, SYSDATE, 'SYSTEM');
INSERT INTO CATEGORY (CATEGORY_CODE, NAME, SUPER_CATEGORY_CODE, DEPTH, CAT_ORDER, CREATE_DATE, CREATE_ID) VALUES ('NA', '네일', 'A', 2, 8, SYSDATE, 'SYSTEM');
INSERT INTO CATEGORY (CATEGORY_CODE, NAME, SUPER_CATEGORY_CODE, DEPTH, CAT_ORDER, CREATE_DATE, CREATE_ID) VALUES ('UG', '헤어', 'A', 2, 8, SYSDATE, 'SYSTEM');
INSERT INTO CATEGORY (CATEGORY_CODE, NAME, SUPER_CATEGORY_CODE, DEPTH, CAT_ORDER, CREATE_DATE, CREATE_ID) VALUES ('UH', '방향', 'A', 2, 9, SYSDATE, 'SYSTEM');
INSERT INTO CATEGORY (CATEGORY_CODE, NAME, SUPER_CATEGORY_CODE, DEPTH, CAT_ORDER, CREATE_DATE, CREATE_ID) VALUES ('UT', '기획 세트', 'A', 2, 10, SYSDATE, 'SYSTEM');
INSERT INTO CATEGORY (CATEGORY_CODE, NAME, SUPER_CATEGORY_CODE, DEPTH, CAT_ORDER, CREATE_DATE, CREATE_ID) VALUES ('UK', '미용소품', 'A', 2, 11, SYSDATE, 'SYSTEM');
INSERT INTO CATEGORY (CATEGORY_CODE, NAME, SUPER_CATEGORY_CODE, DEPTH, CAT_ORDER, CREATE_DATE, CREATE_ID) VALUES ('UB', '남성', 'A', 2, 12, SYSDATE, 'SYSTEM');
INSERT INTO CATEGORY (CATEGORY_CODE, NAME, SUPER_CATEGORY_CODE, DEPTH, CAT_ORDER, CREATE_DATE, CREATE_ID) VALUES ('ST', '라이프 스타일', 'A', 2, 14, SYSDATE, 'SYSTEM');
INSERT INTO CATEGORY (CATEGORY_CODE, NAME, SUPER_CATEGORY_CODE, DEPTH, CAT_ORDER, CREATE_DATE, CREATE_ID) VALUES ('PP', '반려동물 케어', 'A', 2, 13, SYSDATE, 'SYSTEM');
INSERT INTO CATEGORY (CATEGORY_CODE, NAME, SUPER_CATEGORY_CODE, DEPTH, CAT_ORDER, CREATE_DATE, CREATE_ID) VALUES ('HA', '브라이트닝 포어', 'B', 2, 1, SYSDATE, 'SYSTEM');
INSERT INTO CATEGORY (CATEGORY_CODE, NAME, SUPER_CATEGORY_CODE, DEPTH, CAT_ORDER, CREATE_DATE, CREATE_ID) VALUES ('SS', '용암해수', 'B', 2, 1, SYSDATE, 'SYSTEM');
INSERT INTO CATEGORY (CATEGORY_CODE, NAME, SUPER_CATEGORY_CODE, DEPTH, CAT_ORDER, CREATE_DATE, CREATE_ID) VALUES ('LB', '링클 사이언스', 'B', 2, 2, SYSDATE, 'SYSTEM');
INSERT INTO CATEGORY (CATEGORY_CODE, NAME, SUPER_CATEGORY_CODE, DEPTH, CAT_ORDER, CREATE_DATE, CREATE_ID) VALUES ('PO', '퍼스널 원크림', 'B', 2, 2, SYSDATE, 'SYSTEM');
INSERT INTO CATEGORY (CATEGORY_CODE, NAME, SUPER_CATEGORY_CODE, DEPTH, CAT_ORDER, CREATE_DATE, CREATE_ID) VALUES ('TC', '트루케어', 'B', 2, 3, SYSDATE, 'SYSTEM');
INSERT INTO CATEGORY (CATEGORY_CODE, NAME, SUPER_CATEGORY_CODE, DEPTH, CAT_ORDER, CREATE_DATE, CREATE_ID) VALUES ('BL', '제주 왕벚꽃', 'B', 2, 3, SYSDATE, 'SYSTEM');
INSERT INTO CATEGORY (CATEGORY_CODE, NAME, SUPER_CATEGORY_CODE, DEPTH, CAT_ORDER, CREATE_DATE, CREATE_ID) VALUES ('DI', 'Hello 2020 미키와 친구들', 'B', 2, 3, SYSDATE, 'SYSTEM');
INSERT INTO CATEGORY (CATEGORY_CODE, NAME, SUPER_CATEGORY_CODE, DEPTH, CAT_ORDER, CREATE_DATE, CREATE_ID) VALUES ('LK', '그린티', 'B', 2, 4, SYSDATE, 'SYSTEM');
INSERT INTO CATEGORY (CATEGORY_CODE, NAME, SUPER_CATEGORY_CODE, DEPTH, CAT_ORDER, CREATE_DATE, CREATE_ID) VALUES ('SP', '심플라벨', 'B', 2, 4, SYSDATE, 'SYSTEM');
INSERT INTO CATEGORY (CATEGORY_CODE, NAME, SUPER_CATEGORY_CODE, DEPTH, CAT_ORDER, CREATE_DATE, CREATE_ID) VALUES ('LF', '포레스트 포맨', 'B', 2, 4, SYSDATE, 'SYSTEM');
INSERT INTO CATEGORY (CATEGORY_CODE, NAME, SUPER_CATEGORY_CODE, DEPTH, CAT_ORDER, CREATE_DATE, CREATE_ID) VALUES ('DF', '더마포뮬러', 'B', 2, 5, SYSDATE, 'SYSTEM');
INSERT INTO CATEGORY (CATEGORY_CODE, NAME, SUPER_CATEGORY_CODE, DEPTH, CAT_ORDER, CREATE_DATE, CREATE_ID) VALUES ('MC', '마이 메이크업 클렌저', 'B', 2, 6, SYSDATE, 'SYSTEM');
INSERT INTO CATEGORY (CATEGORY_CODE, NAME, SUPER_CATEGORY_CODE, DEPTH, CAT_ORDER, CREATE_DATE, CREATE_ID) VALUES ('HL', '한란', 'B', 2, 7, SYSDATE, 'SYSTEM');
INSERT INTO CATEGORY (CATEGORY_CODE, NAME, SUPER_CATEGORY_CODE, DEPTH, CAT_ORDER, CREATE_DATE, CREATE_ID) VALUES ('LU', '화산송이', 'B', 2, 8, SYSDATE, 'SYSTEM');
INSERT INTO CATEGORY (CATEGORY_CODE, NAME, SUPER_CATEGORY_CODE, DEPTH, CAT_ORDER, CREATE_DATE, CREATE_ID) VALUES ('LI', '비자', 'B', 2, 9, SYSDATE, 'SYSTEM');
INSERT INTO CATEGORY (CATEGORY_CODE, NAME, SUPER_CATEGORY_CODE, DEPTH, CAT_ORDER, CREATE_DATE, CREATE_ID) VALUES ('MY', '마이 헤어 레시피', 'B', 2, 9, SYSDATE, 'SYSTEM');
INSERT INTO CATEGORY (CATEGORY_CODE, NAME, SUPER_CATEGORY_CODE, DEPTH, CAT_ORDER, CREATE_DATE, CREATE_ID) VALUES ('LH', '자연발효', 'B', 2, 10, SYSDATE, 'SYSTEM');
INSERT INTO CATEGORY (CATEGORY_CODE, NAME, SUPER_CATEGORY_CODE, DEPTH, CAT_ORDER, CREATE_DATE, CREATE_ID) VALUES ('CB', '퀵앤이지', 'B', 2, 10, SYSDATE, 'SYSTEM');
INSERT INTO CATEGORY (CATEGORY_CODE, NAME, SUPER_CATEGORY_CODE, DEPTH, CAT_ORDER, CREATE_DATE, CREATE_ID) VALUES ('GH', '진저 허니', 'B', 2, 11, SYSDATE, 'SYSTEM');
INSERT INTO CATEGORY (CATEGORY_CODE, NAME, SUPER_CATEGORY_CODE, DEPTH, CAT_ORDER, CREATE_DATE, CREATE_ID) VALUES ('SF', '슈퍼푸드', 'B', 2, 12, SYSDATE, 'SYSTEM');
INSERT INTO CATEGORY (CATEGORY_CODE, NAME, SUPER_CATEGORY_CODE, DEPTH, CAT_ORDER, CREATE_DATE, CREATE_ID) VALUES ('AS', '아토 수딩', 'B', 2, 13, SYSDATE, 'SYSTEM');
INSERT INTO CATEGORY (CATEGORY_CODE, NAME, SUPER_CATEGORY_CODE, DEPTH, CAT_ORDER, CREATE_DATE, CREATE_ID) VALUES ('LL', '더 미니멈', 'B', 2, 14, SYSDATE, 'SYSTEM');
INSERT INTO CATEGORY (CATEGORY_CODE, NAME, SUPER_CATEGORY_CODE, DEPTH, CAT_ORDER, CREATE_DATE, CREATE_ID) VALUES ('LA', '올리브 리얼', 'B', 2, 15, SYSDATE, 'SYSTEM');
INSERT INTO CATEGORY (CATEGORY_CODE, NAME, SUPER_CATEGORY_CODE, DEPTH, CAT_ORDER, CREATE_DATE, CREATE_ID) VALUES ('LN', '화이트닝 포어', 'B', 2, 16, SYSDATE, 'SYSTEM');
INSERT INTO CATEGORY (CATEGORY_CODE, NAME, SUPER_CATEGORY_CODE, DEPTH, CAT_ORDER, CREATE_DATE, CREATE_ID) VALUES ('BG', '블랙 그린티', 'B', 2, 17, SYSDATE, 'SYSTEM');
INSERT INTO CATEGORY (CATEGORY_CODE, NAME, SUPER_CATEGORY_CODE, DEPTH, CAT_ORDER, CREATE_DATE, CREATE_ID) VALUES ('LQ', '퍼펙트 9리페어', 'B', 2, 18, SYSDATE, 'SYSTEM');
INSERT INTO CATEGORY (CATEGORY_CODE, NAME, SUPER_CATEGORY_CODE, DEPTH, CAT_ORDER, CREATE_DATE, CREATE_ID) VALUES ('CM', '꽃송이버섯', 'B', 2, 19, SYSDATE, 'SYSTEM');
INSERT INTO CATEGORY (CATEGORY_CODE, NAME, SUPER_CATEGORY_CODE, DEPTH, CAT_ORDER, CREATE_DATE, CREATE_ID) VALUES ('LJ', '청보리', 'B', 2, 20, SYSDATE, 'SYSTEM');
INSERT INTO CATEGORY (CATEGORY_CODE, NAME, SUPER_CATEGORY_CODE, DEPTH, CAT_ORDER, CREATE_DATE, CREATE_ID) VALUES ('XA', '수분', 'C', 2, 1, SYSDATE, 'SYSTEM');
INSERT INTO CATEGORY (CATEGORY_CODE, NAME, SUPER_CATEGORY_CODE, DEPTH, CAT_ORDER, CREATE_DATE, CREATE_ID) VALUES ('XB', '보습', 'C', 2, 2, SYSDATE, 'SYSTEM');
INSERT INTO CATEGORY (CATEGORY_CODE, NAME, SUPER_CATEGORY_CODE, DEPTH, CAT_ORDER, CREATE_DATE, CREATE_ID) VALUES ('XC', '트러블', 'C', 2, 3, SYSDATE, 'SYSTEM');
INSERT INTO CATEGORY (CATEGORY_CODE, NAME, SUPER_CATEGORY_CODE, DEPTH, CAT_ORDER, CREATE_DATE, CREATE_ID) VALUES ('XD', '안티에이징', 'C', 2, 4, SYSDATE, 'SYSTEM');
INSERT INTO CATEGORY (CATEGORY_CODE, NAME, SUPER_CATEGORY_CODE, DEPTH, CAT_ORDER, CREATE_DATE, CREATE_ID) VALUES ('XE', '모공', 'C', 2, 5, SYSDATE, 'SYSTEM');
INSERT INTO CATEGORY (CATEGORY_CODE, NAME, SUPER_CATEGORY_CODE, DEPTH, CAT_ORDER, CREATE_DATE, CREATE_ID) VALUES ('XF', '진정', 'C', 2, 6, SYSDATE, 'SYSTEM');
INSERT INTO CATEGORY (CATEGORY_CODE, NAME, SUPER_CATEGORY_CODE, DEPTH, CAT_ORDER, CREATE_DATE, CREATE_ID) VALUES ('XG', '화이트닝', 'C', 2, 7, SYSDATE, 'SYSTEM');
INSERT INTO CATEGORY (CATEGORY_CODE, NAME, SUPER_CATEGORY_CODE, DEPTH, CAT_ORDER, CREATE_DATE, CREATE_ID) VALUES ('XH', '각질', 'C', 2, 8, SYSDATE, 'SYSTEM');
INSERT INTO CATEGORY (CATEGORY_CODE, NAME, SUPER_CATEGORY_CODE, DEPTH, CAT_ORDER, CREATE_DATE, CREATE_ID) VALUES ('UTQW', '기획 세트', 'UT', 3, 1, SYSDATE, 'SYSTEM');
INSERT INTO CATEGORY (CATEGORY_CODE, NAME, SUPER_CATEGORY_CODE, DEPTH, CAT_ORDER, CREATE_DATE, CREATE_ID) VALUES ('UNMP', '마이 팔레트', 'UN', 3, 1, SYSDATE, 'SYSTEM');
INSERT INTO CATEGORY (CATEGORY_CODE, NAME, SUPER_CATEGORY_CODE, DEPTH, CAT_ORDER, CREATE_DATE, CREATE_ID) VALUES ('UMBB', '시트 마스크', 'UM', 3, 1, SYSDATE, 'SYSTEM');
INSERT INTO CATEGORY (CATEGORY_CODE, NAME, SUPER_CATEGORY_CODE, DEPTH, CAT_ORDER, CREATE_DATE, CREATE_ID) VALUES ('UKAA', '브러시', 'UK', 3, 1, SYSDATE, 'SYSTEM');
INSERT INTO CATEGORY (CATEGORY_CODE, NAME, SUPER_CATEGORY_CODE, DEPTH, CAT_ORDER, CREATE_DATE, CREATE_ID) VALUES ('UHPB', '퍼퓸', 'UH', 3, 1, SYSDATE, 'SYSTEM');
INSERT INTO CATEGORY (CATEGORY_CODE, NAME, SUPER_CATEGORY_CODE, DEPTH, CAT_ORDER, CREATE_DATE, CREATE_ID) VALUES ('UGAA', '샴푸', 'UG', 3, 1, SYSDATE, 'SYSTEM');
INSERT INTO CATEGORY (CATEGORY_CODE, NAME, SUPER_CATEGORY_CODE, DEPTH, CAT_ORDER, CREATE_DATE, CREATE_ID) VALUES ('UDAA', '클렌징 폼', 'UD', 3, 1, SYSDATE, 'SYSTEM');
INSERT INTO CATEGORY (CATEGORY_CODE, NAME, SUPER_CATEGORY_CODE, DEPTH, CAT_ORDER, CREATE_DATE, CREATE_ID) VALUES ('UCMF', '마이파운데이션', 'UC', 3, 1, SYSDATE, 'SYSTEM');
INSERT INTO CATEGORY (CATEGORY_CODE, NAME, SUPER_CATEGORY_CODE, DEPTH, CAT_ORDER, CREATE_DATE, CREATE_ID) VALUES ('UCAA', '쿠션', 'UC', 3, 1, SYSDATE, 'SYSTEM');
INSERT INTO CATEGORY (CATEGORY_CODE, NAME, SUPER_CATEGORY_CODE, DEPTH, CAT_ORDER, CREATE_DATE, CREATE_ID) VALUES ('UBBB', '스킨', 'UB', 3, 1, SYSDATE, 'SYSTEM');
INSERT INTO CATEGORY (CATEGORY_CODE, NAME, SUPER_CATEGORY_CODE, DEPTH, CAT_ORDER, CREATE_DATE, CREATE_ID) VALUES ('STCL', '의류', 'ST', 3, 1, SYSDATE, 'SYSTEM');
INSERT INTO CATEGORY (CATEGORY_CODE, NAME, SUPER_CATEGORY_CODE, DEPTH, CAT_ORDER, CREATE_DATE, CREATE_ID) VALUES ('NANS', '네일 스티커', 'NA', 3, 1, SYSDATE, 'SYSTEM');
INSERT INTO CATEGORY (CATEGORY_CODE, NAME, SUPER_CATEGORY_CODE, DEPTH, CAT_ORDER, CREATE_DATE, CREATE_ID) VALUES ('NANC', '네일 컬러', 'NA', 3, 1, SYSDATE, 'SYSTEM');
INSERT INTO CATEGORY (CATEGORY_CODE, NAME, SUPER_CATEGORY_CODE, DEPTH, CAT_ORDER, CREATE_DATE, CREATE_ID) VALUES ('NAJS', '글로스 젤네일 스트립', 'NA', 3, 1, SYSDATE, 'SYSTEM');
INSERT INTO CATEGORY (CATEGORY_CODE, NAME, SUPER_CATEGORY_CODE, DEPTH, CAT_ORDER, CREATE_DATE, CREATE_ID) VALUES ('PPSH', '샴푸', 'PP', 3, 1, SYSDATE, 'SYSTEM');
INSERT INTO CATEGORY (CATEGORY_CODE, NAME, SUPER_CATEGORY_CODE, DEPTH, CAT_ORDER, CREATE_DATE, CREATE_ID) VALUES ('UAAA', '스킨', 'UA', 3, 2, SYSDATE, 'SYSTEM');
INSERT INTO CATEGORY (CATEGORY_CODE, NAME, SUPER_CATEGORY_CODE, DEPTH, CAT_ORDER, CREATE_DATE, CREATE_ID) VALUES ('UABB', '로션', 'UA', 3, 2, SYSDATE, 'SYSTEM');
INSERT INTO CATEGORY (CATEGORY_CODE, NAME, SUPER_CATEGORY_CODE, DEPTH, CAT_ORDER, CREATE_DATE, CREATE_ID) VALUES ('UBDD', '에센스/크림', 'UB', 3, 2, SYSDATE, 'SYSTEM');
INSERT INTO CATEGORY (CATEGORY_CODE, NAME, SUPER_CATEGORY_CODE, DEPTH, CAT_ORDER, CREATE_DATE, CREATE_ID) VALUES ('UFAA', '바디 클렌저', 'UF', 3, 2, SYSDATE, 'SYSTEM');
INSERT INTO CATEGORY (CATEGORY_CODE, NAME, SUPER_CATEGORY_CODE, DEPTH, CAT_ORDER, CREATE_DATE, CREATE_ID) VALUES ('UGBB', '트리트먼트', 'UG', 3, 2, SYSDATE, 'SYSTEM');
INSERT INTO CATEGORY (CATEGORY_CODE, NAME, SUPER_CATEGORY_CODE, DEPTH, CAT_ORDER, CREATE_DATE, CREATE_ID) VALUES ('STEB', '에코백', 'ST', 3, 2, SYSDATE, 'SYSTEM');
INSERT INTO CATEGORY (CATEGORY_CODE, NAME, SUPER_CATEGORY_CODE, DEPTH, CAT_ORDER, CREATE_DATE, CREATE_ID) VALUES ('UKAB', '퍼프/스펀지', 'UK', 3, 2, SYSDATE, 'SYSTEM');
INSERT INTO CATEGORY (CATEGORY_CODE, NAME, SUPER_CATEGORY_CODE, DEPTH, CAT_ORDER, CREATE_DATE, CREATE_ID) VALUES ('UMAA', '워시 오프 팩', 'UM', 3, 2, SYSDATE, 'SYSTEM');
INSERT INTO CATEGORY (CATEGORY_CODE, NAME, SUPER_CATEGORY_CODE, DEPTH, CAT_ORDER, CREATE_DATE, CREATE_ID) VALUES ('UNMC', '마이 팔레트 케이스', 'UN', 3, 2, SYSDATE, 'SYSTEM');
INSERT INTO CATEGORY (CATEGORY_CODE, NAME, SUPER_CATEGORY_CODE, DEPTH, CAT_ORDER, CREATE_DATE, CREATE_ID) VALUES ('NAMP', '매직프레스', 'NA', 3, 2, SYSDATE, 'SYSTEM');
INSERT INTO CATEGORY (CATEGORY_CODE, NAME, SUPER_CATEGORY_CODE, DEPTH, CAT_ORDER, CREATE_DATE, CREATE_ID) VALUES ('UHSP', '스틱 퍼퓸', 'UH', 3, 2, SYSDATE, 'SYSTEM');
INSERT INTO CATEGORY (CATEGORY_CODE, NAME, SUPER_CATEGORY_CODE, DEPTH, CAT_ORDER, CREATE_DATE, CREATE_ID) VALUES ('UDBB', '클렌징 오일/워터', 'UD', 3, 3, SYSDATE, 'SYSTEM');
INSERT INTO CATEGORY (CATEGORY_CODE, NAME, SUPER_CATEGORY_CODE, DEPTH, CAT_ORDER, CREATE_DATE, CREATE_ID) VALUES ('UNBB', '아이섀도우', 'UN', 3, 3, SYSDATE, 'SYSTEM');
INSERT INTO CATEGORY (CATEGORY_CODE, NAME, SUPER_CATEGORY_CODE, DEPTH, CAT_ORDER, CREATE_DATE, CREATE_ID) VALUES ('UDCC', '클렌징 크림/젤', 'UD', 3, 3, SYSDATE, 'SYSTEM');
INSERT INTO CATEGORY (CATEGORY_CODE, NAME, SUPER_CATEGORY_CODE, DEPTH, CAT_ORDER, CREATE_DATE, CREATE_ID) VALUES ('UFBB', '바디 로션/크림', 'UF', 3, 3, SYSDATE, 'SYSTEM');
INSERT INTO CATEGORY (CATEGORY_CODE, NAME, SUPER_CATEGORY_CODE, DEPTH, CAT_ORDER, CREATE_DATE, CREATE_ID) VALUES ('UFFZ', '바디 오일/미스트', 'UF', 3, 3, SYSDATE, 'SYSTEM');
INSERT INTO CATEGORY (CATEGORY_CODE, NAME, SUPER_CATEGORY_CODE, DEPTH, CAT_ORDER, CREATE_DATE, CREATE_ID) VALUES ('UGXX', '헤어 에센스/세럼', 'UG', 3, 3, SYSDATE, 'SYSTEM');
INSERT INTO CATEGORY (CATEGORY_CODE, NAME, SUPER_CATEGORY_CODE, DEPTH, CAT_ORDER, CREATE_DATE, CREATE_ID) VALUES ('UKAC', '메이크업 소품', 'UK', 3, 3, SYSDATE, 'SYSTEM');
INSERT INTO CATEGORY (CATEGORY_CODE, NAME, SUPER_CATEGORY_CODE, DEPTH, CAT_ORDER, CREATE_DATE, CREATE_ID) VALUES ('UKMY', '화장솜/면봉/기름종이', 'UK', 3, 3, SYSDATE, 'SYSTEM');
INSERT INTO CATEGORY (CATEGORY_CODE, NAME, SUPER_CATEGORY_CODE, DEPTH, CAT_ORDER, CREATE_DATE, CREATE_ID) VALUES ('UMEE', '슬리핑 팩', 'UM', 3, 3, SYSDATE, 'SYSTEM');
INSERT INTO CATEGORY (CATEGORY_CODE, NAME, SUPER_CATEGORY_CODE, DEPTH, CAT_ORDER, CREATE_DATE, CREATE_ID) VALUES ('NAGD', '젤네일 디자인 팁', 'NA', 3, 3, SYSDATE, 'SYSTEM');
INSERT INTO CATEGORY (CATEGORY_CODE, NAME, SUPER_CATEGORY_CODE, DEPTH, CAT_ORDER, CREATE_DATE, CREATE_ID) VALUES ('UASC', '선케어', 'UA', 3, 3, SYSDATE, 'SYSTEM');
INSERT INTO CATEGORY (CATEGORY_CODE, NAME, SUPER_CATEGORY_CODE, DEPTH, CAT_ORDER, CREATE_DATE, CREATE_ID) VALUES ('UCEE', '컨실러', 'UC', 3, 3, SYSDATE, 'SYSTEM');
INSERT INTO CATEGORY (CATEGORY_CODE, NAME, SUPER_CATEGORY_CODE, DEPTH, CAT_ORDER, CREATE_DATE, CREATE_ID) VALUES ('UBSB', '로션', 'UB', 3, 3, SYSDATE, 'SYSTEM');
INSERT INTO CATEGORY (CATEGORY_CODE, NAME, SUPER_CATEGORY_CODE, DEPTH, CAT_ORDER, CREATE_DATE, CREATE_ID) VALUES ('UDCT', '클렌징 티슈', 'UD', 3, 4, SYSDATE, 'SYSTEM');
INSERT INTO CATEGORY (CATEGORY_CODE, NAME, SUPER_CATEGORY_CODE, DEPTH, CAT_ORDER, CREATE_DATE, CREATE_ID) VALUES ('UFDD', '바디 스크럽', 'UF', 3, 4, SYSDATE, 'SYSTEM');
INSERT INTO CATEGORY (CATEGORY_CODE, NAME, SUPER_CATEGORY_CODE, DEPTH, CAT_ORDER, CREATE_DATE, CREATE_ID) VALUES ('UGCD', '헤어 마스크팩', 'UG', 3, 4, SYSDATE, 'SYSTEM');
INSERT INTO CATEGORY (CATEGORY_CODE, NAME, SUPER_CATEGORY_CODE, DEPTH, CAT_ORDER, CREATE_DATE, CREATE_ID) VALUES ('UHJJ', '퍼퓸드 미스트', 'UH', 3, 4, SYSDATE, 'SYSTEM');
INSERT INTO CATEGORY (CATEGORY_CODE, NAME, SUPER_CATEGORY_CODE, DEPTH, CAT_ORDER, CREATE_DATE, CREATE_ID) VALUES ('UKBB', '클렌징 소품', 'UK', 3, 4, SYSDATE, 'SYSTEM');
INSERT INTO CATEGORY (CATEGORY_CODE, NAME, SUPER_CATEGORY_CODE, DEPTH, CAT_ORDER, CREATE_DATE, CREATE_ID) VALUES ('UMAB', '필 오프 팩', 'UM', 3, 4, SYSDATE, 'SYSTEM');
INSERT INTO CATEGORY (CATEGORY_CODE, NAME, SUPER_CATEGORY_CODE, DEPTH, CAT_ORDER, CREATE_DATE, CREATE_ID) VALUES ('UNAB', '블러셔', 'UN', 3, 4, SYSDATE, 'SYSTEM');
INSERT INTO CATEGORY (CATEGORY_CODE, NAME, SUPER_CATEGORY_CODE, DEPTH, CAT_ORDER, CREATE_DATE, CREATE_ID) VALUES ('STPE', '문구', 'ST', 3, 4, SYSDATE, 'SYSTEM');
INSERT INTO CATEGORY (CATEGORY_CODE, NAME, SUPER_CATEGORY_CODE, DEPTH, CAT_ORDER, CREATE_DATE, CREATE_ID) VALUES ('UACC', '에센스/세럼', 'UA', 3, 4, SYSDATE, 'SYSTEM');
INSERT INTO CATEGORY (CATEGORY_CODE, NAME, SUPER_CATEGORY_CODE, DEPTH, CAT_ORDER, CREATE_DATE, CREATE_ID) VALUES ('UANO', '페이스 오일', 'UA', 3, 4, SYSDATE, 'SYSTEM');
INSERT INTO CATEGORY (CATEGORY_CODE, NAME, SUPER_CATEGORY_CODE, DEPTH, CAT_ORDER, CREATE_DATE, CREATE_ID) VALUES ('UCBB', '베이스/프라이머', 'UC', 3, 4, SYSDATE, 'SYSTEM');
INSERT INTO CATEGORY (CATEGORY_CODE, NAME, SUPER_CATEGORY_CODE, DEPTH, CAT_ORDER, CREATE_DATE, CREATE_ID) VALUES ('UCCC', '파운데이션/BB', 'UC', 3, 4, SYSDATE, 'SYSTEM');
INSERT INTO CATEGORY (CATEGORY_CODE, NAME, SUPER_CATEGORY_CODE, DEPTH, CAT_ORDER, CREATE_DATE, CREATE_ID) VALUES ('NANA', '네일 케어 및 리무버', 'NA', 3, 5, SYSDATE, 'SYSTEM');
INSERT INTO CATEGORY (CATEGORY_CODE, NAME, SUPER_CATEGORY_CODE, DEPTH, CAT_ORDER, CREATE_DATE, CREATE_ID) VALUES ('UBFF', '선케어/BB', 'UB', 3, 5, SYSDATE, 'SYSTEM');
INSERT INTO CATEGORY (CATEGORY_CODE, NAME, SUPER_CATEGORY_CODE, DEPTH, CAT_ORDER, CREATE_DATE, CREATE_ID) VALUES ('UCDD', '팩트/파우더', 'UC', 3, 5, SYSDATE, 'SYSTEM');
INSERT INTO CATEGORY (CATEGORY_CODE, NAME, SUPER_CATEGORY_CODE, DEPTH, CAT_ORDER, CREATE_DATE, CREATE_ID) VALUES ('UDCS', '클렌징 바', 'UD', 3, 5, SYSDATE, 'SYSTEM');
INSERT INTO CATEGORY (CATEGORY_CODE, NAME, SUPER_CATEGORY_CODE, DEPTH, CAT_ORDER, CREATE_DATE, CREATE_ID) VALUES ('UFEE', '핸드/풋 케어', 'UF', 3, 5, SYSDATE, 'SYSTEM');
INSERT INTO CATEGORY (CATEGORY_CODE, NAME, SUPER_CATEGORY_CODE, DEPTH, CAT_ORDER, CREATE_DATE, CREATE_ID) VALUES ('UFFF', '제모/데오드란트', 'UF', 3, 5, SYSDATE, 'SYSTEM');
INSERT INTO CATEGORY (CATEGORY_CODE, NAME, SUPER_CATEGORY_CODE, DEPTH, CAT_ORDER, CREATE_DATE, CREATE_ID) VALUES ('UGHM', '헤어 메이크업', 'UG', 3, 5, SYSDATE, 'SYSTEM');
INSERT INTO CATEGORY (CATEGORY_CODE, NAME, SUPER_CATEGORY_CODE, DEPTH, CAT_ORDER, CREATE_DATE, CREATE_ID) VALUES ('UKDD', '네일 소품', 'UK', 3, 5, SYSDATE, 'SYSTEM');
INSERT INTO CATEGORY (CATEGORY_CODE, NAME, SUPER_CATEGORY_CODE, DEPTH, CAT_ORDER, CREATE_DATE, CREATE_ID) VALUES ('UMBC', '부분 마스크', 'UM', 3, 5, SYSDATE, 'SYSTEM');
INSERT INTO CATEGORY (CATEGORY_CODE, NAME, SUPER_CATEGORY_CODE, DEPTH, CAT_ORDER, CREATE_DATE, CREATE_ID) VALUES ('UNAA', '마스카라', 'UN', 3, 5, SYSDATE, 'SYSTEM');
INSERT INTO CATEGORY (CATEGORY_CODE, NAME, SUPER_CATEGORY_CODE, DEPTH, CAT_ORDER, CREATE_DATE, CREATE_ID) VALUES ('UHRW', '룸 워터', 'UH', 3, 6, SYSDATE, 'SYSTEM');
INSERT INTO CATEGORY (CATEGORY_CODE, NAME, SUPER_CATEGORY_CODE, DEPTH, CAT_ORDER, CREATE_DATE, CREATE_ID) VALUES ('UGCC', '헤어 스타일링', 'UG', 3, 6, SYSDATE, 'SYSTEM');
INSERT INTO CATEGORY (CATEGORY_CODE, NAME, SUPER_CATEGORY_CODE, DEPTH, CAT_ORDER, CREATE_DATE, CREATE_ID) VALUES ('UDPS', '필링/스크럽', 'UD', 3, 6, SYSDATE, 'SYSTEM');
INSERT INTO CATEGORY (CATEGORY_CODE, NAME, SUPER_CATEGORY_CODE, DEPTH, CAT_ORDER, CREATE_DATE, CREATE_ID) VALUES ('UBII', '헤어 스타일링', 'UB', 3, 6, SYSDATE, 'SYSTEM');
INSERT INTO CATEGORY (CATEGORY_CODE, NAME, SUPER_CATEGORY_CODE, DEPTH, CAT_ORDER, CREATE_DATE, CREATE_ID) VALUES ('UBEE', '쉐이빙/클렌징 폼', 'UB', 3, 6, SYSDATE, 'SYSTEM');
INSERT INTO CATEGORY (CATEGORY_CODE, NAME, SUPER_CATEGORY_CODE, DEPTH, CAT_ORDER, CREATE_DATE, CREATE_ID) VALUES ('UNFF', '컨투어링/하이라이터', 'UN', 3, 6, SYSDATE, 'SYSTEM');
INSERT INTO CATEGORY (CATEGORY_CODE, NAME, SUPER_CATEGORY_CODE, DEPTH, CAT_ORDER, CREATE_DATE, CREATE_ID) VALUES ('UADD', '크림/젤', 'UA', 3, 6, SYSDATE, 'SYSTEM');
INSERT INTO CATEGORY (CATEGORY_CODE, NAME, SUPER_CATEGORY_CODE, DEPTH, CAT_ORDER, CREATE_DATE, CREATE_ID) VALUES ('NANT', '네일 소품', 'NA', 3, 6, SYSDATE, 'SYSTEM');
INSERT INTO CATEGORY (CATEGORY_CODE, NAME, SUPER_CATEGORY_CODE, DEPTH, CAT_ORDER, CREATE_DATE, CREATE_ID) VALUES ('UMDD', '기획 세트', 'UM', 3, 6, SYSDATE, 'SYSTEM');
INSERT INTO CATEGORY (CATEGORY_CODE, NAME, SUPER_CATEGORY_CODE, DEPTH, CAT_ORDER, CREATE_DATE, CREATE_ID) VALUES ('UNCC', '아이라이너', 'UN', 3, 6, SYSDATE, 'SYSTEM');
INSERT INTO CATEGORY (CATEGORY_CODE, NAME, SUPER_CATEGORY_CODE, DEPTH, CAT_ORDER, CREATE_DATE, CREATE_ID) VALUES ('UAJJ', '마사지', 'UA', 3, 6, SYSDATE, 'SYSTEM');
INSERT INTO CATEGORY (CATEGORY_CODE, NAME, SUPER_CATEGORY_CODE, DEPTH, CAT_ORDER, CREATE_DATE, CREATE_ID) VALUES ('UKCC', '바디 소품', 'UK', 3, 7, SYSDATE, 'SYSTEM');
INSERT INTO CATEGORY (CATEGORY_CODE, NAME, SUPER_CATEGORY_CODE, DEPTH, CAT_ORDER, CREATE_DATE, CREATE_ID) VALUES ('UHEE', '디퓨저', 'UH', 3, 7, SYSDATE, 'SYSTEM');
INSERT INTO CATEGORY (CATEGORY_CODE, NAME, SUPER_CATEGORY_CODE, DEPTH, CAT_ORDER, CREATE_DATE, CREATE_ID) VALUES ('UGCV', '헤어 미스트', 'UG', 3, 7, SYSDATE, 'SYSTEM');
INSERT INTO CATEGORY (CATEGORY_CODE, NAME, SUPER_CATEGORY_CODE, DEPTH, CAT_ORDER, CREATE_DATE, CREATE_ID) VALUES ('UFWC', '여성청결제', 'UF', 3, 7, SYSDATE, 'SYSTEM');
INSERT INTO CATEGORY (CATEGORY_CODE, NAME, SUPER_CATEGORY_CODE, DEPTH, CAT_ORDER, CREATE_DATE, CREATE_ID) VALUES ('UDDD', '기타', 'UD', 3, 7, SYSDATE, 'SYSTEM');
INSERT INTO CATEGORY (CATEGORY_CODE, NAME, SUPER_CATEGORY_CODE, DEPTH, CAT_ORDER, CREATE_DATE, CREATE_ID) VALUES ('UASS', '립 케어', 'UA', 3, 7, SYSDATE, 'SYSTEM');
INSERT INTO CATEGORY (CATEGORY_CODE, NAME, SUPER_CATEGORY_CODE, DEPTH, CAT_ORDER, CREATE_DATE, CREATE_ID) VALUES ('UAEE', '아이 케어', 'UA', 3, 7, SYSDATE, 'SYSTEM');
INSERT INTO CATEGORY (CATEGORY_CODE, NAME, SUPER_CATEGORY_CODE, DEPTH, CAT_ORDER, CREATE_DATE, CREATE_ID) VALUES ('NASP', '기획 상품', 'NA', 3, 7, SYSDATE, 'SYSTEM');
INSERT INTO CATEGORY (CATEGORY_CODE, NAME, SUPER_CATEGORY_CODE, DEPTH, CAT_ORDER, CREATE_DATE, CREATE_ID) VALUES ('UNCA', '아이브로우', 'UN', 3, 7, SYSDATE, 'SYSTEM');
INSERT INTO CATEGORY (CATEGORY_CODE, NAME, SUPER_CATEGORY_CODE, DEPTH, CAT_ORDER, CREATE_DATE, CREATE_ID) VALUES ('UAKK', '미스트', 'UA', 3, 8, SYSDATE, 'SYSTEM');
INSERT INTO CATEGORY (CATEGORY_CODE, NAME, SUPER_CATEGORY_CODE, DEPTH, CAT_ORDER, CREATE_DATE, CREATE_ID) VALUES ('UBSE', '기획 세트', 'UB', 3, 8, SYSDATE, 'SYSTEM');
INSERT INTO CATEGORY (CATEGORY_CODE, NAME, SUPER_CATEGORY_CODE, DEPTH, CAT_ORDER, CREATE_DATE, CREATE_ID) VALUES ('UFGG', '기타', 'UF', 3, 8, SYSDATE, 'SYSTEM');
INSERT INTO CATEGORY (CATEGORY_CODE, NAME, SUPER_CATEGORY_CODE, DEPTH, CAT_ORDER, CREATE_DATE, CREATE_ID) VALUES ('UMHH', '기타', 'UM', 3, 8, SYSDATE, 'SYSTEM');
INSERT INTO CATEGORY (CATEGORY_CODE, NAME, SUPER_CATEGORY_CODE, DEPTH, CAT_ORDER, CREATE_DATE, CREATE_ID) VALUES ('UHGG', '캔들', 'UH', 3, 8, SYSDATE, 'SYSTEM');
INSERT INTO CATEGORY (CATEGORY_CODE, NAME, SUPER_CATEGORY_CODE, DEPTH, CAT_ORDER, CREATE_DATE, CREATE_ID) VALUES ('UHHH', '샤쉐', 'UH', 3, 8, SYSDATE, 'SYSTEM');
INSERT INTO CATEGORY (CATEGORY_CODE, NAME, SUPER_CATEGORY_CODE, DEPTH, CAT_ORDER, CREATE_DATE, CREATE_ID) VALUES ('UKMB', '헤어 소품', 'UK', 3, 8, SYSDATE, 'SYSTEM');
INSERT INTO CATEGORY (CATEGORY_CODE, NAME, SUPER_CATEGORY_CODE, DEPTH, CAT_ORDER, CREATE_DATE, CREATE_ID) VALUES ('UKXX', '기타 소품', 'UK', 3, 8, SYSDATE, 'SYSTEM');
INSERT INTO CATEGORY (CATEGORY_CODE, NAME, SUPER_CATEGORY_CODE, DEPTH, CAT_ORDER, CREATE_DATE, CREATE_ID) VALUES ('UGDD', '헤어 컬러링', 'UG', 3, 8, SYSDATE, 'SYSTEM');
INSERT INTO CATEGORY (CATEGORY_CODE, NAME, SUPER_CATEGORY_CODE, DEPTH, CAT_ORDER, CREATE_DATE, CREATE_ID) VALUES ('UAST', '기획 세트', 'UA', 3, 9, SYSDATE, 'SYSTEM');
INSERT INTO CATEGORY (CATEGORY_CODE, NAME, SUPER_CATEGORY_CODE, DEPTH, CAT_ORDER, CREATE_DATE, CREATE_ID) VALUES ('UHEO', '디퓨저 악세사리', 'UH', 3, 9, SYSDATE, 'SYSTEM');
INSERT INTO CATEGORY (CATEGORY_CODE, NAME, SUPER_CATEGORY_CODE, DEPTH, CAT_ORDER, CREATE_DATE, CREATE_ID) VALUES ('UGAD', '헤어 기타', 'UG', 3, 9, SYSDATE, 'SYSTEM');
INSERT INTO CATEGORY (CATEGORY_CODE, NAME, SUPER_CATEGORY_CODE, DEPTH, CAT_ORDER, CREATE_DATE, CREATE_ID) VALUES ('UAHH', '기타', 'UA', 3, 10, SYSDATE, 'SYSTEM');
INSERT INTO CATEGORY (CATEGORY_CODE, NAME, SUPER_CATEGORY_CODE, DEPTH, CAT_ORDER, CREATE_DATE, CREATE_ID) VALUES ('UBGG', '기타', 'UB', 3, 10, SYSDATE, 'SYSTEM');
INSERT INTO CATEGORY (CATEGORY_CODE, NAME, SUPER_CATEGORY_CODE, DEPTH, CAT_ORDER, CREATE_DATE, CREATE_ID) VALUES ('UNEE', '립스틱/ 립밤', 'UN', 3, 10, SYSDATE, 'SYSTEM');
INSERT INTO CATEGORY (CATEGORY_CODE, NAME, SUPER_CATEGORY_CODE, DEPTH, CAT_ORDER, CREATE_DATE, CREATE_ID) VALUES ('UNHH', '립틴트/립글로즈', 'UN', 3, 11, SYSDATE, 'SYSTEM');
INSERT INTO CATEGORY (CATEGORY_CODE, NAME, SUPER_CATEGORY_CODE, DEPTH, CAT_ORDER, CREATE_DATE, CREATE_ID) VALUES ('UASD', '대용량', 'UA', 3, 13, SYSDATE, 'SYSTEM');
INSERT INTO CATEGORY (CATEGORY_CODE, NAME, SUPER_CATEGORY_CODE, DEPTH, CAT_ORDER, CREATE_DATE, CREATE_ID) VALUES ('UDBC', '바디클렌저', 'UD', 3, 13, SYSDATE, 'SYSTEM');
INSERT INTO CATEGORY (CATEGORY_CODE, NAME, SUPER_CATEGORY_CODE, DEPTH, CAT_ORDER, CREATE_DATE, CREATE_ID) VALUES ('UNSE', '기획 상품', 'UN', 3, 99, SYSDATE, 'SYSTEM');