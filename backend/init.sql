CREATE TABLE IF NOT EXISTS benchmark (
    id              INT,
    name            VARCHAR(80),
    description     VARCHAR(300),
    code            BYTEA
);

INSERT INTO benchmark VALUES
    (1, 'Emilio', 'Test', 'print("Hello World!")'),
    (1, 'Alex', 'Test2', 'print("Hello World")');

SELECT * FROM benchmark