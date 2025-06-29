CREATE TABLE employees (
    emp_id NUMBER PRIMARY KEY,
    emp_name VARCHAR2(50),
    salary NUMBER
);

-- Insert sample data
INSERT INTO employees VALUES (101, 'Raktim', 6000);
INSERT INTO employees VALUES (102, 'Raj', 7500);
COMMIT;

CREATE OR REPLACE PROCEDURE show_salary (
    p_emp_id IN NUMBER
) IS
    v_salary NUMBER;
BEGIN
    SELECT salary INTO v_salary
    FROM employees
    WHERE emp_id = p_emp_id;

    DBMS_OUTPUT.PUT_LINE('Employee ID: ' || p_emp_id || ' | Salary: ' || v_salary);
EXCEPTION
    WHEN NO_DATA_FOUND THEN
        DBMS_OUTPUT.PUT_LINE('Employee not found.');
END;

BEGIN
    show_salary(101);  
END;
