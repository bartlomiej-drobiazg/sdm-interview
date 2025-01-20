INSERT INTO STUDENTS
    (first_name, last_name, email, position)
VALUES ('John', 'Doe', 'john.doe@gmail.com', 'ABC'),
       ('Adam', 'Jones', 'adam.jones@gmail.com', 'ABC'),
       ('Susan', 'Simpson', 'susan.simpson@gmail.com', 'ABC');

INSERT INTO COURSES
    (name)
VALUES ('Chemistry'),
       ('Physics'),
       ('Biology'),
       ('Art History');

INSERT INTO MARKS
    (student_id, course_id, date, mark)
VALUES (1, 1, '2025-01-02', '5'),
       (1, 3, '2025-01-02', '4'),
       (1, 4, '2025-01-02', '3'),
       (2, 1, '2025-01-02', '5'),
       (2, 2, '2025-01-02', '4'),
       (3, 1, '2025-01-02', '2'),
       (3, 4, '2025-01-02', '5');
