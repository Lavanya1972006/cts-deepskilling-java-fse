-- Scenario 2:
-- Compute the monthly installment for a loan.

CREATE OR REPLACE FUNCTION CalculateMonthlyInstallment(
    p_amt NUMBER,
    p_rate NUMBER,
    p_year NUMBER
)
RETURN NUMBER
IS
    v_rate NUMBER;
    v_mon NUMBER;
    v_emi NUMBER;
BEGIN
    v_rate := p_rate / 12 / 100;
    v_mon := p_year * 12;

    IF v_rate = 0 THEN
        v_emi := p_amt / v_mon;
    ELSE
        v_emi := (p_amt * v_rate) /
                 (1 - POWER(1 + v_rate, -v_mon));
    END IF;

    RETURN v_emi;
END;
/