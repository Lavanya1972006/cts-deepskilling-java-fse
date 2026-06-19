-- Scenario 1:
-- Apply a 1% discount to the interest rate for customers above 60 years of age.

DECLARE
    CURSOR c_customer IS
        SELECT c.CustomerID, l.LoanID
        FROM Customers c
        JOIN Loans l
        ON c.CustomerID = l.CustomerID
        WHERE FLOOR(MONTHS_BETWEEN(SYSDATE, c.DOB) / 12) > 60;

BEGIN
    FOR rec IN c_customer LOOP
        UPDATE Loans
        SET InterestRate = InterestRate - 1
        WHERE LoanID = rec.LoanID;

        DBMS_OUTPUT.PUT_LINE('Interest rate updated for Loan ID: ' || rec.LoanID);
    END LOOP;

    COMMIT;
END;
/