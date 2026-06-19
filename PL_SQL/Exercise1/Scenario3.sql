-- Scenario 3:
-- Display loan reminders for customers whose loans are due within the next 30 days.

DECLARE
    CURSOR c_loan IS
        SELECT l.LoanID, c.Name, l.EndDate
        FROM Loans l
        JOIN Customers c
        ON l.CustomerID = c.CustomerID
        WHERE l.EndDate BETWEEN SYSDATE AND SYSDATE + 30;

BEGIN
    FOR rec IN c_loan LOOP
        DBMS_OUTPUT.PUT_LINE('Loan ID: ' || rec.LoanID ||
                             ', Customer: ' || rec.Name ||
                             ', Due Date: ' || rec.EndDate);
    END LOOP;
END;
/