-- Scenario 2:
-- Apply an annual maintenance fee to all accounts.

DECLARE
    CURSOR cur_accounts IS
        SELECT AccountID, Balance
        FROM Accounts;

    v_accountID Accounts.AccountID%TYPE;
    v_balance Accounts.Balance%TYPE;
    v_annualFee CONSTANT NUMBER := 100;

BEGIN
    OPEN cur_accounts;

    LOOP
        FETCH cur_accounts
        INTO v_accountID, v_balance;

        EXIT WHEN cur_accounts%NOTFOUND;

        UPDATE Accounts
        SET Balance = Balance - v_annualFee
        WHERE AccountID = v_accountID;

        DBMS_OUTPUT.PUT_LINE('Account ID: ' ||
                             v_accountID ||
                             ' New Balance: ' ||
                             (v_balance - v_annualFee));
    END LOOP;

    CLOSE cur_accounts;
    COMMIT;
END;
/