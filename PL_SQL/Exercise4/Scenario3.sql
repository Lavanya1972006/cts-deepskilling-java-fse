-- Scenario 3:
-- Check if a customer has sufficient balance before making a transaction.

CREATE OR REPLACE FUNCTION HasSufficientBalance(
    p_acc NUMBER,
    p_amt NUMBER
)
RETURN BOOLEAN
IS
    v_bal NUMBER;
BEGIN
    SELECT Balance
    INTO v_bal
    FROM Accounts
    WHERE AccountID = p_acc;

    RETURN v_bal >= p_amt;

EXCEPTION
    WHEN NO_DATA_FOUND THEN
        RETURN FALSE;
END;
/