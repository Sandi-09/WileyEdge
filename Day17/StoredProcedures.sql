use technocrats;

select * from customer;
call getAllCustomerDetails();
-- in parameter
call getAllCustomerDetailsByName('Udaya');
call getAllCustomerDetailsByName2('Udaya','kolkata');

-- out parameter
CALL getCustomerByCity('kolkata',@rcity,@cname);
SELECT @rcity,@cname;

-- inout parameter
SET @counter = 1;
call getCounter(@counter,5);
call getCounter(@counter,1);
select @counter;


DELIMITER $$

CREATE PROCEDURE SetCounter(
	INOUT counter INT,
    IN inc INT
)
BEGIN
	SET counter = counter + inc;
END$$

DELIMITER ;
SET @counter = 1;
CALL SetCounter(@counter,1); -- 2
CALL SetCounter(@counter,1); -- 3
CALL SetCounter(@counter,5); -- 8
SELECT @counter; -- 8
