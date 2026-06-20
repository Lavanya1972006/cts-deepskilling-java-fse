-- Scenario 2:
-- Maintain an audit log for all transactions.

CREATE TABLE AuditLog (
    AuditID NUMBER PRIMARY KEY,
    TransactionID NUMBER,
    ChangeDate DATE,
    ChangeType VARCHAR2(50)
);

CREATE SEQUENCE AuditLogSeq
START WITH 1
INCREMENT BY 1
NOCACHE
NOCYCLE;

CREATE OR REPLACE TRIGGER LogTransaction
AFTER INSERT ON Transactions
FOR EACH ROW
BEGIN
    INSERT INTO AuditLog (
        AuditID,
        TransactionID,
        ChangeDate,
        ChangeType
    )
    VALUES (
        AuditLogSeq.NEXTVAL,
        :NEW.TransactionID,
        SYSDATE,
        'INSERT'
    );
END;
/