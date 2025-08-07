CREATE TABLE CUSTOMER (
    CustomerID NUMBER,
    Name VARCHAR2(100),
    Age NUMBER,
    Balance NUMBER,
    IsVIP VARCHAR2(5),
    LoanInterestRate NUMBER
);
CREATE TABLE LOAN (
    LoanID NUMBER,
    CustomerID NUMBER,
    DueDate DATE
);
INSERT INTO CUSTOMER VALUES (1, 'Raktim Das', 65, 15000, 'FALSE', 10.0);
INSERT INTO CUSTOMER VALUES (2, 'Rita Das', 45, 8000, 'FALSE', 10.0);
INSERT INTO CUSTOMER VALUES (3, 'Sayan Dey', 70, 11000, 'FALSE', 10.0);

INSERT INTO LOAN VALUES (101, 1, SYSDATE + 15);
INSERT INTO LOAN VALUES (102, 2, SYSDATE + 40);
INSERT INTO LOAN VALUES (103, 3, SYSDATE + 10);

COMMIT;


BEGIN
  FOR rec IN (SELECT * FROM CUSTOMER) LOOP
    IF rec.Age > 60 THEN
      UPDATE CUSTOMER
      SET LoanInterestRate = LoanInterestRate - (LoanInterestRate * 0.01)
      WHERE CustomerID = rec.CustomerID;
    END IF;
  END LOOP;
  DBMS_OUTPUT.PUT_LINE('Scenario 1 complete: Discount applied.');
END;


BEGIN
  FOR rec IN (SELECT * FROM CUSTOMER) LOOP
    IF rec.Balance > 10000 THEN
      UPDATE CUSTOMER
      SET IsVIP = 'TRUE'
      WHERE CustomerID = rec.CustomerID;
    END IF;
  END LOOP;
  DBMS_OUTPUT.PUT_LINE('Scenario 2 complete: VIP flag updated.');
END;


BEGIN
  FOR rec IN (
    SELECT L.LoanID, C.Name, L.DueDate
    FROM LOAN L
    JOIN CUSTOMER C ON L.CustomerID = C.CustomerID
    WHERE L.DueDate <= SYSDATE + 30
  ) LOOP
    DBMS_OUTPUT.PUT_LINE('Reminder: Loan ' || rec.LoanID || ' for ' || rec.Name || ' is due on ' || TO_CHAR(rec.DueDate, 'DD-MON-YYYY'));
  END LOOP;
END;

