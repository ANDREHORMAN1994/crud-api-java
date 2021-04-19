INSERT INTO level (name)
	VALUES
		('Error'),
		('Warning'),
		('Info');

INSERT INTO origin (name)
    VALUES
        ('serviço 1'),
        ('serviço 2'),
        ('serviço 3');

INSERT INTO event (data, description, log, quantity, level_id, origin_id)
    VALUES
        (DATE(NOW()), 'ERRO EXEMPLO 1', 123, 5, 1, 1);