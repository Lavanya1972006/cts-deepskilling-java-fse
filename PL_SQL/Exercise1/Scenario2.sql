-- Scenario 2:
-- Promote customers with a balance greater than 10000 to VIP status.

ALTER TABLE Customers
ADD IsVIP CHAR(1);

DECLARE
    CURSOR c_customer IS
        SELECT CustomerID, Balance
        FROM Customers;

BEGIN
    FOR rec IN c_customer LOOP
        IF rec.Balance > 10000 THEN
            UPDATE Customers
            SET IsVIP = 'Y'
            WHERE CustomerID = rec.CustomerID;

            DBMS_OUTPUT.PUT_LINE('Customer ' || rec.CustomerID || ' is marked as VIP.');
        ELSE
            UPDATE Customers
            SET IsVIP = 'N'
            WHERE CustomerID = rec.CustomerID;
        END IF;
    END LOOP;

    COMMIT;
END;
/