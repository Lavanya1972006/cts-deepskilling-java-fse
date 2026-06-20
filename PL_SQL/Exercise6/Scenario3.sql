-- Scenario 3:
-- Update the interest rate for all loans based on a new policy.

DECLARE
    CURSOR cur_loans IS
        SELECT LoanID, InterestRate
        FROM Loans;

    v_loanID Loans.LoanID%TYPE;
    v_interestRate Loans.InterestRate%TYPE;
    v_newInterestRate CONSTANT NUMBER := 5;

BEGIN
    OPEN cur_loans;

    LOOP
        FETCH cur_loans
        INTO v_loanID, v_interestRate;

        EXIT WHEN cur_loans%NOTFOUND;

        UPDATE Loans
        SET InterestRate = v_newInterestRate
        WHERE LoanID = v_loanID;

        DBMS_OUTPUT.PUT_LINE('Loan ID: ' ||
                             v_loanID ||
                             ' New Interest Rate: ' ||
                             v_newInterestRate);
    END LOOP;

    CLOSE cur_loans;
    COMMIT;
END;
/