-- Scenario 3:
-- Group all account-related operations into a package.

CREATE OR REPLACE PACKAGE AccountOperations AS
    PROCEDURE OpenAccount(p_AccountID NUMBER, p_CustomerID NUMBER, p_AccountType VARCHAR2, p_Balance NUMBER);
    PROCEDURE CloseAccount(p_AccountID NUMBER);
    FUNCTION GetTotalBalance(p_CustomerID NUMBER) RETURN NUMBER;
END AccountOperations;
/

CREATE OR REPLACE PACKAGE BODY AccountOperations AS

    PROCEDURE OpenAccount(p_AccountID NUMBER, p_CustomerID NUMBER, p_AccountType VARCHAR2, p_Balance NUMBER) IS
    BEGIN
        INSERT INTO Accounts(AccountID, CustomerID, AccountType, Balance, LastModified)
        VALUES (p_AccountID, p_CustomerID, p_AccountType, p_Balance, SYSDATE);

        COMMIT;
    EXCEPTION
        WHEN DUP_VAL_ON_INDEX THEN
            DBMS_OUTPUT.PUT_LINE('Account already exists.');
    END OpenAccount;

    PROCEDURE CloseAccount(p_AccountID NUMBER) IS
    BEGIN
        DELETE FROM Accounts
        WHERE AccountID = p_AccountID;

        IF SQL%ROWCOUNT = 0 THEN
            DBMS_OUTPUT.PUT_LINE('Account not found.');
        END IF;

        COMMIT;
    END CloseAccount;

    FUNCTION GetTotalBalance(p_CustomerID NUMBER) RETURN NUMBER IS
        v_totalBalance NUMBER;
    BEGIN
        SELECT NVL(SUM(Balance), 0)
        INTO v_totalBalance
        FROM Accounts
        WHERE CustomerID = p_CustomerID;

        RETURN v_totalBalance;
    END GetTotalBalance;

END AccountOperations;
/