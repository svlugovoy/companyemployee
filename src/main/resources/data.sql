INSERT INTO SKILL(ID, SKILL_NAME) VALUES
  (1, 'Leader'),
  (2, 'Manager'),
  (3, 'Mentor'),
  (4, 'Teacher'),
  (5, 'Math'),
  (6, 'Organizer'),
  (7, 'Public Speaking'),
  (8, 'Team Member');

INSERT INTO COMPANY_CONTACT(ID, CITY, COUNTRY, WWW, COMPANY_ID) VALUES
  (1, 'LA', 'USA', 'google.com', null),
  (2, 'Kyiv', 'Ukraine', 'rozetka.com', null),
  (3, 'Odessa', 'Ukraine', 'ashan.com', null);

INSERT INTO COMPANY(ID, COMPANY_NAME, COMPANY_CONTACT_ID) VALUES
  (1, 'Google', null),
  (2, 'Rozetka', null),
  (3, 'Ashan', null);

UPDATE COMPANY_CONTACT SET COMPANY_ID = 1 WHERE ID = 1;
UPDATE COMPANY_CONTACT SET COMPANY_ID = 2 WHERE ID = 2;
UPDATE COMPANY_CONTACT SET COMPANY_ID = 3 WHERE ID = 3;
-- --
UPDATE COMPANY SET COMPANY_CONTACT_ID = 1 WHERE ID = 1;
UPDATE COMPANY SET COMPANY_CONTACT_ID = 2 WHERE ID = 2;
UPDATE COMPANY SET COMPANY_CONTACT_ID = 3 WHERE ID = 3;


INSERT INTO EMPLOYEE(ID, DATE_OF_BIRTHDAY, NAME, COMPANY_ID) VALUES
  (1, DATE '1980-06-30', 'Vasya', 1),
  (2, DATE '1985-10-15', 'Kolya', 2),
  (3, DATE '1990-03-25', 'Vika', 2),
  (4, DATE '1992-05-13', 'Olya', 3),
  (5, DATE '1988-04-05', 'Egor', 2);


INSERT INTO EMPLOYEE_SKILL(EMPLOYEE_ID, SKILL_ID) VALUES
  (1, 1),
  (1, 5),
  (1, 3),
  (2, 8),
  (2, 6),
  (3, 4),
  (3, 7),
  (3, 1),
  (3, 2),
  (4, 3),
  (4, 5),
  (4, 8),
  (5, 5);