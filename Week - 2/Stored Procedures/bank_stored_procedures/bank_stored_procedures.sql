
CREATE TABLE SavingsAccount (
    AccountID NUMBER PRIMARY KEY,
    CustomerID NUMBER,
    Balance NUMBER
);
CREATE TABLE Employee (
    EmployeeID NUMBER PRIMARY KEY,
    Name VARCHAR2(100),
    Department VARCHAR2(50),
    Salary NUMBER
);
CREATE TABLE Account (
    AccountID NUMBER PRIMARY KEY,
    CustomerID NUMBER,
    Balance NUMBER
);

INSERT INTO SavingsAccount VALUES (1, 101, 1000);
INSERT INTO SavingsAccount VALUES (2, 102, 2000);


INSERT INTO Employee VALUES (1, 'Raktim', 'HR', 50000);
INSERT INTO Employee VALUES (2, 'Sayan', 'IT', 60000);

INSERT INTO Account VALUES (1, 101, 10000);
INSERT INTO Account VALUES (2, 101, 5000);

COMMIT;

CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest IS
BEGIN
  FOR rec IN (SELECT * FROM SavingsAccount) LOOP
    UPDATE SavingsAccount
    SET Balance = Balance + (Balance * 0.01)
    WHERE AccountID = rec.AccountID;
  END LOOP;
  DBMS_OUTPUT.PUT_LINE('Interest processed for all savings accounts.');
END;
EXEC ProcessMonthlyInterest;

CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus (
  dept IN VARCHAR2,
  bonus_pct IN NUMBER
) IS
BEGIN
  UPDATE Employee
  SET Salary = Salary + (Salary * bonus_pct / 100)
  WHERE Department = dept;

  DBMS_OUTPUT.PUT_LINE('Bonus applied to ' || dept || ' department.');
END;

EXEC UpdateEmployeeBonus('HR', 10);

CREATE OR REPLACE PROCEDURE TransferFunds (
  from_acct IN NUMBER,
  to_acct IN NUMBER,
  amount IN NUMBER
) IS
  from_balance NUMBER;
BEGIN
  SELECT Balance INTO from_balance FROM Account WHERE AccountID = from_acct;

  IF from_balance >= amount THEN
    UPDATE Account SET Balance = Balance - amount WHERE AccountID = from_acct;
    UPDATE Account SET Balance = Balance + amount WHERE AccountID = to_acct;
    DBMS_OUTPUT.PUT_LINE('Transfer successful: ' || amount || ' transferred.');
  ELSE
    DBMS_OUTPUT.PUT_LINE('Transfer failed: Insufficient balance.');
  END IF;
END;

EXEC TransferFunds(1, 2, 2000);

