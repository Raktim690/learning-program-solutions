SET SERVEROUTPUT ON;

DECLARE
    v_num NUMBER := 10;
BEGIN
    IF v_num > 0 THEN
        DBMS_OUTPUT.PUT_LINE('Positive Number');
    ELSE
        DBMS_OUTPUT.PUT_LINE('Not a Positive Number');
    END IF;
END;
