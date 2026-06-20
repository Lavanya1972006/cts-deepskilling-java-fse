-- Scenario 3:
-- Enforce business rules on deposits and withdrawals.

CREATE OR REPLACE TRIGGER CheckTransactionRules
BEFORE INSERT ON Transactions
FOR EACH ROW
DECLARE
    v_bal NUMBER;
BEGIN
    IF :NEW.TransactionType = 'Withdrawal' THEN
        SELECT Balance
        INTO v_bal
        FROM Accounts
        WHERE AccountID = :NEW.AccountID;

        IF v_bal < :NEW.Amount THEN
            RAISE_APPLICATION_ERROR(
                -20001,
                'Insufficient funds for withdrawal'
            );
        END IF;
    END IF;

    IF :NEW.TransactionType = 'Deposit' THEN
        IF :NEW.Amount <= 0 THEN
            RAISE_APPLICATION_ERROR(
                -20002,
                'Deposit amount must be positive'
            );
        END IF;
    END IF;
END;
/